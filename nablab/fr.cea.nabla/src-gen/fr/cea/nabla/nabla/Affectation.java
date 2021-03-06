/**
 * generated by Xtext 2.19.0
 */
package fr.cea.nabla.nabla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Affectation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nabla.nabla.Affectation#getVarRef <em>Var Ref</em>}</li>
 *   <li>{@link fr.cea.nabla.nabla.Affectation#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see fr.cea.nabla.nabla.NablaPackage#getAffectation()
 * @model
 * @generated
 */
public interface Affectation extends Instruction
{
  /**
   * Returns the value of the '<em><b>Var Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Ref</em>' containment reference.
   * @see #setVarRef(VarRef)
   * @see fr.cea.nabla.nabla.NablaPackage#getAffectation_VarRef()
   * @model containment="true"
   * @generated
   */
  VarRef getVarRef();

  /**
   * Sets the value of the '{@link fr.cea.nabla.nabla.Affectation#getVarRef <em>Var Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Ref</em>' containment reference.
   * @see #getVarRef()
   * @generated
   */
  void setVarRef(VarRef value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see fr.cea.nabla.nabla.NablaPackage#getAffectation_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link fr.cea.nabla.nabla.Affectation#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // Affectation
