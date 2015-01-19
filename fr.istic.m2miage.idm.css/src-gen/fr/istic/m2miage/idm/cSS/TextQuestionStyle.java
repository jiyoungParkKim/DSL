/**
 */
package fr.istic.m2miage.idm.cSS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Question Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.istic.m2miage.idm.cSS.TextQuestionStyle#getName <em>Name</em>}</li>
 *   <li>{@link fr.istic.m2miage.idm.cSS.TextQuestionStyle#getColor <em>Color</em>}</li>
 *   <li>{@link fr.istic.m2miage.idm.cSS.TextQuestionStyle#getBorderType <em>Border Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.istic.m2miage.idm.cSS.CSSPackage#getTextQuestionStyle()
 * @model
 * @generated
 */
public interface TextQuestionStyle extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.istic.m2miage.idm.cSS.CSSPackage#getTextQuestionStyle_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.istic.m2miage.idm.cSS.TextQuestionStyle#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Color</b></em>' attribute.
   * The literals are from the enumeration {@link fr.istic.m2miage.idm.cSS.ColorEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' attribute.
   * @see fr.istic.m2miage.idm.cSS.ColorEnum
   * @see #setColor(ColorEnum)
   * @see fr.istic.m2miage.idm.cSS.CSSPackage#getTextQuestionStyle_Color()
   * @model
   * @generated
   */
  ColorEnum getColor();

  /**
   * Sets the value of the '{@link fr.istic.m2miage.idm.cSS.TextQuestionStyle#getColor <em>Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' attribute.
   * @see fr.istic.m2miage.idm.cSS.ColorEnum
   * @see #getColor()
   * @generated
   */
  void setColor(ColorEnum value);

  /**
   * Returns the value of the '<em><b>Border Type</b></em>' attribute.
   * The literals are from the enumeration {@link fr.istic.m2miage.idm.cSS.BorderTypeEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Border Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Border Type</em>' attribute.
   * @see fr.istic.m2miage.idm.cSS.BorderTypeEnum
   * @see #setBorderType(BorderTypeEnum)
   * @see fr.istic.m2miage.idm.cSS.CSSPackage#getTextQuestionStyle_BorderType()
   * @model
   * @generated
   */
  BorderTypeEnum getBorderType();

  /**
   * Sets the value of the '{@link fr.istic.m2miage.idm.cSS.TextQuestionStyle#getBorderType <em>Border Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Border Type</em>' attribute.
   * @see fr.istic.m2miage.idm.cSS.BorderTypeEnum
   * @see #getBorderType()
   * @generated
   */
  void setBorderType(BorderTypeEnum value);

} // TextQuestionStyle
