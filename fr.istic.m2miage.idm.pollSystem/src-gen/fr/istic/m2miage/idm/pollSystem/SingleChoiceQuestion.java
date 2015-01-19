/**
 */
package fr.istic.m2miage.idm.pollSystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Choice Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.istic.m2miage.idm.pollSystem.SingleChoiceQuestion#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.istic.m2miage.idm.pollSystem.PollSystemPackage#getSingleChoiceQuestion()
 * @model
 * @generated
 */
public interface SingleChoiceQuestion extends Question
{
  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link fr.istic.m2miage.idm.pollSystem.SingleChoiceOption}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see fr.istic.m2miage.idm.pollSystem.PollSystemPackage#getSingleChoiceQuestion_Options()
   * @model containment="true"
   * @generated
   */
  EList<SingleChoiceOption> getOptions();

} // SingleChoiceQuestion
