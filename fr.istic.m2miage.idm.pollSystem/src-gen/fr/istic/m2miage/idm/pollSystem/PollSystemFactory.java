/**
 */
package fr.istic.m2miage.idm.pollSystem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.istic.m2miage.idm.pollSystem.PollSystemPackage
 * @generated
 */
public interface PollSystemFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PollSystemFactory eINSTANCE = fr.istic.m2miage.idm.pollSystem.impl.PollSystemFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Poll System</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Poll System</em>'.
   * @generated
   */
  PollSystem createPollSystem();

  /**
   * Returns a new object of class '<em>Poll</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Poll</em>'.
   * @generated
   */
  Poll createPoll();

  /**
   * Returns a new object of class '<em>Question</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Question</em>'.
   * @generated
   */
  Question createQuestion();

  /**
   * Returns a new object of class '<em>Text Question</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Question</em>'.
   * @generated
   */
  TextQuestion createTextQuestion();

  /**
   * Returns a new object of class '<em>Image Question</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Image Question</em>'.
   * @generated
   */
  ImageQuestion createImageQuestion();

  /**
   * Returns a new object of class '<em>Single Choice Question</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Choice Question</em>'.
   * @generated
   */
  SingleChoiceQuestion createSingleChoiceQuestion();

  /**
   * Returns a new object of class '<em>Multiple Choice Question</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiple Choice Question</em>'.
   * @generated
   */
  MultipleChoiceQuestion createMultipleChoiceQuestion();

  /**
   * Returns a new object of class '<em>Question Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Question Option</em>'.
   * @generated
   */
  QuestionOption createQuestionOption();

  /**
   * Returns a new object of class '<em>Single Choice Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Choice Option</em>'.
   * @generated
   */
  SingleChoiceOption createSingleChoiceOption();

  /**
   * Returns a new object of class '<em>Multiple Choice Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiple Choice Option</em>'.
   * @generated
   */
  MultipleChoiceOption createMultipleChoiceOption();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PollSystemPackage getPollSystemPackage();

} //PollSystemFactory
