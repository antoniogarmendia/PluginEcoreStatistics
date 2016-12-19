/**
 */
package MetaModelGraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetaModelGraph.Graph#getSubgraph <em>Subgraph</em>}</li>
 *   <li>{@link MetaModelGraph.Graph#getEClassList <em>EClass List</em>}</li>
 *   <li>{@link MetaModelGraph.Graph#getEClassAbstract <em>EClass Abstract</em>}</li>
 *   <li>{@link MetaModelGraph.Graph#getAmountEClasses <em>Amount EClasses</em>}</li>
 *   <li>{@link MetaModelGraph.Graph#getAmountAbstractEClasses <em>Amount Abstract EClasses</em>}</li>
 *   <li>{@link MetaModelGraph.Graph#getAmountConcreteEClass <em>Amount Concrete EClass</em>}</li>
 * </ul>
 *
 * @see MetaModelGraph.MetaModelGraphPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * Returns the value of the '<em><b>Subgraph</b></em>' containment reference list.
	 * The list contents are of type {@link MetaModelGraph.SubGraph}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subgraph</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgraph</em>' containment reference list.
	 * @see MetaModelGraph.MetaModelGraphPackage#getGraph_Subgraph()
	 * @model containment="true"
	 * @generated
	 */
	EList<SubGraph> getSubgraph();

	/**
	 * Returns the value of the '<em><b>EClass List</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass List</em>' reference list.
	 * @see MetaModelGraph.MetaModelGraphPackage#getGraph_EClassList()
	 * @model
	 * @generated
	 */
	EList<EClass> getEClassList();

	/**
	 * Returns the value of the '<em><b>EClass Abstract</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClass Abstract</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClass Abstract</em>' reference list.
	 * @see MetaModelGraph.MetaModelGraphPackage#getGraph_EClassAbstract()
	 * @model
	 * @generated
	 */
	EList<EClass> getEClassAbstract();

	/**
	 * Returns the value of the '<em><b>Amount EClasses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount EClasses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount EClasses</em>' attribute.
	 * @see #setAmountEClasses(int)
	 * @see MetaModelGraph.MetaModelGraphPackage#getGraph_AmountEClasses()
	 * @model derived="true"
	 * @generated
	 */
	int getAmountEClasses();

	/**
	 * Sets the value of the '{@link MetaModelGraph.Graph#getAmountEClasses <em>Amount EClasses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount EClasses</em>' attribute.
	 * @see #getAmountEClasses()
	 * @generated
	 */
	void setAmountEClasses(int value);

	/**
	 * Returns the value of the '<em><b>Amount Abstract EClasses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Abstract EClasses</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Abstract EClasses</em>' attribute.
	 * @see #setAmountAbstractEClasses(int)
	 * @see MetaModelGraph.MetaModelGraphPackage#getGraph_AmountAbstractEClasses()
	 * @model derived="true"
	 * @generated
	 */
	int getAmountAbstractEClasses();

	/**
	 * Sets the value of the '{@link MetaModelGraph.Graph#getAmountAbstractEClasses <em>Amount Abstract EClasses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Abstract EClasses</em>' attribute.
	 * @see #getAmountAbstractEClasses()
	 * @generated
	 */
	void setAmountAbstractEClasses(int value);

	/**
	 * Returns the value of the '<em><b>Amount Concrete EClass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Concrete EClass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Concrete EClass</em>' attribute.
	 * @see #setAmountConcreteEClass(int)
	 * @see MetaModelGraph.MetaModelGraphPackage#getGraph_AmountConcreteEClass()
	 * @model derived="true"
	 * @generated
	 */
	int getAmountConcreteEClass();

	/**
	 * Sets the value of the '{@link MetaModelGraph.Graph#getAmountConcreteEClass <em>Amount Concrete EClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Concrete EClass</em>' attribute.
	 * @see #getAmountConcreteEClass()
	 * @generated
	 */
	void setAmountConcreteEClass(int value);

} // Graph
