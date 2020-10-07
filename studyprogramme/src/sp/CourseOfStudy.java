/**
 */
package sp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Of Study</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sp.CourseOfStudy#getName <em>Name</em>}</li>
 *   <li>{@link sp.CourseOfStudy#getStudyCohorts <em>Study Cohorts</em>}</li>
 *   <li>{@link sp.CourseOfStudy#getSpecializations <em>Specializations</em>}</li>
 * </ul>
 *
 * @see sp.SpPackage#getCourseOfStudy()
 * @model
 * @generated
 */
public interface CourseOfStudy extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see sp.SpPackage#getCourseOfStudy_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link sp.CourseOfStudy#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Study Cohorts</b></em>' containment reference list.
	 * The list contents are of type {@link sp.StudyCohort}.
	 * It is bidirectional and its opposite is '{@link sp.StudyCohort#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Cohorts</em>' containment reference list.
	 * @see sp.SpPackage#getCourseOfStudy_StudyCohorts()
	 * @see sp.StudyCohort#getProgramme
	 * @model opposite="programme" containment="true"
	 * @generated
	 */
	EList<StudyCohort> getStudyCohorts();

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' reference list.
	 * The list contents are of type {@link sp.CourseOfStudy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' reference list.
	 * @see sp.SpPackage#getCourseOfStudy_Specializations()
	 * @model
	 * @generated
	 */
	EList<CourseOfStudy> getSpecializations();

} // CourseOfStudy
