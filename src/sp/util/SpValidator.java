/**
 */
package sp.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

import sp.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see sp.SpPackage
 * @generated
 */
public class SpValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SpValidator INSTANCE = new SpValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "sp";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return SpPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case SpPackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case SpPackage.STUDY_COHORT:
				return validateStudyCohort((StudyCohort)value, diagnostics, context);
			case SpPackage.COURSE_OF_STUDY:
				return validateCourseOfStudy((CourseOfStudy)value, diagnostics, context);
			case SpPackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case SpPackage.STUDY_PLAN:
				return validateStudyPlan((StudyPlan)value, diagnostics, context);
			case SpPackage.CREDIT_KIND:
				return validateCreditKind((CreditKind)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyCohort(StudyCohort studyCohort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(studyCohort, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(studyCohort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(studyCohort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(studyCohort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(studyCohort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(studyCohort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(studyCohort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(studyCohort, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(studyCohort, diagnostics, context);
		if (result || diagnostics != null) result &= validateStudyCohort_minimumSemesterCount(studyCohort, diagnostics, context);
		if (result || diagnostics != null) result &= validateStudyCohort_maximumSemesterCount(studyCohort, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the minimumSemesterCount constraint of '<em>Study Cohort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STUDY_COHORT__MINIMUM_SEMESTER_COUNT__EEXPRESSION = "self.semesters->size() >= 4";

	/**
	 * Validates the minimumSemesterCount constraint of '<em>Study Cohort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyCohort_minimumSemesterCount(StudyCohort studyCohort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SpPackage.Literals.STUDY_COHORT,
				 studyCohort,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "minimumSemesterCount",
				 STUDY_COHORT__MINIMUM_SEMESTER_COUNT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the maximumSemesterCount constraint of '<em>Study Cohort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STUDY_COHORT__MAXIMUM_SEMESTER_COUNT__EEXPRESSION = "self.semesters->size() <= 10";

	/**
	 * Validates the maximumSemesterCount constraint of '<em>Study Cohort</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyCohort_maximumSemesterCount(StudyCohort studyCohort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(SpPackage.Literals.STUDY_COHORT,
				 studyCohort,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL",
				 "maximumSemesterCount",
				 STUDY_COHORT__MAXIMUM_SEMESTER_COUNT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseOfStudy(CourseOfStudy courseOfStudy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseOfStudy, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semester, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_minimumCourseCredits(semester, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemester_maximumCompulsoryCourseCredits(semester, diagnostics, context);
		return result;
	}

	/**
	 * Validates the minimumCourseCredits constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSemester_minimumCourseCredits(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		
		EList<Course> courses = semester.getElectiveCourses(); //Helper while getting all courses
		EList<Course> compulsoryCourses = semester.getCompulsoryCourses();
		
		
		compulsoryCourses.forEach(course -> courses.add(course));
		
		int sum = 0;
		
		for (Course course : courses) {
			sum += course.getCredits().getValue();
		}
		
		if (sum < 30) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "minimumCourseCredits", getObjectLabel(semester, context) },
						 new Object[] { semester },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the maximumCompulsoryCourseCredits constraint of '<em>Semester</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSemester_maximumCompulsoryCourseCredits(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		
		EList<Course> compulsoryCourses = semester.getCompulsoryCourses();
		
		int sum = 0;
		
		for (Course course : compulsoryCourses) {
			sum += course.getCredits().getValue();
		}
		
		if (sum > 30) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "maximumCompulsoryCourseCredits", getObjectLabel(semester, context) },
						 new Object[] { semester },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudyPlan(StudyPlan studyPlan, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(studyPlan, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCreditKind(CreditKind creditKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SpValidator
