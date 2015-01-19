/**
 */
package fr.istic.m2miage.idm.cSS.util;

import fr.istic.m2miage.idm.cSS.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.istic.m2miage.idm.cSS.CSSPackage
 * @generated
 */
public class CSSAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CSSPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSSAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CSSPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CSSSwitch<Adapter> modelSwitch =
    new CSSSwitch<Adapter>()
    {
      @Override
      public Adapter caseStyle(Style object)
      {
        return createStyleAdapter();
      }
      @Override
      public Adapter casePollStyle(PollStyle object)
      {
        return createPollStyleAdapter();
      }
      @Override
      public Adapter caseSingleQuestionStyle(SingleQuestionStyle object)
      {
        return createSingleQuestionStyleAdapter();
      }
      @Override
      public Adapter caseMultipleQuestionStyle(MultipleQuestionStyle object)
      {
        return createMultipleQuestionStyleAdapter();
      }
      @Override
      public Adapter caseTextQuestionStyle(TextQuestionStyle object)
      {
        return createTextQuestionStyleAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link fr.istic.m2miage.idm.cSS.Style <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.istic.m2miage.idm.cSS.Style
   * @generated
   */
  public Adapter createStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.istic.m2miage.idm.cSS.PollStyle <em>Poll Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.istic.m2miage.idm.cSS.PollStyle
   * @generated
   */
  public Adapter createPollStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.istic.m2miage.idm.cSS.SingleQuestionStyle <em>Single Question Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.istic.m2miage.idm.cSS.SingleQuestionStyle
   * @generated
   */
  public Adapter createSingleQuestionStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.istic.m2miage.idm.cSS.MultipleQuestionStyle <em>Multiple Question Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.istic.m2miage.idm.cSS.MultipleQuestionStyle
   * @generated
   */
  public Adapter createMultipleQuestionStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.istic.m2miage.idm.cSS.TextQuestionStyle <em>Text Question Style</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.istic.m2miage.idm.cSS.TextQuestionStyle
   * @generated
   */
  public Adapter createTextQuestionStyleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CSSAdapterFactory
