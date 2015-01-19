/**
 */
package fr.istic.m2miage.idm.cSS;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.istic.m2miage.idm.cSS.CSSPackage
 * @generated
 */
public interface CSSFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CSSFactory eINSTANCE = fr.istic.m2miage.idm.cSS.impl.CSSFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Style</em>'.
   * @generated
   */
  Style createStyle();

  /**
   * Returns a new object of class '<em>Poll Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Poll Style</em>'.
   * @generated
   */
  PollStyle createPollStyle();

  /**
   * Returns a new object of class '<em>Single Question Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Question Style</em>'.
   * @generated
   */
  SingleQuestionStyle createSingleQuestionStyle();

  /**
   * Returns a new object of class '<em>Multiple Question Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multiple Question Style</em>'.
   * @generated
   */
  MultipleQuestionStyle createMultipleQuestionStyle();

  /**
   * Returns a new object of class '<em>Text Question Style</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Question Style</em>'.
   * @generated
   */
  TextQuestionStyle createTextQuestionStyle();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CSSPackage getCSSPackage();

} //CSSFactory
