/**
 */
package fr.istic.m2miage.idm.pollSystem.impl;

import fr.istic.m2miage.idm.pollSystem.ImageQuestion;
import fr.istic.m2miage.idm.pollSystem.PollSystemPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.istic.m2miage.idm.pollSystem.impl.ImageQuestionImpl#getImagePath <em>Image Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImageQuestionImpl extends QuestionImpl implements ImageQuestion
{
  /**
   * The default value of the '{@link #getImagePath() <em>Image Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImagePath()
   * @generated
   * @ordered
   */
  protected static final String IMAGE_PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImagePath() <em>Image Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImagePath()
   * @generated
   * @ordered
   */
  protected String imagePath = IMAGE_PATH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImageQuestionImpl()
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
    return PollSystemPackage.Literals.IMAGE_QUESTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImagePath()
  {
    return imagePath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImagePath(String newImagePath)
  {
    String oldImagePath = imagePath;
    imagePath = newImagePath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PollSystemPackage.IMAGE_QUESTION__IMAGE_PATH, oldImagePath, imagePath));
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
      case PollSystemPackage.IMAGE_QUESTION__IMAGE_PATH:
        return getImagePath();
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
      case PollSystemPackage.IMAGE_QUESTION__IMAGE_PATH:
        setImagePath((String)newValue);
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
      case PollSystemPackage.IMAGE_QUESTION__IMAGE_PATH:
        setImagePath(IMAGE_PATH_EDEFAULT);
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
      case PollSystemPackage.IMAGE_QUESTION__IMAGE_PATH:
        return IMAGE_PATH_EDEFAULT == null ? imagePath != null : !IMAGE_PATH_EDEFAULT.equals(imagePath);
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
    result.append(" (imagePath: ");
    result.append(imagePath);
    result.append(')');
    return result.toString();
  }

} //ImageQuestionImpl
