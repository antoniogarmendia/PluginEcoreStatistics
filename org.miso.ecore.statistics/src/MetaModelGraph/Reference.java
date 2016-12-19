/**
 */
package MetaModelGraph;

import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetaModelGraph.Reference#getEReference <em>EReference</em>}</li>
 * </ul>
 *
 * @see MetaModelGraph.MetaModelGraphPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Relation {
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
	 * @see MetaModelGraph.MetaModelGraphPackage#getReference_EReference()
	 * @model
	 * @generated
	 */
	EReference getEReference();

	/**
	 * Sets the value of the '{@link MetaModelGraph.Reference#getEReference <em>EReference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference</em>' reference.
	 * @see #getEReference()
	 * @generated
	 */
	void setEReference(EReference value);

} // Reference
