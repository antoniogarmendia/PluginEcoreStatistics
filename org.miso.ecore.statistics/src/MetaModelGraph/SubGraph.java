/**
 */
package MetaModelGraph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetaModelGraph.SubGraph#getNodes <em>Nodes</em>}</li>
 *   <li>{@link MetaModelGraph.SubGraph#getRelations <em>Relations</em>}</li>
 *   <li>{@link MetaModelGraph.SubGraph#getHeight <em>Height</em>}</li>
 *   <li>{@link MetaModelGraph.SubGraph#getAmountOfConcreteEClass <em>Amount Of Concrete EClass</em>}</li>
 *   <li>{@link MetaModelGraph.SubGraph#getEClassesListOut <em>EClasses List Out</em>}</li>
 *   <li>{@link MetaModelGraph.SubGraph#getAmountEClassesOut <em>Amount EClasses Out</em>}</li>
 *   <li>{@link MetaModelGraph.SubGraph#getRoot <em>Root</em>}</li>
 *   <li>{@link MetaModelGraph.SubGraph#getAmountOfAbstractEClass <em>Amount Of Abstract EClass</em>}</li>
 *   <li>{@link MetaModelGraph.SubGraph#getAmountOfParentEClass <em>Amount Of Parent EClass</em>}</li>
 *   <li>{@link MetaModelGraph.SubGraph#getAmountOfParentAbstractEClass <em>Amount Of Parent Abstract EClass</em>}</li>
 *   <li>{@link MetaModelGraph.SubGraph#getAmountPackages <em>Amount Packages</em>}</li>
 *   <li>{@link MetaModelGraph.SubGraph#getAmountUnits <em>Amount Units</em>}</li>
 *   <li>{@link MetaModelGraph.SubGraph#getAmountRecursionUnits <em>Amount Recursion Units</em>}</li>
 *   <li>{@link MetaModelGraph.SubGraph#getAmountOfRecursionPackages <em>Amount Of Recursion Packages</em>}</li>
 * </ul>
 *
 * @see MetaModelGraph.MetaModelGraphPackage#getSubGraph()
 * @model
 * @generated
 */
public interface SubGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link MetaModelGraph.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see MetaModelGraph.MetaModelGraphPackage#getSubGraph_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link MetaModelGraph.Relation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see MetaModelGraph.MetaModelGraphPackage#getSubGraph_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

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
	 * @see MetaModelGraph.MetaModelGraphPackage#getSubGraph_Height()
	 * @model
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link MetaModelGraph.SubGraph#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Amount Of Concrete EClass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Of Concrete EClass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Of Concrete EClass</em>' attribute.
	 * @see #setAmountOfConcreteEClass(int)
	 * @see MetaModelGraph.MetaModelGraphPackage#getSubGraph_AmountOfConcreteEClass()
	 * @model
	 * @generated
	 */
	int getAmountOfConcreteEClass();

	/**
	 * Sets the value of the '{@link MetaModelGraph.SubGraph#getAmountOfConcreteEClass <em>Amount Of Concrete EClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Of Concrete EClass</em>' attribute.
	 * @see #getAmountOfConcreteEClass()
	 * @generated
	 */
	void setAmountOfConcreteEClass(int value);

	/**
	 * Returns the value of the '<em><b>EClasses List Out</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EClasses List Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EClasses List Out</em>' reference list.
	 * @see MetaModelGraph.MetaModelGraphPackage#getSubGraph_EClassesListOut()
	 * @model
	 * @generated
	 */
	EList<EClass> getEClassesListOut();

	/**
	 * Returns the value of the '<em><b>Amount EClasses Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount EClasses Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount EClasses Out</em>' attribute.
	 * @see #setAmountEClassesOut(int)
	 * @see MetaModelGraph.MetaModelGraphPackage#getSubGraph_AmountEClassesOut()
	 * @model
	 * @generated
	 */
	int getAmountEClassesOut();

	/**
	 * Sets the value of the '{@link MetaModelGraph.SubGraph#getAmountEClassesOut <em>Amount EClasses Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount EClasses Out</em>' attribute.
	 * @see #getAmountEClassesOut()
	 * @generated
	 */
	void setAmountEClassesOut(int value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' reference.
	 * @see #setRoot(Node)
	 * @see MetaModelGraph.MetaModelGraphPackage#getSubGraph_Root()
	 * @model
	 * @generated
	 */
	Node getRoot();

	/**
	 * Sets the value of the '{@link MetaModelGraph.SubGraph#getRoot <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(Node value);

	/**
	 * Returns the value of the '<em><b>Amount Of Abstract EClass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Of Abstract EClass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Of Abstract EClass</em>' attribute.
	 * @see #setAmountOfAbstractEClass(int)
	 * @see MetaModelGraph.MetaModelGraphPackage#getSubGraph_AmountOfAbstractEClass()
	 * @model
	 * @generated
	 */
	int getAmountOfAbstractEClass();

	/**
	 * Sets the value of the '{@link MetaModelGraph.SubGraph#getAmountOfAbstractEClass <em>Amount Of Abstract EClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Of Abstract EClass</em>' attribute.
	 * @see #getAmountOfAbstractEClass()
	 * @generated
	 */
	void setAmountOfAbstractEClass(int value);

	/**
	 * Returns the value of the '<em><b>Amount Of Parent EClass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Of Parent EClass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Of Parent EClass</em>' attribute.
	 * @see #setAmountOfParentEClass(int)
	 * @see MetaModelGraph.MetaModelGraphPackage#getSubGraph_AmountOfParentEClass()
	 * @model
	 * @generated
	 */
	int getAmountOfParentEClass();

	/**
	 * Sets the value of the '{@link MetaModelGraph.SubGraph#getAmountOfParentEClass <em>Amount Of Parent EClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Of Parent EClass</em>' attribute.
	 * @see #getAmountOfParentEClass()
	 * @generated
	 */
	void setAmountOfParentEClass(int value);

	/**
	 * Returns the value of the '<em><b>Amount Of Parent Abstract EClass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Of Parent Abstract EClass</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Of Parent Abstract EClass</em>' attribute.
	 * @see #setAmountOfParentAbstractEClass(int)
	 * @see MetaModelGraph.MetaModelGraphPackage#getSubGraph_AmountOfParentAbstractEClass()
	 * @model
	 * @generated
	 */
	int getAmountOfParentAbstractEClass();

	/**
	 * Sets the value of the '{@link MetaModelGraph.SubGraph#getAmountOfParentAbstractEClass <em>Amount Of Parent Abstract EClass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Of Parent Abstract EClass</em>' attribute.
	 * @see #getAmountOfParentAbstractEClass()
	 * @generated
	 */
	void setAmountOfParentAbstractEClass(int value);

	/**
	 * Returns the value of the '<em><b>Amount Packages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Packages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Packages</em>' attribute.
	 * @see #setAmountPackages(int)
	 * @see MetaModelGraph.MetaModelGraphPackage#getSubGraph_AmountPackages()
	 * @model
	 * @generated
	 */
	int getAmountPackages();

	/**
	 * Sets the value of the '{@link MetaModelGraph.SubGraph#getAmountPackages <em>Amount Packages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Packages</em>' attribute.
	 * @see #getAmountPackages()
	 * @generated
	 */
	void setAmountPackages(int value);

	/**
	 * Returns the value of the '<em><b>Amount Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Units</em>' attribute.
	 * @see #setAmountUnits(int)
	 * @see MetaModelGraph.MetaModelGraphPackage#getSubGraph_AmountUnits()
	 * @model
	 * @generated
	 */
	int getAmountUnits();

	/**
	 * Sets the value of the '{@link MetaModelGraph.SubGraph#getAmountUnits <em>Amount Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Units</em>' attribute.
	 * @see #getAmountUnits()
	 * @generated
	 */
	void setAmountUnits(int value);

	/**
	 * Returns the value of the '<em><b>Amount Recursion Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Recursion Units</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Recursion Units</em>' attribute.
	 * @see #setAmountRecursionUnits(int)
	 * @see MetaModelGraph.MetaModelGraphPackage#getSubGraph_AmountRecursionUnits()
	 * @model
	 * @generated
	 */
	int getAmountRecursionUnits();

	/**
	 * Sets the value of the '{@link MetaModelGraph.SubGraph#getAmountRecursionUnits <em>Amount Recursion Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Recursion Units</em>' attribute.
	 * @see #getAmountRecursionUnits()
	 * @generated
	 */
	void setAmountRecursionUnits(int value);

	/**
	 * Returns the value of the '<em><b>Amount Of Recursion Packages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Of Recursion Packages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Of Recursion Packages</em>' attribute.
	 * @see #setAmountOfRecursionPackages(int)
	 * @see MetaModelGraph.MetaModelGraphPackage#getSubGraph_AmountOfRecursionPackages()
	 * @model
	 * @generated
	 */
	int getAmountOfRecursionPackages();

	/**
	 * Sets the value of the '{@link MetaModelGraph.SubGraph#getAmountOfRecursionPackages <em>Amount Of Recursion Packages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Of Recursion Packages</em>' attribute.
	 * @see #getAmountOfRecursionPackages()
	 * @generated
	 */
	void setAmountOfRecursionPackages(int value);

} // SubGraph
