/**
 */
package sp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Cohort</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sp.StudyCohort#getStartYear <em>Start Year</em>}</li>
 * </ul>
 *
 * @see sp.SpPackage#getStudyCohort()
 * @model
 * @generated
 */
public interface StudyCohort extends EObject {
	/**
	 * Returns the value of the '<em><b>Start Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Year</em>' attribute.
	 * @see #setStartYear(int)
	 * @see sp.SpPackage#getStudyCohort_StartYear()
	 * @model
	 * @generated
	 */
	int getStartYear();

	/**
	 * Sets the value of the '{@link sp.StudyCohort#getStartYear <em>Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Year</em>' attribute.
	 * @see #getStartYear()
	 * @generated
	 */
	void setStartYear(int value);

} // StudyCohort
