/**
 */
package fr.istic.m2miage.idm.pollSystem.impl;

import fr.istic.m2miage.idm.pollSystem.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PollSystemFactoryImpl extends EFactoryImpl implements PollSystemFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static PollSystemFactory init()
  {
    try
    {
      PollSystemFactory thePollSystemFactory = (PollSystemFactory)EPackage.Registry.INSTANCE.getEFactory(PollSystemPackage.eNS_URI);
      if (thePollSystemFactory != null)
      {
        return thePollSystemFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new PollSystemFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PollSystemFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case PollSystemPackage.POLL_SYSTEM: return createPollSystem();
      case PollSystemPackage.POLL: return createPoll();
      case PollSystemPackage.QUESTION: return createQuestion();
      case PollSystemPackage.TEXT_QUESTION: return createTextQuestion();
      case PollSystemPackage.IMAGE_QUESTION: return createImageQuestion();
      case PollSystemPackage.SINGLE_CHOICE_QUESTION: return createSingleChoiceQuestion();
      case PollSystemPackage.MULTIPLE_CHOICE_QUESTION: return createMultipleChoiceQuestion();
      case PollSystemPackage.QUESTION_OPTION: return createQuestionOption();
      case PollSystemPackage.SINGLE_CHOICE_OPTION: return createSingleChoiceOption();
      case PollSystemPackage.MULTIPLE_CHOICE_OPTION: return createMultipleChoiceOption();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PollSystem createPollSystem()
  {
    PollSystemImpl pollSystem = new PollSystemImpl();
    return pollSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Poll createPoll()
  {
    PollImpl poll = new PollImpl();
    return poll;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Question createQuestion()
  {
    QuestionImpl question = new QuestionImpl();
    return question;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextQuestion createTextQuestion()
  {
    TextQuestionImpl textQuestion = new TextQuestionImpl();
    return textQuestion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImageQuestion createImageQuestion()
  {
    ImageQuestionImpl imageQuestion = new ImageQuestionImpl();
    return imageQuestion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleChoiceQuestion createSingleChoiceQuestion()
  {
    SingleChoiceQuestionImpl singleChoiceQuestion = new SingleChoiceQuestionImpl();
    return singleChoiceQuestion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultipleChoiceQuestion createMultipleChoiceQuestion()
  {
    MultipleChoiceQuestionImpl multipleChoiceQuestion = new MultipleChoiceQuestionImpl();
    return multipleChoiceQuestion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuestionOption createQuestionOption()
  {
    QuestionOptionImpl questionOption = new QuestionOptionImpl();
    return questionOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleChoiceOption createSingleChoiceOption()
  {
    SingleChoiceOptionImpl singleChoiceOption = new SingleChoiceOptionImpl();
    return singleChoiceOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultipleChoiceOption createMultipleChoiceOption()
  {
    MultipleChoiceOptionImpl multipleChoiceOption = new MultipleChoiceOptionImpl();
    return multipleChoiceOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PollSystemPackage getPollSystemPackage()
  {
    return (PollSystemPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static PollSystemPackage getPackage()
  {
    return PollSystemPackage.eINSTANCE;
  }

} //PollSystemFactoryImpl
