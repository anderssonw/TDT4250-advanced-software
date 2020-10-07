/**
 */
package sp;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sp.Semester#getCode <em>Code</em>}</li>
 *   <li>{@link sp.Semester#getElectiveCourses <em>Elective Courses</em>}</li>
 *   <li>{@link sp.Semester#getCompulsoryCourses <em>Compulsory Courses</em>}</li>
 *   <li>{@link sp.Semester#getYear <em>Year</em>}</li>
 *   <li>{@link sp.Semester#getSeason <em>Season</em>}</li>
 *   <li>{@link sp.Semester#getStudyCohort <em>Study Cohort</em>}</li>
 * </ul>
 *
 * @see sp.SpPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='minimumCourseCredits maximumCompulsoryCourseCredits'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see sp.SpPackage#getSemester_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link sp.Semester#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Elective Courses</b></em>' reference list.
	 * The list contents are of type {@link sp.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elective Courses</em>' reference list.
	 * @see sp.SpPackage#getSemester_ElectiveCourses()
	 * @model
	 * @generated
	 */
	EList<Course> getElectiveCourses();

	/**
	 * Returns the value of the '<em><b>Compulsory Courses</b></em>' reference list.
	 * The list contents are of type {@link sp.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compulsory Courses</em>' reference list.
	 * @see sp.SpPackage#getSemester_CompulsoryCourses()
	 * @model
	 * @generated
	 */
	EList<Course> getCompulsoryCourses();

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see sp.SpPackage#getSemester_Year()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getYear();

	/**
	 * Returns the value of the '<em><b>Season</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' attribute.
	 * @see sp.SpPackage#getSemester_Season()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getSeason();

	/**
	 * Returns the value of the '<em><b>Study Cohort</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sp.StudyCohort#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Study Cohort</em>' container reference.
	 * @see #setStudyCohort(StudyCohort)
	 * @see sp.SpPackage#getSemester_StudyCohort()
	 * @see sp.StudyCohort#getSemesters
	 * @model opposite="semesters" transient="false"
	 * @generated
	 */
	StudyCohort getStudyCohort();

	/**
	 * Sets the value of the '{@link sp.Semester#getStudyCohort <em>Study Cohort</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Study Cohort</em>' container reference.
	 * @see #getStudyCohort()
	 * @generated
	 */
	void setStudyCohort(StudyCohort value);

} // Semester
