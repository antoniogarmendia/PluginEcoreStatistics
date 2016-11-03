/**
 */
package graph;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.Node#getChildrenContainments <em>Children Containments</em>}</li>
 *   <li>{@link graph.Node#getChildrenReferences <em>Children References</em>}</li>
 *   <li>{@link graph.Node#getReferencesTo <em>References To</em>}</li>
 *   <li>{@link graph.Node#getContainmentReferences <em>Containment References</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Children Containments</b></em>' containment reference list.
	 * The list contents are of type {@link graph.GraphElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children Containments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children Containments</em>' containment reference list.
	 * @see graph.GraphPackage#getNode_ChildrenContainments()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphElement> getChildrenContainments();

	/**
	 * Returns the value of the '<em><b>Children References</b></em>' reference list.
	 * The list contents are of type {@link graph.GraphElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children References</em>' reference list.
	 * @see graph.GraphPackage#getNode_ChildrenReferences()
	 * @model
	 * @generated
	 */
	EList<GraphElement> getChildrenReferences();

	/**
	 * Returns the value of the '<em><b>References To</b></em>' reference list.
	 * The list contents are of type {@link graph.GraphElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References To</em>' reference list.
	 * @see graph.GraphPackage#getNode_ReferencesTo()
	 * @model
	 * @generated
	 */
	EList<GraphElement> getReferencesTo();

	/**
	 * Returns the value of the '<em><b>Containment References</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment References</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment References</em>' reference list.
	 * @see graph.GraphPackage#getNode_ContainmentReferences()
	 * @model
	 * @generated
	 */
	EList<EReference> getContainmentReferences();

} // Node
