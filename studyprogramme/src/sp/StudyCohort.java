/**
 */
package sp;

import org.eclipse.emf.common.util.EList;
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
 *   <li>{@link sp.StudyCohort#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link sp.StudyCohort#getProgramme <em>Programme</em>}</li>
 * </ul>
 *
 * @see sp.SpPackage#getStudyCohort()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='minimumSemesterCount maximumSemesterCount'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL maximumSemesterCount='self.semesters-&gt;size() &lt;= 10' minimumSemesterCount='self.semesters-&gt;size() &gt;= 4'"
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

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link sp.Semester}.
	 * It is bidirectional and its opposite is '{@link sp.Semester#getStudyCohort <em>Study Cohort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see sp.SpPackage#getStudyCohort_Semesters()
	 * @see sp.Semester#getStudyCohort
	 * @model opposite="studyCohort" containment="true"
	 * @generated
	 */
	EList<Semester> getSemesters();

	/**
	 * Returns the value of the '<em><b>Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link sp.CourseOfStudy#getStudyCohorts <em>Study Cohorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' container reference.
	 * @see #setProgramme(CourseOfStudy)
	 * @see sp.SpPackage#getStudyCohort_Programme()
	 * @see sp.CourseOfStudy#getStudyCohorts
	 * @model opposite="studyCohorts" transient="false"
	 * @generated
	 */
	CourseOfStudy getProgramme();

	/**
	 * Sets the value of the '{@link sp.StudyCohort#getProgramme <em>Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' container reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(CourseOfStudy value);

} // StudyCohort
