/**
 */
package fr.istic.m2miage.idm.cSS.impl;

import fr.istic.m2miage.idm.cSS.BorderTypeEnum;
import fr.istic.m2miage.idm.cSS.CSSFactory;
import fr.istic.m2miage.idm.cSS.CSSPackage;
import fr.istic.m2miage.idm.cSS.ColorEnum;
import fr.istic.m2miage.idm.cSS.MultipleQuestionStyle;
import fr.istic.m2miage.idm.cSS.PollStyle;
import fr.istic.m2miage.idm.cSS.SingleQuestionStyle;
import fr.istic.m2miage.idm.cSS.Style;
import fr.istic.m2miage.idm.cSS.TextQuestionStyle;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CSSPackageImpl extends EPackageImpl implements CSSPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass styleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pollStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass singleQuestionStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multipleQuestionStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass textQuestionStyleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum colorEnumEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum borderTypeEnumEEnum = null;

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
   * @see fr.istic.m2miage.idm.cSS.CSSPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private CSSPackageImpl()
  {
    super(eNS_URI, CSSFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link CSSPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static CSSPackage init()
  {
    if (isInited) return (CSSPackage)EPackage.Registry.INSTANCE.getEPackage(CSSPackage.eNS_URI);

    // Obtain or create and register package
    CSSPackageImpl theCSSPackage = (CSSPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CSSPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CSSPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theCSSPackage.createPackageContents();

    // Initialize created meta-data
    theCSSPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theCSSPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(CSSPackage.eNS_URI, theCSSPackage);
    return theCSSPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStyle()
  {
    return styleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStyle_PollStyle()
  {
    return (EReference)styleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStyle_SingleQuestionStyle()
  {
    return (EReference)styleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStyle_MultipleQuestionStyle()
  {
    return (EReference)styleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStyle_TextQuestionStyle()
  {
    return (EReference)styleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPollStyle()
  {
    return pollStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPollStyle_Name()
  {
    return (EAttribute)pollStyleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPollStyle_Color()
  {
    return (EAttribute)pollStyleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPollStyle_BorderType()
  {
    return (EAttribute)pollStyleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSingleQuestionStyle()
  {
    return singleQuestionStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSingleQuestionStyle_Name()
  {
    return (EAttribute)singleQuestionStyleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSingleQuestionStyle_Color()
  {
    return (EAttribute)singleQuestionStyleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSingleQuestionStyle_BorderType()
  {
    return (EAttribute)singleQuestionStyleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultipleQuestionStyle()
  {
    return multipleQuestionStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultipleQuestionStyle_Name()
  {
    return (EAttribute)multipleQuestionStyleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultipleQuestionStyle_Color()
  {
    return (EAttribute)multipleQuestionStyleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultipleQuestionStyle_BorderType()
  {
    return (EAttribute)multipleQuestionStyleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTextQuestionStyle()
  {
    return textQuestionStyleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextQuestionStyle_Name()
  {
    return (EAttribute)textQuestionStyleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextQuestionStyle_Color()
  {
    return (EAttribute)textQuestionStyleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTextQuestionStyle_BorderType()
  {
    return (EAttribute)textQuestionStyleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getColorEnum()
  {
    return colorEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBorderTypeEnum()
  {
    return borderTypeEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSFactory getCSSFactory()
  {
    return (CSSFactory)getEFactoryInstance();
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
    styleEClass = createEClass(STYLE);
    createEReference(styleEClass, STYLE__POLL_STYLE);
    createEReference(styleEClass, STYLE__SINGLE_QUESTION_STYLE);
    createEReference(styleEClass, STYLE__MULTIPLE_QUESTION_STYLE);
    createEReference(styleEClass, STYLE__TEXT_QUESTION_STYLE);

    pollStyleEClass = createEClass(POLL_STYLE);
    createEAttribute(pollStyleEClass, POLL_STYLE__NAME);
    createEAttribute(pollStyleEClass, POLL_STYLE__COLOR);
    createEAttribute(pollStyleEClass, POLL_STYLE__BORDER_TYPE);

    singleQuestionStyleEClass = createEClass(SINGLE_QUESTION_STYLE);
    createEAttribute(singleQuestionStyleEClass, SINGLE_QUESTION_STYLE__NAME);
    createEAttribute(singleQuestionStyleEClass, SINGLE_QUESTION_STYLE__COLOR);
    createEAttribute(singleQuestionStyleEClass, SINGLE_QUESTION_STYLE__BORDER_TYPE);

    multipleQuestionStyleEClass = createEClass(MULTIPLE_QUESTION_STYLE);
    createEAttribute(multipleQuestionStyleEClass, MULTIPLE_QUESTION_STYLE__NAME);
    createEAttribute(multipleQuestionStyleEClass, MULTIPLE_QUESTION_STYLE__COLOR);
    createEAttribute(multipleQuestionStyleEClass, MULTIPLE_QUESTION_STYLE__BORDER_TYPE);

    textQuestionStyleEClass = createEClass(TEXT_QUESTION_STYLE);
    createEAttribute(textQuestionStyleEClass, TEXT_QUESTION_STYLE__NAME);
    createEAttribute(textQuestionStyleEClass, TEXT_QUESTION_STYLE__COLOR);
    createEAttribute(textQuestionStyleEClass, TEXT_QUESTION_STYLE__BORDER_TYPE);

    // Create enums
    colorEnumEEnum = createEEnum(COLOR_ENUM);
    borderTypeEnumEEnum = createEEnum(BORDER_TYPE_ENUM);
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

    // Initialize classes and features; add operations and parameters
    initEClass(styleEClass, Style.class, "Style", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStyle_PollStyle(), this.getPollStyle(), null, "pollStyle", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStyle_SingleQuestionStyle(), this.getSingleQuestionStyle(), null, "singleQuestionStyle", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStyle_MultipleQuestionStyle(), this.getMultipleQuestionStyle(), null, "multipleQuestionStyle", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStyle_TextQuestionStyle(), this.getTextQuestionStyle(), null, "textQuestionStyle", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pollStyleEClass, PollStyle.class, "PollStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPollStyle_Name(), ecorePackage.getEString(), "name", null, 0, 1, PollStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPollStyle_Color(), this.getColorEnum(), "color", null, 0, 1, PollStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPollStyle_BorderType(), this.getBorderTypeEnum(), "borderType", null, 0, 1, PollStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(singleQuestionStyleEClass, SingleQuestionStyle.class, "SingleQuestionStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSingleQuestionStyle_Name(), ecorePackage.getEString(), "name", null, 0, 1, SingleQuestionStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSingleQuestionStyle_Color(), this.getColorEnum(), "color", null, 0, 1, SingleQuestionStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSingleQuestionStyle_BorderType(), this.getBorderTypeEnum(), "borderType", null, 0, 1, SingleQuestionStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multipleQuestionStyleEClass, MultipleQuestionStyle.class, "MultipleQuestionStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMultipleQuestionStyle_Name(), ecorePackage.getEString(), "name", null, 0, 1, MultipleQuestionStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultipleQuestionStyle_Color(), this.getColorEnum(), "color", null, 0, 1, MultipleQuestionStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultipleQuestionStyle_BorderType(), this.getBorderTypeEnum(), "borderType", null, 0, 1, MultipleQuestionStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(textQuestionStyleEClass, TextQuestionStyle.class, "TextQuestionStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTextQuestionStyle_Name(), ecorePackage.getEString(), "name", null, 0, 1, TextQuestionStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTextQuestionStyle_Color(), this.getColorEnum(), "color", null, 0, 1, TextQuestionStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTextQuestionStyle_BorderType(), this.getBorderTypeEnum(), "borderType", null, 0, 1, TextQuestionStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(colorEnumEEnum, ColorEnum.class, "ColorEnum");
    addEEnumLiteral(colorEnumEEnum, ColorEnum.AZURE);
    addEEnumLiteral(colorEnumEEnum, ColorEnum.CYAN);
    addEEnumLiteral(colorEnumEEnum, ColorEnum.LAVENDER_BLUSH);
    addEEnumLiteral(colorEnumEEnum, ColorEnum.LIGHT_GREEN);
    addEEnumLiteral(colorEnumEEnum, ColorEnum.PALE_TURQUOISE);

    initEEnum(borderTypeEnumEEnum, BorderTypeEnum.class, "BorderTypeEnum");
    addEEnumLiteral(borderTypeEnumEEnum, BorderTypeEnum.BOX);
    addEEnumLiteral(borderTypeEnumEEnum, BorderTypeEnum.NONE);
    addEEnumLiteral(borderTypeEnumEEnum, BorderTypeEnum.ROUNDEDBOX);
    addEEnumLiteral(borderTypeEnumEEnum, BorderTypeEnum.DOTTE);

    // Create resource
    createResource(eNS_URI);
  }

} //CSSPackageImpl
