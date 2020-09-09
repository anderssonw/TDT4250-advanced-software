/**
 */
package sp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see sp.SpFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL'"
 * @generated
 */
public interface SpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/tdt4250.sp/model/sp.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SpPackage eINSTANCE = sp.impl.SpPackageImpl.init();

	/**
	 * The meta object id for the '{@link sp.impl.CourseImpl <em>Course</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sp.impl.CourseImpl
	 * @see sp.impl.SpPackageImpl#getCourse()
	 * @generated
	 */
	int COURSE = 0;

	/**
	 * The feature id for the '<em><b>Course</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__COURSE = 0;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CREDITS = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__CODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Course</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sp.impl.StudyCohortImpl <em>Study Cohort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sp.impl.StudyCohortImpl
	 * @see sp.impl.SpPackageImpl#getStudyCohort()
	 * @generated
	 */
	int STUDY_COHORT = 1;

	/**
	 * The feature id for the '<em><b>Start Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_COHORT__START_YEAR = 0;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_COHORT__SEMESTERS = 1;

	/**
	 * The feature id for the '<em><b>Programme</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_COHORT__PROGRAMME = 2;

	/**
	 * The number of structural features of the '<em>Study Cohort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_COHORT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Study Cohort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_COHORT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sp.impl.CourseOfStudyImpl <em>Course Of Study</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sp.impl.CourseOfStudyImpl
	 * @see sp.impl.SpPackageImpl#getCourseOfStudy()
	 * @generated
	 */
	int COURSE_OF_STUDY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OF_STUDY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Study Cohorts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OF_STUDY__STUDY_COHORTS = 1;

	/**
	 * The feature id for the '<em><b>Specializations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OF_STUDY__SPECIALIZATIONS = 2;

	/**
	 * The number of structural features of the '<em>Course Of Study</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OF_STUDY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Course Of Study</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_OF_STUDY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sp.impl.SemesterImpl <em>Semester</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sp.impl.SemesterImpl
	 * @see sp.impl.SpPackageImpl#getSemester()
	 * @generated
	 */
	int SEMESTER = 3;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__CODE = 0;

	/**
	 * The feature id for the '<em><b>Elective Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__ELECTIVE_COURSES = 1;

	/**
	 * The feature id for the '<em><b>Compulsory Courses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__COMPULSORY_COURSES = 2;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__YEAR = 3;

	/**
	 * The feature id for the '<em><b>Season</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__SEASON = 4;

	/**
	 * The feature id for the '<em><b>Study Cohort</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER__STUDY_COHORT = 5;

	/**
	 * The number of structural features of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Semester</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sp.impl.StudyPlanImpl <em>Study Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sp.impl.StudyPlanImpl
	 * @see sp.impl.SpPackageImpl#getStudyPlan()
	 * @generated
	 */
	int STUDY_PLAN = 4;

	/**
	 * The feature id for the '<em><b>Programmes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__PROGRAMMES = 0;

	/**
	 * The feature id for the '<em><b>Offered Courses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN__OFFERED_COURSES = 1;

	/**
	 * The number of structural features of the '<em>Study Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Study Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDY_PLAN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link sp.CreditKind <em>Credit Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see sp.CreditKind
	 * @see sp.impl.SpPackageImpl#getCreditKind()
	 * @generated
	 */
	int CREDIT_KIND = 5;


	/**
	 * Returns the meta object for class '{@link sp.Course <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course</em>'.
	 * @see sp.Course
	 * @generated
	 */
	EClass getCourse();

	/**
	 * Returns the meta object for the attribute '{@link sp.Course#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Course</em>'.
	 * @see sp.Course#getCourse()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Course();

	/**
	 * Returns the meta object for the attribute '{@link sp.Course#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sp.Course#getName()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Name();

	/**
	 * Returns the meta object for the attribute '{@link sp.Course#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see sp.Course#getCode()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Code();

	/**
	 * Returns the meta object for the attribute '{@link sp.Course#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see sp.Course#getCredits()
	 * @see #getCourse()
	 * @generated
	 */
	EAttribute getCourse_Credits();

	/**
	 * Returns the meta object for class '{@link sp.StudyCohort <em>Study Cohort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Cohort</em>'.
	 * @see sp.StudyCohort
	 * @generated
	 */
	EClass getStudyCohort();

	/**
	 * Returns the meta object for the attribute '{@link sp.StudyCohort#getStartYear <em>Start Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Year</em>'.
	 * @see sp.StudyCohort#getStartYear()
	 * @see #getStudyCohort()
	 * @generated
	 */
	EAttribute getStudyCohort_StartYear();

	/**
	 * Returns the meta object for the containment reference list '{@link sp.StudyCohort#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Semesters</em>'.
	 * @see sp.StudyCohort#getSemesters()
	 * @see #getStudyCohort()
	 * @generated
	 */
	EReference getStudyCohort_Semesters();

	/**
	 * Returns the meta object for the container reference '{@link sp.StudyCohort#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Programme</em>'.
	 * @see sp.StudyCohort#getProgramme()
	 * @see #getStudyCohort()
	 * @generated
	 */
	EReference getStudyCohort_Programme();

	/**
	 * Returns the meta object for class '{@link sp.CourseOfStudy <em>Course Of Study</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Of Study</em>'.
	 * @see sp.CourseOfStudy
	 * @generated
	 */
	EClass getCourseOfStudy();

	/**
	 * Returns the meta object for the attribute '{@link sp.CourseOfStudy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see sp.CourseOfStudy#getName()
	 * @see #getCourseOfStudy()
	 * @generated
	 */
	EAttribute getCourseOfStudy_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link sp.CourseOfStudy#getStudyCohorts <em>Study Cohorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Study Cohorts</em>'.
	 * @see sp.CourseOfStudy#getStudyCohorts()
	 * @see #getCourseOfStudy()
	 * @generated
	 */
	EReference getCourseOfStudy_StudyCohorts();

	/**
	 * Returns the meta object for the reference list '{@link sp.CourseOfStudy#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specializations</em>'.
	 * @see sp.CourseOfStudy#getSpecializations()
	 * @see #getCourseOfStudy()
	 * @generated
	 */
	EReference getCourseOfStudy_Specializations();

	/**
	 * Returns the meta object for class '{@link sp.Semester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semester</em>'.
	 * @see sp.Semester
	 * @generated
	 */
	EClass getSemester();

	/**
	 * Returns the meta object for the attribute '{@link sp.Semester#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see sp.Semester#getCode()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Code();

	/**
	 * Returns the meta object for the reference list '{@link sp.Semester#getElectiveCourses <em>Elective Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elective Courses</em>'.
	 * @see sp.Semester#getElectiveCourses()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_ElectiveCourses();

	/**
	 * Returns the meta object for the reference list '{@link sp.Semester#getCompulsoryCourses <em>Compulsory Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Compulsory Courses</em>'.
	 * @see sp.Semester#getCompulsoryCourses()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_CompulsoryCourses();

	/**
	 * Returns the meta object for the attribute '{@link sp.Semester#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see sp.Semester#getYear()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Year();

	/**
	 * Returns the meta object for the attribute '{@link sp.Semester#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Season</em>'.
	 * @see sp.Semester#getSeason()
	 * @see #getSemester()
	 * @generated
	 */
	EAttribute getSemester_Season();

	/**
	 * Returns the meta object for the container reference '{@link sp.Semester#getStudyCohort <em>Study Cohort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Study Cohort</em>'.
	 * @see sp.Semester#getStudyCohort()
	 * @see #getSemester()
	 * @generated
	 */
	EReference getSemester_StudyCohort();

	/**
	 * Returns the meta object for class '{@link sp.StudyPlan <em>Study Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Study Plan</em>'.
	 * @see sp.StudyPlan
	 * @generated
	 */
	EClass getStudyPlan();

	/**
	 * Returns the meta object for the containment reference list '{@link sp.StudyPlan#getProgrammes <em>Programmes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programmes</em>'.
	 * @see sp.StudyPlan#getProgrammes()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EReference getStudyPlan_Programmes();

	/**
	 * Returns the meta object for the containment reference list '{@link sp.StudyPlan#getOfferedCourses <em>Offered Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Offered Courses</em>'.
	 * @see sp.StudyPlan#getOfferedCourses()
	 * @see #getStudyPlan()
	 * @generated
	 */
	EReference getStudyPlan_OfferedCourses();

	/**
	 * Returns the meta object for enum '{@link sp.CreditKind <em>Credit Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Credit Kind</em>'.
	 * @see sp.CreditKind
	 * @generated
	 */
	EEnum getCreditKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SpFactory getSpFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link sp.impl.CourseImpl <em>Course</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sp.impl.CourseImpl
		 * @see sp.impl.SpPackageImpl#getCourse()
		 * @generated
		 */
		EClass COURSE = eINSTANCE.getCourse();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__COURSE = eINSTANCE.getCourse_Course();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__NAME = eINSTANCE.getCourse_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CODE = eINSTANCE.getCourse_Code();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE__CREDITS = eINSTANCE.getCourse_Credits();

		/**
		 * The meta object literal for the '{@link sp.impl.StudyCohortImpl <em>Study Cohort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sp.impl.StudyCohortImpl
		 * @see sp.impl.SpPackageImpl#getStudyCohort()
		 * @generated
		 */
		EClass STUDY_COHORT = eINSTANCE.getStudyCohort();

		/**
		 * The meta object literal for the '<em><b>Start Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDY_COHORT__START_YEAR = eINSTANCE.getStudyCohort_StartYear();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_COHORT__SEMESTERS = eINSTANCE.getStudyCohort_Semesters();

		/**
		 * The meta object literal for the '<em><b>Programme</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_COHORT__PROGRAMME = eINSTANCE.getStudyCohort_Programme();

		/**
		 * The meta object literal for the '{@link sp.impl.CourseOfStudyImpl <em>Course Of Study</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sp.impl.CourseOfStudyImpl
		 * @see sp.impl.SpPackageImpl#getCourseOfStudy()
		 * @generated
		 */
		EClass COURSE_OF_STUDY = eINSTANCE.getCourseOfStudy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSE_OF_STUDY__NAME = eINSTANCE.getCourseOfStudy_Name();

		/**
		 * The meta object literal for the '<em><b>Study Cohorts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_OF_STUDY__STUDY_COHORTS = eINSTANCE.getCourseOfStudy_StudyCohorts();

		/**
		 * The meta object literal for the '<em><b>Specializations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_OF_STUDY__SPECIALIZATIONS = eINSTANCE.getCourseOfStudy_Specializations();

		/**
		 * The meta object literal for the '{@link sp.impl.SemesterImpl <em>Semester</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sp.impl.SemesterImpl
		 * @see sp.impl.SpPackageImpl#getSemester()
		 * @generated
		 */
		EClass SEMESTER = eINSTANCE.getSemester();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__CODE = eINSTANCE.getSemester_Code();

		/**
		 * The meta object literal for the '<em><b>Elective Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__ELECTIVE_COURSES = eINSTANCE.getSemester_ElectiveCourses();

		/**
		 * The meta object literal for the '<em><b>Compulsory Courses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__COMPULSORY_COURSES = eINSTANCE.getSemester_CompulsoryCourses();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__YEAR = eINSTANCE.getSemester_Year();

		/**
		 * The meta object literal for the '<em><b>Season</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTER__SEASON = eINSTANCE.getSemester_Season();

		/**
		 * The meta object literal for the '<em><b>Study Cohort</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMESTER__STUDY_COHORT = eINSTANCE.getSemester_StudyCohort();

		/**
		 * The meta object literal for the '{@link sp.impl.StudyPlanImpl <em>Study Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sp.impl.StudyPlanImpl
		 * @see sp.impl.SpPackageImpl#getStudyPlan()
		 * @generated
		 */
		EClass STUDY_PLAN = eINSTANCE.getStudyPlan();

		/**
		 * The meta object literal for the '<em><b>Programmes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN__PROGRAMMES = eINSTANCE.getStudyPlan_Programmes();

		/**
		 * The meta object literal for the '<em><b>Offered Courses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STUDY_PLAN__OFFERED_COURSES = eINSTANCE.getStudyPlan_OfferedCourses();

		/**
		 * The meta object literal for the '{@link sp.CreditKind <em>Credit Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see sp.CreditKind
		 * @see sp.impl.SpPackageImpl#getCreditKind()
		 * @generated
		 */
		EEnum CREDIT_KIND = eINSTANCE.getCreditKind();

	}

} //SpPackage
