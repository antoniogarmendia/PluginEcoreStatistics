/**
 */
package graph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link graph.GraphRoot#getHeight <em>Height</em>}</li>
 *   <li>{@link graph.GraphRoot#getAmountOfNodes <em>Amount Of Nodes</em>}</li>
 * </ul>
 *
 * @see graph.GraphPackage#getGraphRoot()
 * @model
 * @generated
 */
public interface GraphRoot extends Node {
	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see graph.GraphPackage#getGraphRoot_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link graph.GraphRoot#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Amount Of Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Of Nodes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Of Nodes</em>' attribute.
	 * @see #setAmountOfNodes(int)
	 * @see graph.GraphPackage#getGraphRoot_AmountOfNodes()
	 * @model
	 * @generated
	 */
	int getAmountOfNodes();

	/**
	 * Sets the value of the '{@link graph.GraphRoot#getAmountOfNodes <em>Amount Of Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Of Nodes</em>' attribute.
	 * @see #getAmountOfNodes()
	 * @generated
	 */
	void setAmountOfNodes(int value);

} // GraphRoot
