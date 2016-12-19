package org.miso.ecore.statistics.dialogs;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

public class EcoreStatistics {

	public URI ecoreURI;
	private ResourceSet resourceSetEcore;
	private Resource resEcore;
	public EList<EClass> listEClasses;
	public boolean error;
	
	
	public EcoreStatistics(URI ecoreURI) {
		super();
		this.ecoreURI = ecoreURI;
		this.resEcore = null;
		this.resourceSetEcore = new ResourceSetImpl();
		this.listEClasses = null;	
		this.error = false;
	}
	
	public boolean isError() {
		return error;
	}

	public Resource getResource()
	{
		if(this.resEcore==null){
			getResourceSet().getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap(true));
			getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap().put( 
					"ecore", new EcoreResourceFactoryImpl());
			try
			{
				this.resEcore = getResourceSet().getResource(getEcoreURI(),true);
			}
			catch(Exception e)
			{
				this.error = true;
				e.printStackTrace();
			}
		}
		return resEcore;
	}
	
	public URI getEcoreURI() {
		return ecoreURI;
	}

	public void setEcoreURI(URI ecoreURI) {
		this.ecoreURI = ecoreURI;
	}

	public ResourceSet getResourceSet() {
		return this.resourceSetEcore;
	}

	public void setResourceSet(ResourceSet resourceSet) {
		this.resourceSetEcore = resourceSet;
	}

	public EList<EClass> getList_classes() {
		// TODO Auto-generated method stub
		if(getResource()!=null)
		{
			if(listEClasses==null)
			{
				this.listEClasses = new BasicEList<EClass>();
				TreeIterator<EObject> itContents = getResource().getAllContents();
				while (itContents.hasNext()) {
					EObject eObject = (EObject) itContents.next();
					if(eObject instanceof EClass)
					{
						this.listEClasses.add((EClass) eObject);
					}
				}
			}
		}
		return this.listEClasses;
	}
	
	

}
