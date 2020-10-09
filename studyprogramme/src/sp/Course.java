/**
 */
package sp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sp.Course#getName <em>Name</em>}</li>
 *   <li>{@link sp.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link sp.Course#getCode <em>Code</em>}</li>
 *   <li>{@link sp.Course#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @see sp.SpPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sp.SpPackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sp.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see sp.SpPackage#getCourse_Code()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getCode();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see sp.SpPackage#getCourse_Title()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getTitle();

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * The literals are from the enumeration {@link sp.CreditKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see sp.CreditKind
	 * @see #setCredits(CreditKind)
	 * @see sp.SpPackage#getCourse_Credits()
	 * @model
	 * @generated
	 */
	CreditKind getCredits();

	/**
	 * Sets the value of the '{@link sp.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see sp.CreditKind
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(CreditKind value);

} // Course
