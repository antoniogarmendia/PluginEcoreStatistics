/**
 */
package graph.impl;

import graph.GraphPackage;
import graph.GraphRoot;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graph.impl.GraphRootImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link graph.impl.GraphRootImpl#getAmountOfNodes <em>Amount Of Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphRootImpl extends NodeImpl implements GraphRoot {
	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountOfNodes() <em>Amount Of Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfNodes()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_OF_NODES_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getAmountOfNodes() <em>Amount Of Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfNodes()
	 * @generated
	 * @ordered
	 */
	protected int amountOfNodes = AMOUNT_OF_NODES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.GRAPH_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GRAPH_ROOT__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmountOfNodes() {
		return amountOfNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountOfNodes(int newAmountOfNodes) {
		int oldAmountOfNodes = amountOfNodes;
		amountOfNodes = newAmountOfNodes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphPackage.GRAPH_ROOT__AMOUNT_OF_NODES, oldAmountOfNodes, amountOfNodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphPackage.GRAPH_ROOT__HEIGHT:
				return getHeight();
			case GraphPackage.GRAPH_ROOT__AMOUNT_OF_NODES:
				return getAmountOfNodes();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphPackage.GRAPH_ROOT__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case GraphPackage.GRAPH_ROOT__AMOUNT_OF_NODES:
				setAmountOfNodes((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphPackage.GRAPH_ROOT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case GraphPackage.GRAPH_ROOT__AMOUNT_OF_NODES:
				setAmountOfNodes(AMOUNT_OF_NODES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphPackage.GRAPH_ROOT__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case GraphPackage.GRAPH_ROOT__AMOUNT_OF_NODES:
				return amountOfNodes != AMOUNT_OF_NODES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (height: ");
		result.append(height);
		result.append(", amountOfNodes: ");
		result.append(amountOfNodes);
		result.append(')');
		return result.toString();
	}

} //GraphRootImpl
