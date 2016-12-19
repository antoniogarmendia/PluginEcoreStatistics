/**
 */
package MetaModelGraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetaModelGraph.Node#getCompositions <em>Compositions</em>}</li>
 *   <li>{@link MetaModelGraph.Node#getReferences <em>References</em>}</li>
 *   <li>{@link MetaModelGraph.Node#getSubClasses <em>Sub Classes</em>}</li>
 *   <li>{@link MetaModelGraph.Node#getEClass <em>EClass</em>}</li>
 *   <li>{@link MetaModelGraph.Node#getRelations <em>Relations</em>}</li>
 *   <li>{@link MetaModelGraph.Node#getEnumModularNotation <em>Enum Modular Notation</em>}</li>
 *   <li>{@link MetaModelGraph.Node#getListNodes <em>List Nodes</em>}</li>
 *   <li>{@link MetaModelGraph.Node#getDirectSubclasses <em>Direct Subclasses</em>}</li>
 *   <li>{@link MetaModelGraph.Node#getDirectComposition <em>Direct Composition</em>}</li>
 *   <li>{@link MetaModelGraph.Node#isInsideRecursion <em>Inside Recursion</em>}</li>
 * </ul>
 *
 * @see MetaModelGraph.MetaModelGraphPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Compositions</b></em>' reference list.
	 * The list contents are of type {@link MetaModelGraph.Composition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compositions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compositions</em>' reference list.
	 * @see MetaModelGraph.MetaModelGraphPackage#getNode_Compositions()
	 * @model
	 * @generated
	 */
	EList<Composition> getCompositions();

	/**
	 * Returns the value of the '<em><b>References</b></em>' reference list.
	 * The list contents are of type {@link MetaModelGraph.Reference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' reference list.
	 * @see MetaModelGraph.MetaModelGraphPackage#getNode_References()
	 * @model
	 * @generated
	 */
	EList<Reference> getReferences();

	/**
	 * Returns the value of the '<em><b>Sub Classes</b></em>' reference list.
	 * The list contents are of type {@link MetaModelGraph.SubClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Classes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Classes</em>' reference list.
	 * @see MetaModelGraph.MetaModelGraphPackage#getNode_SubClasses()
	 * @model
	 * @generated
	 */
	EList<SubClass> getSubClasses();

	/**
	 * Returns the value of the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass</em>' reference.
	 * @see #setEClass(EClass)
	 * @see MetaModelGraph.MetaModelGraphPackage#getNode_EClass()
	 * @model
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link MetaModelGraph.Node#getEClass <em>EClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' reference list.
	 * The list contents are of type {@link MetaModelGraph.Relation}.
	 * It is bidirectional and its opposite is '{@link MetaModelGraph.Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' reference list.
	 * @see MetaModelGraph.MetaModelGraphPackage#getNode_Relations()
	 * @see MetaModelGraph.Relation#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Relation> getRelations();

	/**
	 * Returns the value of the '<em><b>Enum Modular Notation</b></em>' attribute list.
	 * The list contents are of type {@link MetaModelGraph.EnumModular}.
	 * The literals are from the enumeration {@link MetaModelGraph.EnumModular}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Modular Notation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Modular Notation</em>' attribute list.
	 * @see MetaModelGraph.EnumModular
	 * @see MetaModelGraph.MetaModelGraphPackage#getNode_EnumModularNotation()
	 * @model
	 * @generated
	 */
	EList<EnumModular> getEnumModularNotation();

	/**
	 * Returns the value of the '<em><b>List Nodes</b></em>' reference list.
	 * The list contents are of type {@link MetaModelGraph.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Nodes</em>' reference list.
	 * @see MetaModelGraph.MetaModelGraphPackage#getNode_ListNodes()
	 * @model
	 * @generated
	 */
	EList<Node> getListNodes();

	/**
	 * Returns the value of the '<em><b>Direct Subclasses</b></em>' reference list.
	 * The list contents are of type {@link MetaModelGraph.SubClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direct Subclasses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direct Subclasses</em>' reference list.
	 * @see MetaModelGraph.MetaModelGraphPackage#getNode_DirectSubclasses()
	 * @model
	 * @generated
	 */
	EList<SubClass> getDirectSubclasses();

	/**
	 * Returns the value of the '<em><b>Direct Composition</b></em>' reference list.
	 * The list contents are of type {@link MetaModelGraph.Composition}.
	 * It is bidirectional and its opposite is '{@link MetaModelGraph.Composition#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direct Composition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direct Composition</em>' reference list.
	 * @see MetaModelGraph.MetaModelGraphPackage#getNode_DirectComposition()
	 * @see MetaModelGraph.Composition#getParentNode
	 * @model opposite="parentNode"
	 * @generated
	 */
	EList<Composition> getDirectComposition();

	/**
	 * Returns the value of the '<em><b>Inside Recursion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inside Recursion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inside Recursion</em>' attribute.
	 * @see #setInsideRecursion(boolean)
	 * @see MetaModelGraph.MetaModelGraphPackage#getNode_InsideRecursion()
	 * @model
	 * @generated
	 */
	boolean isInsideRecursion();

	/**
	 * Sets the value of the '{@link MetaModelGraph.Node#isInsideRecursion <em>Inside Recursion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inside Recursion</em>' attribute.
	 * @see #isInsideRecursion()
	 * @generated
	 */
	void setInsideRecursion(boolean value);

} // Node
