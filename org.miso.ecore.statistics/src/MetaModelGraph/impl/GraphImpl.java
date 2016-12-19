/**
 */
package MetaModelGraph.impl;

import MetaModelGraph.Graph;
import MetaModelGraph.MetaModelGraphPackage;
import MetaModelGraph.SubGraph;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetaModelGraph.impl.GraphImpl#getSubgraph <em>Subgraph</em>}</li>
 *   <li>{@link MetaModelGraph.impl.GraphImpl#getEClassList <em>EClass List</em>}</li>
 *   <li>{@link MetaModelGraph.impl.GraphImpl#getEClassAbstract <em>EClass Abstract</em>}</li>
 *   <li>{@link MetaModelGraph.impl.GraphImpl#getAmountEClasses <em>Amount EClasses</em>}</li>
 *   <li>{@link MetaModelGraph.impl.GraphImpl#getAmountAbstractEClasses <em>Amount Abstract EClasses</em>}</li>
 *   <li>{@link MetaModelGraph.impl.GraphImpl#getAmountConcreteEClass <em>Amount Concrete EClass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphImpl extends MinimalEObjectImpl.Container implements Graph {
	/**
	 * The cached value of the '{@link #getSubgraph() <em>Subgraph</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubgraph()
	 * @generated
	 * @ordered
	 */
	protected EList<SubGraph> subgraph;

	/**
	 * The cached value of the '{@link #getEClassList() <em>EClass List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClassList()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> eClassList;

	/**
	 * The cached value of the '{@link #getEClassAbstract() <em>EClass Abstract</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClassAbstract()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> eClassAbstract;

	/**
	 * The default value of the '{@link #getAmountEClasses() <em>Amount EClasses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountEClasses()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_ECLASSES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountEClasses() <em>Amount EClasses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountEClasses()
	 * @generated
	 * @ordered
	 */
	protected int amountEClasses = AMOUNT_ECLASSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountAbstractEClasses() <em>Amount Abstract EClasses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAbstractEClasses()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_ABSTRACT_ECLASSES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountAbstractEClasses() <em>Amount Abstract EClasses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAbstractEClasses()
	 * @generated
	 * @ordered
	 */
	protected int amountAbstractEClasses = AMOUNT_ABSTRACT_ECLASSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountConcreteEClass() <em>Amount Concrete EClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountConcreteEClass()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_CONCRETE_ECLASS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountConcreteEClass() <em>Amount Concrete EClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountConcreteEClass()
	 * @generated
	 * @ordered
	 */
	protected int amountConcreteEClass = AMOUNT_CONCRETE_ECLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelGraphPackage.Literals.GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubGraph> getSubgraph() {
		if (subgraph == null) {
			subgraph = new EObjectContainmentEList<SubGraph>(SubGraph.class, this, MetaModelGraphPackage.GRAPH__SUBGRAPH);
		}
		return subgraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getEClassList() {
		if (eClassList == null) {
			eClassList = new EObjectResolvingEList<EClass>(EClass.class, this, MetaModelGraphPackage.GRAPH__ECLASS_LIST);
		}
		return eClassList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getEClassAbstract() {
		if (eClassAbstract == null) {
			eClassAbstract = new EObjectResolvingEList<EClass>(EClass.class, this, MetaModelGraphPackage.GRAPH__ECLASS_ABSTRACT);
		}
		return eClassAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getAmountEClasses() {
		return getEClassList().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountEClasses(int newAmountEClasses) {
		int oldAmountEClasses = amountEClasses;
		amountEClasses = newAmountEClasses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelGraphPackage.GRAPH__AMOUNT_ECLASSES, oldAmountEClasses, amountEClasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getAmountAbstractEClasses() {
		return getEClassAbstract().size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountAbstractEClasses(int newAmountAbstractEClasses) {
		int oldAmountAbstractEClasses = amountAbstractEClasses;
		amountAbstractEClasses = newAmountAbstractEClasses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelGraphPackage.GRAPH__AMOUNT_ABSTRACT_ECLASSES, oldAmountAbstractEClasses, amountAbstractEClasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getAmountConcreteEClass() {
		return getAmountEClasses() - getAmountAbstractEClasses();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountConcreteEClass(int newAmountConcreteEClass) {
		int oldAmountConcreteEClass = amountConcreteEClass;
		amountConcreteEClass = newAmountConcreteEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelGraphPackage.GRAPH__AMOUNT_CONCRETE_ECLASS, oldAmountConcreteEClass, amountConcreteEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaModelGraphPackage.GRAPH__SUBGRAPH:
				return ((InternalEList<?>)getSubgraph()).basicRemove(otherEnd, msgs);
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
			case MetaModelGraphPackage.GRAPH__SUBGRAPH:
				return getSubgraph();
			case MetaModelGraphPackage.GRAPH__ECLASS_LIST:
				return getEClassList();
			case MetaModelGraphPackage.GRAPH__ECLASS_ABSTRACT:
				return getEClassAbstract();
			case MetaModelGraphPackage.GRAPH__AMOUNT_ECLASSES:
				return getAmountEClasses();
			case MetaModelGraphPackage.GRAPH__AMOUNT_ABSTRACT_ECLASSES:
				return getAmountAbstractEClasses();
			case MetaModelGraphPackage.GRAPH__AMOUNT_CONCRETE_ECLASS:
				return getAmountConcreteEClass();
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
			case MetaModelGraphPackage.GRAPH__SUBGRAPH:
				getSubgraph().clear();
				getSubgraph().addAll((Collection<? extends SubGraph>)newValue);
				return;
			case MetaModelGraphPackage.GRAPH__ECLASS_LIST:
				getEClassList().clear();
				getEClassList().addAll((Collection<? extends EClass>)newValue);
				return;
			case MetaModelGraphPackage.GRAPH__ECLASS_ABSTRACT:
				getEClassAbstract().clear();
				getEClassAbstract().addAll((Collection<? extends EClass>)newValue);
				return;
			case MetaModelGraphPackage.GRAPH__AMOUNT_ECLASSES:
				setAmountEClasses((Integer)newValue);
				return;
			case MetaModelGraphPackage.GRAPH__AMOUNT_ABSTRACT_ECLASSES:
				setAmountAbstractEClasses((Integer)newValue);
				return;
			case MetaModelGraphPackage.GRAPH__AMOUNT_CONCRETE_ECLASS:
				setAmountConcreteEClass((Integer)newValue);
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
			case MetaModelGraphPackage.GRAPH__SUBGRAPH:
				getSubgraph().clear();
				return;
			case MetaModelGraphPackage.GRAPH__ECLASS_LIST:
				getEClassList().clear();
				return;
			case MetaModelGraphPackage.GRAPH__ECLASS_ABSTRACT:
				getEClassAbstract().clear();
				return;
			case MetaModelGraphPackage.GRAPH__AMOUNT_ECLASSES:
				setAmountEClasses(AMOUNT_ECLASSES_EDEFAULT);
				return;
			case MetaModelGraphPackage.GRAPH__AMOUNT_ABSTRACT_ECLASSES:
				setAmountAbstractEClasses(AMOUNT_ABSTRACT_ECLASSES_EDEFAULT);
				return;
			case MetaModelGraphPackage.GRAPH__AMOUNT_CONCRETE_ECLASS:
				setAmountConcreteEClass(AMOUNT_CONCRETE_ECLASS_EDEFAULT);
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
			case MetaModelGraphPackage.GRAPH__SUBGRAPH:
				return subgraph != null && !subgraph.isEmpty();
			case MetaModelGraphPackage.GRAPH__ECLASS_LIST:
				return eClassList != null && !eClassList.isEmpty();
			case MetaModelGraphPackage.GRAPH__ECLASS_ABSTRACT:
				return eClassAbstract != null && !eClassAbstract.isEmpty();
			case MetaModelGraphPackage.GRAPH__AMOUNT_ECLASSES:
				return amountEClasses != AMOUNT_ECLASSES_EDEFAULT;
			case MetaModelGraphPackage.GRAPH__AMOUNT_ABSTRACT_ECLASSES:
				return amountAbstractEClasses != AMOUNT_ABSTRACT_ECLASSES_EDEFAULT;
			case MetaModelGraphPackage.GRAPH__AMOUNT_CONCRETE_ECLASS:
				return amountConcreteEClass != AMOUNT_CONCRETE_ECLASS_EDEFAULT;
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
		result.append(" (amountEClasses: ");
		result.append(amountEClasses);
		result.append(", amountAbstractEClasses: ");
		result.append(amountAbstractEClasses);
		result.append(", amountConcreteEClass: ");
		result.append(amountConcreteEClass);
		result.append(')');
		return result.toString();
	}

} //GraphImpl
