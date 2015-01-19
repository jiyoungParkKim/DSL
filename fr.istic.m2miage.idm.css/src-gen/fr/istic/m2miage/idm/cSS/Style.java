/**
 */
package fr.istic.m2miage.idm.cSS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.istic.m2miage.idm.cSS.Style#getPollStyle <em>Poll Style</em>}</li>
 *   <li>{@link fr.istic.m2miage.idm.cSS.Style#getSingleQuestionStyle <em>Single Question Style</em>}</li>
 *   <li>{@link fr.istic.m2miage.idm.cSS.Style#getMultipleQuestionStyle <em>Multiple Question Style</em>}</li>
 *   <li>{@link fr.istic.m2miage.idm.cSS.Style#getTextQuestionStyle <em>Text Question Style</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.istic.m2miage.idm.cSS.CSSPackage#getStyle()
 * @model
 * @generated
 */
public interface Style extends EObject
{
  /**
   * Returns the value of the '<em><b>Poll Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Poll Style</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Poll Style</em>' containment reference.
   * @see #setPollStyle(PollStyle)
   * @see fr.istic.m2miage.idm.cSS.CSSPackage#getStyle_PollStyle()
   * @model containment="true"
   * @generated
   */
  PollStyle getPollStyle();

  /**
   * Sets the value of the '{@link fr.istic.m2miage.idm.cSS.Style#getPollStyle <em>Poll Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Poll Style</em>' containment reference.
   * @see #getPollStyle()
   * @generated
   */
  void setPollStyle(PollStyle value);

  /**
   * Returns the value of the '<em><b>Single Question Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Single Question Style</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Single Question Style</em>' containment reference.
   * @see #setSingleQuestionStyle(SingleQuestionStyle)
   * @see fr.istic.m2miage.idm.cSS.CSSPackage#getStyle_SingleQuestionStyle()
   * @model containment="true"
   * @generated
   */
  SingleQuestionStyle getSingleQuestionStyle();

  /**
   * Sets the value of the '{@link fr.istic.m2miage.idm.cSS.Style#getSingleQuestionStyle <em>Single Question Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Single Question Style</em>' containment reference.
   * @see #getSingleQuestionStyle()
   * @generated
   */
  void setSingleQuestionStyle(SingleQuestionStyle value);

  /**
   * Returns the value of the '<em><b>Multiple Question Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiple Question Style</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiple Question Style</em>' containment reference.
   * @see #setMultipleQuestionStyle(MultipleQuestionStyle)
   * @see fr.istic.m2miage.idm.cSS.CSSPackage#getStyle_MultipleQuestionStyle()
   * @model containment="true"
   * @generated
   */
  MultipleQuestionStyle getMultipleQuestionStyle();

  /**
   * Sets the value of the '{@link fr.istic.m2miage.idm.cSS.Style#getMultipleQuestionStyle <em>Multiple Question Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiple Question Style</em>' containment reference.
   * @see #getMultipleQuestionStyle()
   * @generated
   */
  void setMultipleQuestionStyle(MultipleQuestionStyle value);

  /**
   * Returns the value of the '<em><b>Text Question Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text Question Style</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text Question Style</em>' containment reference.
   * @see #setTextQuestionStyle(TextQuestionStyle)
   * @see fr.istic.m2miage.idm.cSS.CSSPackage#getStyle_TextQuestionStyle()
   * @model containment="true"
   * @generated
   */
  TextQuestionStyle getTextQuestionStyle();

  /**
   * Sets the value of the '{@link fr.istic.m2miage.idm.cSS.Style#getTextQuestionStyle <em>Text Question Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text Question Style</em>' containment reference.
   * @see #getTextQuestionStyle()
   * @generated
   */
  void setTextQuestionStyle(TextQuestionStyle value);

} // Style
