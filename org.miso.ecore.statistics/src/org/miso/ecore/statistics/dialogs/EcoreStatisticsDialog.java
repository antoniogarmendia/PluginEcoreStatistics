package org.miso.ecore.statistics.dialogs;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.window.IShellProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.miso.ecore.statistics.utils.CSVUtils;

import MetaModelGraph.Composition;
import MetaModelGraph.EnumModular;
import MetaModelGraph.Graph;
import MetaModelGraph.Node;
import MetaModelGraph.Reference;
import MetaModelGraph.Relation;
import MetaModelGraph.SubClass;
import MetaModelGraph.SubGraph;
import MetaModelGraph.impl.MetaModelGraphFactoryImpl;
import dslHeuristicVisualization.ConcreteStrategyMaxContainment;
import dslHeuristicVisualization.ConcreteStrategyNoParent;
import dslHeuristicVisualization.DslHeuristicVisualizationFactory;
import dslHeuristicVisualization.EcoreMatrixContainment;


public class EcoreStatisticsDialog extends Dialog{
	
	public EcoreStatistics nemf;
	//Widgets
	private Text address;
	public List list;
	
	//Label 
	private Label lb_NameEcore;
	private Label lb_amountClasses;
	private Label lbAmountAbstract;
	private Label lb_amountContainment;
	private Label lb_amountNoNContainment;
		
	//Statistics MM
	private Label lb_amountMM;
	private Label lb_amountEClass;
	private Label lb_ecoreErrors;
	private Label lb_amountNONContainmentMM;
	public List listWOContainmentReferences;
	
	private final EList<Node> listVisitedNodes = new BasicEList<Node>();
	
	public EcoreStatisticsDialog(IShellProvider parentShell) {
		
		super(parentShell);
		this.address = null;
		this.nemf = null;
		
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		
		Composite container = (Composite) super.createDialogArea(parent);
		GridLayout layout_container = new GridLayout();
		layout_container.numColumns = 3;
		container.setLayout(layout_container);
		
		//Address
		GridData grid_address = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		address = new Text(container, SWT.BORDER | SWT.SINGLE);
		address.setText("");
		address.setLayoutData(grid_address);
		
		//Browse Workspace
		GridData grid_ws = new GridData(SWT.RIGHT);
		Button btn_ws = new Button(container, SWT.NONE);
		btn_ws.setText("Browse Workspace");
		btn_ws.setLayoutData(grid_ws);
		
		//Find Ecores
		GridData grid_find = new GridData(SWT.RIGHT);
		Button btn_find = new Button(container, SWT.NONE);
		btn_find.setText("Find Ecores");
		btn_find.setLayoutData(grid_find);		
		
		//Listeners
		btn_ws.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				handleBrowseWorkspace();
			}				
		});
		
		
		//Composite of Statistics
		Composite containerStatistics = new Composite(container, SWT.NONE);
		GridLayout layout_containerStatistics = new GridLayout();
		layout_containerStatistics.numColumns = 2;
		containerStatistics.setLayout(layout_containerStatistics);
		containerStatistics.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		
		//Titles of Columns
		Label lb_MM = new Label(containerStatistics, SWT.NONE | SWT.CENTER);
		lb_MM.setText("List of Ecore Meta-models");
		Label lb_statistics = new Label(containerStatistics, SWT.NONE | SWT.CENTER);
		lb_statistics.setText("Statistics");
		
		//Create List
		this.list = new List (containerStatistics, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
		GridData grid_List = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		grid_List.heightHint = 200;
		this.list.setLayoutData(grid_List);
		
		//Add Listeners
		list.addListener(SWT.Selection, e -> {
			
			String ecoreMM = list.getItem(list.getSelectionIndex());
			EcoreStatisticsByName(ecoreMM);
			System.out.println("Ecore MM: " + ecoreMM);
			
		});		
		
		//Composite of Statistics
		Composite containerStats = new Composite(containerStatistics, SWT.NONE);
		GridLayout layout_containerStats = new GridLayout();
		layout_containerStats.numColumns = 2;
		containerStats.setLayout(layout_containerStats);
		
		//Title of Meta-models
		Label lb_titleEcore = new Label(containerStats, SWT.NONE);
		lb_titleEcore.setText("Name of Meta-model: ");
		
		//Name 
		lb_NameEcore = new Label(containerStats, SWT.NONE);
		lb_NameEcore.setText("Not Found");
		lb_NameEcore.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		
		//Amount of Classes
		Label lb_title_amountClasses = new Label(containerStats, SWT.NONE);
		lb_title_amountClasses.setText("Amount of EClasses: ");
		
		lb_amountClasses = new Label(containerStats, SWT.NONE);
		lb_amountClasses.setText("Not Found");
		
		//Amount of Abstract Classes
		Label lbTitleAmountAbstract = new Label(containerStats, SWT.NONE);
		lbTitleAmountAbstract.setText("Amount of Abstract Classes");
		
		lbAmountAbstract = new Label(containerStats, SWT.NONE);
		lbAmountAbstract.setText("Not Found");
		
		//Amount of Containment References
		Label lb_title_amountContainment = new Label(containerStats, SWT.NONE);
		lb_title_amountContainment.setText("Amount of Containment References: ");
		
		//Amount of Containment References
		lb_amountContainment = new Label(containerStats, SWT.NONE);
		lb_amountContainment.setText("Not Found");
			
		//Amount of Containment References
		Label lb_title_amountNoNContainment = new Label(containerStats, SWT.NONE);
		lb_title_amountNoNContainment.setText("Amount of Non-Containment References: ");
		
		//Amount of Non-Containment References		
		lb_amountNoNContainment = new Label(containerStats, SWT.NONE);
		lb_amountNoNContainment.setText("Not Found");
		
		//Statistics of Folder
		Label lb_title_allMMStatistics = new Label(containerStatistics, SWT.NONE);
		lb_title_allMMStatistics.setText("All Meta-models");
		lb_title_allMMStatistics.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1));
		
		Label lb_title_amountMM = new Label(containerStatistics, SWT.NONE);
		lb_title_amountMM.setText("Amount of Ecores");
		
		lb_amountMM = new Label(containerStatistics, SWT.NONE);
		lb_amountMM.setText("Not Found");
		
		Label lb_title_amountEClass = new Label(containerStatistics, SWT.NONE);
		lb_title_amountEClass.setText("Amount of EClasses");
		
		lb_amountEClass = new Label(containerStatistics, SWT.NONE);
		lb_amountEClass.setText("Amount of EClasses");
		
		Label lb_title_ecoreErrors = new Label(containerStatistics, SWT.NONE);
		lb_title_ecoreErrors.setText("Errors");
		
		new Label(containerStatistics, SWT.NONE);
		
		lb_ecoreErrors = new Label(containerStatistics, SWT.NONE);
		lb_ecoreErrors.setText("No Errors Found");
		GridData gr_ecoreErrors = new GridData(SWT.FILL, SWT.TOP, true, false,2, 1);
		lb_ecoreErrors.setLayoutData(gr_ecoreErrors);
		
		lb_amountNONContainmentMM = new Label(containerStatistics, SWT.LEFT | SWT.WRAP);
		lb_amountNONContainmentMM.setText("Ecores Without Containment References");
		GridData grid_amountNONContainmentMM = new GridData(SWT.FILL, SWT.TOP, true, false, 2, 1);
		lb_amountNONContainmentMM.setLayoutData(grid_amountNONContainmentMM);
		
		//Create List
		this.listWOContainmentReferences = new List (containerStatistics, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
		GridData grid_listWOContainmentReferences = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		grid_listWOContainmentReferences.heightHint = 150;
		this.listWOContainmentReferences.setLayoutData(grid_listWOContainmentReferences);
			
		//Add Listeners
		this.listWOContainmentReferences.addListener(SWT.Selection, e -> {
					
					String ecoreMM = listWOContainmentReferences.getItem(listWOContainmentReferences.getSelectionIndex());
					EcoreStatisticsByName(ecoreMM);
					System.out.println("Ecore MM: " + ecoreMM);
					
				});	
		
		
		new Label(containerStatistics, SWT.NONE);
		
		Button btnGenContainmentTree = new Button(containerStatistics, SWT.NONE);
		btnGenContainmentTree.setText("Generate Tree");
		
		btnGenContainmentTree.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				
				if(nemf.isError()==false && nemf.getList_classes()!=null)
					GenerateVisualization(nemf);
			}		
			
		});
		
				
		Button btnGenAllContainmentTree = new Button(containerStatistics, SWT.NONE);
		btnGenAllContainmentTree.setText("Generate All Tree");
		
		btnGenAllContainmentTree.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				
				//String path = "platform:/resource" + address.getText() + "/" + ecoreMM;
				//nemf = new EcoreStatistics(URI.createURI(path, false));
				String[] listItems = list.getItems();
				for (String string : listItems) {
					String path = "platform:/resource" + address.getText() + "/" + string;
					EcoreStatistics ecoreStats = new EcoreStatistics(URI.createURI(path, false));
					if(ecoreStats.isError()==false && ecoreStats.getList_classes()!=null)
						GenerateVisualization(ecoreStats);
				}				
			}		
			
		});
		
		Button btnCreateCSV = new Button(containerStatistics, SWT.NONE);
		btnCreateCSV.setText("Create CSV");
		
		btnCreateCSV.addSelectionListener(new SelectionAdapter() {
			
			
			@Override
			public void widgetSelected(SelectionEvent e) {
			
				String[] listItems = list.getItems();
				String csvFile = "StatistiscEcoreZooModularPattern.csv";
				String csvNoContainment = "StatistiscNoContainment.csv";
				
				try {
					
					String csvPath = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + address.getText() + "/" + csvFile;
					String csvPathNoContainment = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + address.getText() + "/" + csvNoContainment;
					FileWriter writer = new FileWriter(csvPath);
					CSVUtils.writeLine(writer, Arrays.asList("Meta-model Name","Amount of Roots","Name of the Roots","Selected Root",
															  "Recursive Project","Height",
															  "Amount of Packages", "Amount of Recursive Packages",
															  "Amount of Units", "Amount of Recursive Units", "Unit Statistics",															  
															  "Amount of EClasses", "Amount of EClass Out"));
					
					FileWriter writerNoContainments = new FileWriter(csvPathNoContainment);
					CSVUtils.writeLine(writerNoContainments, Arrays.asList("Meta-model Name"));
					
					for (String mm : listWOContainmentReferences.getItems()) {
						
						CSVUtils.writeLine(writerNoContainments, Arrays.asList(mm));
					}
					
					writerNoContainments.flush();
					writerNoContainments.close();
				     
					for (String mm : listItems) {
						String path = address.getText() + "/" + mm;
						URI fileURI = URI.createPlatformResourceURI(path,true);
						ResourceSet reset = new ResourceSetImpl();	
						URIConverter converter = new ExtensibleURIConverterImpl();
						boolean exist = converter.exists(fileURI.trimFileExtension().appendFileExtension("mmgraph"), null);
						if(exist==true){
							Resource res = reset.getResource(fileURI.trimFileExtension().appendFileExtension("mmgraph"),true);						
							AddToCSVFile(res,writer);
						}
						else
							CSVUtils.writeLine(writer, Arrays.asList(fileURI.lastSegment(),String.valueOf("-1")));
					}
					 writer.flush();
				     writer.close();					
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}		
			
		});
		
		return container;
	}
	
	private void AddToCSVFile(Resource res, FileWriter writer) throws IOException {
		
		
		EObject rootEObject = res.getContents().get(0);
		
		if(rootEObject instanceof Graph)
		{
			Graph graph = (Graph)rootEObject;
			int amountOfSubGraph = graph.getSubgraph().size();
			Iterator<SubGraph> itSubGraphs = graph.getSubgraph().iterator();
			int eClassesOut = 500000;
			SubGraph subGraph = null;
			String nameOfRoots = "";
			String selectedRoot = "";
			while (itSubGraphs.hasNext()) {
				SubGraph currentSubGraph = (SubGraph) itSubGraphs.next();
				if(eClassesOut>currentSubGraph.getAmountEClassesOut()){
					eClassesOut = currentSubGraph.getAmountEClassesOut();
					subGraph = currentSubGraph;	
					selectedRoot = currentSubGraph.getRoot().getEClass().getName();
				}	
				if(nameOfRoots.equals(""))
					nameOfRoots = currentSubGraph.getRoot().getEClass().getName();
				else
					nameOfRoots = nameOfRoots + "|" + currentSubGraph.getRoot().getEClass().getName();
			}
			
			String unitsStatistics = amountPackagesUnits(subGraph);
				
			boolean recursiveProject = false;
			if(subGraph.getRoot().getEnumModularNotation().indexOf(EnumModular.RECURSION_PACKAGE)!=-1)
				recursiveProject = true; 
			
			CSVUtils.writeLine(writer, Arrays.asList(res.getURI().lastSegment(),
												String.valueOf(amountOfSubGraph),
												nameOfRoots,
												selectedRoot,
												String.valueOf(recursiveProject),
												String.valueOf(subGraph.getHeight()),
												String.valueOf(subGraph.getAmountPackages()),
												String.valueOf(subGraph.getAmountOfRecursionPackages()),
												String.valueOf(subGraph.getAmountUnits()),
												String.valueOf(subGraph.getAmountRecursionUnits()),
												unitsStatistics,
												String.valueOf(graph.getAmountEClasses()),
												String.valueOf(subGraph.getAmountEClassesOut())
												)
							  );
																						
		}	
	}

	private String amountPackagesUnits(SubGraph subGraph) {
		
		Iterator<Node> itNodes = subGraph.getNodes().iterator();
		int amountPackages = 0;
		int amountUnits = 0;
		int amountRecursionUnits = 0;
		int amountRecursionPackages = 0;
		String unitsStatistics = "";
		while (itNodes.hasNext()) {
			Node node = (Node) itNodes.next();
			if(node.getEnumModularNotation().indexOf(EnumModular.PACKAGE)!=-1)
				amountPackages = amountPackages + 1;
			else if(node.getEnumModularNotation().indexOf(EnumModular.RECURSION_PACKAGE)!=-1)
				amountRecursionPackages = amountRecursionPackages + 1;
			if(node.getEnumModularNotation().indexOf(EnumModular.RECURSION_UNIT)!=-1)
			{
				//Determine concrete nodes
				//EList<Node> nodes =
				getInsideNodes(node);
				//node.getListNodes().addAll(nodes);
				amountRecursionUnits = amountRecursionUnits + 1;
				unitsStatistics = unitStatistics(unitsStatistics,node);			
			}
			else if(node.getEnumModularNotation().indexOf(EnumModular.UNIT)!=-1)
			{
				//Determine concrete nodes
				//EList<Node> nodes = 
				getInsideNodes(node);
				//node.getListNodes().addAll(nodes);
				//Recursion inside the unit
				amountUnits = amountUnits + 1;
				unitsStatistics = unitStatistics(unitsStatistics,node);			
			}
			
		}
		
		subGraph.setAmountPackages(amountPackages);
		subGraph.setAmountUnits(amountUnits);
		subGraph.setAmountRecursionUnits(amountRecursionUnits);
		subGraph.setAmountOfRecursionPackages(amountRecursionPackages);
		
		return unitsStatistics;
	}

	private String unitStatistics(String unitsStatistics, Node node) {
		
		if(!unitsStatistics.equals(""))
			unitsStatistics = unitsStatistics + "|";
		unitsStatistics = unitsStatistics + "Unit Name: " + node.getEClass().getName() + "&" +	
											"Size of EClasses Inside Unit: " + node.getListNodes().size() 
											;
		if(node.getEnumModularNotation().indexOf(EnumModular.RECURSION_UNIT)!=-1){
			unitsStatistics = unitsStatistics + "&RecursiveUnit: true";  
		}else{
			unitsStatistics = unitsStatistics + "&RecursiveUnit: false";
			//Recursive Inside Unit
			Iterator<Node> itNodes = node.getListNodes().iterator();
			boolean recursiveInsideUnit = false;
			while (itNodes.hasNext()) {
				Node node2 = (Node) itNodes.next();
				recursiveInsideUnit = detectRecursion(node2);
				if(recursiveInsideUnit == true)
					break;
			}
			if(recursiveInsideUnit==true)
				unitsStatistics = unitsStatistics + "&RecursiveInsideUnit: true";
			else
				unitsStatistics = unitsStatistics + "&RecursiveInsideUnit: false";
		}	
		
		return unitsStatistics;
	}

	private void getInsideNodes(Node node) {
		
		Iterator<Composition> itCompositions = node.getCompositions().iterator();
		listVisitedNodes.clear(); 
		while (itCompositions.hasNext()) {
			Composition composition = (Composition) itCompositions.next();
			Node target = composition.getTarget();
			if(target.getEClass().isAbstract()==false)
				node.getListNodes().add(target);
			System.out.println("Init");
			node.getListNodes().addAll(getListOfInsideNodes(target));
		}		
	}
		
	public EList<Node> getListOfInsideNodes(Node node){
		
		EList<Node> listOfInsideNodes = new BasicEList<Node>();
		EList<Node> listNodes = new BasicEList<Node>();
		listNodes.add(node);
		
		for (int i = 0; i < listNodes.size(); i++) {
			
			Node currentNode = listNodes.get(i);
			Iterator<Composition> itCompositions = getAllCompositions(currentNode).iterator();
			while (itCompositions.hasNext()) {
				Composition composition = (Composition) itCompositions.next();
				Node compositionNode = composition.getTarget();	
				if(listNodes.indexOf(compositionNode)==-1 && compositionNode.getEClass().isAbstract() == false)
					listNodes.add(compositionNode);
				if(listOfInsideNodes.indexOf(compositionNode)==-1)
					listOfInsideNodes.add(compositionNode);
			}
			
			Iterator<SubClass> itSubClasses = currentNode.getSubClasses().iterator();
			while (itSubClasses.hasNext()) {
				
				SubClass subClass = (SubClass) itSubClasses.next();
				Node subClassNode = subClass.getTarget();
				if(listNodes.indexOf(subClassNode)==-1 && subClassNode.getEClass().isAbstract() == false)
					listNodes.add(subClassNode);
				if(listOfInsideNodes.indexOf(subClassNode)==-1)
					listOfInsideNodes.add(subClassNode);				
			}
			
		}
		
		return listOfInsideNodes;
	}	

	@Override
	protected void configureShell(Shell newShell) {
		// TODO Auto-generated method stub
		super.configureShell(newShell);
		newShell.setText("Ecore Statistics");
	}	
	
	@Override
    protected Point getInitialSize() {
            return new Point(900,800);
    }
	
	//Browse Files and Folders within the workspace
	public void handleBrowseWorkspace()
	{
		
		ContainerSelectionDialog browse = new ContainerSelectionDialog(getShell(),ResourcesPlugin.getWorkspace().getRoot(), 
					false, "Select Folder");		
		if (browse.open()==ContainerSelectionDialog.OK) 
		{
			Object[] result = browse.getResult();
			if (result.length == 1) {
				address.setText(((Path) result[0]).toString());
				Fill_ListEcores();
			}
		}		
	}
	
	public void Fill_ListEcores()
	{
		IFolder containerFolder = ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(address.getText()));
		this.list.setRedraw(false);
		this.listWOContainmentReferences.setRedraw(false);
		this.list.removeAll();
		this.listWOContainmentReferences.removeAll();
		try {
			IResource[] resources = containerFolder.members();
			int amountEClass = 0;
			String ecoresWithErrors = "";
			int amountecoresWithErrors = 0;
			int amountNONContainment = 0;
			for (int i = 0; i < resources.length; i++) {
				IResource res = resources[i];				
				if(isEcore(res)==true)
				{
					this.list.add(res.getName());		
					EcoreStatistics ecore = new EcoreStatistics(URI.createPlatformResourceURI(address.getText() + "/" + res.getName(),true));
					if(ecore.getList_classes()!=null)
					{
						amountEClass = amountEClass + ecore.getList_classes().size();
						int amountOfContainment = amountContainment(ecore.getList_classes());
						if(amountOfContainment == 0)
						{
							this.listWOContainmentReferences.add(res.getName());	
							amountNONContainment = amountNONContainment + 1;
						}
					}
					else
					{
						ecoresWithErrors = ecoresWithErrors + res.getName() + ", ";
						amountecoresWithErrors = amountecoresWithErrors + 1;
					}
				}
			}			
			lb_amountMM.setText(Integer.toString(this.list.getItemCount()));
			lb_amountEClass.setText(Integer.toString(amountEClass));
			lb_amountNONContainmentMM.setText("Found without Containment References: " + Integer.toString(amountNONContainment));
			lb_ecoreErrors.setText(Integer.toString(amountecoresWithErrors) + ": "+  ecoresWithErrors);
			this.list.setRedraw(true);
			this.listWOContainmentReferences.setRedraw(true);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private boolean isEcore(IResource res) {
		
		if(res instanceof IFile)
		{
			if(res.getFileExtension().equals("ecore"))
				return true;
		}
		return false;
	}	
	
	public void EcoreStatisticsByName(String ecoreMM)
	{
		String path = "platform:/resource" + address.getText() + "/" + ecoreMM;
		nemf = new EcoreStatistics(URI.createURI(path, false));
		
		if(nemf.getList_classes()!=null)
		{	
			lb_NameEcore.setText(nemf.getResource().getURI().lastSegment());
			lb_amountClasses.setText(Integer.toString(nemf.getList_classes().size()));
			lbAmountAbstract.setText(Integer.toString(amountAbstractClasses(nemf.getList_classes())));
			lb_amountContainment.setText(Integer.toString(amountContainment(nemf.getList_classes())));
			lb_amountNoNContainment.setText(Integer.toString(amountNonContainment(nemf.getList_classes())));
		}
		else
		{
			lb_NameEcore.setText(nemf.getResource().getURI().lastSegment());
			lb_amountClasses.setText("Not Found, try to open with the Ecore Editor");
			lbAmountAbstract.setText("Not Found");
			lb_amountContainment.setText("Not Found");
			lb_amountNoNContainment.setText("Not Found");
		}
	}
	
	private int amountAbstractClasses(EList<EClass> listEClass)
	{
		Iterator<EClass> itClasses = listEClass.iterator();
		int count = 0;
		while (itClasses.hasNext()) {
			EClass eClass = (EClass) itClasses.next();
			if(eClass.isAbstract())
				count = count + 1;
		}
		return count;
	}
	
	private int amountContainment(EList<EClass> listEClass)
	{
		Iterator<EClass> itEClass = listEClass.iterator();
		int amount = 0;
		while (itEClass.hasNext()) {
			EClass eClass = (EClass) itEClass.next();
			Iterator<EReference> itEReferences = eClass.getEReferences().iterator();
			while (itEReferences.hasNext()) {
				EReference eReference = (EReference) itEReferences.next();
				if(eReference.isContainment() == true){
					System.out.println("amountContainment : " + eClass.getName() + "|" + eReference.getName());
					amount = amount + 1;
				}
			}			
		}
		return amount;
	}
	
	private int amountNonContainment(EList<EClass> listEClass)
	{
		Iterator<EClass> itEClass = listEClass.iterator();
		int amount = 0;
		while (itEClass.hasNext()) {
			EClass eClass = (EClass) itEClass.next();
			Iterator<EReference> references =  eClass.getEReferences().iterator();
			while (references.hasNext()) {
				EReference eReference = (EReference) references.next();
				if(eReference.isContainment() == false)
					amount = amount +1;
			}
		}
		return amount;
	}
	
	public void GenerateVisualization(EcoreStatistics ecoreStats)
	{
		
		if(ecoreStats!=null)
		{
			EcoreMatrixContainment ecoreContainment = DslHeuristicVisualizationFactory.eINSTANCE.createEcoreMatrixContainment();
			ConcreteStrategyMaxContainment getRoot = DslHeuristicVisualizationFactory.eINSTANCE.createConcreteStrategyMaxContainment();
			
			ecoreContainment.GetDirectMatrixContainment(ecoreStats.getList_classes());
			ecoreContainment.GetPathMatrix();
			
			ConcreteStrategyNoParent rootStrategyNoParent = DslHeuristicVisualizationFactory.eINSTANCE.createConcreteStrategyNoParent();
						
			EList<EClass> listNoParentClasses = rootStrategyNoParent.List_Root(ecoreContainment.getPathMatrix(), ecoreStats.getList_classes());
			
			//if(listNoParentClasses.size() == 0){
				
				Iterator<EClass> itRoots = getRoot.List_Root(ecoreContainment.getPathMatrix(), ecoreStats.getList_classes()).iterator();
				while (itRoots.hasNext()) {
					EClass eClass = (EClass) itRoots.next();
					if(eClass.isAbstract() == false){
						int pos = listNoParentClasses.indexOf(eClass);
						if(pos==-1)
							listNoParentClasses.add(eClass);
						
						break;							
					}
				}				
			//}	
				
			Iterator<EClass> itListNoParentClasses = listNoParentClasses.iterator();	
			
			Graph graph = MetaModelGraphFactoryImpl.eINSTANCE.createGraph();
			
			Map<EClass, Node> mapElements = new ConcurrentHashMap<EClass, Node>();
			
			graph.getEClassList().addAll(ecoreStats.getList_classes());
			graph.getEClassAbstract().addAll(getAbstractEClasses(ecoreStats.getList_classes()));
						
			while (itListNoParentClasses.hasNext()) {
				
				EClass eClassRoot = (EClass) itListNoParentClasses.next();
				SubGraph subGraph = MetaModelGraphFactoryImpl.eINSTANCE.createSubGraph();
				Node rootNode = MetaModelGraphFactoryImpl.eINSTANCE.createNode();
				rootNode.setEClass(eClassRoot);
				subGraph.getNodes().add(rootNode);
				subGraph.setRoot(rootNode);
				mapElements.clear();
				mapElements.put(eClassRoot, rootNode);				
								
				ArrayList<EClass> arrayEAllClasses = new ArrayList<EClass>(Arrays.asList(eClassRoot));
				
				for (int i = 0; i < arrayEAllClasses.size(); i++) {
					
					EClass eClass = arrayEAllClasses.get(i);					
					//Iterator<EReference> itEAllReferences = eClass.getEAllReferences().iterator();
					Iterator<EReference> itEAllReferences = eClass.getEAllContainments().iterator();
					EList<EReference> listEReferences = eClass.getEReferences();
					
					Node sourceNode = mapElements.get(eClass);
					//Take into account the SubClasses of the Node
					SubClasses(sourceNode,subGraph,arrayEAllClasses,mapElements,ecoreStats.getList_classes());
					
					while (itEAllReferences.hasNext()) {
						
						EReference eReference = (EReference) itEAllReferences.next();
						EClassifier eClassifier = eReference.getEType();
						
						if(eClassifier instanceof EClass){
							
							EClass eClassType = (EClass) eClassifier;
							//Search in the Map of Elements
							Node node = mapElements.get(eClassType);
							if(node == null){
								
								node = MetaModelGraphFactoryImpl.eINSTANCE.createNode();
								node.setEClass(eClassType);
								subGraph.getNodes().add(node);
								mapElements.put(eClassType, node);
								arrayEAllClasses.add(eClassType);
								//SubClasses
								SubClasses(node,subGraph,arrayEAllClasses,mapElements,ecoreStats.getList_classes());
							}					
							
							Relation eRelation = null;
							if(eReference.isContainment()){
							
								eRelation = MetaModelGraphFactoryImpl.eINSTANCE.createComposition();
								((Composition)eRelation).setEReference(eReference);	
								eRelation.setTarget(node);
								sourceNode.getCompositions().add((Composition) eRelation);
								if(listEReferences.indexOf(eReference)!=-1)
									sourceNode.getDirectComposition().add((Composition) eRelation);
								
							}else{
								
								eRelation = MetaModelGraphFactoryImpl.eINSTANCE.createReference();
								((Reference)eRelation).setEReference(eReference);
								eRelation.setTarget(node);
								sourceNode.getReferences().add((Reference) eRelation);
							}
							
							subGraph.getRelations().add(eRelation);						
						}						
					}					
				}			
				
				calculateAmountOfConcreteClasses(subGraph,ecoreStats.listEClasses,mapElements);
				annotateProjectPackageAndUnits(subGraph);
				calculateMaxHeight(subGraph);
				graph.getSubgraph().add(subGraph);
			}		
			
			ResourceSet reset = new ResourceSetImpl();					
			Resource res = reset.createResource(ecoreStats.getEcoreURI().trimFileExtension().appendFileExtension("mmgraph"));
			res.getContents().add(graph);
			
			try {
				res.save(null);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
		}			
		System.out.println("Generate Visualization: " +  ecoreStats.getEcoreURI().lastSegment());
	}

	private void calculateMaxHeight(SubGraph subGraph) {
		
		Node rootNode = subGraph.getRoot();
		Iterator<Composition> itCompositions = rootNode.getCompositions().iterator();
		int maxHeight = 0;
		while (itCompositions.hasNext()) {
			Composition composition = (Composition) itCompositions.next();
			int height = calculateHeight(composition, new BasicEList<Node>());
			if(height>maxHeight)
				maxHeight = height;
		}
		subGraph.setHeight(maxHeight);
		
	}
	
	private int calculateHeight(Composition composition, EList<Node> visitedNodes){
		
		Iterator<Composition> itCompositions = getAllCompositions(composition.getTarget()).iterator();
		int maxHeight = 0;
		if(itCompositions.hasNext() == false)
				return 1;
			else{
				int height = 0; 
				while (itCompositions.hasNext()) {
					Composition compo = (Composition) itCompositions.next();
					Node node = compo.getTarget();
					int indexOf = visitedNodes.indexOf(node);
					if(indexOf==-1 && !composition.getTarget().equals(node)){
						visitedNodes.add(node);
						height = calculateHeight(compo, visitedNodes);
						if(height > maxHeight)
							maxHeight = height;
					}						
				}
			}
		
		return maxHeight + 1;
	}
		
	private EList<Composition> getDirectAllCompositions(Node node){
		
		EList<Composition> eListCompositions = new BasicEList<Composition>();
		eListCompositions.addAll(node.getCompositions());	
				
		return eListCompositions;
	}
	
	private EList<Composition> getAllCompositionSubClass(Node node){
		
		EList<Composition> eListCompositions = new BasicEList<Composition>();
				
		Iterator<SubClass> itAllSubClasses = node.getSubClasses().iterator();
		while (itAllSubClasses.hasNext()) {
			SubClass subClass = (SubClass) itAllSubClasses.next();
			eListCompositions.addAll(subClass.getTarget().getCompositions());
		}
				
		return eListCompositions;		
	}
	
	private EList<Composition> getAllCompositions(Node node){
		
		EList<Composition> eListCompositions = new BasicEList<Composition>();
		eListCompositions.addAll(getDirectAllCompositions(node));
		eListCompositions.addAll(getAllCompositionSubClass(node));
		
		return eListCompositions;
	}

	private void calculateAmountOfConcreteClasses(SubGraph subGraph, EList<EClass> listEClasses, Map<EClass, Node> mapElements) {
		
		int amountOfConcreteClasses = 0;
		int amountOfAbstractEClass = 0;
		EList<EClass> listEClassOut = new BasicEList<EClass>();
		Iterator<Node> itNodes = subGraph.getNodes().iterator();
		while (itNodes.hasNext()) {
			Node node = (Node) itNodes.next();
			if(node.getEClass().isAbstract() == false)
				amountOfConcreteClasses = amountOfConcreteClasses + 1;
			else
				amountOfAbstractEClass = amountOfAbstractEClass + 1;		
		}
		
		int parentEClass = 0;
		int parentAbstractEClass = 0;
		
		Iterator<EClass> itlistEClasses = listEClasses.iterator();
		while (itlistEClasses.hasNext()) {
			EClass eClass = (EClass) itlistEClasses.next();
			Object element = mapElements.get(eClass);
			if(/*eClass.isAbstract() == false &&*/ element==null){
				
				boolean isSuperType = false;
				for (Map.Entry<EClass, Node> entry : mapElements.entrySet()) {
					EClass eClassMap = (EClass) entry.getKey();
					int pos = eClassMap.getEAllSuperTypes().indexOf(eClass);
					if(pos!=-1){
						isSuperType = true;
						break;
					}
				}
				if(isSuperType == false)		
					listEClassOut.add(eClass);
				else {
					if(eClass.isAbstract() == true)
						parentAbstractEClass = parentAbstractEClass + 1;
					else
						parentEClass = parentEClass + 1;
				}
			}
		}
		
		subGraph.setAmountEClassesOut(listEClassOut.size());
		subGraph.setAmountOfParentEClass(parentEClass);
		subGraph.setAmountOfParentAbstractEClass(parentAbstractEClass);
		subGraph.getEClassesListOut().addAll(listEClassOut);
		subGraph.setAmountOfConcreteEClass(amountOfConcreteClasses);
		subGraph.setAmountOfAbstractEClass(amountOfAbstractEClass);
		
	}

	private EList<EClass> getAbstractEClasses(EList<EClass> list_classes) {
		
		EList<EClass> listAbstractEClasses = new BasicEList<EClass>();
		Iterator<EClass> itAbstractEClasses = list_classes.iterator();
		while (itAbstractEClasses.hasNext()) {
			EClass eClass = (EClass) itAbstractEClasses.next();
			if(eClass.isAbstract())
				listAbstractEClasses.add(eClass);
		}			
		return listAbstractEClasses;		
	}

	private void SubClasses(Node node, SubGraph subGraph, ArrayList<EClass> arrayEAllClasses,
			Map<EClass, Node> mapElements, EList<EClass> eClassesList) {
		
		Iterator<EClass> itListClasses = eClassesList.iterator();
		EClass eClassP = node.getEClass();
		while (itListClasses.hasNext()) {
		
			EClass eClass = (EClass) itListClasses.next();
			EList<EClass> listSuper = eClass.getEAllSuperTypes();
			EList<EClass> listDirectSuperClass = eClass.getESuperTypes();
			int index = listSuper.indexOf(eClassP);
			if(index != -1){
				Node subClassNode = mapElements.get(eClass);
				if(subClassNode == null){
					subClassNode = MetaModelGraphFactoryImpl.eINSTANCE.createNode();
					subClassNode.setEClass(eClass);
					subGraph.getNodes().add(subClassNode);
					mapElements.put(eClass, subClassNode);
					arrayEAllClasses.add(eClass);
				}
				SubClass sub = MetaModelGraphFactoryImpl.eINSTANCE.createSubClass();
				sub.setTarget(subClassNode);
				subGraph.getRelations().add(sub);
				node.getSubClasses().add(sub);		
				if(listDirectSuperClass.indexOf(eClassP)!=-1)
					node.getDirectSubclasses().add(sub);
			}
		}		
		
	}

	private void annotateProjectPackageAndUnits(SubGraph subGraph) {
		
		//Project 
		subGraph.getRoot().getEnumModularNotation().add(EnumModular.PROJECT);
		
		boolean existRecursion = detectRecursion(subGraph.getRoot());
		if(existRecursion == true)
			subGraph.getRoot().getEnumModularNotation().add(EnumModular.RECURSION_PACKAGE);
		
		EList<Node> eListAllNodes = new BasicEList<Node>();
		eListAllNodes.add(subGraph.getRoot());
		
		for (int i = 0; i < eListAllNodes.size(); i++){
			
			Node sourceNode = eListAllNodes.get(i);
			if(sourceNode.equals(subGraph.getRoot())){
				
				//Analyze Compositions
				Iterator<Composition> itCompositions = sourceNode.getCompositions().iterator();
				while (itCompositions.hasNext()) {
					
					Composition composition = (Composition) itCompositions.next();
					Node currentNode = composition.getTarget();
					existRecursion = detectRecursion(currentNode);
					if(existRecursion==true){
						if(currentNode.getEClass().isAbstract() == false)
							currentNode.getEnumModularNotation().add(EnumModular.RECURSION_PACKAGE);
						else 
							currentNode.getEnumModularNotation().add(EnumModular.RECURSION_ABSTRACT_PACKAGE);
						if(eListAllNodes.indexOf(currentNode)==-1)
							eListAllNodes.add(currentNode);
					}
					else
					{
						boolean hasComp = hasCompositionLevel(currentNode,0);
						if(hasComp==true){
							if(currentNode.getEClass().isAbstract() == false)
								currentNode.getEnumModularNotation().add(EnumModular.PACKAGE);
							else 
								currentNode.getEnumModularNotation().add(EnumModular.ABSTRACT_PACKAGE_UNIT);
							if(eListAllNodes.indexOf(currentNode)==-1)
								eListAllNodes.add(currentNode);
						}
						else
							AnnotateUnit(currentNode);						
					}
				}
				
			}else{
				
				boolean hasCompo = hasCompositionLevel(sourceNode, 0);
				if(hasCompo == true){
					
					//Analyze Compositions
					Iterator<Composition> itCompositions = this.getAllCompositions(sourceNode).iterator();				
					while (itCompositions.hasNext()) {
						Composition composition = (Composition) itCompositions.next();
						Node currentNode = composition.getTarget();
						if(sourceNode.getEnumModularNotation().indexOf(EnumModular.RECURSION_PACKAGE)!=-1){
							if(currentNode.getEClass().isAbstract() == false)
								currentNode.getEnumModularNotation().add(EnumModular.UNIT);
							else
								AnnotateUnit(currentNode);
						}
						else{
							existRecursion = detectRecursion(currentNode);
							if (existRecursion==true) {							
								if(currentNode.getEClass().isAbstract() == false)
									currentNode.getEnumModularNotation().add(EnumModular.RECURSION_PACKAGE);
								else 
									currentNode.getEnumModularNotation().add(EnumModular.RECURSION_ABSTRACT_PACKAGE);
							}
							else{
								boolean hasComp = hasCompositionLevel(currentNode,1);
								if(hasComp==true){
									if(currentNode.getEClass().isAbstract() == false)
										currentNode.getEnumModularNotation().add(EnumModular.PACKAGE);
									else 
										currentNode.getEnumModularNotation().add(EnumModular.ABSTRACT_PACKAGE_UNIT);															
								}
								else
									currentNode.getEnumModularNotation().add(EnumModular.UNIT);
							}
							if(eListAllNodes.indexOf(currentNode)==-1)
								eListAllNodes.add(currentNode);
						}
					}
					
					Iterator<SubClass> itAllSubClasses = sourceNode.getSubClasses().iterator();
					while (itAllSubClasses.hasNext()) {
						SubClass subClass = (SubClass) itAllSubClasses.next();
						//if(subClass.getTarget().getCompositions().size() == 0 && subClass.getTarget().getEClass().isAbstract() == false)
						//	subClass.getTarget().getEnumModularNotation().add(EnumModular.UNIT);
						//else{
							if(eListAllNodes.indexOf(subClass.getTarget())==-1)
								eListAllNodes.add(subClass.getTarget());
						//}							
					}
					
					existRecursion = detectRecursion(sourceNode);
					if(existRecursion == true){
						
						if(sourceNode.getEClass().isAbstract() == true)
							sourceNode.getEnumModularNotation().add(EnumModular.RECURSION_ABSTRACT_PACKAGE);
						else
							sourceNode.getEnumModularNotation().add(EnumModular.RECURSION_PACKAGE);
						
					}
					else{
						if(sourceNode.getEClass().isAbstract() == true)
							sourceNode.getEnumModularNotation().add(EnumModular.ABSTRACT_PACKAGE_UNIT);
						else
							sourceNode.getEnumModularNotation().add(EnumModular.PACKAGE);
					}
				}
				else{
					
					AnnotateUnit(sourceNode);
				}				
				
			}
		}		
	}
		
	private boolean detectRecursion(Node node) {
		
		EList<Node> listOfNodes = new BasicEList<Node>();
		listOfNodes.add(node);
		for (int i = 0; i < listOfNodes.size(); i++) {

			Node currentNode = listOfNodes.get(i);
			Iterator<Composition> itCompositions =  getAllCompositions(currentNode).iterator();
			while (itCompositions.hasNext()) {
				Composition composition = (Composition) itCompositions.next();
				Node target = composition.getTarget();
				if(target.equals(node) ^ isSubEClass(target, node)==true)
					return true;
				else{
					if(listOfNodes.indexOf(target)==-1)
						listOfNodes.add(target);
				}				
			}			
		}		
		return false;
	}
	
	private boolean isSubEClass(Node parent,Node children){
		
		Iterator<SubClass> itSubClasses = parent.getSubClasses().iterator();
		while (itSubClasses.hasNext()) {
			SubClass subClass = (SubClass) itSubClasses.next();
			if(subClass.getTarget().equals(children))
				return true;
		}
		return false;
	}

	private void AnnotateUnit(Node node){
		
		boolean existRecursion = detectRecursion(node);
		if(existRecursion == false){
			if(node.getEClass().isAbstract() == true)
				node.getEnumModularNotation().add(EnumModular.ABSTRACT_UNIT);
			else
				node.getEnumModularNotation().add(EnumModular.UNIT);
		}
		else{
			if(node.getEClass().isAbstract() == true)
				node.getEnumModularNotation().add(EnumModular.RECURSION_ABSTRACT_UNIT);
			else
				node.getEnumModularNotation().add(EnumModular.RECURSION_UNIT);
		}
		Iterator<SubClass> itAllSubClasses = node.getSubClasses().iterator();
		while (itAllSubClasses.hasNext()) {
			SubClass subClass = (SubClass) itAllSubClasses.next();
			existRecursion = detectRecursion(subClass.getTarget());
			if(existRecursion==false)
			{
				if(subClass.getTarget().getEClass().isAbstract() == false)
					subClass.getTarget().getEnumModularNotation().add(EnumModular.UNIT);
				else
					subClass.getTarget().getEnumModularNotation().add(EnumModular.ABSTRACT_UNIT);
			}
			else{
				
				if(subClass.getTarget().getEClass().isAbstract() == false)
					subClass.getTarget().getEnumModularNotation().add(EnumModular.RECURSION_UNIT);
				else
					subClass.getTarget().getEnumModularNotation().add(EnumModular.RECURSION_ABSTRACT_UNIT);
				
			}				
		}		
	}
	
	/*
	 * True has composition to unvisited node 
	 * False has no composition
	 * */
	private boolean hasCompositionLevel(Node node,int level){
	
		Iterator<Composition> itCompositions = getAllCompositions(node).iterator();
		if(itCompositions.hasNext() == false)
			return false;
		while (itCompositions.hasNext()) {
			Composition composition = (Composition) itCompositions.next();
			Node currentNode = composition.getTarget();			
			if(currentNode.equals(node) == false){	
			
				if(currentNode.getEnumModularNotation().equals(EnumModular.DEFAULT) || level==1)
					return true;			
				else
					return hasCompositionLevel(currentNode, 1);
			}		
		}		
		return false;
	}
	
	
}
