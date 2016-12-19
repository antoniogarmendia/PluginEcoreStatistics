/**
 */
package MetaModelGraph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see MetaModelGraph.MetaModelGraphFactory
 * @model kind="package"
 * @generated
 */
public interface MetaModelGraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "MetaModelGraph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://miso.org/MetaModelGraph/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "MetaModelGraph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetaModelGraphPackage eINSTANCE = MetaModelGraph.impl.MetaModelGraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link MetaModelGraph.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetaModelGraph.impl.GraphImpl
	 * @see MetaModelGraph.impl.MetaModelGraphPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Subgraph</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__SUBGRAPH = 0;

	/**
	 * The feature id for the '<em><b>EClass List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__ECLASS_LIST = 1;

	/**
	 * The feature id for the '<em><b>EClass Abstract</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__ECLASS_ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Amount EClasses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__AMOUNT_ECLASSES = 3;

	/**
	 * The feature id for the '<em><b>Amount Abstract EClasses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__AMOUNT_ABSTRACT_ECLASSES = 4;

	/**
	 * The feature id for the '<em><b>Amount Concrete EClass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__AMOUNT_CONCRETE_ECLASS = 5;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetaModelGraph.impl.SubGraphImpl <em>Sub Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetaModelGraph.impl.SubGraphImpl
	 * @see MetaModelGraph.impl.MetaModelGraphPackageImpl#getSubGraph()
	 * @generated
	 */
	int SUB_GRAPH = 1;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__NODES = 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__RELATIONS = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Amount Of Concrete EClass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__AMOUNT_OF_CONCRETE_ECLASS = 3;

	/**
	 * The feature id for the '<em><b>EClasses List Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__ECLASSES_LIST_OUT = 4;

	/**
	 * The feature id for the '<em><b>Amount EClasses Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__AMOUNT_ECLASSES_OUT = 5;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__ROOT = 6;

	/**
	 * The feature id for the '<em><b>Amount Of Abstract EClass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__AMOUNT_OF_ABSTRACT_ECLASS = 7;

	/**
	 * The feature id for the '<em><b>Amount Of Parent EClass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__AMOUNT_OF_PARENT_ECLASS = 8;

	/**
	 * The feature id for the '<em><b>Amount Of Parent Abstract EClass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__AMOUNT_OF_PARENT_ABSTRACT_ECLASS = 9;

	/**
	 * The feature id for the '<em><b>Amount Packages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__AMOUNT_PACKAGES = 10;

	/**
	 * The feature id for the '<em><b>Amount Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__AMOUNT_UNITS = 11;

	/**
	 * The feature id for the '<em><b>Amount Recursion Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__AMOUNT_RECURSION_UNITS = 12;

	/**
	 * The feature id for the '<em><b>Amount Of Recursion Packages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH__AMOUNT_OF_RECURSION_PACKAGES = 13;

	/**
	 * The number of structural features of the '<em>Sub Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Sub Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetaModelGraph.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetaModelGraph.impl.NodeImpl
	 * @see MetaModelGraph.impl.MetaModelGraphPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 2;

	/**
	 * The feature id for the '<em><b>Compositions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__COMPOSITIONS = 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__REFERENCES = 1;

	/**
	 * The feature id for the '<em><b>Sub Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SUB_CLASSES = 2;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ECLASS = 3;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__RELATIONS = 4;

	/**
	 * The feature id for the '<em><b>Enum Modular Notation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ENUM_MODULAR_NOTATION = 5;

	/**
	 * The feature id for the '<em><b>List Nodes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LIST_NODES = 6;

	/**
	 * The feature id for the '<em><b>Direct Subclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DIRECT_SUBCLASSES = 7;

	/**
	 * The feature id for the '<em><b>Direct Composition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DIRECT_COMPOSITION = 8;

	/**
	 * The feature id for the '<em><b>Inside Recursion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INSIDE_RECURSION = 9;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetaModelGraph.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetaModelGraph.impl.RelationImpl
	 * @see MetaModelGraph.impl.MetaModelGraphPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TARGET = 0;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link MetaModelGraph.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetaModelGraph.impl.CompositionImpl
	 * @see MetaModelGraph.impl.MetaModelGraphPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__TARGET = RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__EREFERENCE = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__PARENT_NODE = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetaModelGraph.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetaModelGraph.impl.ReferenceImpl
	 * @see MetaModelGraph.impl.MetaModelGraphPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TARGET = RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__EREFERENCE = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetaModelGraph.impl.SubClassImpl <em>Sub Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetaModelGraph.impl.SubClassImpl
	 * @see MetaModelGraph.impl.MetaModelGraphPackageImpl#getSubClass()
	 * @generated
	 */
	int SUB_CLASS = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS__TARGET = RELATION__TARGET;

	/**
	 * The number of structural features of the '<em>Sub Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sub Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link MetaModelGraph.EnumModular <em>Enum Modular</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see MetaModelGraph.EnumModular
	 * @see MetaModelGraph.impl.MetaModelGraphPackageImpl#getEnumModular()
	 * @generated
	 */
	int ENUM_MODULAR = 7;

	/**
	 * Returns the meta object for class '{@link MetaModelGraph.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see MetaModelGraph.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link MetaModelGraph.Graph#getSubgraph <em>Subgraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subgraph</em>'.
	 * @see MetaModelGraph.Graph#getSubgraph()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Subgraph();

	/**
	 * Returns the meta object for the reference list '{@link MetaModelGraph.Graph#getEClassList <em>EClass List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EClass List</em>'.
	 * @see MetaModelGraph.Graph#getEClassList()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_EClassList();

	/**
	 * Returns the meta object for the reference list '{@link MetaModelGraph.Graph#getEClassAbstract <em>EClass Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EClass Abstract</em>'.
	 * @see MetaModelGraph.Graph#getEClassAbstract()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_EClassAbstract();

	/**
	 * Returns the meta object for the attribute '{@link MetaModelGraph.Graph#getAmountEClasses <em>Amount EClasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount EClasses</em>'.
	 * @see MetaModelGraph.Graph#getAmountEClasses()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_AmountEClasses();

	/**
	 * Returns the meta object for the attribute '{@link MetaModelGraph.Graph#getAmountAbstractEClasses <em>Amount Abstract EClasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Abstract EClasses</em>'.
	 * @see MetaModelGraph.Graph#getAmountAbstractEClasses()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_AmountAbstractEClasses();

	/**
	 * Returns the meta object for the attribute '{@link MetaModelGraph.Graph#getAmountConcreteEClass <em>Amount Concrete EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Concrete EClass</em>'.
	 * @see MetaModelGraph.Graph#getAmountConcreteEClass()
	 * @see #getGraph()
	 * @generated
	 */
	EAttribute getGraph_AmountConcreteEClass();

	/**
	 * Returns the meta object for class '{@link MetaModelGraph.SubGraph <em>Sub Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Graph</em>'.
	 * @see MetaModelGraph.SubGraph
	 * @generated
	 */
	EClass getSubGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link MetaModelGraph.SubGraph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see MetaModelGraph.SubGraph#getNodes()
	 * @see #getSubGraph()
	 * @generated
	 */
	EReference getSubGraph_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link MetaModelGraph.SubGraph#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see MetaModelGraph.SubGraph#getRelations()
	 * @see #getSubGraph()
	 * @generated
	 */
	EReference getSubGraph_Relations();

	/**
	 * Returns the meta object for the attribute '{@link MetaModelGraph.SubGraph#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see MetaModelGraph.SubGraph#getHeight()
	 * @see #getSubGraph()
	 * @generated
	 */
	EAttribute getSubGraph_Height();

	/**
	 * Returns the meta object for the attribute '{@link MetaModelGraph.SubGraph#getAmountOfConcreteEClass <em>Amount Of Concrete EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Of Concrete EClass</em>'.
	 * @see MetaModelGraph.SubGraph#getAmountOfConcreteEClass()
	 * @see #getSubGraph()
	 * @generated
	 */
	EAttribute getSubGraph_AmountOfConcreteEClass();

	/**
	 * Returns the meta object for the reference list '{@link MetaModelGraph.SubGraph#getEClassesListOut <em>EClasses List Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>EClasses List Out</em>'.
	 * @see MetaModelGraph.SubGraph#getEClassesListOut()
	 * @see #getSubGraph()
	 * @generated
	 */
	EReference getSubGraph_EClassesListOut();

	/**
	 * Returns the meta object for the attribute '{@link MetaModelGraph.SubGraph#getAmountEClassesOut <em>Amount EClasses Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount EClasses Out</em>'.
	 * @see MetaModelGraph.SubGraph#getAmountEClassesOut()
	 * @see #getSubGraph()
	 * @generated
	 */
	EAttribute getSubGraph_AmountEClassesOut();

	/**
	 * Returns the meta object for the reference '{@link MetaModelGraph.SubGraph#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root</em>'.
	 * @see MetaModelGraph.SubGraph#getRoot()
	 * @see #getSubGraph()
	 * @generated
	 */
	EReference getSubGraph_Root();

	/**
	 * Returns the meta object for the attribute '{@link MetaModelGraph.SubGraph#getAmountOfAbstractEClass <em>Amount Of Abstract EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Of Abstract EClass</em>'.
	 * @see MetaModelGraph.SubGraph#getAmountOfAbstractEClass()
	 * @see #getSubGraph()
	 * @generated
	 */
	EAttribute getSubGraph_AmountOfAbstractEClass();

	/**
	 * Returns the meta object for the attribute '{@link MetaModelGraph.SubGraph#getAmountOfParentEClass <em>Amount Of Parent EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Of Parent EClass</em>'.
	 * @see MetaModelGraph.SubGraph#getAmountOfParentEClass()
	 * @see #getSubGraph()
	 * @generated
	 */
	EAttribute getSubGraph_AmountOfParentEClass();

	/**
	 * Returns the meta object for the attribute '{@link MetaModelGraph.SubGraph#getAmountOfParentAbstractEClass <em>Amount Of Parent Abstract EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Of Parent Abstract EClass</em>'.
	 * @see MetaModelGraph.SubGraph#getAmountOfParentAbstractEClass()
	 * @see #getSubGraph()
	 * @generated
	 */
	EAttribute getSubGraph_AmountOfParentAbstractEClass();

	/**
	 * Returns the meta object for the attribute '{@link MetaModelGraph.SubGraph#getAmountPackages <em>Amount Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Packages</em>'.
	 * @see MetaModelGraph.SubGraph#getAmountPackages()
	 * @see #getSubGraph()
	 * @generated
	 */
	EAttribute getSubGraph_AmountPackages();

	/**
	 * Returns the meta object for the attribute '{@link MetaModelGraph.SubGraph#getAmountUnits <em>Amount Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Units</em>'.
	 * @see MetaModelGraph.SubGraph#getAmountUnits()
	 * @see #getSubGraph()
	 * @generated
	 */
	EAttribute getSubGraph_AmountUnits();

	/**
	 * Returns the meta object for the attribute '{@link MetaModelGraph.SubGraph#getAmountRecursionUnits <em>Amount Recursion Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Recursion Units</em>'.
	 * @see MetaModelGraph.SubGraph#getAmountRecursionUnits()
	 * @see #getSubGraph()
	 * @generated
	 */
	EAttribute getSubGraph_AmountRecursionUnits();

	/**
	 * Returns the meta object for the attribute '{@link MetaModelGraph.SubGraph#getAmountOfRecursionPackages <em>Amount Of Recursion Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Of Recursion Packages</em>'.
	 * @see MetaModelGraph.SubGraph#getAmountOfRecursionPackages()
	 * @see #getSubGraph()
	 * @generated
	 */
	EAttribute getSubGraph_AmountOfRecursionPackages();

	/**
	 * Returns the meta object for class '{@link MetaModelGraph.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see MetaModelGraph.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference list '{@link MetaModelGraph.Node#getCompositions <em>Compositions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compositions</em>'.
	 * @see MetaModelGraph.Node#getCompositions()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Compositions();

	/**
	 * Returns the meta object for the reference list '{@link MetaModelGraph.Node#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>References</em>'.
	 * @see MetaModelGraph.Node#getReferences()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_References();

	/**
	 * Returns the meta object for the reference list '{@link MetaModelGraph.Node#getSubClasses <em>Sub Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Classes</em>'.
	 * @see MetaModelGraph.Node#getSubClasses()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_SubClasses();

	/**
	 * Returns the meta object for the reference '{@link MetaModelGraph.Node#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see MetaModelGraph.Node#getEClass()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_EClass();

	/**
	 * Returns the meta object for the reference list '{@link MetaModelGraph.Node#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Relations</em>'.
	 * @see MetaModelGraph.Node#getRelations()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Relations();

	/**
	 * Returns the meta object for the attribute list '{@link MetaModelGraph.Node#getEnumModularNotation <em>Enum Modular Notation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enum Modular Notation</em>'.
	 * @see MetaModelGraph.Node#getEnumModularNotation()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_EnumModularNotation();

	/**
	 * Returns the meta object for the reference list '{@link MetaModelGraph.Node#getListNodes <em>List Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>List Nodes</em>'.
	 * @see MetaModelGraph.Node#getListNodes()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ListNodes();

	/**
	 * Returns the meta object for the reference list '{@link MetaModelGraph.Node#getDirectSubclasses <em>Direct Subclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Direct Subclasses</em>'.
	 * @see MetaModelGraph.Node#getDirectSubclasses()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_DirectSubclasses();

	/**
	 * Returns the meta object for the reference list '{@link MetaModelGraph.Node#getDirectComposition <em>Direct Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Direct Composition</em>'.
	 * @see MetaModelGraph.Node#getDirectComposition()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_DirectComposition();

	/**
	 * Returns the meta object for the attribute '{@link MetaModelGraph.Node#isInsideRecursion <em>Inside Recursion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inside Recursion</em>'.
	 * @see MetaModelGraph.Node#isInsideRecursion()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_InsideRecursion();

	/**
	 * Returns the meta object for class '{@link MetaModelGraph.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see MetaModelGraph.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the reference '{@link MetaModelGraph.Relation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see MetaModelGraph.Relation#getTarget()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Target();

	/**
	 * Returns the meta object for class '{@link MetaModelGraph.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see MetaModelGraph.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for the reference '{@link MetaModelGraph.Composition#getEReference <em>EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference</em>'.
	 * @see MetaModelGraph.Composition#getEReference()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_EReference();

	/**
	 * Returns the meta object for the reference '{@link MetaModelGraph.Composition#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Node</em>'.
	 * @see MetaModelGraph.Composition#getParentNode()
	 * @see #getComposition()
	 * @generated
	 */
	EReference getComposition_ParentNode();

	/**
	 * Returns the meta object for class '{@link MetaModelGraph.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see MetaModelGraph.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link MetaModelGraph.Reference#getEReference <em>EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference</em>'.
	 * @see MetaModelGraph.Reference#getEReference()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_EReference();

	/**
	 * Returns the meta object for class '{@link MetaModelGraph.SubClass <em>Sub Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Class</em>'.
	 * @see MetaModelGraph.SubClass
	 * @generated
	 */
	EClass getSubClass();

	/**
	 * Returns the meta object for enum '{@link MetaModelGraph.EnumModular <em>Enum Modular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Enum Modular</em>'.
	 * @see MetaModelGraph.EnumModular
	 * @generated
	 */
	EEnum getEnumModular();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetaModelGraphFactory getMetaModelGraphFactory();

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
		 * The meta object literal for the '{@link MetaModelGraph.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetaModelGraph.impl.GraphImpl
		 * @see MetaModelGraph.impl.MetaModelGraphPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Subgraph</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__SUBGRAPH = eINSTANCE.getGraph_Subgraph();

		/**
		 * The meta object literal for the '<em><b>EClass List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__ECLASS_LIST = eINSTANCE.getGraph_EClassList();

		/**
		 * The meta object literal for the '<em><b>EClass Abstract</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__ECLASS_ABSTRACT = eINSTANCE.getGraph_EClassAbstract();

		/**
		 * The meta object literal for the '<em><b>Amount EClasses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__AMOUNT_ECLASSES = eINSTANCE.getGraph_AmountEClasses();

		/**
		 * The meta object literal for the '<em><b>Amount Abstract EClasses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__AMOUNT_ABSTRACT_ECLASSES = eINSTANCE.getGraph_AmountAbstractEClasses();

		/**
		 * The meta object literal for the '<em><b>Amount Concrete EClass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAPH__AMOUNT_CONCRETE_ECLASS = eINSTANCE.getGraph_AmountConcreteEClass();

		/**
		 * The meta object literal for the '{@link MetaModelGraph.impl.SubGraphImpl <em>Sub Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetaModelGraph.impl.SubGraphImpl
		 * @see MetaModelGraph.impl.MetaModelGraphPackageImpl#getSubGraph()
		 * @generated
		 */
		EClass SUB_GRAPH = eINSTANCE.getSubGraph();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_GRAPH__NODES = eINSTANCE.getSubGraph_Nodes();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_GRAPH__RELATIONS = eINSTANCE.getSubGraph_Relations();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_GRAPH__HEIGHT = eINSTANCE.getSubGraph_Height();

		/**
		 * The meta object literal for the '<em><b>Amount Of Concrete EClass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_GRAPH__AMOUNT_OF_CONCRETE_ECLASS = eINSTANCE.getSubGraph_AmountOfConcreteEClass();

		/**
		 * The meta object literal for the '<em><b>EClasses List Out</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_GRAPH__ECLASSES_LIST_OUT = eINSTANCE.getSubGraph_EClassesListOut();

		/**
		 * The meta object literal for the '<em><b>Amount EClasses Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_GRAPH__AMOUNT_ECLASSES_OUT = eINSTANCE.getSubGraph_AmountEClassesOut();

		/**
		 * The meta object literal for the '<em><b>Root</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_GRAPH__ROOT = eINSTANCE.getSubGraph_Root();

		/**
		 * The meta object literal for the '<em><b>Amount Of Abstract EClass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_GRAPH__AMOUNT_OF_ABSTRACT_ECLASS = eINSTANCE.getSubGraph_AmountOfAbstractEClass();

		/**
		 * The meta object literal for the '<em><b>Amount Of Parent EClass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_GRAPH__AMOUNT_OF_PARENT_ECLASS = eINSTANCE.getSubGraph_AmountOfParentEClass();

		/**
		 * The meta object literal for the '<em><b>Amount Of Parent Abstract EClass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_GRAPH__AMOUNT_OF_PARENT_ABSTRACT_ECLASS = eINSTANCE.getSubGraph_AmountOfParentAbstractEClass();

		/**
		 * The meta object literal for the '<em><b>Amount Packages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_GRAPH__AMOUNT_PACKAGES = eINSTANCE.getSubGraph_AmountPackages();

		/**
		 * The meta object literal for the '<em><b>Amount Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_GRAPH__AMOUNT_UNITS = eINSTANCE.getSubGraph_AmountUnits();

		/**
		 * The meta object literal for the '<em><b>Amount Recursion Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_GRAPH__AMOUNT_RECURSION_UNITS = eINSTANCE.getSubGraph_AmountRecursionUnits();

		/**
		 * The meta object literal for the '<em><b>Amount Of Recursion Packages</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_GRAPH__AMOUNT_OF_RECURSION_PACKAGES = eINSTANCE.getSubGraph_AmountOfRecursionPackages();

		/**
		 * The meta object literal for the '{@link MetaModelGraph.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetaModelGraph.impl.NodeImpl
		 * @see MetaModelGraph.impl.MetaModelGraphPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Compositions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__COMPOSITIONS = eINSTANCE.getNode_Compositions();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__REFERENCES = eINSTANCE.getNode_References();

		/**
		 * The meta object literal for the '<em><b>Sub Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SUB_CLASSES = eINSTANCE.getNode_SubClasses();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ECLASS = eINSTANCE.getNode_EClass();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__RELATIONS = eINSTANCE.getNode_Relations();

		/**
		 * The meta object literal for the '<em><b>Enum Modular Notation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ENUM_MODULAR_NOTATION = eINSTANCE.getNode_EnumModularNotation();

		/**
		 * The meta object literal for the '<em><b>List Nodes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__LIST_NODES = eINSTANCE.getNode_ListNodes();

		/**
		 * The meta object literal for the '<em><b>Direct Subclasses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__DIRECT_SUBCLASSES = eINSTANCE.getNode_DirectSubclasses();

		/**
		 * The meta object literal for the '<em><b>Direct Composition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__DIRECT_COMPOSITION = eINSTANCE.getNode_DirectComposition();

		/**
		 * The meta object literal for the '<em><b>Inside Recursion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__INSIDE_RECURSION = eINSTANCE.getNode_InsideRecursion();

		/**
		 * The meta object literal for the '{@link MetaModelGraph.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetaModelGraph.impl.RelationImpl
		 * @see MetaModelGraph.impl.MetaModelGraphPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__TARGET = eINSTANCE.getRelation_Target();

		/**
		 * The meta object literal for the '{@link MetaModelGraph.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetaModelGraph.impl.CompositionImpl
		 * @see MetaModelGraph.impl.MetaModelGraphPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '<em><b>EReference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__EREFERENCE = eINSTANCE.getComposition_EReference();

		/**
		 * The meta object literal for the '<em><b>Parent Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION__PARENT_NODE = eINSTANCE.getComposition_ParentNode();

		/**
		 * The meta object literal for the '{@link MetaModelGraph.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetaModelGraph.impl.ReferenceImpl
		 * @see MetaModelGraph.impl.MetaModelGraphPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>EReference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__EREFERENCE = eINSTANCE.getReference_EReference();

		/**
		 * The meta object literal for the '{@link MetaModelGraph.impl.SubClassImpl <em>Sub Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetaModelGraph.impl.SubClassImpl
		 * @see MetaModelGraph.impl.MetaModelGraphPackageImpl#getSubClass()
		 * @generated
		 */
		EClass SUB_CLASS = eINSTANCE.getSubClass();

		/**
		 * The meta object literal for the '{@link MetaModelGraph.EnumModular <em>Enum Modular</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see MetaModelGraph.EnumModular
		 * @see MetaModelGraph.impl.MetaModelGraphPackageImpl#getEnumModular()
		 * @generated
		 */
		EEnum ENUM_MODULAR = eINSTANCE.getEnumModular();

	}

} //MetaModelGraphPackage
