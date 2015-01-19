/**
 */
package fr.istic.m2miage.idm.uimm;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.istic.m2miage.idm.uimm.UimmFactory
 * @model kind="package"
 * @generated
 */
public interface UimmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uimm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://idm.m2miage.istic.fr/uimm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uimm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UimmPackage eINSTANCE = fr.istic.m2miage.idm.uimm.impl.UimmPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.istic.m2miage.idm.uimm.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.istic.m2miage.idm.uimm.impl.ComponentImpl
	 * @see fr.istic.m2miage.idm.uimm.impl.UimmPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BORDER_STYLE = 2;

	/**
	 * The feature id for the '<em><b>Bg Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__BG_COLOR = 3;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__COMPONENTS = 4;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.istic.m2miage.idm.uimm.impl.TextComponentImpl <em>Text Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.istic.m2miage.idm.uimm.impl.TextComponentImpl
	 * @see fr.istic.m2miage.idm.uimm.impl.UimmPackageImpl#getTextComponent()
	 * @generated
	 */
	int TEXT_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_COMPONENT__NAME = COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_COMPONENT__DESCRIPTION = COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_COMPONENT__BORDER_STYLE = COMPONENT__BORDER_STYLE;

	/**
	 * The feature id for the '<em><b>Bg Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_COMPONENT__BG_COLOR = COMPONENT__BG_COLOR;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_COMPONENT__COMPONENTS = COMPONENT__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_COMPONENT__TEXT = COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Text Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Text Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.istic.m2miage.idm.uimm.impl.ImageComponentImpl <em>Image Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.istic.m2miage.idm.uimm.impl.ImageComponentImpl
	 * @see fr.istic.m2miage.idm.uimm.impl.UimmPackageImpl#getImageComponent()
	 * @generated
	 */
	int IMAGE_COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COMPONENT__NAME = TEXT_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COMPONENT__DESCRIPTION = TEXT_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COMPONENT__BORDER_STYLE = TEXT_COMPONENT__BORDER_STYLE;

	/**
	 * The feature id for the '<em><b>Bg Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COMPONENT__BG_COLOR = TEXT_COMPONENT__BG_COLOR;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COMPONENT__COMPONENTS = TEXT_COMPONENT__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COMPONENT__TEXT = TEXT_COMPONENT__TEXT;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COMPONENT__SRC = TEXT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COMPONENT_FEATURE_COUNT = TEXT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Image Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_COMPONENT_OPERATION_COUNT = TEXT_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.istic.m2miage.idm.uimm.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.istic.m2miage.idm.uimm.impl.ElementImpl
	 * @see fr.istic.m2miage.idm.uimm.impl.UimmPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.istic.m2miage.idm.uimm.impl.ListComponentImpl <em>List Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.istic.m2miage.idm.uimm.impl.ListComponentImpl
	 * @see fr.istic.m2miage.idm.uimm.impl.UimmPackageImpl#getListComponent()
	 * @generated
	 */
	int LIST_COMPONENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPONENT__NAME = TEXT_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPONENT__DESCRIPTION = TEXT_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPONENT__BORDER_STYLE = TEXT_COMPONENT__BORDER_STYLE;

	/**
	 * The feature id for the '<em><b>Bg Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPONENT__BG_COLOR = TEXT_COMPONENT__BG_COLOR;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPONENT__COMPONENTS = TEXT_COMPONENT__COMPONENTS;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPONENT__TEXT = TEXT_COMPONENT__TEXT;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPONENT__ELEMENTS = TEXT_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPONENT_FEATURE_COUNT = TEXT_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_COMPONENT_OPERATION_COUNT = TEXT_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.istic.m2miage.idm.uimm.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.istic.m2miage.idm.uimm.impl.OptionImpl
	 * @see fr.istic.m2miage.idm.uimm.impl.UimmPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__TEXT = ELEMENT__TEXT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__NAME = ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__TYPE = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VALUE = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.istic.m2miage.idm.uimm.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.istic.m2miage.idm.uimm.impl.PageImpl
	 * @see fr.istic.m2miage.idm.uimm.impl.UimmPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 6;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__COMPONENTS = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITLE = 1;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.istic.m2miage.idm.uimm.OptionType <em>Option Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.istic.m2miage.idm.uimm.OptionType
	 * @see fr.istic.m2miage.idm.uimm.impl.UimmPackageImpl#getOptionType()
	 * @generated
	 */
	int OPTION_TYPE = 7;

	/**
	 * The meta object id for the '{@link fr.istic.m2miage.idm.uimm.BorderStyle <em>Border Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.istic.m2miage.idm.uimm.BorderStyle
	 * @see fr.istic.m2miage.idm.uimm.impl.UimmPackageImpl#getBorderStyle()
	 * @generated
	 */
	int BORDER_STYLE = 8;

	/**
	 * The meta object id for the '{@link fr.istic.m2miage.idm.uimm.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.istic.m2miage.idm.uimm.Color
	 * @see fr.istic.m2miage.idm.uimm.impl.UimmPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 9;


	/**
	 * Returns the meta object for class '{@link fr.istic.m2miage.idm.uimm.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see fr.istic.m2miage.idm.uimm.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.uimm.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.istic.m2miage.idm.uimm.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.uimm.Component#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see fr.istic.m2miage.idm.uimm.Component#getDescription()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Description();

	/**
	 * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.uimm.Component#getBorderStyle <em>Border Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Style</em>'.
	 * @see fr.istic.m2miage.idm.uimm.Component#getBorderStyle()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_BorderStyle();

	/**
	 * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.uimm.Component#getBgColor <em>Bg Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bg Color</em>'.
	 * @see fr.istic.m2miage.idm.uimm.Component#getBgColor()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_BgColor();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.istic.m2miage.idm.uimm.Component#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see fr.istic.m2miage.idm.uimm.Component#getComponents()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Components();

	/**
	 * Returns the meta object for class '{@link fr.istic.m2miage.idm.uimm.ImageComponent <em>Image Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Component</em>'.
	 * @see fr.istic.m2miage.idm.uimm.ImageComponent
	 * @generated
	 */
	EClass getImageComponent();

	/**
	 * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.uimm.ImageComponent#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see fr.istic.m2miage.idm.uimm.ImageComponent#getSrc()
	 * @see #getImageComponent()
	 * @generated
	 */
	EAttribute getImageComponent_Src();

	/**
	 * Returns the meta object for class '{@link fr.istic.m2miage.idm.uimm.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see fr.istic.m2miage.idm.uimm.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.uimm.Element#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see fr.istic.m2miage.idm.uimm.Element#getText()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Text();

	/**
	 * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.uimm.Element#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.istic.m2miage.idm.uimm.Element#getName()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Name();

	/**
	 * Returns the meta object for class '{@link fr.istic.m2miage.idm.uimm.TextComponent <em>Text Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Component</em>'.
	 * @see fr.istic.m2miage.idm.uimm.TextComponent
	 * @generated
	 */
	EClass getTextComponent();

	/**
	 * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.uimm.TextComponent#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see fr.istic.m2miage.idm.uimm.TextComponent#getText()
	 * @see #getTextComponent()
	 * @generated
	 */
	EAttribute getTextComponent_Text();

	/**
	 * Returns the meta object for class '{@link fr.istic.m2miage.idm.uimm.ListComponent <em>List Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Component</em>'.
	 * @see fr.istic.m2miage.idm.uimm.ListComponent
	 * @generated
	 */
	EClass getListComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.istic.m2miage.idm.uimm.ListComponent#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see fr.istic.m2miage.idm.uimm.ListComponent#getElements()
	 * @see #getListComponent()
	 * @generated
	 */
	EReference getListComponent_Elements();

	/**
	 * Returns the meta object for class '{@link fr.istic.m2miage.idm.uimm.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see fr.istic.m2miage.idm.uimm.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.uimm.Option#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.istic.m2miage.idm.uimm.Option#getType()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Type();

	/**
	 * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.uimm.Option#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.istic.m2miage.idm.uimm.Option#getValue()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Value();

	/**
	 * Returns the meta object for class '{@link fr.istic.m2miage.idm.uimm.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see fr.istic.m2miage.idm.uimm.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.istic.m2miage.idm.uimm.Page#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see fr.istic.m2miage.idm.uimm.Page#getComponents()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Components();

	/**
	 * Returns the meta object for the attribute '{@link fr.istic.m2miage.idm.uimm.Page#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see fr.istic.m2miage.idm.uimm.Page#getTitle()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Title();

	/**
	 * Returns the meta object for enum '{@link fr.istic.m2miage.idm.uimm.OptionType <em>Option Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Option Type</em>'.
	 * @see fr.istic.m2miage.idm.uimm.OptionType
	 * @generated
	 */
	EEnum getOptionType();

	/**
	 * Returns the meta object for enum '{@link fr.istic.m2miage.idm.uimm.BorderStyle <em>Border Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Border Style</em>'.
	 * @see fr.istic.m2miage.idm.uimm.BorderStyle
	 * @generated
	 */
	EEnum getBorderStyle();

	/**
	 * Returns the meta object for enum '{@link fr.istic.m2miage.idm.uimm.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see fr.istic.m2miage.idm.uimm.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UimmFactory getUimmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.istic.m2miage.idm.uimm.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.istic.m2miage.idm.uimm.impl.ComponentImpl
		 * @see fr.istic.m2miage.idm.uimm.impl.UimmPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__DESCRIPTION = eINSTANCE.getComponent_Description();

		/**
		 * The meta object literal for the '<em><b>Border Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__BORDER_STYLE = eINSTANCE.getComponent_BorderStyle();

		/**
		 * The meta object literal for the '<em><b>Bg Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__BG_COLOR = eINSTANCE.getComponent_BgColor();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__COMPONENTS = eINSTANCE.getComponent_Components();

		/**
		 * The meta object literal for the '{@link fr.istic.m2miage.idm.uimm.impl.ImageComponentImpl <em>Image Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.istic.m2miage.idm.uimm.impl.ImageComponentImpl
		 * @see fr.istic.m2miage.idm.uimm.impl.UimmPackageImpl#getImageComponent()
		 * @generated
		 */
		EClass IMAGE_COMPONENT = eINSTANCE.getImageComponent();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_COMPONENT__SRC = eINSTANCE.getImageComponent_Src();

		/**
		 * The meta object literal for the '{@link fr.istic.m2miage.idm.uimm.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.istic.m2miage.idm.uimm.impl.ElementImpl
		 * @see fr.istic.m2miage.idm.uimm.impl.UimmPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TEXT = eINSTANCE.getElement_Text();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__NAME = eINSTANCE.getElement_Name();

		/**
		 * The meta object literal for the '{@link fr.istic.m2miage.idm.uimm.impl.TextComponentImpl <em>Text Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.istic.m2miage.idm.uimm.impl.TextComponentImpl
		 * @see fr.istic.m2miage.idm.uimm.impl.UimmPackageImpl#getTextComponent()
		 * @generated
		 */
		EClass TEXT_COMPONENT = eINSTANCE.getTextComponent();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_COMPONENT__TEXT = eINSTANCE.getTextComponent_Text();

		/**
		 * The meta object literal for the '{@link fr.istic.m2miage.idm.uimm.impl.ListComponentImpl <em>List Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.istic.m2miage.idm.uimm.impl.ListComponentImpl
		 * @see fr.istic.m2miage.idm.uimm.impl.UimmPackageImpl#getListComponent()
		 * @generated
		 */
		EClass LIST_COMPONENT = eINSTANCE.getListComponent();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_COMPONENT__ELEMENTS = eINSTANCE.getListComponent_Elements();

		/**
		 * The meta object literal for the '{@link fr.istic.m2miage.idm.uimm.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.istic.m2miage.idm.uimm.impl.OptionImpl
		 * @see fr.istic.m2miage.idm.uimm.impl.UimmPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__TYPE = eINSTANCE.getOption_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__VALUE = eINSTANCE.getOption_Value();

		/**
		 * The meta object literal for the '{@link fr.istic.m2miage.idm.uimm.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.istic.m2miage.idm.uimm.impl.PageImpl
		 * @see fr.istic.m2miage.idm.uimm.impl.UimmPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__COMPONENTS = eINSTANCE.getPage_Components();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TITLE = eINSTANCE.getPage_Title();

		/**
		 * The meta object literal for the '{@link fr.istic.m2miage.idm.uimm.OptionType <em>Option Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.istic.m2miage.idm.uimm.OptionType
		 * @see fr.istic.m2miage.idm.uimm.impl.UimmPackageImpl#getOptionType()
		 * @generated
		 */
		EEnum OPTION_TYPE = eINSTANCE.getOptionType();

		/**
		 * The meta object literal for the '{@link fr.istic.m2miage.idm.uimm.BorderStyle <em>Border Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.istic.m2miage.idm.uimm.BorderStyle
		 * @see fr.istic.m2miage.idm.uimm.impl.UimmPackageImpl#getBorderStyle()
		 * @generated
		 */
		EEnum BORDER_STYLE = eINSTANCE.getBorderStyle();

		/**
		 * The meta object literal for the '{@link fr.istic.m2miage.idm.uimm.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.istic.m2miage.idm.uimm.Color
		 * @see fr.istic.m2miage.idm.uimm.impl.UimmPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

	}

} //UimmPackage
