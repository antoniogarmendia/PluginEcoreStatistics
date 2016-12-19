/**
 */
package MetaModelGraph.impl;

import MetaModelGraph.Composition;
import MetaModelGraph.MetaModelGraphPackage;

import MetaModelGraph.Node;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetaModelGraph.impl.CompositionImpl#getEReference <em>EReference</em>}</li>
 *   <li>{@link MetaModelGraph.impl.CompositionImpl#getParentNode <em>Parent Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionImpl extends RelationImpl implements Composition {
	/**
	 * The cached value of the '{@link #getEReference() <em>EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEReference()
	 * @generated
	 * @ordered
	 */
	protected EReference eReference;

	/**
	 * The cached value of the '{@link #getParentNode() <em>Parent Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentNode()
	 * @generated
	 * @ordered
	 */
	protected Node parentNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelGraphPackage.Literals.COMPOSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEReference() {
		if (eReference != null && eReference.eIsProxy()) {
			InternalEObject oldEReference = (InternalEObject)eReference;
			eReference = (EReference)eResolveProxy(oldEReference);
			if (eReference != oldEReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelGraphPackage.COMPOSITION__EREFERENCE, oldEReference, eReference));
			}
		}
		return eReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference basicGetEReference() {
		return eReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEReference(EReference newEReference) {
		EReference oldEReference = eReference;
		eReference = newEReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelGraphPackage.COMPOSITION__EREFERENCE, oldEReference, eReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getParentNode() {
		if (parentNode != null && parentNode.eIsProxy()) {
			InternalEObject oldParentNode = (InternalEObject)parentNode;
			parentNode = (Node)eResolveProxy(oldParentNode);
			if (parentNode != oldParentNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelGraphPackage.COMPOSITION__PARENT_NODE, oldParentNode, parentNode));
			}
		}
		return parentNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetParentNode() {
		return parentNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentNode(Node newParentNode, NotificationChain msgs) {
		Node oldParentNode = parentNode;
		parentNode = newParentNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaModelGraphPackage.COMPOSITION__PARENT_NODE, oldParentNode, newParentNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentNode(Node newParentNode) {
		if (newParentNode != parentNode) {
			NotificationChain msgs = null;
			if (parentNode != null)
				msgs = ((InternalEObject)parentNode).eInverseRemove(this, MetaModelGraphPackage.NODE__DIRECT_COMPOSITION, Node.class, msgs);
			if (newParentNode != null)
				msgs = ((InternalEObject)newParentNode).eInverseAdd(this, MetaModelGraphPackage.NODE__DIRECT_COMPOSITION, Node.class, msgs);
			msgs = basicSetParentNode(newParentNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelGraphPackage.COMPOSITION__PARENT_NODE, newParentNode, newParentNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaModelGraphPackage.COMPOSITION__PARENT_NODE:
				if (parentNode != null)
					msgs = ((InternalEObject)parentNode).eInverseRemove(this, MetaModelGraphPackage.NODE__DIRECT_COMPOSITION, Node.class, msgs);
				return basicSetParentNode((Node)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaModelGraphPackage.COMPOSITION__PARENT_NODE:
				return basicSetParentNode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaModelGraphPackage.COMPOSITION__EREFERENCE:
				if (resolve) return getEReference();
				return basicGetEReference();
			case MetaModelGraphPackage.COMPOSITION__PARENT_NODE:
				if (resolve) return getParentNode();
				return basicGetParentNode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetaModelGraphPackage.COMPOSITION__EREFERENCE:
				setEReference((EReference)newValue);
				return;
			case MetaModelGraphPackage.COMPOSITION__PARENT_NODE:
				setParentNode((Node)newValue);
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
			case MetaModelGraphPackage.COMPOSITION__EREFERENCE:
				setEReference((EReference)null);
				return;
			case MetaModelGraphPackage.COMPOSITION__PARENT_NODE:
				setParentNode((Node)null);
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
			case MetaModelGraphPackage.COMPOSITION__EREFERENCE:
				return eReference != null;
			case MetaModelGraphPackage.COMPOSITION__PARENT_NODE:
				return parentNode != null;
		}
		return super.eIsSet(featureID);
	}

} //CompositionImpl
