/**
 * generated by Xtext 2.19.0
 */
package fr.cea.nabla.nabla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Minus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nabla.nabla.UnaryMinus#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see fr.cea.nabla.nabla.NablaPackage#getUnaryMinus()
 * @model
 * @generated
 */
public interface UnaryMinus extends Expression
{
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
   * @see fr.cea.nabla.nabla.NablaPackage#getUnaryMinus_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link fr.cea.nabla.nabla.UnaryMinus#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // UnaryMinus
