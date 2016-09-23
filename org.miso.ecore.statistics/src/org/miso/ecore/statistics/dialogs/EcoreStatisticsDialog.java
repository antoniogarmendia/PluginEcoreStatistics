package org.miso.ecore.statistics.dialogs;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
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
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

public class EcoreStatisticsDialog extends Dialog{
	
	//Widgets
	private Text address;
	public List list;
	
	public final String root = "platform:/resource";
	
	
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
		address.setText(root);
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
		
		//Create List
		this.list = new List (container, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
		
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
            return new Point(450, 300);
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
				address.setText(root.concat(((Path) result[0]).toString()));
				Fill_ListEcores();
			}
		}		
	}
	
	public void Fill_ListEcores()
	{
		
	}
	
}
