/**
 */
package MetaModelGraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetaModelGraph.Relation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see MetaModelGraph.MetaModelGraphPackage#getRelation()
 * @model abstract="true"
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link MetaModelGraph.Node#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see MetaModelGraph.MetaModelGraphPackage#getRelation_Target()
	 * @see MetaModelGraph.Node#getRelations
	 * @model opposite="relations"
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link MetaModelGraph.Relation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

} // Relation
