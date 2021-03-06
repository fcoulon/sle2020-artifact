/**
 * generated by Xtext 2.19.0
 */
package fr.cea.nabla.nabla.impl;

import fr.cea.nabla.nabla.BasicType;
import fr.cea.nabla.nabla.Expression;
import fr.cea.nabla.nabla.NablaPackage;
import fr.cea.nabla.nabla.ReductionArg;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reduction Arg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nabla.nabla.impl.ReductionArgImpl#getSeed <em>Seed</em>}</li>
 *   <li>{@link fr.cea.nabla.nabla.impl.ReductionArgImpl#getCollectionType <em>Collection Type</em>}</li>
 *   <li>{@link fr.cea.nabla.nabla.impl.ReductionArgImpl#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReductionArgImpl extends MinimalEObjectImpl.Container implements ReductionArg
{
  /**
   * The cached value of the '{@link #getSeed() <em>Seed</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeed()
   * @generated
   * @ordered
   */
  protected Expression seed;

  /**
   * The default value of the '{@link #getCollectionType() <em>Collection Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollectionType()
   * @generated
   * @ordered
   */
  protected static final BasicType COLLECTION_TYPE_EDEFAULT = BasicType.INT;

  /**
   * The cached value of the '{@link #getCollectionType() <em>Collection Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollectionType()
   * @generated
   * @ordered
   */
  protected BasicType collectionType = COLLECTION_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected static final BasicType RETURN_TYPE_EDEFAULT = BasicType.INT;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected BasicType returnType = RETURN_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReductionArgImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return NablaPackage.Literals.REDUCTION_ARG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getSeed()
  {
    return seed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSeed(Expression newSeed, NotificationChain msgs)
  {
    Expression oldSeed = seed;
    seed = newSeed;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NablaPackage.REDUCTION_ARG__SEED, oldSeed, newSeed);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeed(Expression newSeed)
  {
    if (newSeed != seed)
    {
      NotificationChain msgs = null;
      if (seed != null)
        msgs = ((InternalEObject)seed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NablaPackage.REDUCTION_ARG__SEED, null, msgs);
      if (newSeed != null)
        msgs = ((InternalEObject)newSeed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NablaPackage.REDUCTION_ARG__SEED, null, msgs);
      msgs = basicSetSeed(newSeed, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NablaPackage.REDUCTION_ARG__SEED, newSeed, newSeed));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicType getCollectionType()
  {
    return collectionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCollectionType(BasicType newCollectionType)
  {
    BasicType oldCollectionType = collectionType;
    collectionType = newCollectionType == null ? COLLECTION_TYPE_EDEFAULT : newCollectionType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NablaPackage.REDUCTION_ARG__COLLECTION_TYPE, oldCollectionType, collectionType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicType getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(BasicType newReturnType)
  {
    BasicType oldReturnType = returnType;
    returnType = newReturnType == null ? RETURN_TYPE_EDEFAULT : newReturnType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NablaPackage.REDUCTION_ARG__RETURN_TYPE, oldReturnType, returnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case NablaPackage.REDUCTION_ARG__SEED:
        return basicSetSeed(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case NablaPackage.REDUCTION_ARG__SEED:
        return getSeed();
      case NablaPackage.REDUCTION_ARG__COLLECTION_TYPE:
        return getCollectionType();
      case NablaPackage.REDUCTION_ARG__RETURN_TYPE:
        return getReturnType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case NablaPackage.REDUCTION_ARG__SEED:
        setSeed((Expression)newValue);
        return;
      case NablaPackage.REDUCTION_ARG__COLLECTION_TYPE:
        setCollectionType((BasicType)newValue);
        return;
      case NablaPackage.REDUCTION_ARG__RETURN_TYPE:
        setReturnType((BasicType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case NablaPackage.REDUCTION_ARG__SEED:
        setSeed((Expression)null);
        return;
      case NablaPackage.REDUCTION_ARG__COLLECTION_TYPE:
        setCollectionType(COLLECTION_TYPE_EDEFAULT);
        return;
      case NablaPackage.REDUCTION_ARG__RETURN_TYPE:
        setReturnType(RETURN_TYPE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case NablaPackage.REDUCTION_ARG__SEED:
        return seed != null;
      case NablaPackage.REDUCTION_ARG__COLLECTION_TYPE:
        return collectionType != COLLECTION_TYPE_EDEFAULT;
      case NablaPackage.REDUCTION_ARG__RETURN_TYPE:
        return returnType != RETURN_TYPE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (collectionType: ");
    result.append(collectionType);
    result.append(", returnType: ");
    result.append(returnType);
    result.append(')');
    return result.toString();
  }

} //ReductionArgImpl
