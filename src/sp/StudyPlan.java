/**
 */
package sp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sp.StudyPlan#getProgrammes <em>Programmes</em>}</li>
 *   <li>{@link sp.StudyPlan#getOfferedCourses <em>Offered Courses</em>}</li>
 * </ul>
 *
 * @see sp.SpPackage#getStudyPlan()
 * @model
 * @generated
 */
public interface StudyPlan extends EObject {
	/**
	 * Returns the value of the '<em><b>Programmes</b></em>' containment reference list.
	 * The list contents are of type {@link sp.CourseOfStudy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programmes</em>' containment reference list.
	 * @see sp.SpPackage#getStudyPlan_Programmes()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseOfStudy> getProgrammes();

	/**
	 * Returns the value of the '<em><b>Offered Courses</b></em>' containment reference list.
	 * The list contents are of type {@link sp.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offered Courses</em>' containment reference list.
	 * @see sp.SpPackage#getStudyPlan_OfferedCourses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getOfferedCourses();

} // StudyPlan
