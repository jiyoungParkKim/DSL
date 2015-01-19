/**
 */
package fr.istic.m2miage.idm.cSS.impl;

import fr.istic.m2miage.idm.cSS.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class CSSFactoryImpl extends EFactoryImpl implements CSSFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CSSFactory init()
  {
    try
    {
      CSSFactory theCSSFactory = (CSSFactory)EPackage.Registry.INSTANCE.getEFactory(CSSPackage.eNS_URI);
      if (theCSSFactory != null)
      {
        return theCSSFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CSSFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSFactoryImpl()
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
      case CSSPackage.STYLE: return createStyle();
      case CSSPackage.POLL_STYLE: return createPollStyle();
      case CSSPackage.SINGLE_QUESTION_STYLE: return createSingleQuestionStyle();
      case CSSPackage.MULTIPLE_QUESTION_STYLE: return createMultipleQuestionStyle();
      case CSSPackage.TEXT_QUESTION_STYLE: return createTextQuestionStyle();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case CSSPackage.COLOR_ENUM:
        return createColorEnumFromString(eDataType, initialValue);
      case CSSPackage.BORDER_TYPE_ENUM:
        return createBorderTypeEnumFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case CSSPackage.COLOR_ENUM:
        return convertColorEnumToString(eDataType, instanceValue);
      case CSSPackage.BORDER_TYPE_ENUM:
        return convertBorderTypeEnumToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Style createStyle()
  {
    StyleImpl style = new StyleImpl();
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PollStyle createPollStyle()
  {
    PollStyleImpl pollStyle = new PollStyleImpl();
    return pollStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SingleQuestionStyle createSingleQuestionStyle()
  {
    SingleQuestionStyleImpl singleQuestionStyle = new SingleQuestionStyleImpl();
    return singleQuestionStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultipleQuestionStyle createMultipleQuestionStyle()
  {
    MultipleQuestionStyleImpl multipleQuestionStyle = new MultipleQuestionStyleImpl();
    return multipleQuestionStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextQuestionStyle createTextQuestionStyle()
  {
    TextQuestionStyleImpl textQuestionStyle = new TextQuestionStyleImpl();
    return textQuestionStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorEnum createColorEnumFromString(EDataType eDataType, String initialValue)
  {
    ColorEnum result = ColorEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertColorEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BorderTypeEnum createBorderTypeEnumFromString(EDataType eDataType, String initialValue)
  {
    BorderTypeEnum result = BorderTypeEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBorderTypeEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSPackage getCSSPackage()
  {
    return (CSSPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CSSPackage getPackage()
  {
    return CSSPackage.eINSTANCE;
  }

} //CSSFactoryImpl
