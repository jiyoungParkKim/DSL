/**
 */
package fr.istic.m2miage.idm.pollSystem;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Poll System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.istic.m2miage.idm.pollSystem.PollSystem#getName <em>Name</em>}</li>
 *   <li>{@link fr.istic.m2miage.idm.pollSystem.PollSystem#getPolls <em>Polls</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.istic.m2miage.idm.pollSystem.PollSystemPackage#getPollSystem()
 * @model
 * @generated
 */
public interface PollSystem extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.istic.m2miage.idm.pollSystem.PollSystemPackage#getPollSystem_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.istic.m2miage.idm.pollSystem.PollSystem#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Polls</b></em>' containment reference list.
   * The list contents are of type {@link fr.istic.m2miage.idm.pollSystem.Poll}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Polls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Polls</em>' containment reference list.
   * @see fr.istic.m2miage.idm.pollSystem.PollSystemPackage#getPollSystem_Polls()
   * @model containment="true"
   * @generated
   */
  EList<Poll> getPolls();

} // PollSystem
