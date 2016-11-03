/**
 */
package graph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see graph.GraphFactory
 * @model kind="package"
 * @generated
 */
public interface GraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://miso.org/tree/representation/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphPackage eINSTANCE = graph.impl.GraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link graph.impl.GraphRootImpl <em>Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph.impl.GraphRootImpl
	 * @see graph.impl.GraphPackageImpl#getGraphRoot()
	 * @generated
	 */
	int GRAPH_ROOT = 3;

	/**
	 * The meta object id for the '{@link graph.impl.GraphElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph.impl.GraphElementImpl
	 * @see graph.impl.GraphPackageImpl#getGraphElement()
	 * @generated
	 */
	int GRAPH_ELEMENT = 1;

	/**
	 * The meta object id for the '{@link graph.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph.impl.NodeImpl
	 * @see graph.impl.GraphPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The meta object id for the '{@link graph.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see graph.impl.GraphImpl
	 * @see graph.impl.GraphPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT__ECLASS = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ECLASS = GRAPH_ELEMENT__ECLASS;

	/**
	 * The feature id for the '<em><b>Children Containments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CHILDREN_CONTAINMENTS = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Children References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CHILDREN_REFERENCES = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>References To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__REFERENCES_TO = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Containment References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONTAINMENT_REFERENCES = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = GRAPH_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ROOT__ECLASS = NODE__ECLASS;

	/**
	 * The feature id for the '<em><b>Children Containments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ROOT__CHILDREN_CONTAINMENTS = NODE__CHILDREN_CONTAINMENTS;

	/**
	 * The feature id for the '<em><b>Children References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ROOT__CHILDREN_REFERENCES = NODE__CHILDREN_REFERENCES;

	/**
	 * The feature id for the '<em><b>References To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ROOT__REFERENCES_TO = NODE__REFERENCES_TO;

	/**
	 * The feature id for the '<em><b>Containment References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ROOT__CONTAINMENT_REFERENCES = NODE__CONTAINMENT_REFERENCES;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ROOT__HEIGHT = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Amount Of Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ROOT__AMOUNT_OF_NODES = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ROOT_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_ROOT_OPERATION_COUNT = NODE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link graph.GraphRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root</em>'.
	 * @see graph.GraphRoot
	 * @generated
	 */
	EClass getGraphRoot();

	/**
	 * Returns the meta object for the attribute '{@link graph.GraphRoot#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see graph.GraphRoot#getHeight()
	 * @see #getGraphRoot()
	 * @generated
	 */
	EAttribute getGraphRoot_Height();

	/**
	 * Returns the meta object for the attribute '{@link graph.GraphRoot#getAmountOfNodes <em>Amount Of Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Of Nodes</em>'.
	 * @see graph.GraphRoot#getAmountOfNodes()
	 * @see #getGraphRoot()
	 * @generated
	 */
	EAttribute getGraphRoot_AmountOfNodes();

	/**
	 * Returns the meta object for class '{@link graph.GraphElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see graph.GraphElement
	 * @generated
	 */
	EClass getGraphElement();

	/**
	 * Returns the meta object for the reference '{@link graph.GraphElement#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see graph.GraphElement#getEClass()
	 * @see #getGraphElement()
	 * @generated
	 */
	EReference getGraphElement_EClass();

	/**
	 * Returns the meta object for class '{@link graph.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see graph.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference list '{@link graph.Node#getChildrenContainments <em>Children Containments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children Containments</em>'.
	 * @see graph.Node#getChildrenContainments()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ChildrenContainments();

	/**
	 * Returns the meta object for the reference list '{@link graph.Node#getChildrenReferences <em>Children References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children References</em>'.
	 * @see graph.Node#getChildrenReferences()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ChildrenReferences();

	/**
	 * Returns the meta object for the reference list '{@link graph.Node#getReferencesTo <em>References To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References To</em>'.
	 * @see graph.Node#getReferencesTo()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ReferencesTo();

	/**
	 * Returns the meta object for the reference list '{@link graph.Node#getContainmentReferences <em>Containment References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Containment References</em>'.
	 * @see graph.Node#getContainmentReferences()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ContainmentReferences();

	/**
	 * Returns the meta object for class '{@link graph.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see graph.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link graph.Graph#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see graph.Graph#getElements()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Elements();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphFactory getGraphFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link graph.impl.GraphRootImpl <em>Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph.impl.GraphRootImpl
		 * @see graph.impl.GraphPackageImpl#getGraphRoot()
		 * @generated
		 */
		EClass GRAPH_ROOT = eINSTANCE.getGraphRoot();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_ROOT__HEIGHT = eINSTANCE.getGraphRoot_Height();

		/**
		 * The meta object literal for the '<em><b>Amount Of Nodes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH_ROOT__AMOUNT_OF_NODES = eINSTANCE.getGraphRoot_AmountOfNodes();

		/**
		 * The meta object literal for the '{@link graph.impl.GraphElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph.impl.GraphElementImpl
		 * @see graph.impl.GraphPackageImpl#getGraphElement()
		 * @generated
		 */
		EClass GRAPH_ELEMENT = eINSTANCE.getGraphElement();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH_ELEMENT__ECLASS = eINSTANCE.getGraphElement_EClass();

		/**
		 * The meta object literal for the '{@link graph.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph.impl.NodeImpl
		 * @see graph.impl.GraphPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Children Containments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CHILDREN_CONTAINMENTS = eINSTANCE.getNode_ChildrenContainments();

		/**
		 * The meta object literal for the '<em><b>Children References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CHILDREN_REFERENCES = eINSTANCE.getNode_ChildrenReferences();

		/**
		 * The meta object literal for the '<em><b>References To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__REFERENCES_TO = eINSTANCE.getNode_ReferencesTo();

		/**
		 * The meta object literal for the '<em><b>Containment References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CONTAINMENT_REFERENCES = eINSTANCE.getNode_ContainmentReferences();

		/**
		 * The meta object literal for the '{@link graph.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see graph.impl.GraphImpl
		 * @see graph.impl.GraphPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__ELEMENTS = eINSTANCE.getGraph_Elements();

	}

} //GraphPackage
