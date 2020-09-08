/**
 */
package sp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sp.Programme#getName <em>Name</em>}</li>
 *   <li>{@link sp.Programme#getCourses <em>Courses</em>}</li>
 *   <li>{@link sp.Programme#getStudyCohorts <em>Study Cohorts</em>}</li>
 *   <li>{@link sp.Programme#getSpecializations <em>Specializations</em>}</li>
 * </ul>
 *
 * @see sp.SpPackage#getProgramme()
 * @model
 * @generated
 */
public interface Programme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sp.SpPackage#getProgramme_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sp.Programme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link sp.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see sp.SpPackage#getProgramme_Courses()
	 * @model
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Study Cohorts</b></em>' reference list.
	 * The list contents are of type {@link sp.StudyCohort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Cohorts</em>' reference list.
	 * @see sp.SpPackage#getProgramme_StudyCohorts()
	 * @model
	 * @generated
	 */
	EList<StudyCohort> getStudyCohorts();

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' reference list.
	 * The list contents are of type {@link sp.Programme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' reference list.
	 * @see sp.SpPackage#getProgramme_Specializations()
	 * @model
	 * @generated
	 */
	EList<Programme> getSpecializations();

} // Programme
