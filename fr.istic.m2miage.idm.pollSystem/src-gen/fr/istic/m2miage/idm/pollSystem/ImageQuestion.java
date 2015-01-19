/**
 */
package fr.istic.m2miage.idm.pollSystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.istic.m2miage.idm.pollSystem.ImageQuestion#getImagePath <em>Image Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.istic.m2miage.idm.pollSystem.PollSystemPackage#getImageQuestion()
 * @model
 * @generated
 */
public interface ImageQuestion extends Question
{
  /**
   * Returns the value of the '<em><b>Image Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Image Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Image Path</em>' attribute.
   * @see #setImagePath(String)
   * @see fr.istic.m2miage.idm.pollSystem.PollSystemPackage#getImageQuestion_ImagePath()
   * @model
   * @generated
   */
  String getImagePath();

  /**
   * Sets the value of the '{@link fr.istic.m2miage.idm.pollSystem.ImageQuestion#getImagePath <em>Image Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Image Path</em>' attribute.
   * @see #getImagePath()
   * @generated
   */
  void setImagePath(String value);

} // ImageQuestion
