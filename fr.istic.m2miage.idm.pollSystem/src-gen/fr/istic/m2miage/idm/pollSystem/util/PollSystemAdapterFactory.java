/**
 */
package fr.istic.m2miage.idm.pollSystem.util;

import fr.istic.m2miage.idm.pollSystem.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.istic.m2miage.idm.pollSystem.PollSystemPackage
 * @generated
 */
public class PollSystemAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PollSystemPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PollSystemAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PollSystemPackage.eINSTANCE;
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
  protected PollSystemSwitch<Adapter> modelSwitch =
    new PollSystemSwitch<Adapter>()
    {
      @Override
      public Adapter casePollSystem(PollSystem object)
      {
        return createPollSystemAdapter();
      }
      @Override
      public Adapter casePoll(Poll object)
      {
        return createPollAdapter();
      }
      @Override
      public Adapter caseQuestion(Question object)
      {
        return createQuestionAdapter();
      }
      @Override
      public Adapter caseTextQuestion(TextQuestion object)
      {
        return createTextQuestionAdapter();
      }
      @Override
      public Adapter caseImageQuestion(ImageQuestion object)
      {
        return createImageQuestionAdapter();
      }
      @Override
      public Adapter caseSingleChoiceQuestion(SingleChoiceQuestion object)
      {
        return createSingleChoiceQuestionAdapter();
      }
      @Override
      public Adapter caseMultipleChoiceQuestion(MultipleChoiceQuestion object)
      {
        return createMultipleChoiceQuestionAdapter();
      }
      @Override
      public Adapter caseQuestionOption(QuestionOption object)
      {
        return createQuestionOptionAdapter();
      }
      @Override
      public Adapter caseSingleChoiceOption(SingleChoiceOption object)
      {
        return createSingleChoiceOptionAdapter();
      }
      @Override
      public Adapter caseMultipleChoiceOption(MultipleChoiceOption object)
      {
        return createMultipleChoiceOptionAdapter();
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
   * Creates a new adapter for an object of class '{@link fr.istic.m2miage.idm.pollSystem.PollSystem <em>Poll System</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.istic.m2miage.idm.pollSystem.PollSystem
   * @generated
   */
  public Adapter createPollSystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.istic.m2miage.idm.pollSystem.Poll <em>Poll</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.istic.m2miage.idm.pollSystem.Poll
   * @generated
   */
  public Adapter createPollAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.istic.m2miage.idm.pollSystem.Question <em>Question</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.istic.m2miage.idm.pollSystem.Question
   * @generated
   */
  public Adapter createQuestionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.istic.m2miage.idm.pollSystem.TextQuestion <em>Text Question</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.istic.m2miage.idm.pollSystem.TextQuestion
   * @generated
   */
  public Adapter createTextQuestionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.istic.m2miage.idm.pollSystem.ImageQuestion <em>Image Question</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.istic.m2miage.idm.pollSystem.ImageQuestion
   * @generated
   */
  public Adapter createImageQuestionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.istic.m2miage.idm.pollSystem.SingleChoiceQuestion <em>Single Choice Question</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.istic.m2miage.idm.pollSystem.SingleChoiceQuestion
   * @generated
   */
  public Adapter createSingleChoiceQuestionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.istic.m2miage.idm.pollSystem.MultipleChoiceQuestion <em>Multiple Choice Question</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.istic.m2miage.idm.pollSystem.MultipleChoiceQuestion
   * @generated
   */
  public Adapter createMultipleChoiceQuestionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.istic.m2miage.idm.pollSystem.QuestionOption <em>Question Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.istic.m2miage.idm.pollSystem.QuestionOption
   * @generated
   */
  public Adapter createQuestionOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.istic.m2miage.idm.pollSystem.SingleChoiceOption <em>Single Choice Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.istic.m2miage.idm.pollSystem.SingleChoiceOption
   * @generated
   */
  public Adapter createSingleChoiceOptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link fr.istic.m2miage.idm.pollSystem.MultipleChoiceOption <em>Multiple Choice Option</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see fr.istic.m2miage.idm.pollSystem.MultipleChoiceOption
   * @generated
   */
  public Adapter createMultipleChoiceOptionAdapter()
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

} //PollSystemAdapterFactory
