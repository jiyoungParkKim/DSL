/**
 */
package fr.istic.m2miage.idm.pollSystem.impl;

import fr.istic.m2miage.idm.pollSystem.ImageQuestion;
import fr.istic.m2miage.idm.pollSystem.MultipleChoiceOption;
import fr.istic.m2miage.idm.pollSystem.MultipleChoiceQuestion;
import fr.istic.m2miage.idm.pollSystem.Poll;
import fr.istic.m2miage.idm.pollSystem.PollSystem;
import fr.istic.m2miage.idm.pollSystem.PollSystemFactory;
import fr.istic.m2miage.idm.pollSystem.PollSystemPackage;
import fr.istic.m2miage.idm.pollSystem.Question;
import fr.istic.m2miage.idm.pollSystem.QuestionOption;
import fr.istic.m2miage.idm.pollSystem.SingleChoiceOption;
import fr.istic.m2miage.idm.pollSystem.SingleChoiceQuestion;
import fr.istic.m2miage.idm.pollSystem.TextQuestion;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PollSystemPackageImpl extends EPackageImpl implements PollSystemPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pollSystemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pollEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass questionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textQuestionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageQuestionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleChoiceQuestionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multipleChoiceQuestionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass questionOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleChoiceOptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multipleChoiceOptionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see fr.istic.m2miage.idm.pollSystem.PollSystemPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PollSystemPackageImpl()
  {
    super(eNS_URI, PollSystemFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PollSystemPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PollSystemPackage init()
  {
    if (isInited) return (PollSystemPackage)EPackage.Registry.INSTANCE.getEPackage(PollSystemPackage.eNS_URI);

    // Obtain or create and register package
    PollSystemPackageImpl thePollSystemPackage = (PollSystemPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PollSystemPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PollSystemPackageImpl());

    isInited = true;

    // Create package meta-data objects
    thePollSystemPackage.createPackageContents();

    // Initialize created meta-data
    thePollSystemPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePollSystemPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PollSystemPackage.eNS_URI, thePollSystemPackage);
    return thePollSystemPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPollSystem()
  {
    return pollSystemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPollSystem_Name()
  {
    return (EAttribute)pollSystemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPollSystem_Polls()
  {
    return (EReference)pollSystemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPoll()
  {
    return pollEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPoll_Name()
  {
    return (EAttribute)pollEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPoll_Description()
  {
    return (EAttribute)pollEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPoll_Questions()
  {
    return (EReference)pollEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuestion()
  {
    return questionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuestion_Name()
  {
    return (EAttribute)questionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuestion_Text()
  {
    return (EAttribute)questionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextQuestion()
  {
    return textQuestionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImageQuestion()
  {
    return imageQuestionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImageQuestion_ImagePath()
  {
    return (EAttribute)imageQuestionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleChoiceQuestion()
  {
    return singleChoiceQuestionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSingleChoiceQuestion_Options()
  {
    return (EReference)singleChoiceQuestionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultipleChoiceQuestion()
  {
    return multipleChoiceQuestionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultipleChoiceQuestion_Options()
  {
    return (EReference)multipleChoiceQuestionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuestionOption()
  {
    return questionOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuestionOption_Name()
  {
    return (EAttribute)questionOptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuestionOption_Option()
  {
    return (EAttribute)questionOptionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQuestionOption_Value()
  {
    return (EAttribute)questionOptionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleChoiceOption()
  {
    return singleChoiceOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultipleChoiceOption()
  {
    return multipleChoiceOptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PollSystemFactory getPollSystemFactory()
  {
    return (PollSystemFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    pollSystemEClass = createEClass(POLL_SYSTEM);
    createEAttribute(pollSystemEClass, POLL_SYSTEM__NAME);
    createEReference(pollSystemEClass, POLL_SYSTEM__POLLS);

    pollEClass = createEClass(POLL);
    createEAttribute(pollEClass, POLL__NAME);
    createEAttribute(pollEClass, POLL__DESCRIPTION);
    createEReference(pollEClass, POLL__QUESTIONS);

    questionEClass = createEClass(QUESTION);
    createEAttribute(questionEClass, QUESTION__NAME);
    createEAttribute(questionEClass, QUESTION__TEXT);

    textQuestionEClass = createEClass(TEXT_QUESTION);

    imageQuestionEClass = createEClass(IMAGE_QUESTION);
    createEAttribute(imageQuestionEClass, IMAGE_QUESTION__IMAGE_PATH);

    singleChoiceQuestionEClass = createEClass(SINGLE_CHOICE_QUESTION);
    createEReference(singleChoiceQuestionEClass, SINGLE_CHOICE_QUESTION__OPTIONS);

    multipleChoiceQuestionEClass = createEClass(MULTIPLE_CHOICE_QUESTION);
    createEReference(multipleChoiceQuestionEClass, MULTIPLE_CHOICE_QUESTION__OPTIONS);

    questionOptionEClass = createEClass(QUESTION_OPTION);
    createEAttribute(questionOptionEClass, QUESTION_OPTION__NAME);
    createEAttribute(questionOptionEClass, QUESTION_OPTION__OPTION);
    createEAttribute(questionOptionEClass, QUESTION_OPTION__VALUE);

    singleChoiceOptionEClass = createEClass(SINGLE_CHOICE_OPTION);

    multipleChoiceOptionEClass = createEClass(MULTIPLE_CHOICE_OPTION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    textQuestionEClass.getESuperTypes().add(this.getQuestion());
    imageQuestionEClass.getESuperTypes().add(this.getQuestion());
    singleChoiceQuestionEClass.getESuperTypes().add(this.getQuestion());
    multipleChoiceQuestionEClass.getESuperTypes().add(this.getQuestion());
    singleChoiceOptionEClass.getESuperTypes().add(this.getQuestionOption());
    multipleChoiceOptionEClass.getESuperTypes().add(this.getQuestionOption());

    // Initialize classes and features; add operations and parameters
    initEClass(pollSystemEClass, PollSystem.class, "PollSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPollSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, PollSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPollSystem_Polls(), this.getPoll(), null, "polls", null, 0, -1, PollSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pollEClass, Poll.class, "Poll", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPoll_Name(), ecorePackage.getEString(), "name", null, 0, 1, Poll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPoll_Description(), ecorePackage.getEString(), "description", null, 0, 1, Poll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPoll_Questions(), this.getQuestion(), null, "questions", null, 0, -1, Poll.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuestion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuestion_Text(), ecorePackage.getEString(), "text", null, 0, 1, Question.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textQuestionEClass, TextQuestion.class, "TextQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(imageQuestionEClass, ImageQuestion.class, "ImageQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImageQuestion_ImagePath(), ecorePackage.getEString(), "imagePath", null, 0, 1, ImageQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleChoiceQuestionEClass, SingleChoiceQuestion.class, "SingleChoiceQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSingleChoiceQuestion_Options(), this.getSingleChoiceOption(), null, "options", null, 0, -1, SingleChoiceQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multipleChoiceQuestionEClass, MultipleChoiceQuestion.class, "MultipleChoiceQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultipleChoiceQuestion_Options(), this.getMultipleChoiceOption(), null, "options", null, 0, -1, MultipleChoiceQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(questionOptionEClass, QuestionOption.class, "QuestionOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQuestionOption_Name(), ecorePackage.getEString(), "name", null, 0, 1, QuestionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuestionOption_Option(), ecorePackage.getEString(), "option", null, 0, 1, QuestionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getQuestionOption_Value(), ecorePackage.getEString(), "value", null, 0, 1, QuestionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleChoiceOptionEClass, SingleChoiceOption.class, "SingleChoiceOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(multipleChoiceOptionEClass, MultipleChoiceOption.class, "MultipleChoiceOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //PollSystemPackageImpl
