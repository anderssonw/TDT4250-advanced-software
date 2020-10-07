/**
 */
package sp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.emf.ecore.util.EcoreUtil;
import sp.Course;
import sp.Semester;
import sp.SpPackage;
import sp.StudyCohort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sp.impl.SemesterImpl#getCode <em>Code</em>}</li>
 *   <li>{@link sp.impl.SemesterImpl#getElectiveCourses <em>Elective Courses</em>}</li>
 *   <li>{@link sp.impl.SemesterImpl#getCompulsoryCourses <em>Compulsory Courses</em>}</li>
 *   <li>{@link sp.impl.SemesterImpl#getYear <em>Year</em>}</li>
 *   <li>{@link sp.impl.SemesterImpl#getSeason <em>Season</em>}</li>
 *   <li>{@link sp.impl.SemesterImpl#getStudyCohort <em>Study Cohort</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElectiveCourses() <em>Elective Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectiveCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> electiveCourses;

	/**
	 * The cached value of the '{@link #getCompulsoryCourses() <em>Compulsory Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompulsoryCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> compulsoryCourses;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getSeason() <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeason()
	 * @generated
	 * @ordered
	 */
	protected static final String SEASON_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpPackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.SEMESTER__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getElectiveCourses() {
		if (electiveCourses == null) {
			electiveCourses = new EObjectResolvingEList<Course>(Course.class, this, SpPackage.SEMESTER__ELECTIVE_COURSES);
		}
		return electiveCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getCompulsoryCourses() {
		if (compulsoryCourses == null) {
			compulsoryCourses = new EObjectResolvingEList<Course>(Course.class, this, SpPackage.SEMESTER__COMPULSORY_COURSES);
		}
		return compulsoryCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getYear() {
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		
		String course = this.getCode();
		
		String code = course.substring(1);
		
		if (code.matches("^[0-9]{4}$")) {
			return Integer.parseInt(code);
		} else {
			throw new IllegalArgumentException();
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getSeason() {
		// Ensure that you remove @generated or mark it @generated NOT
		//throw new UnsupportedOperationException();
		
		String course = this.getCode();
		
		String season = course.substring(0, 1);
		if (season.equals("H")) {
			return "Host";
		} else if (season.equals("V")) {
			return "Vår";
		} else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StudyCohort getStudyCohort() {
		if (eContainerFeatureID() != SpPackage.SEMESTER__STUDY_COHORT) return null;
		return (StudyCohort)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStudyCohort(StudyCohort newStudyCohort, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStudyCohort, SpPackage.SEMESTER__STUDY_COHORT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStudyCohort(StudyCohort newStudyCohort) {
		if (newStudyCohort != eInternalContainer() || (eContainerFeatureID() != SpPackage.SEMESTER__STUDY_COHORT && newStudyCohort != null)) {
			if (EcoreUtil.isAncestor(this, newStudyCohort))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStudyCohort != null)
				msgs = ((InternalEObject)newStudyCohort).eInverseAdd(this, SpPackage.STUDY_COHORT__SEMESTERS, StudyCohort.class, msgs);
			msgs = basicSetStudyCohort(newStudyCohort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.SEMESTER__STUDY_COHORT, newStudyCohort, newStudyCohort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpPackage.SEMESTER__STUDY_COHORT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStudyCohort((StudyCohort)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpPackage.SEMESTER__STUDY_COHORT:
				return basicSetStudyCohort(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SpPackage.SEMESTER__STUDY_COHORT:
				return eInternalContainer().eInverseRemove(this, SpPackage.STUDY_COHORT__SEMESTERS, StudyCohort.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpPackage.SEMESTER__CODE:
				return getCode();
			case SpPackage.SEMESTER__ELECTIVE_COURSES:
				return getElectiveCourses();
			case SpPackage.SEMESTER__COMPULSORY_COURSES:
				return getCompulsoryCourses();
			case SpPackage.SEMESTER__YEAR:
				return getYear();
			case SpPackage.SEMESTER__SEASON:
				return getSeason();
			case SpPackage.SEMESTER__STUDY_COHORT:
				return getStudyCohort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SpPackage.SEMESTER__CODE:
				setCode((String)newValue);
				return;
			case SpPackage.SEMESTER__ELECTIVE_COURSES:
				getElectiveCourses().clear();
				getElectiveCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case SpPackage.SEMESTER__COMPULSORY_COURSES:
				getCompulsoryCourses().clear();
				getCompulsoryCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case SpPackage.SEMESTER__STUDY_COHORT:
				setStudyCohort((StudyCohort)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SpPackage.SEMESTER__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case SpPackage.SEMESTER__ELECTIVE_COURSES:
				getElectiveCourses().clear();
				return;
			case SpPackage.SEMESTER__COMPULSORY_COURSES:
				getCompulsoryCourses().clear();
				return;
			case SpPackage.SEMESTER__STUDY_COHORT:
				setStudyCohort((StudyCohort)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SpPackage.SEMESTER__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case SpPackage.SEMESTER__ELECTIVE_COURSES:
				return electiveCourses != null && !electiveCourses.isEmpty();
			case SpPackage.SEMESTER__COMPULSORY_COURSES:
				return compulsoryCourses != null && !compulsoryCourses.isEmpty();
			case SpPackage.SEMESTER__YEAR:
				return getYear() != YEAR_EDEFAULT;
			case SpPackage.SEMESTER__SEASON:
				return SEASON_EDEFAULT == null ? getSeason() != null : !SEASON_EDEFAULT.equals(getSeason());
			case SpPackage.SEMESTER__STUDY_COHORT:
				return getStudyCohort() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
