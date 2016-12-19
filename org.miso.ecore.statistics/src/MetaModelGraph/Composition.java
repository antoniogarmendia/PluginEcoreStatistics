/**
 */
package MetaModelGraph;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetaModelGraph.Composition#getEReference <em>EReference</em>}</li>
 *   <li>{@link MetaModelGraph.Composition#getParentNode <em>Parent Node</em>}</li>
 * </ul>
 *
 * @see MetaModelGraph.MetaModelGraphPackage#getComposition()
 * @model
 * @generated
 */
public interface Composition extends Relation {
	/**
	 * Returns the value of the '<em><b>EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference</em>' reference.
	 * @see #setEReference(EReference)
	 * @see MetaModelGraph.MetaModelGraphPackage#getComposition_EReference()
	 * @model
	 * @generated
	 */
	EReference getEReference();

	/**
	 * Sets the value of the '{@link MetaModelGraph.Composition#getEReference <em>EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference</em>' reference.
	 * @see #getEReference()
	 * @generated
	 */
	void setEReference(EReference value);

	/**
	 * Returns the value of the '<em><b>Parent Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MetaModelGraph.Node#getDirectComposition <em>Direct Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Node</em>' reference.
	 * @see #setParentNode(Node)
	 * @see MetaModelGraph.MetaModelGraphPackage#getComposition_ParentNode()
	 * @see MetaModelGraph.Node#getDirectComposition
	 * @model opposite="directComposition"
	 * @generated
	 */
	Node getParentNode();

	/**
	 * Sets the value of the '{@link MetaModelGraph.Composition#getParentNode <em>Parent Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Node</em>' reference.
	 * @see #getParentNode()
	 * @generated
	 */
	void setParentNode(Node value);

} // Composition
