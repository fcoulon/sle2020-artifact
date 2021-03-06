/**
 * generated by Xtext 2.19.0
 */
package fr.cea.nabla.nabla.impl;

import fr.cea.nabla.nabla.NablaPackage;
import fr.cea.nabla.nabla.SpaceIterator;
import fr.cea.nabla.nabla.SpaceIteratorRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Space Iterator Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.cea.nabla.nabla.impl.SpaceIteratorRefImpl#isPrev <em>Prev</em>}</li>
 *   <li>{@link fr.cea.nabla.nabla.impl.SpaceIteratorRefImpl#isNext <em>Next</em>}</li>
 *   <li>{@link fr.cea.nabla.nabla.impl.SpaceIteratorRefImpl#getIterator <em>Iterator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpaceIteratorRefImpl extends IteratorRangeOrRefImpl implements SpaceIteratorRef
{
  /**
   * The default value of the '{@link #isPrev() <em>Prev</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrev()
   * @generated
   * @ordered
   */
  protected static final boolean PREV_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isPrev() <em>Prev</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isPrev()
   * @generated
   * @ordered
   */
  protected boolean prev = PREV_EDEFAULT;

  /**
   * The default value of the '{@link #isNext() <em>Next</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNext()
   * @generated
   * @ordered
   */
  protected static final boolean NEXT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isNext() <em>Next</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isNext()
   * @generated
   * @ordered
   */
  protected boolean next = NEXT_EDEFAULT;

  /**
   * The cached value of the '{@link #getIterator() <em>Iterator</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIterator()
   * @generated
   * @ordered
   */
  protected SpaceIterator iterator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SpaceIteratorRefImpl()
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
    return NablaPackage.Literals.SPACE_ITERATOR_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isPrev()
  {
    return prev;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrev(boolean newPrev)
  {
    boolean oldPrev = prev;
    prev = newPrev;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NablaPackage.SPACE_ITERATOR_REF__PREV, oldPrev, prev));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isNext()
  {
    return next;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNext(boolean newNext)
  {
    boolean oldNext = next;
    next = newNext;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NablaPackage.SPACE_ITERATOR_REF__NEXT, oldNext, next));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpaceIterator getIterator()
  {
    if (iterator != null && iterator.eIsProxy())
    {
      InternalEObject oldIterator = (InternalEObject)iterator;
      iterator = (SpaceIterator)eResolveProxy(oldIterator);
      if (iterator != oldIterator)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, NablaPackage.SPACE_ITERATOR_REF__ITERATOR, oldIterator, iterator));
      }
    }
    return iterator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SpaceIterator basicGetIterator()
  {
    return iterator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIterator(SpaceIterator newIterator)
  {
    SpaceIterator oldIterator = iterator;
    iterator = newIterator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, NablaPackage.SPACE_ITERATOR_REF__ITERATOR, oldIterator, iterator));
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
      case NablaPackage.SPACE_ITERATOR_REF__PREV:
        return isPrev();
      case NablaPackage.SPACE_ITERATOR_REF__NEXT:
        return isNext();
      case NablaPackage.SPACE_ITERATOR_REF__ITERATOR:
        if (resolve) return getIterator();
        return basicGetIterator();
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
      case NablaPackage.SPACE_ITERATOR_REF__PREV:
        setPrev((Boolean)newValue);
        return;
      case NablaPackage.SPACE_ITERATOR_REF__NEXT:
        setNext((Boolean)newValue);
        return;
      case NablaPackage.SPACE_ITERATOR_REF__ITERATOR:
        setIterator((SpaceIterator)newValue);
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
      case NablaPackage.SPACE_ITERATOR_REF__PREV:
        setPrev(PREV_EDEFAULT);
        return;
      case NablaPackage.SPACE_ITERATOR_REF__NEXT:
        setNext(NEXT_EDEFAULT);
        return;
      case NablaPackage.SPACE_ITERATOR_REF__ITERATOR:
        setIterator((SpaceIterator)null);
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
      case NablaPackage.SPACE_ITERATOR_REF__PREV:
        return prev != PREV_EDEFAULT;
      case NablaPackage.SPACE_ITERATOR_REF__NEXT:
        return next != NEXT_EDEFAULT;
      case NablaPackage.SPACE_ITERATOR_REF__ITERATOR:
        return iterator != null;
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
    result.append(" (prev: ");
    result.append(prev);
    result.append(", next: ");
    result.append(next);
    result.append(')');
    return result.toString();
  }

} //SpaceIteratorRefImpl
