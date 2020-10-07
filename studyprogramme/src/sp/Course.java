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
 *   <li>{@link sp.Course#getCourse <em>Course</em>}</li>
 *   <li>{@link sp.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link sp.Course#getCode <em>Code</em>}</li>
 *   <li>{@link sp.Course#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see sp.SpPackage#getCourse()
 * @model
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' attribute.
	 * @see #setCourse(String)
	 * @see sp.SpPackage#getCourse_Course()
	 * @model
	 * @generated
	 */
	String getCourse();

	/**
	 * Sets the value of the '{@link sp.Course#getCourse <em>Course</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' attribute.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see sp.SpPackage#getCourse_Name()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getName();

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
