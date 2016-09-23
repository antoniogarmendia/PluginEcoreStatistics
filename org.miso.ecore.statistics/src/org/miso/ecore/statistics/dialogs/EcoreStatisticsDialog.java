package org.miso.ecore.statistics.dialogs;

import org.eclipse.core.resources.ResourcesPlugin;
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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;

public class EcoreStatisticsDialog extends Dialog{

	public EcoreStatisticsDialog(IShellProvider parentShell) {
		super(parentShell);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		// TODO Auto-generated method stub
		Composite container = (Composite) super.createDialogArea(parent);
		GridLayout layout_container = new GridLayout();
		layout_container.numColumns = 2;
		container.setLayout(layout_container);
		
		//Address
		GridData grid_address = new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1);
		Text address = new Text(container, SWT.BORDER | SWT.SINGLE);
		address.setText("platform:/resource/");
		address.setLayoutData(grid_address);
		
		//Browse Workspace
		GridData grid_ws = new GridData(SWT.RIGHT);
		Button btn_ws = new Button(container, SWT.NONE);
		btn_ws.setText("Browse Workspace");
		btn_ws.setLayoutData(grid_ws);
		
		//Listeners
		btn_ws.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				handleBrowseWorkspace();
			}				
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
            return new Point(450, 300);
    }
	
	public void handleBrowseWorkspace()
	{
		ContainerSelectionDialog browse = new ContainerSelectionDialog(getShell(), 
				ResourcesPlugin.getWorkspace().getRoot(), false, "Select Folder or Ecore Meta-model");
		
		
	}
}
