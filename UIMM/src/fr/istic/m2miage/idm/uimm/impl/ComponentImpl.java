/**
 */
package fr.istic.m2miage.idm.uimm.impl;

import fr.istic.m2miage.idm.uimm.BorderStyle;
import fr.istic.m2miage.idm.uimm.Color;
import fr.istic.m2miage.idm.uimm.Component;
import fr.istic.m2miage.idm.uimm.UimmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.istic.m2miage.idm.uimm.impl.ComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.istic.m2miage.idm.uimm.impl.ComponentImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.istic.m2miage.idm.uimm.impl.ComponentImpl#getBorderStyle <em>Border Style</em>}</li>
 *   <li>{@link fr.istic.m2miage.idm.uimm.impl.ComponentImpl#getBgColor <em>Bg Color</em>}</li>
 *   <li>{@link fr.istic.m2miage.idm.uimm.impl.ComponentImpl#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentImpl extends MinimalEObjectImpl.Container implements Component {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getBorderStyle() <em>Border Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderStyle()
	 * @generated
	 * @ordered
	 */
	protected static final BorderStyle BORDER_STYLE_EDEFAULT = BorderStyle.BOX;

	/**
	 * The cached value of the '{@link #getBorderStyle() <em>Border Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderStyle()
	 * @generated
	 * @ordered
	 */
	protected BorderStyle borderStyle = BORDER_STYLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBgColor() <em>Bg Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBgColor()
	 * @generated
	 * @ordered
	 */
	protected Color bgColor;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UimmPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimmPackage.COMPONENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimmPackage.COMPONENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BorderStyle getBorderStyle() {
		return borderStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBorderStyle(BorderStyle newBorderStyle) {
		BorderStyle oldBorderStyle = borderStyle;
		borderStyle = newBorderStyle == null ? BORDER_STYLE_EDEFAULT : newBorderStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimmPackage.COMPONENT__BORDER_STYLE, oldBorderStyle, borderStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getBgColor() {
		return bgColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBgColor(Color newBgColor) {
		Color oldBgColor = bgColor;
		bgColor = newBgColor == null ? null : newBgColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UimmPackage.COMPONENT__BG_COLOR, oldBgColor, bgColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, UimmPackage.COMPONENT__COMPONENTS);
		}
		return components;
	}
	
	@Override
	public void initComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Component>(Component.class, this, UimmPackage.COMPONENT__COMPONENTS);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UimmPackage.COMPONENT__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UimmPackage.COMPONENT__NAME:
				return getName();
			case UimmPackage.COMPONENT__DESCRIPTION:
				return getDescription();
			case UimmPackage.COMPONENT__BORDER_STYLE:
				return getBorderStyle();
			case UimmPackage.COMPONENT__BG_COLOR:
				return getBgColor();
			case UimmPackage.COMPONENT__COMPONENTS:
				return getComponents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UimmPackage.COMPONENT__NAME:
				setName((String)newValue);
				return;
			case UimmPackage.COMPONENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case UimmPackage.COMPONENT__BORDER_STYLE:
				setBorderStyle((BorderStyle)newValue);
				return;
			case UimmPackage.COMPONENT__BG_COLOR:
				setBgColor((Color)newValue);
				return;
			case UimmPackage.COMPONENT__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UimmPackage.COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UimmPackage.COMPONENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case UimmPackage.COMPONENT__BORDER_STYLE:
				setBorderStyle(BORDER_STYLE_EDEFAULT);
				return;
			case UimmPackage.COMPONENT__BG_COLOR:
				setBgColor((Color)null);
				return;
			case UimmPackage.COMPONENT__COMPONENTS:
				getComponents().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UimmPackage.COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UimmPackage.COMPONENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case UimmPackage.COMPONENT__BORDER_STYLE:
				return borderStyle != BORDER_STYLE_EDEFAULT;
			case UimmPackage.COMPONENT__BG_COLOR:
				return bgColor != null;
			case UimmPackage.COMPONENT__COMPONENTS:
				return components != null && !components.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", borderStyle: ");
		result.append(borderStyle);
		result.append(", bgColor: ");
		result.append(bgColor);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
