/**
 */
package fr.istic.m2miage.idm.uimm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Color</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.istic.m2miage.idm.uimm.UimmPackage#getColor()
 * @model instanceClass="fr.istic.m2miage.idm.uimm.Color"
 * @generated
 */
public enum Color implements Enumerator {
	/**
	 * The '<em><b>Azure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AZURE_VALUE
	 * @generated
	 * @ordered
	 */
	AZURE(0, "Azure", "Azure"),

	/**
	 * The '<em><b>Cyan</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CYAN_VALUE
	 * @generated
	 * @ordered
	 */
	CYAN(1, "Cyan", "Cyan"),

	/**
	 * The '<em><b>Lavender Blush</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAVENDER_BLUSH_VALUE
	 * @generated
	 * @ordered
	 */
	LAVENDER_BLUSH(2, "LavenderBlush", "LavenderBlush"),

	/**
	 * The '<em><b>Light Green</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHT_GREEN_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHT_GREEN(3, "LightGreen", "LightGreen"),

	/**
	 * The '<em><b>Pale Turquoise</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PALE_TURQUOISE_VALUE
	 * @generated
	 * @ordered
	 */
	PALE_TURQUOISE(4, "PaleTurquoise", "PaleTurquoise");

	/**
	 * The '<em><b>Azure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Azure</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AZURE
	 * @model name="Azure"
	 * @generated
	 * @ordered
	 */
	public static final int AZURE_VALUE = 0;

	/**
	 * The '<em><b>Cyan</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cyan</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CYAN
	 * @model name="Cyan"
	 * @generated
	 * @ordered
	 */
	public static final int CYAN_VALUE = 1;

	/**
	 * The '<em><b>Lavender Blush</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lavender Blush</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAVENDER_BLUSH
	 * @model name="LavenderBlush"
	 * @generated
	 * @ordered
	 */
	public static final int LAVENDER_BLUSH_VALUE = 2;

	/**
	 * The '<em><b>Light Green</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Light Green</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIGHT_GREEN
	 * @model name="LightGreen"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHT_GREEN_VALUE = 3;

	/**
	 * The '<em><b>Pale Turquoise</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pale Turquoise</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PALE_TURQUOISE
	 * @model name="PaleTurquoise"
	 * @generated
	 * @ordered
	 */
	public static final int PALE_TURQUOISE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Color</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Color[] VALUES_ARRAY =
		new Color[] {
			AZURE,
			CYAN,
			LAVENDER_BLUSH,
			LIGHT_GREEN,
			PALE_TURQUOISE,
		};

	/**
	 * A public read-only list of all the '<em><b>Color</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Color> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Color</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Color get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Color result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Color</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Color getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Color result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Color</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Color get(int value) {
		switch (value) {
			case AZURE_VALUE: return AZURE;
			case CYAN_VALUE: return CYAN;
			case LAVENDER_BLUSH_VALUE: return LAVENDER_BLUSH;
			case LIGHT_GREEN_VALUE: return LIGHT_GREEN;
			case PALE_TURQUOISE_VALUE: return PALE_TURQUOISE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Color(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Color
