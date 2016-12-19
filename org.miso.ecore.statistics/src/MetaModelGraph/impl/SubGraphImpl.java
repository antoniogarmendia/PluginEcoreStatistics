/**
 */
package MetaModelGraph.impl;

import MetaModelGraph.MetaModelGraphPackage;
import MetaModelGraph.Node;
import MetaModelGraph.Relation;
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
 * An implementation of the model object '<em><b>Sub Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetaModelGraph.impl.SubGraphImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link MetaModelGraph.impl.SubGraphImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link MetaModelGraph.impl.SubGraphImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link MetaModelGraph.impl.SubGraphImpl#getAmountOfConcreteEClass <em>Amount Of Concrete EClass</em>}</li>
 *   <li>{@link MetaModelGraph.impl.SubGraphImpl#getEClassesListOut <em>EClasses List Out</em>}</li>
 *   <li>{@link MetaModelGraph.impl.SubGraphImpl#getAmountEClassesOut <em>Amount EClasses Out</em>}</li>
 *   <li>{@link MetaModelGraph.impl.SubGraphImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link MetaModelGraph.impl.SubGraphImpl#getAmountOfAbstractEClass <em>Amount Of Abstract EClass</em>}</li>
 *   <li>{@link MetaModelGraph.impl.SubGraphImpl#getAmountOfParentEClass <em>Amount Of Parent EClass</em>}</li>
 *   <li>{@link MetaModelGraph.impl.SubGraphImpl#getAmountOfParentAbstractEClass <em>Amount Of Parent Abstract EClass</em>}</li>
 *   <li>{@link MetaModelGraph.impl.SubGraphImpl#getAmountPackages <em>Amount Packages</em>}</li>
 *   <li>{@link MetaModelGraph.impl.SubGraphImpl#getAmountUnits <em>Amount Units</em>}</li>
 *   <li>{@link MetaModelGraph.impl.SubGraphImpl#getAmountRecursionUnits <em>Amount Recursion Units</em>}</li>
 *   <li>{@link MetaModelGraph.impl.SubGraphImpl#getAmountOfRecursionPackages <em>Amount Of Recursion Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubGraphImpl extends MinimalEObjectImpl.Container implements SubGraph {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> nodes;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

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
	 * The default value of the '{@link #getAmountOfConcreteEClass() <em>Amount Of Concrete EClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfConcreteEClass()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_OF_CONCRETE_ECLASS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountOfConcreteEClass() <em>Amount Of Concrete EClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfConcreteEClass()
	 * @generated
	 * @ordered
	 */
	protected int amountOfConcreteEClass = AMOUNT_OF_CONCRETE_ECLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEClassesListOut() <em>EClasses List Out</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClassesListOut()
	 * @generated
	 * @ordered
	 */
	protected EList<EClass> eClassesListOut;

	/**
	 * The default value of the '{@link #getAmountEClassesOut() <em>Amount EClasses Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountEClassesOut()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_ECLASSES_OUT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountEClassesOut() <em>Amount EClasses Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountEClassesOut()
	 * @generated
	 * @ordered
	 */
	protected int amountEClassesOut = AMOUNT_ECLASSES_OUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected Node root;

	/**
	 * The default value of the '{@link #getAmountOfAbstractEClass() <em>Amount Of Abstract EClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfAbstractEClass()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_OF_ABSTRACT_ECLASS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountOfAbstractEClass() <em>Amount Of Abstract EClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfAbstractEClass()
	 * @generated
	 * @ordered
	 */
	protected int amountOfAbstractEClass = AMOUNT_OF_ABSTRACT_ECLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountOfParentEClass() <em>Amount Of Parent EClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfParentEClass()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_OF_PARENT_ECLASS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountOfParentEClass() <em>Amount Of Parent EClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfParentEClass()
	 * @generated
	 * @ordered
	 */
	protected int amountOfParentEClass = AMOUNT_OF_PARENT_ECLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountOfParentAbstractEClass() <em>Amount Of Parent Abstract EClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfParentAbstractEClass()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_OF_PARENT_ABSTRACT_ECLASS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountOfParentAbstractEClass() <em>Amount Of Parent Abstract EClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfParentAbstractEClass()
	 * @generated
	 * @ordered
	 */
	protected int amountOfParentAbstractEClass = AMOUNT_OF_PARENT_ABSTRACT_ECLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountPackages() <em>Amount Packages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountPackages()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_PACKAGES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountPackages() <em>Amount Packages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountPackages()
	 * @generated
	 * @ordered
	 */
	protected int amountPackages = AMOUNT_PACKAGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountUnits() <em>Amount Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountUnits()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_UNITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountUnits() <em>Amount Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountUnits()
	 * @generated
	 * @ordered
	 */
	protected int amountUnits = AMOUNT_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountRecursionUnits() <em>Amount Recursion Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountRecursionUnits()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_RECURSION_UNITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountRecursionUnits() <em>Amount Recursion Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountRecursionUnits()
	 * @generated
	 * @ordered
	 */
	protected int amountRecursionUnits = AMOUNT_RECURSION_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountOfRecursionPackages() <em>Amount Of Recursion Packages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfRecursionPackages()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_OF_RECURSION_PACKAGES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountOfRecursionPackages() <em>Amount Of Recursion Packages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfRecursionPackages()
	 * @generated
	 * @ordered
	 */
	protected int amountOfRecursionPackages = AMOUNT_OF_RECURSION_PACKAGES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelGraphPackage.Literals.SUB_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<Node>(Node.class, this, MetaModelGraphPackage.SUB_GRAPH__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, MetaModelGraphPackage.SUB_GRAPH__RELATIONS);
		}
		return relations;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelGraphPackage.SUB_GRAPH__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmountOfConcreteEClass() {
		return amountOfConcreteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountOfConcreteEClass(int newAmountOfConcreteEClass) {
		int oldAmountOfConcreteEClass = amountOfConcreteEClass;
		amountOfConcreteEClass = newAmountOfConcreteEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_CONCRETE_ECLASS, oldAmountOfConcreteEClass, amountOfConcreteEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClass> getEClassesListOut() {
		if (eClassesListOut == null) {
			eClassesListOut = new EObjectResolvingEList<EClass>(EClass.class, this, MetaModelGraphPackage.SUB_GRAPH__ECLASSES_LIST_OUT);
		}
		return eClassesListOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmountEClassesOut() {
		return amountEClassesOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountEClassesOut(int newAmountEClassesOut) {
		int oldAmountEClassesOut = amountEClassesOut;
		amountEClassesOut = newAmountEClassesOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelGraphPackage.SUB_GRAPH__AMOUNT_ECLASSES_OUT, oldAmountEClassesOut, amountEClassesOut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getRoot() {
		if (root != null && root.eIsProxy()) {
			InternalEObject oldRoot = (InternalEObject)root;
			root = (Node)eResolveProxy(oldRoot);
			if (root != oldRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelGraphPackage.SUB_GRAPH__ROOT, oldRoot, root));
			}
		}
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(Node newRoot) {
		Node oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelGraphPackage.SUB_GRAPH__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmountOfAbstractEClass() {
		return amountOfAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountOfAbstractEClass(int newAmountOfAbstractEClass) {
		int oldAmountOfAbstractEClass = amountOfAbstractEClass;
		amountOfAbstractEClass = newAmountOfAbstractEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_ABSTRACT_ECLASS, oldAmountOfAbstractEClass, amountOfAbstractEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmountOfParentEClass() {
		return amountOfParentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountOfParentEClass(int newAmountOfParentEClass) {
		int oldAmountOfParentEClass = amountOfParentEClass;
		amountOfParentEClass = newAmountOfParentEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_PARENT_ECLASS, oldAmountOfParentEClass, amountOfParentEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmountOfParentAbstractEClass() {
		return amountOfParentAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountOfParentAbstractEClass(int newAmountOfParentAbstractEClass) {
		int oldAmountOfParentAbstractEClass = amountOfParentAbstractEClass;
		amountOfParentAbstractEClass = newAmountOfParentAbstractEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_PARENT_ABSTRACT_ECLASS, oldAmountOfParentAbstractEClass, amountOfParentAbstractEClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmountPackages() {
		return amountPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountPackages(int newAmountPackages) {
		int oldAmountPackages = amountPackages;
		amountPackages = newAmountPackages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelGraphPackage.SUB_GRAPH__AMOUNT_PACKAGES, oldAmountPackages, amountPackages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmountUnits() {
		return amountUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountUnits(int newAmountUnits) {
		int oldAmountUnits = amountUnits;
		amountUnits = newAmountUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelGraphPackage.SUB_GRAPH__AMOUNT_UNITS, oldAmountUnits, amountUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmountRecursionUnits() {
		return amountRecursionUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountRecursionUnits(int newAmountRecursionUnits) {
		int oldAmountRecursionUnits = amountRecursionUnits;
		amountRecursionUnits = newAmountRecursionUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelGraphPackage.SUB_GRAPH__AMOUNT_RECURSION_UNITS, oldAmountRecursionUnits, amountRecursionUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmountOfRecursionPackages() {
		return amountOfRecursionPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountOfRecursionPackages(int newAmountOfRecursionPackages) {
		int oldAmountOfRecursionPackages = amountOfRecursionPackages;
		amountOfRecursionPackages = newAmountOfRecursionPackages;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_RECURSION_PACKAGES, oldAmountOfRecursionPackages, amountOfRecursionPackages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaModelGraphPackage.SUB_GRAPH__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case MetaModelGraphPackage.SUB_GRAPH__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
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
			case MetaModelGraphPackage.SUB_GRAPH__NODES:
				return getNodes();
			case MetaModelGraphPackage.SUB_GRAPH__RELATIONS:
				return getRelations();
			case MetaModelGraphPackage.SUB_GRAPH__HEIGHT:
				return getHeight();
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_CONCRETE_ECLASS:
				return getAmountOfConcreteEClass();
			case MetaModelGraphPackage.SUB_GRAPH__ECLASSES_LIST_OUT:
				return getEClassesListOut();
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_ECLASSES_OUT:
				return getAmountEClassesOut();
			case MetaModelGraphPackage.SUB_GRAPH__ROOT:
				if (resolve) return getRoot();
				return basicGetRoot();
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_ABSTRACT_ECLASS:
				return getAmountOfAbstractEClass();
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_PARENT_ECLASS:
				return getAmountOfParentEClass();
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_PARENT_ABSTRACT_ECLASS:
				return getAmountOfParentAbstractEClass();
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_PACKAGES:
				return getAmountPackages();
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_UNITS:
				return getAmountUnits();
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_RECURSION_UNITS:
				return getAmountRecursionUnits();
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_RECURSION_PACKAGES:
				return getAmountOfRecursionPackages();
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
			case MetaModelGraphPackage.SUB_GRAPH__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_CONCRETE_ECLASS:
				setAmountOfConcreteEClass((Integer)newValue);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__ECLASSES_LIST_OUT:
				getEClassesListOut().clear();
				getEClassesListOut().addAll((Collection<? extends EClass>)newValue);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_ECLASSES_OUT:
				setAmountEClassesOut((Integer)newValue);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__ROOT:
				setRoot((Node)newValue);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_ABSTRACT_ECLASS:
				setAmountOfAbstractEClass((Integer)newValue);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_PARENT_ECLASS:
				setAmountOfParentEClass((Integer)newValue);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_PARENT_ABSTRACT_ECLASS:
				setAmountOfParentAbstractEClass((Integer)newValue);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_PACKAGES:
				setAmountPackages((Integer)newValue);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_UNITS:
				setAmountUnits((Integer)newValue);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_RECURSION_UNITS:
				setAmountRecursionUnits((Integer)newValue);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_RECURSION_PACKAGES:
				setAmountOfRecursionPackages((Integer)newValue);
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
			case MetaModelGraphPackage.SUB_GRAPH__NODES:
				getNodes().clear();
				return;
			case MetaModelGraphPackage.SUB_GRAPH__RELATIONS:
				getRelations().clear();
				return;
			case MetaModelGraphPackage.SUB_GRAPH__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_CONCRETE_ECLASS:
				setAmountOfConcreteEClass(AMOUNT_OF_CONCRETE_ECLASS_EDEFAULT);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__ECLASSES_LIST_OUT:
				getEClassesListOut().clear();
				return;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_ECLASSES_OUT:
				setAmountEClassesOut(AMOUNT_ECLASSES_OUT_EDEFAULT);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__ROOT:
				setRoot((Node)null);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_ABSTRACT_ECLASS:
				setAmountOfAbstractEClass(AMOUNT_OF_ABSTRACT_ECLASS_EDEFAULT);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_PARENT_ECLASS:
				setAmountOfParentEClass(AMOUNT_OF_PARENT_ECLASS_EDEFAULT);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_PARENT_ABSTRACT_ECLASS:
				setAmountOfParentAbstractEClass(AMOUNT_OF_PARENT_ABSTRACT_ECLASS_EDEFAULT);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_PACKAGES:
				setAmountPackages(AMOUNT_PACKAGES_EDEFAULT);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_UNITS:
				setAmountUnits(AMOUNT_UNITS_EDEFAULT);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_RECURSION_UNITS:
				setAmountRecursionUnits(AMOUNT_RECURSION_UNITS_EDEFAULT);
				return;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_RECURSION_PACKAGES:
				setAmountOfRecursionPackages(AMOUNT_OF_RECURSION_PACKAGES_EDEFAULT);
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
			case MetaModelGraphPackage.SUB_GRAPH__NODES:
				return nodes != null && !nodes.isEmpty();
			case MetaModelGraphPackage.SUB_GRAPH__RELATIONS:
				return relations != null && !relations.isEmpty();
			case MetaModelGraphPackage.SUB_GRAPH__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_CONCRETE_ECLASS:
				return amountOfConcreteEClass != AMOUNT_OF_CONCRETE_ECLASS_EDEFAULT;
			case MetaModelGraphPackage.SUB_GRAPH__ECLASSES_LIST_OUT:
				return eClassesListOut != null && !eClassesListOut.isEmpty();
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_ECLASSES_OUT:
				return amountEClassesOut != AMOUNT_ECLASSES_OUT_EDEFAULT;
			case MetaModelGraphPackage.SUB_GRAPH__ROOT:
				return root != null;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_ABSTRACT_ECLASS:
				return amountOfAbstractEClass != AMOUNT_OF_ABSTRACT_ECLASS_EDEFAULT;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_PARENT_ECLASS:
				return amountOfParentEClass != AMOUNT_OF_PARENT_ECLASS_EDEFAULT;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_PARENT_ABSTRACT_ECLASS:
				return amountOfParentAbstractEClass != AMOUNT_OF_PARENT_ABSTRACT_ECLASS_EDEFAULT;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_PACKAGES:
				return amountPackages != AMOUNT_PACKAGES_EDEFAULT;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_UNITS:
				return amountUnits != AMOUNT_UNITS_EDEFAULT;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_RECURSION_UNITS:
				return amountRecursionUnits != AMOUNT_RECURSION_UNITS_EDEFAULT;
			case MetaModelGraphPackage.SUB_GRAPH__AMOUNT_OF_RECURSION_PACKAGES:
				return amountOfRecursionPackages != AMOUNT_OF_RECURSION_PACKAGES_EDEFAULT;
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
		result.append(", amountOfConcreteEClass: ");
		result.append(amountOfConcreteEClass);
		result.append(", amountEClassesOut: ");
		result.append(amountEClassesOut);
		result.append(", amountOfAbstractEClass: ");
		result.append(amountOfAbstractEClass);
		result.append(", amountOfParentEClass: ");
		result.append(amountOfParentEClass);
		result.append(", amountOfParentAbstractEClass: ");
		result.append(amountOfParentAbstractEClass);
		result.append(", amountPackages: ");
		result.append(amountPackages);
		result.append(", amountUnits: ");
		result.append(amountUnits);
		result.append(", amountRecursionUnits: ");
		result.append(amountRecursionUnits);
		result.append(", amountOfRecursionPackages: ");
		result.append(amountOfRecursionPackages);
		result.append(')');
		return result.toString();
	}

} //SubGraphImpl
