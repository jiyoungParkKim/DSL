/**
 */
package fr.istic.m2miage.idm.cSS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see fr.istic.m2miage.idm.cSS.CSSFactory
 * @model kind="package"
 * @generated
 */
public interface CSSPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "cSS";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.istic.fr/m2miage/idm/CSS";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "cSS";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CSSPackage eINSTANCE = fr.istic.m2miage.idm.cSS.impl.CSSPackageImpl.init();

  /**
   * The meta object id for the '{@link fr.istic.m2miage.idm.cSS.impl.StyleImpl <em>Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.m2miage.idm.cSS.impl.StyleImpl
   * @see fr.istic.m2miage.idm.cSS.impl.CSSPackageImpl#getStyle()
   * @generated
   */
  int STYLE = 0;

  /**
   * The feature id for the '<em><b>Poll Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE__POLL_STYLE = 0;

  /**
   * The feature id for the '<em><b>Single Question Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE__SINGLE_QUESTION_STYLE = 1;

  /**
   * The feature id for the '<em><b>Multiple Question Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE__MULTIPLE_QUESTION_STYLE = 2;

  /**
   * The feature id for the '<em><b>Text Question Style</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE__TEXT_QUESTION_STYLE = 3;

  /**
   * The number of structural features of the '<em>Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STYLE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link fr.istic.m2miage.idm.cSS.impl.PollStyleImpl <em>Poll Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.m2miage.idm.cSS.impl.PollStyleImpl
   * @see fr.istic.m2miage.idm.cSS.impl.CSSPackageImpl#getPollStyle()
   * @generated
   */
  int POLL_STYLE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLL_STYLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLL_STYLE__COLOR = 1;

  /**
   * The feature id for the '<em><b>Border Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLL_STYLE__BORDER_TYPE = 2;

  /**
   * The number of structural features of the '<em>Poll Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POLL_STYLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.istic.m2miage.idm.cSS.impl.SingleQuestionStyleImpl <em>Single Question Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.m2miage.idm.cSS.impl.SingleQuestionStyleImpl
   * @see fr.istic.m2miage.idm.cSS.impl.CSSPackageImpl#getSingleQuestionStyle()
   * @generated
   */
  int SINGLE_QUESTION_STYLE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_QUESTION_STYLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_QUESTION_STYLE__COLOR = 1;

  /**
   * The feature id for the '<em><b>Border Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_QUESTION_STYLE__BORDER_TYPE = 2;

  /**
   * The number of structural features of the '<em>Single Question Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SINGLE_QUESTION_STYLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.istic.m2miage.idm.cSS.impl.MultipleQuestionStyleImpl <em>Multiple Question Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.m2miage.idm.cSS.impl.MultipleQuestionStyleImpl
   * @see fr.istic.m2miage.idm.cSS.impl.CSSPackageImpl#getMultipleQuestionStyle()
   * @generated
   */
  int MULTIPLE_QUESTION_STYLE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLE_QUESTION_STYLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLE_QUESTION_STYLE__COLOR = 1;

  /**
   * The feature id for the '<em><b>Border Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLE_QUESTION_STYLE__BORDER_TYPE = 2;

  /**
   * The number of structural features of the '<em>Multiple Question Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLE_QUESTION_STYLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.istic.m2miage.idm.cSS.impl.TextQuestionStyleImpl <em>Text Question Style</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.m2miage.idm.cSS.impl.TextQuestionStyleImpl
   * @see fr.istic.m2miage.idm.cSS.impl.CSSPackageImpl#getTextQuestionStyle()
   * @generated
   */
  int TEXT_QUESTION_STYLE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_QUESTION_STYLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Color</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_QUESTION_STYLE__COLOR = 1;

  /**
   * The feature id for the '<em><b>Border Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_QUESTION_STYLE__BORDER_TYPE = 2;

  /**
   * The number of structural features of the '<em>Text Question Style</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_QUESTION_STYLE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link fr.istic.m2miage.idm.cSS.ColorEnum <em>Color Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.m2miage.idm.cSS.ColorEnum
   * @see fr.istic.m2miage.idm.cSS.impl.CSSPackageImpl#getColorEnum()
   * @generated
   */
  int COLOR_ENUM = 5;

  /**
   * The meta object id for the '{@link fr.istic.m2miage.idm.cSS.BorderTypeEnum <em>Border Type Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see fr.istic.m2miage.idm.cSS.BorderTypeEnum
   * @see fr.istic.m2miage.idm.cSS.impl.CSSPackageImpl#getBorderTypeEnum()
   * @generated
   */
  int BORDER_TYPE_ENUM = 6;


  /**
   * Returns the meta object for class '{@link fr.istic.m2miage.idm.cSS.Style <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Style</em>'.
   * @see fr.istic.m2miage.idm.cSS.Style
   * @generated
   */
  EClass getStyle();

  /**
   * Returns the meta object for the containment reference '{@link fr.istic.m2miage.idm.cSS.Style#getPollStyle <em>Poll Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Poll Style</em>'.
   * @see fr.istic.m2miage.idm.cSS.Style#getPollStyle()
   * @see #getStyle()
   * @generated
   */
  EReference getStyle_PollStyle();

  /**
   * Returns the meta object for the containment reference '{@link fr.istic.m2miage.idm.cSS.Style#getSingleQuestionStyle <em>Single Question Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Single Question Style</em>'.
   * @see fr.istic.m2miage.idm.cSS.Style#getSingleQuestionStyle()
   * @see #getStyle()
   * @generated
   */
  EReference getStyle_SingleQuestionStyle();

  /**
   * Returns the meta object for the containment reference '{@link fr.istic.m2miage.idm.cSS.Style#getMultipleQuestionStyle <em>Multiple Question Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Multiple Question Style</em>'.
   * @see fr.istic.m2miage.idm.cSS.Style#getMultipleQuestionStyle()
   * @see #getStyle()
   * @generated
   */
  EReference getStyle_MultipleQuestionStyle();

  /**
   * Returns the meta object for the containment reference '{@link fr.istic.m2miage.idm.cSS.Style#getTextQuestionStyle <em>Text Question Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Text Question Style</em>'.
   * @see fr.istic.m2miage.idm.cSS.Style#getTextQuestionStyle()
   * @see #getStyle()
   * @generated
   */
  EReference getStyle_TextQuestionStyle();

  /**
   * Returns the meta object for class '{@link fr.istic.m2miage.idm.cSS.PollStyle <em>Poll Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Poll Style</em>'.
   * @see fr.istic.m2miage.idm.cSS.PollStyle
   * @generated
   */
  EClass getPollStyle();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.cSS.PollStyle#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.istic.m2miage.idm.cSS.PollStyle#getName()
   * @see #getPollStyle()
   * @generated
   */
  EAttribute getPollStyle_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.cSS.PollStyle#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see fr.istic.m2miage.idm.cSS.PollStyle#getColor()
   * @see #getPollStyle()
   * @generated
   */
  EAttribute getPollStyle_Color();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.cSS.PollStyle#getBorderType <em>Border Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Border Type</em>'.
   * @see fr.istic.m2miage.idm.cSS.PollStyle#getBorderType()
   * @see #getPollStyle()
   * @generated
   */
  EAttribute getPollStyle_BorderType();

  /**
   * Returns the meta object for class '{@link fr.istic.m2miage.idm.cSS.SingleQuestionStyle <em>Single Question Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Single Question Style</em>'.
   * @see fr.istic.m2miage.idm.cSS.SingleQuestionStyle
   * @generated
   */
  EClass getSingleQuestionStyle();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.cSS.SingleQuestionStyle#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.istic.m2miage.idm.cSS.SingleQuestionStyle#getName()
   * @see #getSingleQuestionStyle()
   * @generated
   */
  EAttribute getSingleQuestionStyle_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.cSS.SingleQuestionStyle#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see fr.istic.m2miage.idm.cSS.SingleQuestionStyle#getColor()
   * @see #getSingleQuestionStyle()
   * @generated
   */
  EAttribute getSingleQuestionStyle_Color();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.cSS.SingleQuestionStyle#getBorderType <em>Border Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Border Type</em>'.
   * @see fr.istic.m2miage.idm.cSS.SingleQuestionStyle#getBorderType()
   * @see #getSingleQuestionStyle()
   * @generated
   */
  EAttribute getSingleQuestionStyle_BorderType();

  /**
   * Returns the meta object for class '{@link fr.istic.m2miage.idm.cSS.MultipleQuestionStyle <em>Multiple Question Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiple Question Style</em>'.
   * @see fr.istic.m2miage.idm.cSS.MultipleQuestionStyle
   * @generated
   */
  EClass getMultipleQuestionStyle();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.cSS.MultipleQuestionStyle#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.istic.m2miage.idm.cSS.MultipleQuestionStyle#getName()
   * @see #getMultipleQuestionStyle()
   * @generated
   */
  EAttribute getMultipleQuestionStyle_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.cSS.MultipleQuestionStyle#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see fr.istic.m2miage.idm.cSS.MultipleQuestionStyle#getColor()
   * @see #getMultipleQuestionStyle()
   * @generated
   */
  EAttribute getMultipleQuestionStyle_Color();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.cSS.MultipleQuestionStyle#getBorderType <em>Border Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Border Type</em>'.
   * @see fr.istic.m2miage.idm.cSS.MultipleQuestionStyle#getBorderType()
   * @see #getMultipleQuestionStyle()
   * @generated
   */
  EAttribute getMultipleQuestionStyle_BorderType();

  /**
   * Returns the meta object for class '{@link fr.istic.m2miage.idm.cSS.TextQuestionStyle <em>Text Question Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Question Style</em>'.
   * @see fr.istic.m2miage.idm.cSS.TextQuestionStyle
   * @generated
   */
  EClass getTextQuestionStyle();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.cSS.TextQuestionStyle#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see fr.istic.m2miage.idm.cSS.TextQuestionStyle#getName()
   * @see #getTextQuestionStyle()
   * @generated
   */
  EAttribute getTextQuestionStyle_Name();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.cSS.TextQuestionStyle#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Color</em>'.
   * @see fr.istic.m2miage.idm.cSS.TextQuestionStyle#getColor()
   * @see #getTextQuestionStyle()
   * @generated
   */
  EAttribute getTextQuestionStyle_Color();

  /**
   * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.cSS.TextQuestionStyle#getBorderType <em>Border Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Border Type</em>'.
   * @see fr.istic.m2miage.idm.cSS.TextQuestionStyle#getBorderType()
   * @see #getTextQuestionStyle()
   * @generated
   */
  EAttribute getTextQuestionStyle_BorderType();

  /**
   * Returns the meta object for enum '{@link fr.istic.m2miage.idm.cSS.ColorEnum <em>Color Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Color Enum</em>'.
   * @see fr.istic.m2miage.idm.cSS.ColorEnum
   * @generated
   */
  EEnum getColorEnum();

  /**
   * Returns the meta object for enum '{@link fr.istic.m2miage.idm.cSS.BorderTypeEnum <em>Border Type Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Border Type Enum</em>'.
   * @see fr.istic.m2miage.idm.cSS.BorderTypeEnum
   * @generated
   */
  EEnum getBorderTypeEnum();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CSSFactory getCSSFactory();

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
     * The meta object literal for the '{@link fr.istic.m2miage.idm.cSS.impl.StyleImpl <em>Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.m2miage.idm.cSS.impl.StyleImpl
     * @see fr.istic.m2miage.idm.cSS.impl.CSSPackageImpl#getStyle()
     * @generated
     */
    EClass STYLE = eINSTANCE.getStyle();

    /**
     * The meta object literal for the '<em><b>Poll Style</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLE__POLL_STYLE = eINSTANCE.getStyle_PollStyle();

    /**
     * The meta object literal for the '<em><b>Single Question Style</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLE__SINGLE_QUESTION_STYLE = eINSTANCE.getStyle_SingleQuestionStyle();

    /**
     * The meta object literal for the '<em><b>Multiple Question Style</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLE__MULTIPLE_QUESTION_STYLE = eINSTANCE.getStyle_MultipleQuestionStyle();

    /**
     * The meta object literal for the '<em><b>Text Question Style</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STYLE__TEXT_QUESTION_STYLE = eINSTANCE.getStyle_TextQuestionStyle();

    /**
     * The meta object literal for the '{@link fr.istic.m2miage.idm.cSS.impl.PollStyleImpl <em>Poll Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.m2miage.idm.cSS.impl.PollStyleImpl
     * @see fr.istic.m2miage.idm.cSS.impl.CSSPackageImpl#getPollStyle()
     * @generated
     */
    EClass POLL_STYLE = eINSTANCE.getPollStyle();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLL_STYLE__NAME = eINSTANCE.getPollStyle_Name();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLL_STYLE__COLOR = eINSTANCE.getPollStyle_Color();

    /**
     * The meta object literal for the '<em><b>Border Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POLL_STYLE__BORDER_TYPE = eINSTANCE.getPollStyle_BorderType();

    /**
     * The meta object literal for the '{@link fr.istic.m2miage.idm.cSS.impl.SingleQuestionStyleImpl <em>Single Question Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.m2miage.idm.cSS.impl.SingleQuestionStyleImpl
     * @see fr.istic.m2miage.idm.cSS.impl.CSSPackageImpl#getSingleQuestionStyle()
     * @generated
     */
    EClass SINGLE_QUESTION_STYLE = eINSTANCE.getSingleQuestionStyle();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SINGLE_QUESTION_STYLE__NAME = eINSTANCE.getSingleQuestionStyle_Name();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SINGLE_QUESTION_STYLE__COLOR = eINSTANCE.getSingleQuestionStyle_Color();

    /**
     * The meta object literal for the '<em><b>Border Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SINGLE_QUESTION_STYLE__BORDER_TYPE = eINSTANCE.getSingleQuestionStyle_BorderType();

    /**
     * The meta object literal for the '{@link fr.istic.m2miage.idm.cSS.impl.MultipleQuestionStyleImpl <em>Multiple Question Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.m2miage.idm.cSS.impl.MultipleQuestionStyleImpl
     * @see fr.istic.m2miage.idm.cSS.impl.CSSPackageImpl#getMultipleQuestionStyle()
     * @generated
     */
    EClass MULTIPLE_QUESTION_STYLE = eINSTANCE.getMultipleQuestionStyle();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLE_QUESTION_STYLE__NAME = eINSTANCE.getMultipleQuestionStyle_Name();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLE_QUESTION_STYLE__COLOR = eINSTANCE.getMultipleQuestionStyle_Color();

    /**
     * The meta object literal for the '<em><b>Border Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLE_QUESTION_STYLE__BORDER_TYPE = eINSTANCE.getMultipleQuestionStyle_BorderType();

    /**
     * The meta object literal for the '{@link fr.istic.m2miage.idm.cSS.impl.TextQuestionStyleImpl <em>Text Question Style</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.m2miage.idm.cSS.impl.TextQuestionStyleImpl
     * @see fr.istic.m2miage.idm.cSS.impl.CSSPackageImpl#getTextQuestionStyle()
     * @generated
     */
    EClass TEXT_QUESTION_STYLE = eINSTANCE.getTextQuestionStyle();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_QUESTION_STYLE__NAME = eINSTANCE.getTextQuestionStyle_Name();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_QUESTION_STYLE__COLOR = eINSTANCE.getTextQuestionStyle_Color();

    /**
     * The meta object literal for the '<em><b>Border Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXT_QUESTION_STYLE__BORDER_TYPE = eINSTANCE.getTextQuestionStyle_BorderType();

    /**
     * The meta object literal for the '{@link fr.istic.m2miage.idm.cSS.ColorEnum <em>Color Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.m2miage.idm.cSS.ColorEnum
     * @see fr.istic.m2miage.idm.cSS.impl.CSSPackageImpl#getColorEnum()
     * @generated
     */
    EEnum COLOR_ENUM = eINSTANCE.getColorEnum();

    /**
     * The meta object literal for the '{@link fr.istic.m2miage.idm.cSS.BorderTypeEnum <em>Border Type Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see fr.istic.m2miage.idm.cSS.BorderTypeEnum
     * @see fr.istic.m2miage.idm.cSS.impl.CSSPackageImpl#getBorderTypeEnum()
     * @generated
     */
    EEnum BORDER_TYPE_ENUM = eINSTANCE.getBorderTypeEnum();

  }

} //CSSPackage
