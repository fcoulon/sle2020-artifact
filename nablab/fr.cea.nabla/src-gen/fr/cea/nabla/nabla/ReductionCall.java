/**
 * generated by Xtext 2.19.0
 */
package fr.cea.nabla.nabla;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduction Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nabla.nabla.ReductionCall#getReduction <em>Reduction</em>}</li>
 *   <li>{@link fr.cea.nabla.nabla.ReductionCall#getIterator <em>Iterator</em>}</li>
 *   <li>{@link fr.cea.nabla.nabla.ReductionCall#getArg <em>Arg</em>}</li>
 * </ul>
 *
 * @see fr.cea.nabla.nabla.NablaPackage#getReductionCall()
 * @model
 * @generated
 */
public interface ReductionCall extends Expression
{
  /**
   * Returns the value of the '<em><b>Reduction</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reduction</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reduction</em>' reference.
   * @see #setReduction(Reduction)
   * @see fr.cea.nabla.nabla.NablaPackage#getReductionCall_Reduction()
   * @model
   * @generated
   */
  Reduction getReduction();

  /**
   * Sets the value of the '{@link fr.cea.nabla.nabla.ReductionCall#getReduction <em>Reduction</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reduction</em>' reference.
   * @see #getReduction()
   * @generated
   */
  void setReduction(Reduction value);

  /**
   * Returns the value of the '<em><b>Iterator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Iterator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Iterator</em>' containment reference.
   * @see #setIterator(SpaceIterator)
   * @see fr.cea.nabla.nabla.NablaPackage#getReductionCall_Iterator()
   * @model containment="true"
   * @generated
   */
  SpaceIterator getIterator();

  /**
   * Sets the value of the '{@link fr.cea.nabla.nabla.ReductionCall#getIterator <em>Iterator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Iterator</em>' containment reference.
   * @see #getIterator()
   * @generated
   */
  void setIterator(SpaceIterator value);

  /**
   * Returns the value of the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arg</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arg</em>' containment reference.
   * @see #setArg(Expression)
   * @see fr.cea.nabla.nabla.NablaPackage#getReductionCall_Arg()
   * @model containment="true"
   * @generated
   */
  Expression getArg();

  /**
   * Sets the value of the '{@link fr.cea.nabla.nabla.ReductionCall#getArg <em>Arg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Arg</em>' containment reference.
   * @see #getArg()
   * @generated
   */
  void setArg(Expression value);

} // ReductionCall