/**
 */
package fr.istic.m2miage.idm.uimm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import fr.istic.m2miage.idm.uimm.Component;
import java.util.ArrayList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.istic.m2miage.idm.uimm.Component#getName <em>Name</em>}</li>
 *   <li>{@link fr.istic.m2miage.idm.uimm.Component#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.istic.m2miage.idm.uimm.Component#getBorderStyle <em>Border Style</em>}</li>
 *   <li>{@link fr.istic.m2miage.idm.uimm.Component#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link fr.istic.m2miage.idm.uimm.Component#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.istic.m2miage.idm.uimm.UimmPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
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
	 * @see fr.istic.m2miage.idm.uimm.UimmPackage#getComponent_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.istic.m2miage.idm.uimm.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see fr.istic.m2miage.idm.uimm.UimmPackage#getComponent_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link fr.istic.m2miage.idm.uimm.Component#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Border Style</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.istic.m2miage.idm.uimm.BorderStyle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Border Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Style</em>' attribute.
	 * @see fr.istic.m2miage.idm.uimm.BorderStyle
	 * @see #setBorderStyle(BorderStyle)
	 * @see fr.istic.m2miage.idm.uimm.UimmPackage#getComponent_BorderStyle()
	 * @model
	 * @generated
	 */
	BorderStyle getBorderStyle();

	/**
	 * Sets the value of the '{@link fr.istic.m2miage.idm.uimm.Component#getBorderStyle <em>Border Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Style</em>' attribute.
	 * @see fr.istic.m2miage.idm.uimm.BorderStyle
	 * @see #getBorderStyle()
	 * @generated
	 */
	void setBorderStyle(BorderStyle value);

	/**
	 * Returns the value of the '<em><b>Bg Color</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.istic.m2miage.idm.uimm.Color}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bg Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bg Color</em>' attribute.
	 * @see fr.istic.m2miage.idm.uimm.Color
	 * @see #setBgColor(Color)
	 * @see fr.istic.m2miage.idm.uimm.UimmPackage#getComponent_BgColor()
	 * @model dataType="fr.istic.m2miage.idm.uimm.Color"
	 * @generated
	 */
	Color getBgColor();

	/**
	 * Sets the value of the '{@link fr.istic.m2miage.idm.uimm.Component#getBgColor <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bg Color</em>' attribute.
	 * @see fr.istic.m2miage.idm.uimm.Color
	 * @see #getBgColor()
	 * @generated
	 */
	void setBgColor(Color value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link fr.istic.m2miage.idm.uimm.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see fr.istic.m2miage.idm.uimm.UimmPackage#getComponent_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getComponents();
	
	void initComponents();

} // Component
