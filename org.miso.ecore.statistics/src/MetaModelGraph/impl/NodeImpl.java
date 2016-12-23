/**
 */
package MetaModelGraph.impl;

import MetaModelGraph.Composition;
import MetaModelGraph.EnumModular;
import MetaModelGraph.MetaModelGraphPackage;
import MetaModelGraph.Node;
import MetaModelGraph.Reference;

import MetaModelGraph.Relation;
import MetaModelGraph.SubClass;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetaModelGraph.impl.NodeImpl#getCompositions <em>Compositions</em>}</li>
 *   <li>{@link MetaModelGraph.impl.NodeImpl#getReferences <em>References</em>}</li>
 *   <li>{@link MetaModelGraph.impl.NodeImpl#getSubClasses <em>Sub Classes</em>}</li>
 *   <li>{@link MetaModelGraph.impl.NodeImpl#getEClass <em>EClass</em>}</li>
 *   <li>{@link MetaModelGraph.impl.NodeImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link MetaModelGraph.impl.NodeImpl#getEnumModularNotation <em>Enum Modular Notation</em>}</li>
 *   <li>{@link MetaModelGraph.impl.NodeImpl#getListNodes <em>List Nodes</em>}</li>
 *   <li>{@link MetaModelGraph.impl.NodeImpl#getDirectSubclasses <em>Direct Subclasses</em>}</li>
 *   <li>{@link MetaModelGraph.impl.NodeImpl#getDirectComposition <em>Direct Composition</em>}</li>
 *   <li>{@link MetaModelGraph.impl.NodeImpl#isInsideRecursion <em>Inside Recursion</em>}</li>
 *   <li>{@link MetaModelGraph.impl.NodeImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link MetaModelGraph.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link MetaModelGraph.impl.NodeImpl#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The cached value of the '{@link #getCompositions() <em>Compositions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositions()
	 * @generated
	 * @ordered
	 */
	protected EList<Composition> compositions;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> references;

	/**
	 * The cached value of the '{@link #getSubClasses() <em>Sub Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<SubClass> subClasses;

	/**
	 * The cached value of the '{@link #getEClass() <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEClass()
	 * @generated
	 * @ordered
	 */
	protected EClass eClass;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * The cached value of the '{@link #getEnumModularNotation() <em>Enum Modular Notation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumModularNotation()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumModular> enumModularNotation;

	/**
	 * The cached value of the '{@link #getListNodes() <em>List Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> listNodes;

	/**
	 * The cached value of the '{@link #getDirectSubclasses() <em>Direct Subclasses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectSubclasses()
	 * @generated
	 * @ordered
	 */
	protected EList<SubClass> directSubclasses;

	/**
	 * The cached value of the '{@link #getDirectComposition() <em>Direct Composition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectComposition()
	 * @generated
	 * @ordered
	 */
	protected EList<Composition> directComposition;

	/**
	 * The default value of the '{@link #isInsideRecursion() <em>Inside Recursion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsideRecursion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSIDE_RECURSION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInsideRecursion() <em>Inside Recursion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInsideRecursion()
	 * @generated
	 * @ordered
	 */
	protected boolean insideRecursion = INSIDE_RECURSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIcon()
	 * @generated
	 * @ordered
	 */
	protected String icon = ICON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected EAttribute name;

	/**
	 * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected String extension = EXTENSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelGraphPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Composition> getCompositions() {
		if (compositions == null) {
			compositions = new EObjectWithInverseResolvingEList<Composition>(Composition.class, this, MetaModelGraphPackage.NODE__COMPOSITIONS, MetaModelGraphPackage.COMPOSITION__PARENT_NODE);
		}
		return compositions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReferences() {
		if (references == null) {
			references = new EObjectResolvingEList<Reference>(Reference.class, this, MetaModelGraphPackage.NODE__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubClass> getSubClasses() {
		if (subClasses == null) {
			subClasses = new EObjectResolvingEList<SubClass>(SubClass.class, this, MetaModelGraphPackage.NODE__SUB_CLASSES);
		}
		return subClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEClass() {
		if (eClass != null && eClass.eIsProxy()) {
			InternalEObject oldEClass = (InternalEObject)eClass;
			eClass = (EClass)eResolveProxy(oldEClass);
			if (eClass != oldEClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelGraphPackage.NODE__ECLASS, oldEClass, eClass));
			}
		}
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetEClass() {
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEClass(EClass newEClass) {
		EClass oldEClass = eClass;
		eClass = newEClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelGraphPackage.NODE__ECLASS, oldEClass, eClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectWithInverseResolvingEList<Relation>(Relation.class, this, MetaModelGraphPackage.NODE__RELATIONS, MetaModelGraphPackage.RELATION__TARGET);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumModular> getEnumModularNotation() {
		if (enumModularNotation == null) {
			enumModularNotation = new EDataTypeUniqueEList<EnumModular>(EnumModular.class, this, MetaModelGraphPackage.NODE__ENUM_MODULAR_NOTATION);
		}
		return enumModularNotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getListNodes() {
		if (listNodes == null) {
			listNodes = new EObjectResolvingEList<Node>(Node.class, this, MetaModelGraphPackage.NODE__LIST_NODES);
		}
		return listNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubClass> getDirectSubclasses() {
		if (directSubclasses == null) {
			directSubclasses = new EObjectResolvingEList<SubClass>(SubClass.class, this, MetaModelGraphPackage.NODE__DIRECT_SUBCLASSES);
		}
		return directSubclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Composition> getDirectComposition() {
		if (directComposition == null) {
			directComposition = new EObjectResolvingEList<Composition>(Composition.class, this, MetaModelGraphPackage.NODE__DIRECT_COMPOSITION);
		}
		return directComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInsideRecursion() {
		return insideRecursion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsideRecursion(boolean newInsideRecursion) {
		boolean oldInsideRecursion = insideRecursion;
		insideRecursion = newInsideRecursion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelGraphPackage.NODE__INSIDE_RECURSION, oldInsideRecursion, insideRecursion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIcon() {
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIcon(String newIcon) {
		String oldIcon = icon;
		icon = newIcon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelGraphPackage.NODE__ICON, oldIcon, icon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getName() {
		if (name != null && name.eIsProxy()) {
			InternalEObject oldName = (InternalEObject)name;
			name = (EAttribute)eResolveProxy(oldName);
			if (name != oldName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelGraphPackage.NODE__NAME, oldName, name));
			}
		}
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute basicGetName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(EAttribute newName) {
		EAttribute oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelGraphPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtension() {
		return extension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtension(String newExtension) {
		String oldExtension = extension;
		extension = newExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelGraphPackage.NODE__EXTENSION, oldExtension, extension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaModelGraphPackage.NODE__COMPOSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCompositions()).basicAdd(otherEnd, msgs);
			case MetaModelGraphPackage.NODE__RELATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelations()).basicAdd(otherEnd, msgs);
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
			case MetaModelGraphPackage.NODE__COMPOSITIONS:
				return ((InternalEList<?>)getCompositions()).basicRemove(otherEnd, msgs);
			case MetaModelGraphPackage.NODE__RELATIONS:
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
			case MetaModelGraphPackage.NODE__COMPOSITIONS:
				return getCompositions();
			case MetaModelGraphPackage.NODE__REFERENCES:
				return getReferences();
			case MetaModelGraphPackage.NODE__SUB_CLASSES:
				return getSubClasses();
			case MetaModelGraphPackage.NODE__ECLASS:
				if (resolve) return getEClass();
				return basicGetEClass();
			case MetaModelGraphPackage.NODE__RELATIONS:
				return getRelations();
			case MetaModelGraphPackage.NODE__ENUM_MODULAR_NOTATION:
				return getEnumModularNotation();
			case MetaModelGraphPackage.NODE__LIST_NODES:
				return getListNodes();
			case MetaModelGraphPackage.NODE__DIRECT_SUBCLASSES:
				return getDirectSubclasses();
			case MetaModelGraphPackage.NODE__DIRECT_COMPOSITION:
				return getDirectComposition();
			case MetaModelGraphPackage.NODE__INSIDE_RECURSION:
				return isInsideRecursion();
			case MetaModelGraphPackage.NODE__ICON:
				return getIcon();
			case MetaModelGraphPackage.NODE__NAME:
				if (resolve) return getName();
				return basicGetName();
			case MetaModelGraphPackage.NODE__EXTENSION:
				return getExtension();
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
			case MetaModelGraphPackage.NODE__COMPOSITIONS:
				getCompositions().clear();
				getCompositions().addAll((Collection<? extends Composition>)newValue);
				return;
			case MetaModelGraphPackage.NODE__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends Reference>)newValue);
				return;
			case MetaModelGraphPackage.NODE__SUB_CLASSES:
				getSubClasses().clear();
				getSubClasses().addAll((Collection<? extends SubClass>)newValue);
				return;
			case MetaModelGraphPackage.NODE__ECLASS:
				setEClass((EClass)newValue);
				return;
			case MetaModelGraphPackage.NODE__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case MetaModelGraphPackage.NODE__ENUM_MODULAR_NOTATION:
				getEnumModularNotation().clear();
				getEnumModularNotation().addAll((Collection<? extends EnumModular>)newValue);
				return;
			case MetaModelGraphPackage.NODE__LIST_NODES:
				getListNodes().clear();
				getListNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case MetaModelGraphPackage.NODE__DIRECT_SUBCLASSES:
				getDirectSubclasses().clear();
				getDirectSubclasses().addAll((Collection<? extends SubClass>)newValue);
				return;
			case MetaModelGraphPackage.NODE__DIRECT_COMPOSITION:
				getDirectComposition().clear();
				getDirectComposition().addAll((Collection<? extends Composition>)newValue);
				return;
			case MetaModelGraphPackage.NODE__INSIDE_RECURSION:
				setInsideRecursion((Boolean)newValue);
				return;
			case MetaModelGraphPackage.NODE__ICON:
				setIcon((String)newValue);
				return;
			case MetaModelGraphPackage.NODE__NAME:
				setName((EAttribute)newValue);
				return;
			case MetaModelGraphPackage.NODE__EXTENSION:
				setExtension((String)newValue);
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
			case MetaModelGraphPackage.NODE__COMPOSITIONS:
				getCompositions().clear();
				return;
			case MetaModelGraphPackage.NODE__REFERENCES:
				getReferences().clear();
				return;
			case MetaModelGraphPackage.NODE__SUB_CLASSES:
				getSubClasses().clear();
				return;
			case MetaModelGraphPackage.NODE__ECLASS:
				setEClass((EClass)null);
				return;
			case MetaModelGraphPackage.NODE__RELATIONS:
				getRelations().clear();
				return;
			case MetaModelGraphPackage.NODE__ENUM_MODULAR_NOTATION:
				getEnumModularNotation().clear();
				return;
			case MetaModelGraphPackage.NODE__LIST_NODES:
				getListNodes().clear();
				return;
			case MetaModelGraphPackage.NODE__DIRECT_SUBCLASSES:
				getDirectSubclasses().clear();
				return;
			case MetaModelGraphPackage.NODE__DIRECT_COMPOSITION:
				getDirectComposition().clear();
				return;
			case MetaModelGraphPackage.NODE__INSIDE_RECURSION:
				setInsideRecursion(INSIDE_RECURSION_EDEFAULT);
				return;
			case MetaModelGraphPackage.NODE__ICON:
				setIcon(ICON_EDEFAULT);
				return;
			case MetaModelGraphPackage.NODE__NAME:
				setName((EAttribute)null);
				return;
			case MetaModelGraphPackage.NODE__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
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
			case MetaModelGraphPackage.NODE__COMPOSITIONS:
				return compositions != null && !compositions.isEmpty();
			case MetaModelGraphPackage.NODE__REFERENCES:
				return references != null && !references.isEmpty();
			case MetaModelGraphPackage.NODE__SUB_CLASSES:
				return subClasses != null && !subClasses.isEmpty();
			case MetaModelGraphPackage.NODE__ECLASS:
				return eClass != null;
			case MetaModelGraphPackage.NODE__RELATIONS:
				return relations != null && !relations.isEmpty();
			case MetaModelGraphPackage.NODE__ENUM_MODULAR_NOTATION:
				return enumModularNotation != null && !enumModularNotation.isEmpty();
			case MetaModelGraphPackage.NODE__LIST_NODES:
				return listNodes != null && !listNodes.isEmpty();
			case MetaModelGraphPackage.NODE__DIRECT_SUBCLASSES:
				return directSubclasses != null && !directSubclasses.isEmpty();
			case MetaModelGraphPackage.NODE__DIRECT_COMPOSITION:
				return directComposition != null && !directComposition.isEmpty();
			case MetaModelGraphPackage.NODE__INSIDE_RECURSION:
				return insideRecursion != INSIDE_RECURSION_EDEFAULT;
			case MetaModelGraphPackage.NODE__ICON:
				return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
			case MetaModelGraphPackage.NODE__NAME:
				return name != null;
			case MetaModelGraphPackage.NODE__EXTENSION:
				return EXTENSION_EDEFAULT == null ? extension != null : !EXTENSION_EDEFAULT.equals(extension);
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
		result.append(" (enumModularNotation: ");
		result.append(enumModularNotation);
		result.append(", insideRecursion: ");
		result.append(insideRecursion);
		result.append(", icon: ");
		result.append(icon);
		result.append(", extension: ");
		result.append(extension);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
