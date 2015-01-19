/**
 */
package fr.istic.m2miage.idm.uimm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.istic.m2miage.idm.uimm.ListComponent#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.istic.m2miage.idm.uimm.UimmPackage#getListComponent()
 * @model
 * @generated
 */
public interface ListComponent extends TextComponent {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link fr.istic.m2miage.idm.uimm.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see fr.istic.m2miage.idm.uimm.UimmPackage#getListComponent_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Element> getElements();

} // ListComponent
