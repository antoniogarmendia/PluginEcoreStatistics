/**
 */
package graph.impl;

import graph.AbstractNode;
import graph.GraphElement;
import graph.GraphPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link graph.impl.AbstractNodeImpl#getChildrenContainments <em>Children Containments</em>}</li>
 *   <li>{@link graph.impl.AbstractNodeImpl#getChildrenReferences <em>Children References</em>}</li>
 *   <li>{@link graph.impl.AbstractNodeImpl#getReferencesTo <em>References To</em>}</li>
 *   <li>{@link graph.impl.AbstractNodeImpl#getContainmentReferences <em>Containment References</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractNodeImpl extends GraphElementImpl implements AbstractNode {
	/**
	 * The cached value of the '{@link #getChildrenContainments() <em>Children Containments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildrenContainments()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphElement> childrenContainments;

	/**
	 * The cached value of the '{@link #getChildrenReferences() <em>Children References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildrenReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphElement> childrenReferences;

	/**
	 * The cached value of the '{@link #getReferencesTo() <em>References To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphElement> referencesTo;

	/**
	 * The cached value of the '{@link #getContainmentReferences() <em>Containment References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainmentReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<EReference> containmentReferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.ABSTRACT_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphElement> getChildrenContainments() {
		if (childrenContainments == null) {
			childrenContainments = new EObjectContainmentEList<GraphElement>(GraphElement.class, this, GraphPackage.ABSTRACT_NODE__CHILDREN_CONTAINMENTS);
		}
		return childrenContainments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphElement> getChildrenReferences() {
		if (childrenReferences == null) {
			childrenReferences = new EObjectResolvingEList<GraphElement>(GraphElement.class, this, GraphPackage.ABSTRACT_NODE__CHILDREN_REFERENCES);
		}
		return childrenReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GraphElement> getReferencesTo() {
		if (referencesTo == null) {
			referencesTo = new EObjectResolvingEList<GraphElement>(GraphElement.class, this, GraphPackage.ABSTRACT_NODE__REFERENCES_TO);
		}
		return referencesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EReference> getContainmentReferences() {
		if (containmentReferences == null) {
			containmentReferences = new EObjectResolvingEList<EReference>(EReference.class, this, GraphPackage.ABSTRACT_NODE__CONTAINMENT_REFERENCES);
		}
		return containmentReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.ABSTRACT_NODE__CHILDREN_CONTAINMENTS:
				return ((InternalEList<?>)getChildrenContainments()).basicRemove(otherEnd, msgs);
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
			case GraphPackage.ABSTRACT_NODE__CHILDREN_CONTAINMENTS:
				return getChildrenContainments();
			case GraphPackage.ABSTRACT_NODE__CHILDREN_REFERENCES:
				return getChildrenReferences();
			case GraphPackage.ABSTRACT_NODE__REFERENCES_TO:
				return getReferencesTo();
			case GraphPackage.ABSTRACT_NODE__CONTAINMENT_REFERENCES:
				return getContainmentReferences();
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
			case GraphPackage.ABSTRACT_NODE__CHILDREN_CONTAINMENTS:
				getChildrenContainments().clear();
				getChildrenContainments().addAll((Collection<? extends GraphElement>)newValue);
				return;
			case GraphPackage.ABSTRACT_NODE__CHILDREN_REFERENCES:
				getChildrenReferences().clear();
				getChildrenReferences().addAll((Collection<? extends GraphElement>)newValue);
				return;
			case GraphPackage.ABSTRACT_NODE__REFERENCES_TO:
				getReferencesTo().clear();
				getReferencesTo().addAll((Collection<? extends GraphElement>)newValue);
				return;
			case GraphPackage.ABSTRACT_NODE__CONTAINMENT_REFERENCES:
				getContainmentReferences().clear();
				getContainmentReferences().addAll((Collection<? extends EReference>)newValue);
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
			case GraphPackage.ABSTRACT_NODE__CHILDREN_CONTAINMENTS:
				getChildrenContainments().clear();
				return;
			case GraphPackage.ABSTRACT_NODE__CHILDREN_REFERENCES:
				getChildrenReferences().clear();
				return;
			case GraphPackage.ABSTRACT_NODE__REFERENCES_TO:
				getReferencesTo().clear();
				return;
			case GraphPackage.ABSTRACT_NODE__CONTAINMENT_REFERENCES:
				getContainmentReferences().clear();
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
			case GraphPackage.ABSTRACT_NODE__CHILDREN_CONTAINMENTS:
				return childrenContainments != null && !childrenContainments.isEmpty();
			case GraphPackage.ABSTRACT_NODE__CHILDREN_REFERENCES:
				return childrenReferences != null && !childrenReferences.isEmpty();
			case GraphPackage.ABSTRACT_NODE__REFERENCES_TO:
				return referencesTo != null && !referencesTo.isEmpty();
			case GraphPackage.ABSTRACT_NODE__CONTAINMENT_REFERENCES:
				return containmentReferences != null && !containmentReferences.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractNodeImpl
