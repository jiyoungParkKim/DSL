/**
 */
package fr.istic.m2miage.idm.pollSystem;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.istic.m2miage.idm.pollSystem.PollSystemFactory
 * @model kind="package"
 * @generated
 */
public interface PollSystemPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pollSystem";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.istic.fr/m2miage/idm/PollSystem";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pollSystem";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PollSystemPackage eINSTANCE = fr.istic.m2miage.idm.pollSystem.impl.PollSystemPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.istic.m2miage.idm.pollSystem.impl.PollSystemImpl <em>Poll System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.m2miage.idm.pollSystem.impl.PollSystemImpl
   * @see fr.istic.m2miage.idm.pollSystem.impl.PollSystemPackageImpl#getPollSystem()
   * @generated
   */
  int POLL_SYSTEM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLL_SYSTEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Polls</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLL_SYSTEM__POLLS = 1;

  /**
   * The number of structural features of the '<em>Poll System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLL_SYSTEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.istic.m2miage.idm.pollSystem.impl.PollImpl <em>Poll</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.m2miage.idm.pollSystem.impl.PollImpl
   * @see fr.istic.m2miage.idm.pollSystem.impl.PollSystemPackageImpl#getPoll()
   * @generated
   */
  int POLL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLL__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLL__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Questions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLL__QUESTIONS = 2;

  /**
   * The number of structural features of the '<em>Poll</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.istic.m2miage.idm.pollSystem.impl.QuestionImpl <em>Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.m2miage.idm.pollSystem.impl.QuestionImpl
   * @see fr.istic.m2miage.idm.pollSystem.impl.PollSystemPackageImpl#getQuestion()
   * @generated
   */
  int QUESTION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION__TEXT = 1;

  /**
   * The number of structural features of the '<em>Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link fr.istic.m2miage.idm.pollSystem.impl.TextQuestionImpl <em>Text Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.m2miage.idm.pollSystem.impl.TextQuestionImpl
   * @see fr.istic.m2miage.idm.pollSystem.impl.PollSystemPackageImpl#getTextQuestion()
   * @generated
   */
  int TEXT_QUESTION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_QUESTION__NAME = QUESTION__NAME;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_QUESTION__TEXT = QUESTION__TEXT;

  /**
   * The number of structural features of the '<em>Text Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.istic.m2miage.idm.pollSystem.impl.ImageQuestionImpl <em>Image Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.m2miage.idm.pollSystem.impl.ImageQuestionImpl
   * @see fr.istic.m2miage.idm.pollSystem.impl.PollSystemPackageImpl#getImageQuestion()
   * @generated
   */
  int IMAGE_QUESTION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_QUESTION__NAME = QUESTION__NAME;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_QUESTION__TEXT = QUESTION__TEXT;

  /**
   * The feature id for the '<em><b>Image Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_QUESTION__IMAGE_PATH = QUESTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Image Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.istic.m2miage.idm.pollSystem.impl.SingleChoiceQuestionImpl <em>Single Choice Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.m2miage.idm.pollSystem.impl.SingleChoiceQuestionImpl
   * @see fr.istic.m2miage.idm.pollSystem.impl.PollSystemPackageImpl#getSingleChoiceQuestion()
   * @generated
   */
  int SINGLE_CHOICE_QUESTION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_CHOICE_QUESTION__NAME = QUESTION__NAME;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_CHOICE_QUESTION__TEXT = QUESTION__TEXT;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_CHOICE_QUESTION__OPTIONS = QUESTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Single Choice Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_CHOICE_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.istic.m2miage.idm.pollSystem.impl.MultipleChoiceQuestionImpl <em>Multiple Choice Question</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.m2miage.idm.pollSystem.impl.MultipleChoiceQuestionImpl
   * @see fr.istic.m2miage.idm.pollSystem.impl.PollSystemPackageImpl#getMultipleChoiceQuestion()
   * @generated
   */
  int MULTIPLE_CHOICE_QUESTION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLE_CHOICE_QUESTION__NAME = QUESTION__NAME;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLE_CHOICE_QUESTION__TEXT = QUESTION__TEXT;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLE_CHOICE_QUESTION__OPTIONS = QUESTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Multiple Choice Question</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLE_CHOICE_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link fr.istic.m2miage.idm.pollSystem.impl.QuestionOptionImpl <em>Question Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.m2miage.idm.pollSystem.impl.QuestionOptionImpl
   * @see fr.istic.m2miage.idm.pollSystem.impl.PollSystemPackageImpl#getQuestionOption()
   * @generated
   */
  int QUESTION_OPTION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_OPTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_OPTION__OPTION = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_OPTION__VALUE = 2;

  /**
   * The number of structural features of the '<em>Question Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUESTION_OPTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.istic.m2miage.idm.pollSystem.impl.SingleChoiceOptionImpl <em>Single Choice Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.m2miage.idm.pollSystem.impl.SingleChoiceOptionImpl
   * @see fr.istic.m2miage.idm.pollSystem.impl.PollSystemPackageImpl#getSingleChoiceOption()
   * @generated
   */
  int SINGLE_CHOICE_OPTION = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_CHOICE_OPTION__NAME = QUESTION_OPTION__NAME;

  /**
   * The feature id for the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_CHOICE_OPTION__OPTION = QUESTION_OPTION__OPTION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_CHOICE_OPTION__VALUE = QUESTION_OPTION__VALUE;

  /**
   * The number of structural features of the '<em>Single Choice Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_CHOICE_OPTION_FEATURE_COUNT = QUESTION_OPTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link fr.istic.m2miage.idm.pollSystem.impl.MultipleChoiceOptionImpl <em>Multiple Choice Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.m2miage.idm.pollSystem.impl.MultipleChoiceOptionImpl
   * @see fr.istic.m2miage.idm.pollSystem.impl.PollSystemPackageImpl#getMultipleChoiceOption()
   * @generated
   */
  int MULTIPLE_CHOICE_OPTION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLE_CHOICE_OPTION__NAME = QUESTION_OPTION__NAME;

  /**
   * The feature id for the '<em><b>Option</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLE_CHOICE_OPTION__OPTION = QUESTION_OPTION__OPTION;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLE_CHOICE_OPTION__VALUE = QUESTION_OPTION__VALUE;

  /**
   * The number of structural features of the '<em>Multiple Choice Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLE_CHOICE_OPTION_FEATURE_COUNT = QUESTION_OPTION_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link fr.istic.m2miage.idm.pollSystem.PollSystem <em>Poll System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Poll System</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.PollSystem
   * @generated
   */
  EClass getPollSystem();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.pollSystem.PollSystem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.PollSystem#getName()
   * @see #getPollSystem()
   * @generated
   */
  EAttribute getPollSystem_Name();

  /**
   * Returns the meta object for the containment reference list '{@link fr.istic.m2miage.idm.pollSystem.PollSystem#getPolls <em>Polls</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Polls</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.PollSystem#getPolls()
   * @see #getPollSystem()
   * @generated
   */
  EReference getPollSystem_Polls();

  /**
   * Returns the meta object for class '{@link fr.istic.m2miage.idm.pollSystem.Poll <em>Poll</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Poll</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.Poll
   * @generated
   */
  EClass getPoll();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.pollSystem.Poll#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.Poll#getName()
   * @see #getPoll()
   * @generated
   */
  EAttribute getPoll_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.pollSystem.Poll#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.Poll#getDescription()
   * @see #getPoll()
   * @generated
   */
  EAttribute getPoll_Description();

  /**
   * Returns the meta object for the containment reference list '{@link fr.istic.m2miage.idm.pollSystem.Poll#getQuestions <em>Questions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Questions</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.Poll#getQuestions()
   * @see #getPoll()
   * @generated
   */
  EReference getPoll_Questions();

  /**
   * Returns the meta object for class '{@link fr.istic.m2miage.idm.pollSystem.Question <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Question</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.Question
   * @generated
   */
  EClass getQuestion();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.pollSystem.Question#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.Question#getName()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.pollSystem.Question#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.Question#getText()
   * @see #getQuestion()
   * @generated
   */
  EAttribute getQuestion_Text();

  /**
   * Returns the meta object for class '{@link fr.istic.m2miage.idm.pollSystem.TextQuestion <em>Text Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Question</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.TextQuestion
   * @generated
   */
  EClass getTextQuestion();

  /**
   * Returns the meta object for class '{@link fr.istic.m2miage.idm.pollSystem.ImageQuestion <em>Image Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image Question</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.ImageQuestion
   * @generated
   */
  EClass getImageQuestion();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.pollSystem.ImageQuestion#getImagePath <em>Image Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Image Path</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.ImageQuestion#getImagePath()
   * @see #getImageQuestion()
   * @generated
   */
  EAttribute getImageQuestion_ImagePath();

  /**
   * Returns the meta object for class '{@link fr.istic.m2miage.idm.pollSystem.SingleChoiceQuestion <em>Single Choice Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Choice Question</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.SingleChoiceQuestion
   * @generated
   */
  EClass getSingleChoiceQuestion();

  /**
   * Returns the meta object for the containment reference list '{@link fr.istic.m2miage.idm.pollSystem.SingleChoiceQuestion#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.SingleChoiceQuestion#getOptions()
   * @see #getSingleChoiceQuestion()
   * @generated
   */
  EReference getSingleChoiceQuestion_Options();

  /**
   * Returns the meta object for class '{@link fr.istic.m2miage.idm.pollSystem.MultipleChoiceQuestion <em>Multiple Choice Question</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiple Choice Question</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.MultipleChoiceQuestion
   * @generated
   */
  EClass getMultipleChoiceQuestion();

  /**
   * Returns the meta object for the containment reference list '{@link fr.istic.m2miage.idm.pollSystem.MultipleChoiceQuestion#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.MultipleChoiceQuestion#getOptions()
   * @see #getMultipleChoiceQuestion()
   * @generated
   */
  EReference getMultipleChoiceQuestion_Options();

  /**
   * Returns the meta object for class '{@link fr.istic.m2miage.idm.pollSystem.QuestionOption <em>Question Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Question Option</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.QuestionOption
   * @generated
   */
  EClass getQuestionOption();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.pollSystem.QuestionOption#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.QuestionOption#getName()
   * @see #getQuestionOption()
   * @generated
   */
  EAttribute getQuestionOption_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.pollSystem.QuestionOption#getOption <em>Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Option</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.QuestionOption#getOption()
   * @see #getQuestionOption()
   * @generated
   */
  EAttribute getQuestionOption_Option();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.pollSystem.QuestionOption#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.QuestionOption#getValue()
   * @see #getQuestionOption()
   * @generated
   */
  EAttribute getQuestionOption_Value();

  /**
   * Returns the meta object for class '{@link fr.istic.m2miage.idm.pollSystem.SingleChoiceOption <em>Single Choice Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Choice Option</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.SingleChoiceOption
   * @generated
   */
  EClass getSingleChoiceOption();

  /**
   * Returns the meta object for class '{@link fr.istic.m2miage.idm.pollSystem.MultipleChoiceOption <em>Multiple Choice Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiple Choice Option</em>'.
   * @see fr.istic.m2miage.idm.pollSystem.MultipleChoiceOption
   * @generated
   */
  EClass getMultipleChoiceOption();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PollSystemFactory getPollSystemFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link fr.istic.m2miage.idm.pollSystem.impl.PollSystemImpl <em>Poll System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.m2miage.idm.pollSystem.impl.PollSystemImpl
     * @see fr.istic.m2miage.idm.pollSystem.impl.PollSystemPackageImpl#getPollSystem()
     * @generated
     */
    EClass POLL_SYSTEM = eINSTANCE.getPollSystem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLL_SYSTEM__NAME = eINSTANCE.getPollSystem_Name();

    /**
     * The meta object literal for the '<em><b>Polls</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLL_SYSTEM__POLLS = eINSTANCE.getPollSystem_Polls();

    /**
     * The meta object literal for the '{@link fr.istic.m2miage.idm.pollSystem.impl.PollImpl <em>Poll</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.m2miage.idm.pollSystem.impl.PollImpl
     * @see fr.istic.m2miage.idm.pollSystem.impl.PollSystemPackageImpl#getPoll()
     * @generated
     */
    EClass POLL = eINSTANCE.getPoll();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLL__NAME = eINSTANCE.getPoll_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLL__DESCRIPTION = eINSTANCE.getPoll_Description();

    /**
     * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POLL__QUESTIONS = eINSTANCE.getPoll_Questions();

    /**
     * The meta object literal for the '{@link fr.istic.m2miage.idm.pollSystem.impl.QuestionImpl <em>Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.m2miage.idm.pollSystem.impl.QuestionImpl
     * @see fr.istic.m2miage.idm.pollSystem.impl.PollSystemPackageImpl#getQuestion()
     * @generated
     */
    EClass QUESTION = eINSTANCE.getQuestion();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__NAME = eINSTANCE.getQuestion_Name();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION__TEXT = eINSTANCE.getQuestion_Text();

    /**
     * The meta object literal for the '{@link fr.istic.m2miage.idm.pollSystem.impl.TextQuestionImpl <em>Text Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.m2miage.idm.pollSystem.impl.TextQuestionImpl
     * @see fr.istic.m2miage.idm.pollSystem.impl.PollSystemPackageImpl#getTextQuestion()
     * @generated
     */
    EClass TEXT_QUESTION = eINSTANCE.getTextQuestion();

    /**
     * The meta object literal for the '{@link fr.istic.m2miage.idm.pollSystem.impl.ImageQuestionImpl <em>Image Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.m2miage.idm.pollSystem.impl.ImageQuestionImpl
     * @see fr.istic.m2miage.idm.pollSystem.impl.PollSystemPackageImpl#getImageQuestion()
     * @generated
     */
    EClass IMAGE_QUESTION = eINSTANCE.getImageQuestion();

    /**
     * The meta object literal for the '<em><b>Image Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE_QUESTION__IMAGE_PATH = eINSTANCE.getImageQuestion_ImagePath();

    /**
     * The meta object literal for the '{@link fr.istic.m2miage.idm.pollSystem.impl.SingleChoiceQuestionImpl <em>Single Choice Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.m2miage.idm.pollSystem.impl.SingleChoiceQuestionImpl
     * @see fr.istic.m2miage.idm.pollSystem.impl.PollSystemPackageImpl#getSingleChoiceQuestion()
     * @generated
     */
    EClass SINGLE_CHOICE_QUESTION = eINSTANCE.getSingleChoiceQuestion();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SINGLE_CHOICE_QUESTION__OPTIONS = eINSTANCE.getSingleChoiceQuestion_Options();

    /**
     * The meta object literal for the '{@link fr.istic.m2miage.idm.pollSystem.impl.MultipleChoiceQuestionImpl <em>Multiple Choice Question</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.m2miage.idm.pollSystem.impl.MultipleChoiceQuestionImpl
     * @see fr.istic.m2miage.idm.pollSystem.impl.PollSystemPackageImpl#getMultipleChoiceQuestion()
     * @generated
     */
    EClass MULTIPLE_CHOICE_QUESTION = eINSTANCE.getMultipleChoiceQuestion();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTIPLE_CHOICE_QUESTION__OPTIONS = eINSTANCE.getMultipleChoiceQuestion_Options();

    /**
     * The meta object literal for the '{@link fr.istic.m2miage.idm.pollSystem.impl.QuestionOptionImpl <em>Question Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.m2miage.idm.pollSystem.impl.QuestionOptionImpl
     * @see fr.istic.m2miage.idm.pollSystem.impl.PollSystemPackageImpl#getQuestionOption()
     * @generated
     */
    EClass QUESTION_OPTION = eINSTANCE.getQuestionOption();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION_OPTION__NAME = eINSTANCE.getQuestionOption_Name();

    /**
     * The meta object literal for the '<em><b>Option</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION_OPTION__OPTION = eINSTANCE.getQuestionOption_Option();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUESTION_OPTION__VALUE = eINSTANCE.getQuestionOption_Value();

    /**
     * The meta object literal for the '{@link fr.istic.m2miage.idm.pollSystem.impl.SingleChoiceOptionImpl <em>Single Choice Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.m2miage.idm.pollSystem.impl.SingleChoiceOptionImpl
     * @see fr.istic.m2miage.idm.pollSystem.impl.PollSystemPackageImpl#getSingleChoiceOption()
     * @generated
     */
    EClass SINGLE_CHOICE_OPTION = eINSTANCE.getSingleChoiceOption();

    /**
     * The meta object literal for the '{@link fr.istic.m2miage.idm.pollSystem.impl.MultipleChoiceOptionImpl <em>Multiple Choice Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.m2miage.idm.pollSystem.impl.MultipleChoiceOptionImpl
     * @see fr.istic.m2miage.idm.pollSystem.impl.PollSystemPackageImpl#getMultipleChoiceOption()
     * @generated
     */
    EClass MULTIPLE_CHOICE_OPTION = eINSTANCE.getMultipleChoiceOption();

  }

} //PollSystemPackage
