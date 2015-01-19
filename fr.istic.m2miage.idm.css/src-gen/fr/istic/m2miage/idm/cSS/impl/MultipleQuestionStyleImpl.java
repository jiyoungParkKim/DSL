/**
 */
package fr.istic.m2miage.idm.cSS.impl;

import fr.istic.m2miage.idm.cSS.BorderTypeEnum;
import fr.istic.m2miage.idm.cSS.CSSPackage;
import fr.istic.m2miage.idm.cSS.ColorEnum;
import fr.istic.m2miage.idm.cSS.MultipleQuestionStyle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiple Question Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.istic.m2miage.idm.cSS.impl.MultipleQuestionStyleImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.istic.m2miage.idm.cSS.impl.MultipleQuestionStyleImpl#getColor <em>Color</em>}</li>
 *   <li>{@link fr.istic.m2miage.idm.cSS.impl.MultipleQuestionStyleImpl#getBorderType <em>Border Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultipleQuestionStyleImpl extends MinimalEObjectImpl.Container implements MultipleQuestionStyle
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected static final ColorEnum COLOR_EDEFAULT = ColorEnum.AZURE;

  /**
   * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected ColorEnum color = COLOR_EDEFAULT;

  /**
   * The default value of the '{@link #getBorderType() <em>Border Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBorderType()
   * @generated
   * @ordered
   */
  protected static final BorderTypeEnum BORDER_TYPE_EDEFAULT = BorderTypeEnum.BOX;

  /**
   * The cached value of the '{@link #getBorderType() <em>Border Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBorderType()
   * @generated
   * @ordered
   */
  protected BorderTypeEnum borderType = BORDER_TYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultipleQuestionStyleImpl()
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
    return CSSPackage.Literals.MULTIPLE_QUESTION_STYLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CSSPackage.MULTIPLE_QUESTION_STYLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorEnum getColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(ColorEnum newColor)
  {
    ColorEnum oldColor = color;
    color = newColor == null ? COLOR_EDEFAULT : newColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CSSPackage.MULTIPLE_QUESTION_STYLE__COLOR, oldColor, color));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BorderTypeEnum getBorderType()
  {
    return borderType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBorderType(BorderTypeEnum newBorderType)
  {
    BorderTypeEnum oldBorderType = borderType;
    borderType = newBorderType == null ? BORDER_TYPE_EDEFAULT : newBorderType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CSSPackage.MULTIPLE_QUESTION_STYLE__BORDER_TYPE, oldBorderType, borderType));
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
      case CSSPackage.MULTIPLE_QUESTION_STYLE__NAME:
        return getName();
      case CSSPackage.MULTIPLE_QUESTION_STYLE__COLOR:
        return getColor();
      case CSSPackage.MULTIPLE_QUESTION_STYLE__BORDER_TYPE:
        return getBorderType();
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
      case CSSPackage.MULTIPLE_QUESTION_STYLE__NAME:
        setName((String)newValue);
        return;
      case CSSPackage.MULTIPLE_QUESTION_STYLE__COLOR:
        setColor((ColorEnum)newValue);
        return;
      case CSSPackage.MULTIPLE_QUESTION_STYLE__BORDER_TYPE:
        setBorderType((BorderTypeEnum)newValue);
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
      case CSSPackage.MULTIPLE_QUESTION_STYLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CSSPackage.MULTIPLE_QUESTION_STYLE__COLOR:
        setColor(COLOR_EDEFAULT);
        return;
      case CSSPackage.MULTIPLE_QUESTION_STYLE__BORDER_TYPE:
        setBorderType(BORDER_TYPE_EDEFAULT);
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
      case CSSPackage.MULTIPLE_QUESTION_STYLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CSSPackage.MULTIPLE_QUESTION_STYLE__COLOR:
        return color != COLOR_EDEFAULT;
      case CSSPackage.MULTIPLE_QUESTION_STYLE__BORDER_TYPE:
        return borderType != BORDER_TYPE_EDEFAULT;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", color: ");
    result.append(color);
    result.append(", borderType: ");
    result.append(borderType);
    result.append(')');
    return result.toString();
  }

} //MultipleQuestionStyleImpl
