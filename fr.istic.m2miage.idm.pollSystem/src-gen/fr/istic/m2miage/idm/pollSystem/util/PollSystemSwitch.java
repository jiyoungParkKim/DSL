/**
 */
package fr.istic.m2miage.idm.pollSystem.util;

import fr.istic.m2miage.idm.pollSystem.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.istic.m2miage.idm.pollSystem.PollSystemPackage
 * @generated
 */
public class PollSystemSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PollSystemPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PollSystemSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PollSystemPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PollSystemPackage.POLL_SYSTEM:
      {
        PollSystem pollSystem = (PollSystem)theEObject;
        T result = casePollSystem(pollSystem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PollSystemPackage.POLL:
      {
        Poll poll = (Poll)theEObject;
        T result = casePoll(poll);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PollSystemPackage.QUESTION:
      {
        Question question = (Question)theEObject;
        T result = caseQuestion(question);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PollSystemPackage.TEXT_QUESTION:
      {
        TextQuestion textQuestion = (TextQuestion)theEObject;
        T result = caseTextQuestion(textQuestion);
        if (result == null) result = caseQuestion(textQuestion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PollSystemPackage.IMAGE_QUESTION:
      {
        ImageQuestion imageQuestion = (ImageQuestion)theEObject;
        T result = caseImageQuestion(imageQuestion);
        if (result == null) result = caseQuestion(imageQuestion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PollSystemPackage.SINGLE_CHOICE_QUESTION:
      {
        SingleChoiceQuestion singleChoiceQuestion = (SingleChoiceQuestion)theEObject;
        T result = caseSingleChoiceQuestion(singleChoiceQuestion);
        if (result == null) result = caseQuestion(singleChoiceQuestion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PollSystemPackage.MULTIPLE_CHOICE_QUESTION:
      {
        MultipleChoiceQuestion multipleChoiceQuestion = (MultipleChoiceQuestion)theEObject;
        T result = caseMultipleChoiceQuestion(multipleChoiceQuestion);
        if (result == null) result = caseQuestion(multipleChoiceQuestion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PollSystemPackage.QUESTION_OPTION:
      {
        QuestionOption questionOption = (QuestionOption)theEObject;
        T result = caseQuestionOption(questionOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PollSystemPackage.SINGLE_CHOICE_OPTION:
      {
        SingleChoiceOption singleChoiceOption = (SingleChoiceOption)theEObject;
        T result = caseSingleChoiceOption(singleChoiceOption);
        if (result == null) result = caseQuestionOption(singleChoiceOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PollSystemPackage.MULTIPLE_CHOICE_OPTION:
      {
        MultipleChoiceOption multipleChoiceOption = (MultipleChoiceOption)theEObject;
        T result = caseMultipleChoiceOption(multipleChoiceOption);
        if (result == null) result = caseQuestionOption(multipleChoiceOption);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Poll System</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Poll System</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePollSystem(PollSystem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Poll</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Poll</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePoll(Poll object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Question</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuestion(Question object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Question</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Question</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextQuestion(TextQuestion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image Question</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image Question</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImageQuestion(ImageQuestion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Choice Question</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Choice Question</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleChoiceQuestion(SingleChoiceQuestion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiple Choice Question</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiple Choice Question</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultipleChoiceQuestion(MultipleChoiceQuestion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Question Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Question Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseQuestionOption(QuestionOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Single Choice Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Single Choice Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSingleChoiceOption(SingleChoiceOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multiple Choice Option</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multiple Choice Option</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultipleChoiceOption(MultipleChoiceOption object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PollSystemSwitch
