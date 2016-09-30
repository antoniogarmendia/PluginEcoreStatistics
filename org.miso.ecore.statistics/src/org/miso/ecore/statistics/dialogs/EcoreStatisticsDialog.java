package org.miso.ecore.statistics.dialogs;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
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


public class EcoreStatisticsDialog extends Dialog{
	
	//Widgets
	private Text address;
	public List list;
	
	//Label 
	private Label lb_amountClasses;
	private Label lb_amountContainment;
	private Label lb_amountNoNContainment;
		
	//Statistics MM
	private Label lb_amountMM;
	private Label lb_amountEClass;
	private Label lb_ecoreErrors;
	private Label lb_amountNONContainmentMM;
	public List listWOContainmentReferences;
	
	public EcoreStatisticsDialog(IShellProvider parentShell) {
		super(parentShell);
		this.address = null;
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		// TODO Auto-generated method stub
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
		
		//Amount of Classes
		Label lb_title_amountClasses = new Label(containerStats, SWT.NONE);
		lb_title_amountClasses.setText("Amount of EClasses: ");
		
		//Amount of Containment References
		lb_amountClasses = new Label(containerStats, SWT.NONE);
		lb_amountClasses.setText("Not Found");
		
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
		
		
		return container;
	}

	@Override
	protected void configureShell(Shell newShell) {
		// TODO Auto-generated method stub
		super.configureShell(newShell);
		newShell.setText("Ecore Statistics");
	}	
	
	@Override
    protected Point getInitialSize() {
            return new Point(900, 700);
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
						int amountOfContainment = AmountContainment(ecore.getList_classes());
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
		// TODO Auto-generated method stub
		if(res instanceof IFile)
		{
			if(res.getFileExtension().equals("ecore"))
				return true;
		}
		return false;
	}	
	
	public void EcoreStatisticsByName(String ecoreMM)
	{
		String path = "platform:/resource/" + address.getText() + "/" + ecoreMM;
		EcoreStatistics nemf = new EcoreStatistics(URI.createURI(path, false));
		
		if(nemf.getList_classes()!=null)
		{	
			lb_amountClasses.setText(Integer.toString(nemf.getList_classes().size()));
			lb_amountContainment.setText(Integer.toString(AmountContainment(nemf.getList_classes())));
			lb_amountNoNContainment.setText(Integer.toString(AmountNonContainment(nemf.getList_classes())));
		}
		else
		{
			lb_amountClasses.setText("Not Found, try to open with the Ecore Editor");
			lb_amountContainment.setText("Not Found");
			lb_amountNoNContainment.setText("Not Found");
		}
	}
	
	private int AmountContainment(EList<EClass> listEClass)
	{
		Iterator<EClass> itEClass = listEClass.iterator();
		int amount = 0;
		while (itEClass.hasNext()) {
			EClass eClass = (EClass) itEClass.next();
			amount = amount + eClass.getEAllContainments().size();
		}
		return amount;
	}
	
	private int AmountNonContainment(EList<EClass> listEClass)
	{
		Iterator<EClass> itEClass = listEClass.iterator();
		int amount = 0;
		while (itEClass.hasNext()) {
			EClass eClass = (EClass) itEClass.next();
			Iterator<EReference> references =  eClass.getEAllReferences().iterator();
			while (references.hasNext()) {
				EReference eReference = (EReference) references.next();
				if(eReference.isContainment() == false)
					amount = amount +1;
			}
		}
		return amount;
	}
	
}
