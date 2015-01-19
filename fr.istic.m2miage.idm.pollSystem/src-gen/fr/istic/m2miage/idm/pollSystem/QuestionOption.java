/**
 */
package fr.istic.m2miage.idm.pollSystem;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.istic.m2miage.idm.pollSystem.QuestionOption#getName <em>Name</em>}</li>
 *   <li>{@link fr.istic.m2miage.idm.pollSystem.QuestionOption#getOption <em>Option</em>}</li>
 *   <li>{@link fr.istic.m2miage.idm.pollSystem.QuestionOption#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.istic.m2miage.idm.pollSystem.PollSystemPackage#getQuestionOption()
 * @model
 * @generated
 */
public interface QuestionOption extends EObject
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
   * @see fr.istic.m2miage.idm.pollSystem.PollSystemPackage#getQuestionOption_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.istic.m2miage.idm.pollSystem.QuestionOption#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Option</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option</em>' attribute.
   * @see #setOption(String)
   * @see fr.istic.m2miage.idm.pollSystem.PollSystemPackage#getQuestionOption_Option()
   * @model
   * @generated
   */
  String getOption();

  /**
   * Sets the value of the '{@link fr.istic.m2miage.idm.pollSystem.QuestionOption#getOption <em>Option</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Option</em>' attribute.
   * @see #getOption()
   * @generated
   */
  void setOption(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see fr.istic.m2miage.idm.pollSystem.PollSystemPackage#getQuestionOption_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link fr.istic.m2miage.idm.pollSystem.QuestionOption#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // QuestionOption
