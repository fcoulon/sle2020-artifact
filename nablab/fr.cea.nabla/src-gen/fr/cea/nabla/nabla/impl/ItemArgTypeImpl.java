/**
 * generated by Xtext 2.19.0
 */
package fr.cea.nabla.nabla.impl;

import fr.cea.nabla.nabla.ItemArgType;
import fr.cea.nabla.nabla.ItemType;
import fr.cea.nabla.nabla.NablaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Arg Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nabla.nabla.impl.ItemArgTypeImpl#isMultiple <em>Multiple</em>}</li>
 *   <li>{@link fr.cea.nabla.nabla.impl.ItemArgTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemArgTypeImpl extends MinimalEObjectImpl.Container implements ItemArgType
{
  /**
   * The default value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMultiple()
   * @generated
   * @ordered
   */
  protected static final boolean MULTIPLE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMultiple() <em>Multiple</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMultiple()
   * @generated
   * @ordered
   */
  protected boolean multiple = MULTIPLE_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final ItemType TYPE_EDEFAULT = ItemType.NODE;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ItemType type = TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItemArgTypeImpl()
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
    return NablaPackage.Literals.ITEM_ARG_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMultiple()
  {
    return multiple;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiple(boolean newMultiple)
  {
    boolean oldMultiple = multiple;
    multiple = newMultiple;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NablaPackage.ITEM_ARG_TYPE__MULTIPLE, oldMultiple, multiple));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ItemType newType)
  {
    ItemType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NablaPackage.ITEM_ARG_TYPE__TYPE, oldType, type));
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
      case NablaPackage.ITEM_ARG_TYPE__MULTIPLE:
        return isMultiple();
      case NablaPackage.ITEM_ARG_TYPE__TYPE:
        return getType();
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
      case NablaPackage.ITEM_ARG_TYPE__MULTIPLE:
        setMultiple((Boolean)newValue);
        return;
      case NablaPackage.ITEM_ARG_TYPE__TYPE:
        setType((ItemType)newValue);
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
      case NablaPackage.ITEM_ARG_TYPE__MULTIPLE:
        setMultiple(MULTIPLE_EDEFAULT);
        return;
      case NablaPackage.ITEM_ARG_TYPE__TYPE:
        setType(TYPE_EDEFAULT);
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
      case NablaPackage.ITEM_ARG_TYPE__MULTIPLE:
        return multiple != MULTIPLE_EDEFAULT;
      case NablaPackage.ITEM_ARG_TYPE__TYPE:
        return type != TYPE_EDEFAULT;
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
    result.append(" (multiple: ");
    result.append(multiple);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //ItemArgTypeImpl
