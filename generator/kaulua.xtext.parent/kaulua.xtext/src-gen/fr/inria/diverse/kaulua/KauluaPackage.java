/**
 * generated by Xtext 2.19.0
 */
package fr.inria.diverse.kaulua;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.diverse.kaulua.KauluaFactory
 * @model kind="package"
 * @generated
 */
public interface KauluaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "kaulua";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.inria.fr/diverse/Kaulua";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "kaulua";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  KauluaPackage eINSTANCE = fr.inria.diverse.kaulua.impl.KauluaPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.inria.diverse.kaulua.impl.ProtocolImpl <em>Protocol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.kaulua.impl.ProtocolImpl
   * @see fr.inria.diverse.kaulua.impl.KauluaPackageImpl#getProtocol()
   * @generated
   */
  int PROTOCOL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__NAME = 0;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__FEATURES = 1;

  /**
   * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__DEPENDENCIES = 2;

  /**
   * The number of structural features of the '<em>Protocol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.inria.diverse.kaulua.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.kaulua.impl.FeatureImpl
   * @see fr.inria.diverse.kaulua.impl.KauluaPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 1;

  /**
   * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__IS_MANDATORY = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 1;

  /**
   * The feature id for the '<em><b>Capabilities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__CAPABILITIES = 2;

  /**
   * The feature id for the '<em><b>Alternative Group</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__ALTERNATIVE_GROUP = 3;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.inria.diverse.kaulua.impl.CapabilityImpl <em>Capability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.kaulua.impl.CapabilityImpl
   * @see fr.inria.diverse.kaulua.impl.KauluaPackageImpl#getCapability()
   * @generated
   */
  int CAPABILITY = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Definition File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY__DEFINITION_FILE = 1;

  /**
   * The number of structural features of the '<em>Capability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAPABILITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.inria.diverse.kaulua.impl.DependencyImpl <em>Dependency</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.inria.diverse.kaulua.impl.DependencyImpl
   * @see fr.inria.diverse.kaulua.impl.KauluaPackageImpl#getDependency()
   * @generated
   */
  int DEPENDENCY = 3;

  /**
   * The feature id for the '<em><b>Caller</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__CALLER = 0;

  /**
   * The feature id for the '<em><b>Callee</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY__CALLEE = 1;

  /**
   * The number of structural features of the '<em>Dependency</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEPENDENCY_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link fr.inria.diverse.kaulua.Protocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protocol</em>'.
   * @see fr.inria.diverse.kaulua.Protocol
   * @generated
   */
  EClass getProtocol();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.kaulua.Protocol#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.inria.diverse.kaulua.Protocol#getName()
   * @see #getProtocol()
   * @generated
   */
  EAttribute getProtocol_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.diverse.kaulua.Protocol#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see fr.inria.diverse.kaulua.Protocol#getFeatures()
   * @see #getProtocol()
   * @generated
   */
  EReference getProtocol_Features();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.diverse.kaulua.Protocol#getDependencies <em>Dependencies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dependencies</em>'.
   * @see fr.inria.diverse.kaulua.Protocol#getDependencies()
   * @see #getProtocol()
   * @generated
   */
  EReference getProtocol_Dependencies();

  /**
   * Returns the meta object for class '{@link fr.inria.diverse.kaulua.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see fr.inria.diverse.kaulua.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.kaulua.Feature#isIsMandatory <em>Is Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Mandatory</em>'.
   * @see fr.inria.diverse.kaulua.Feature#isIsMandatory()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_IsMandatory();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.kaulua.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.inria.diverse.kaulua.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.inria.diverse.kaulua.Feature#getCapabilities <em>Capabilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Capabilities</em>'.
   * @see fr.inria.diverse.kaulua.Feature#getCapabilities()
   * @see #getFeature()
   * @generated
   */
  EReference getFeature_Capabilities();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.kaulua.Feature#getAlternativeGroup <em>Alternative Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alternative Group</em>'.
   * @see fr.inria.diverse.kaulua.Feature#getAlternativeGroup()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_AlternativeGroup();

  /**
   * Returns the meta object for class '{@link fr.inria.diverse.kaulua.Capability <em>Capability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Capability</em>'.
   * @see fr.inria.diverse.kaulua.Capability
   * @generated
   */
  EClass getCapability();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.kaulua.Capability#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.inria.diverse.kaulua.Capability#getName()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.inria.diverse.kaulua.Capability#getDefinitionFile <em>Definition File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Definition File</em>'.
   * @see fr.inria.diverse.kaulua.Capability#getDefinitionFile()
   * @see #getCapability()
   * @generated
   */
  EAttribute getCapability_DefinitionFile();

  /**
   * Returns the meta object for class '{@link fr.inria.diverse.kaulua.Dependency <em>Dependency</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dependency</em>'.
   * @see fr.inria.diverse.kaulua.Dependency
   * @generated
   */
  EClass getDependency();

  /**
   * Returns the meta object for the reference '{@link fr.inria.diverse.kaulua.Dependency#getCaller <em>Caller</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Caller</em>'.
   * @see fr.inria.diverse.kaulua.Dependency#getCaller()
   * @see #getDependency()
   * @generated
   */
  EReference getDependency_Caller();

  /**
   * Returns the meta object for the reference '{@link fr.inria.diverse.kaulua.Dependency#getCallee <em>Callee</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Callee</em>'.
   * @see fr.inria.diverse.kaulua.Dependency#getCallee()
   * @see #getDependency()
   * @generated
   */
  EReference getDependency_Callee();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  KauluaFactory getKauluaFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.inria.diverse.kaulua.impl.ProtocolImpl <em>Protocol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.kaulua.impl.ProtocolImpl
     * @see fr.inria.diverse.kaulua.impl.KauluaPackageImpl#getProtocol()
     * @generated
     */
    EClass PROTOCOL = eINSTANCE.getProtocol();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROTOCOL__NAME = eINSTANCE.getProtocol_Name();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOCOL__FEATURES = eINSTANCE.getProtocol_Features();

    /**
     * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROTOCOL__DEPENDENCIES = eINSTANCE.getProtocol_Dependencies();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.kaulua.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.kaulua.impl.FeatureImpl
     * @see fr.inria.diverse.kaulua.impl.KauluaPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__IS_MANDATORY = eINSTANCE.getFeature_IsMandatory();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '<em><b>Capabilities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE__CAPABILITIES = eINSTANCE.getFeature_Capabilities();

    /**
     * The meta object literal for the '<em><b>Alternative Group</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__ALTERNATIVE_GROUP = eINSTANCE.getFeature_AlternativeGroup();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.kaulua.impl.CapabilityImpl <em>Capability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.kaulua.impl.CapabilityImpl
     * @see fr.inria.diverse.kaulua.impl.KauluaPackageImpl#getCapability()
     * @generated
     */
    EClass CAPABILITY = eINSTANCE.getCapability();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPABILITY__NAME = eINSTANCE.getCapability_Name();

    /**
     * The meta object literal for the '<em><b>Definition File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAPABILITY__DEFINITION_FILE = eINSTANCE.getCapability_DefinitionFile();

    /**
     * The meta object literal for the '{@link fr.inria.diverse.kaulua.impl.DependencyImpl <em>Dependency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.inria.diverse.kaulua.impl.DependencyImpl
     * @see fr.inria.diverse.kaulua.impl.KauluaPackageImpl#getDependency()
     * @generated
     */
    EClass DEPENDENCY = eINSTANCE.getDependency();

    /**
     * The meta object literal for the '<em><b>Caller</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY__CALLER = eINSTANCE.getDependency_Caller();

    /**
     * The meta object literal for the '<em><b>Callee</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEPENDENCY__CALLEE = eINSTANCE.getDependency_Callee();

  }

} //KauluaPackage
