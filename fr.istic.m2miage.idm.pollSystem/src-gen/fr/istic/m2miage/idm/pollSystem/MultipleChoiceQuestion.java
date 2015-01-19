/**
 */
package fr.istic.m2miage.idm.pollSystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Choice Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.istic.m2miage.idm.pollSystem.MultipleChoiceQuestion#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.istic.m2miage.idm.pollSystem.PollSystemPackage#getMultipleChoiceQuestion()
 * @model
 * @generated
 */
public interface MultipleChoiceQuestion extends Question
{
  /**
   * Returns the value of the '<em><b>Options</b></em>' containment reference list.
   * The list contents are of type {@link fr.istic.m2miage.idm.pollSystem.MultipleChoiceOption}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Options</em>' containment reference list.
   * @see fr.istic.m2miage.idm.pollSystem.PollSystemPackage#getMultipleChoiceQuestion_Options()
   * @model containment="true"
   * @generated
   */
  EList<MultipleChoiceOption> getOptions();

} // MultipleChoiceQuestion
