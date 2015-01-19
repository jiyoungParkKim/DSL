/**
 */
package fr.istic.m2miage.idm.cSS.impl;

import fr.istic.m2miage.idm.cSS.CSSPackage;
import fr.istic.m2miage.idm.cSS.MultipleQuestionStyle;
import fr.istic.m2miage.idm.cSS.PollStyle;
import fr.istic.m2miage.idm.cSS.SingleQuestionStyle;
import fr.istic.m2miage.idm.cSS.Style;
import fr.istic.m2miage.idm.cSS.TextQuestionStyle;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.istic.m2miage.idm.cSS.impl.StyleImpl#getPollStyle <em>Poll Style</em>}</li>
 *   <li>{@link fr.istic.m2miage.idm.cSS.impl.StyleImpl#getSingleQuestionStyle <em>Single Question Style</em>}</li>
 *   <li>{@link fr.istic.m2miage.idm.cSS.impl.StyleImpl#getMultipleQuestionStyle <em>Multiple Question Style</em>}</li>
 *   <li>{@link fr.istic.m2miage.idm.cSS.impl.StyleImpl#getTextQuestionStyle <em>Text Question Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StyleImpl extends MinimalEObjectImpl.Container implements Style
{
  /**
   * The cached value of the '{@link #getPollStyle() <em>Poll Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPollStyle()
   * @generated
   * @ordered
   */
  protected PollStyle pollStyle;

  /**
   * The cached value of the '{@link #getSingleQuestionStyle() <em>Single Question Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSingleQuestionStyle()
   * @generated
   * @ordered
   */
  protected SingleQuestionStyle singleQuestionStyle;

  /**
   * The cached value of the '{@link #getMultipleQuestionStyle() <em>Multiple Question Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultipleQuestionStyle()
   * @generated
   * @ordered
   */
  protected MultipleQuestionStyle multipleQuestionStyle;

  /**
   * The cached value of the '{@link #getTextQuestionStyle() <em>Text Question Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextQuestionStyle()
   * @generated
   * @ordered
   */
  protected TextQuestionStyle textQuestionStyle;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StyleImpl()
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
    return CSSPackage.Literals.STYLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PollStyle getPollStyle()
  {
    return pollStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPollStyle(PollStyle newPollStyle, NotificationChain msgs)
  {
    PollStyle oldPollStyle = pollStyle;
    pollStyle = newPollStyle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CSSPackage.STYLE__POLL_STYLE, oldPollStyle, newPollStyle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPollStyle(PollStyle newPollStyle)
  {
    if (newPollStyle != pollStyle)
    {
      NotificationChain msgs = null;
      if (pollStyle != null)
        msgs = ((InternalEObject)pollStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CSSPackage.STYLE__POLL_STYLE, null, msgs);
      if (newPollStyle != null)
        msgs = ((InternalEObject)newPollStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CSSPackage.STYLE__POLL_STYLE, null, msgs);
      msgs = basicSetPollStyle(newPollStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CSSPackage.STYLE__POLL_STYLE, newPollStyle, newPollStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleQuestionStyle getSingleQuestionStyle()
  {
    return singleQuestionStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSingleQuestionStyle(SingleQuestionStyle newSingleQuestionStyle, NotificationChain msgs)
  {
    SingleQuestionStyle oldSingleQuestionStyle = singleQuestionStyle;
    singleQuestionStyle = newSingleQuestionStyle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CSSPackage.STYLE__SINGLE_QUESTION_STYLE, oldSingleQuestionStyle, newSingleQuestionStyle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSingleQuestionStyle(SingleQuestionStyle newSingleQuestionStyle)
  {
    if (newSingleQuestionStyle != singleQuestionStyle)
    {
      NotificationChain msgs = null;
      if (singleQuestionStyle != null)
        msgs = ((InternalEObject)singleQuestionStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CSSPackage.STYLE__SINGLE_QUESTION_STYLE, null, msgs);
      if (newSingleQuestionStyle != null)
        msgs = ((InternalEObject)newSingleQuestionStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CSSPackage.STYLE__SINGLE_QUESTION_STYLE, null, msgs);
      msgs = basicSetSingleQuestionStyle(newSingleQuestionStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CSSPackage.STYLE__SINGLE_QUESTION_STYLE, newSingleQuestionStyle, newSingleQuestionStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultipleQuestionStyle getMultipleQuestionStyle()
  {
    return multipleQuestionStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMultipleQuestionStyle(MultipleQuestionStyle newMultipleQuestionStyle, NotificationChain msgs)
  {
    MultipleQuestionStyle oldMultipleQuestionStyle = multipleQuestionStyle;
    multipleQuestionStyle = newMultipleQuestionStyle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CSSPackage.STYLE__MULTIPLE_QUESTION_STYLE, oldMultipleQuestionStyle, newMultipleQuestionStyle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultipleQuestionStyle(MultipleQuestionStyle newMultipleQuestionStyle)
  {
    if (newMultipleQuestionStyle != multipleQuestionStyle)
    {
      NotificationChain msgs = null;
      if (multipleQuestionStyle != null)
        msgs = ((InternalEObject)multipleQuestionStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CSSPackage.STYLE__MULTIPLE_QUESTION_STYLE, null, msgs);
      if (newMultipleQuestionStyle != null)
        msgs = ((InternalEObject)newMultipleQuestionStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CSSPackage.STYLE__MULTIPLE_QUESTION_STYLE, null, msgs);
      msgs = basicSetMultipleQuestionStyle(newMultipleQuestionStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CSSPackage.STYLE__MULTIPLE_QUESTION_STYLE, newMultipleQuestionStyle, newMultipleQuestionStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextQuestionStyle getTextQuestionStyle()
  {
    return textQuestionStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTextQuestionStyle(TextQuestionStyle newTextQuestionStyle, NotificationChain msgs)
  {
    TextQuestionStyle oldTextQuestionStyle = textQuestionStyle;
    textQuestionStyle = newTextQuestionStyle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CSSPackage.STYLE__TEXT_QUESTION_STYLE, oldTextQuestionStyle, newTextQuestionStyle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTextQuestionStyle(TextQuestionStyle newTextQuestionStyle)
  {
    if (newTextQuestionStyle != textQuestionStyle)
    {
      NotificationChain msgs = null;
      if (textQuestionStyle != null)
        msgs = ((InternalEObject)textQuestionStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CSSPackage.STYLE__TEXT_QUESTION_STYLE, null, msgs);
      if (newTextQuestionStyle != null)
        msgs = ((InternalEObject)newTextQuestionStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CSSPackage.STYLE__TEXT_QUESTION_STYLE, null, msgs);
      msgs = basicSetTextQuestionStyle(newTextQuestionStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CSSPackage.STYLE__TEXT_QUESTION_STYLE, newTextQuestionStyle, newTextQuestionStyle));
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
      case CSSPackage.STYLE__POLL_STYLE:
        return basicSetPollStyle(null, msgs);
      case CSSPackage.STYLE__SINGLE_QUESTION_STYLE:
        return basicSetSingleQuestionStyle(null, msgs);
      case CSSPackage.STYLE__MULTIPLE_QUESTION_STYLE:
        return basicSetMultipleQuestionStyle(null, msgs);
      case CSSPackage.STYLE__TEXT_QUESTION_STYLE:
        return basicSetTextQuestionStyle(null, msgs);
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
      case CSSPackage.STYLE__POLL_STYLE:
        return getPollStyle();
      case CSSPackage.STYLE__SINGLE_QUESTION_STYLE:
        return getSingleQuestionStyle();
      case CSSPackage.STYLE__MULTIPLE_QUESTION_STYLE:
        return getMultipleQuestionStyle();
      case CSSPackage.STYLE__TEXT_QUESTION_STYLE:
        return getTextQuestionStyle();
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
      case CSSPackage.STYLE__POLL_STYLE:
        setPollStyle((PollStyle)newValue);
        return;
      case CSSPackage.STYLE__SINGLE_QUESTION_STYLE:
        setSingleQuestionStyle((SingleQuestionStyle)newValue);
        return;
      case CSSPackage.STYLE__MULTIPLE_QUESTION_STYLE:
        setMultipleQuestionStyle((MultipleQuestionStyle)newValue);
        return;
      case CSSPackage.STYLE__TEXT_QUESTION_STYLE:
        setTextQuestionStyle((TextQuestionStyle)newValue);
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
      case CSSPackage.STYLE__POLL_STYLE:
        setPollStyle((PollStyle)null);
        return;
      case CSSPackage.STYLE__SINGLE_QUESTION_STYLE:
        setSingleQuestionStyle((SingleQuestionStyle)null);
        return;
      case CSSPackage.STYLE__MULTIPLE_QUESTION_STYLE:
        setMultipleQuestionStyle((MultipleQuestionStyle)null);
        return;
      case CSSPackage.STYLE__TEXT_QUESTION_STYLE:
        setTextQuestionStyle((TextQuestionStyle)null);
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
      case CSSPackage.STYLE__POLL_STYLE:
        return pollStyle != null;
      case CSSPackage.STYLE__SINGLE_QUESTION_STYLE:
        return singleQuestionStyle != null;
      case CSSPackage.STYLE__MULTIPLE_QUESTION_STYLE:
        return multipleQuestionStyle != null;
      case CSSPackage.STYLE__TEXT_QUESTION_STYLE:
        return textQuestionStyle != null;
    }
    return super.eIsSet(featureID);
  }

} //StyleImpl
