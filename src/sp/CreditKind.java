/**
 */
package sp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Credit Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see sp.SpPackage#getCreditKind()
 * @model
 * @generated
 */
public enum CreditKind implements Enumerator {
	/**
	 * The '<em><b>FIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVE_VALUE
	 * @generated
	 * @ordered
	 */
	FIVE(0, "FIVE", "FIVE"),

	/**
	 * The '<em><b>SEVENPOINTFIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVENPOINTFIVE_VALUE
	 * @generated
	 * @ordered
	 */
	SEVENPOINTFIVE(1, "SEVENPOINTFIVE", "7.5"),

	/**
	 * The '<em><b>TEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEN_VALUE
	 * @generated
	 * @ordered
	 */
	TEN(2, "TEN", "10"),

	/**
	 * The '<em><b>FIFTEEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIFTEEN_VALUE
	 * @generated
	 * @ordered
	 */
	FIFTEEN(3, "FIFTEEN", "15"),

	/**
	 * The '<em><b>TWENTY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWENTY_VALUE
	 * @generated
	 * @ordered
	 */
	TWENTY(4, "TWENTY", "20"),

	/**
	 * The '<em><b>THIRTY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRTY_VALUE
	 * @generated
	 * @ordered
	 */
	THIRTY(5, "THIRTY", "30");

	/**
	 * The '<em><b>FIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIVE_VALUE = 0;

	/**
	 * The '<em><b>SEVENPOINTFIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEVENPOINTFIVE
	 * @model literal="7.5"
	 * @generated
	 * @ordered
	 */
	public static final int SEVENPOINTFIVE_VALUE = 1;

	/**
	 * The '<em><b>TEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TEN
	 * @model literal="10"
	 * @generated
	 * @ordered
	 */
	public static final int TEN_VALUE = 2;

	/**
	 * The '<em><b>FIFTEEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIFTEEN
	 * @model literal="15"
	 * @generated
	 * @ordered
	 */
	public static final int FIFTEEN_VALUE = 3;

	/**
	 * The '<em><b>TWENTY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWENTY
	 * @model literal="20"
	 * @generated
	 * @ordered
	 */
	public static final int TWENTY_VALUE = 4;

	/**
	 * The '<em><b>THIRTY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #THIRTY
	 * @model literal="30"
	 * @generated
	 * @ordered
	 */
	public static final int THIRTY_VALUE = 5;

	/**
	 * An array of all the '<em><b>Credit Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CreditKind[] VALUES_ARRAY =
		new CreditKind[] {
			FIVE,
			SEVENPOINTFIVE,
			TEN,
			FIFTEEN,
			TWENTY,
			THIRTY,
		};

	/**
	 * A public read-only list of all the '<em><b>Credit Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CreditKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Credit Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CreditKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CreditKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Credit Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CreditKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CreditKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Credit Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CreditKind get(int value) {
		switch (value) {
			case FIVE_VALUE: return FIVE;
			case SEVENPOINTFIVE_VALUE: return SEVENPOINTFIVE;
			case TEN_VALUE: return TEN;
			case FIFTEEN_VALUE: return FIFTEEN;
			case TWENTY_VALUE: return TWENTY;
			case THIRTY_VALUE: return THIRTY;
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
	private CreditKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //CreditKind
