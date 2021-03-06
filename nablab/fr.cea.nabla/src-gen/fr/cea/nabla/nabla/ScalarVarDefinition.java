/**
 * generated by Xtext 2.19.0
 */
package fr.cea.nabla.nabla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scalar Var Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nabla.nabla.ScalarVarDefinition#isConst <em>Const</em>}</li>
 *   <li>{@link fr.cea.nabla.nabla.ScalarVarDefinition#getType <em>Type</em>}</li>
 *   <li>{@link fr.cea.nabla.nabla.ScalarVarDefinition#getVariable <em>Variable</em>}</li>
 *   <li>{@link fr.cea.nabla.nabla.ScalarVarDefinition#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 *
 * @see fr.cea.nabla.nabla.NablaPackage#getScalarVarDefinition()
 * @model
 * @generated
 */
public interface ScalarVarDefinition extends Instruction
{
  /**
   * Returns the value of the '<em><b>Const</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const</em>' attribute.
   * @see #setConst(boolean)
   * @see fr.cea.nabla.nabla.NablaPackage#getScalarVarDefinition_Const()
   * @model
   * @generated
   */
  boolean isConst();

  /**
   * Sets the value of the '{@link fr.cea.nabla.nabla.ScalarVarDefinition#isConst <em>Const</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const</em>' attribute.
   * @see #isConst()
   * @generated
   */
  void setConst(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link fr.cea.nabla.nabla.BasicType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see fr.cea.nabla.nabla.BasicType
   * @see #setType(BasicType)
   * @see fr.cea.nabla.nabla.NablaPackage#getScalarVarDefinition_Type()
   * @model
   * @generated
   */
  BasicType getType();

  /**
   * Sets the value of the '{@link fr.cea.nabla.nabla.ScalarVarDefinition#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see fr.cea.nabla.nabla.BasicType
   * @see #getType()
   * @generated
   */
  void setType(BasicType value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(ScalarVar)
   * @see fr.cea.nabla.nabla.NablaPackage#getScalarVarDefinition_Variable()
   * @model containment="true"
   * @generated
   */
  ScalarVar getVariable();

  /**
   * Sets the value of the '{@link fr.cea.nabla.nabla.ScalarVarDefinition#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(ScalarVar value);

  /**
   * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Value</em>' containment reference.
   * @see #setDefaultValue(Expression)
   * @see fr.cea.nabla.nabla.NablaPackage#getScalarVarDefinition_DefaultValue()
   * @model containment="true"
   * @generated
   */
  Expression getDefaultValue();

  /**
   * Sets the value of the '{@link fr.cea.nabla.nabla.ScalarVarDefinition#getDefaultValue <em>Default Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Value</em>' containment reference.
   * @see #getDefaultValue()
   * @generated
   */
  void setDefaultValue(Expression value);

} // ScalarVarDefinition
