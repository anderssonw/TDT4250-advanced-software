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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import sp.CourseOfStudy;
import sp.Semester;
import sp.SpPackage;
import sp.StudyCohort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Cohort</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sp.impl.StudyCohortImpl#getStartYear <em>Start Year</em>}</li>
 *   <li>{@link sp.impl.StudyCohortImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link sp.impl.StudyCohortImpl#getProgramme <em>Programme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyCohortImpl extends MinimalEObjectImpl.Container implements StudyCohort {
	/**
	 * The default value of the '{@link #getStartYear() <em>Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartYear()
	 * @generated
	 * @ordered
	 */
	protected static final int START_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartYear() <em>Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartYear()
	 * @generated
	 * @ordered
	 */
	protected int startYear = START_YEAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semester> semesters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyCohortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpPackage.Literals.STUDY_COHORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStartYear() {
		return startYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartYear(int newStartYear) {
		int oldStartYear = startYear;
		startYear = newStartYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.STUDY_COHORT__START_YEAR, oldStartYear, startYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentWithInverseEList<Semester>(Semester.class, this, SpPackage.STUDY_COHORT__SEMESTERS, SpPackage.SEMESTER__STUDY_COHORT);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseOfStudy getProgramme() {
		if (eContainerFeatureID() != SpPackage.STUDY_COHORT__PROGRAMME) return null;
		return (CourseOfStudy)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramme(CourseOfStudy newProgramme, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgramme, SpPackage.STUDY_COHORT__PROGRAMME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramme(CourseOfStudy newProgramme) {
		if (newProgramme != eInternalContainer() || (eContainerFeatureID() != SpPackage.STUDY_COHORT__PROGRAMME && newProgramme != null)) {
			if (EcoreUtil.isAncestor(this, newProgramme))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgramme != null)
				msgs = ((InternalEObject)newProgramme).eInverseAdd(this, SpPackage.COURSE_OF_STUDY__STUDY_COHORTS, CourseOfStudy.class, msgs);
			msgs = basicSetProgramme(newProgramme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.STUDY_COHORT__PROGRAMME, newProgramme, newProgramme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpPackage.STUDY_COHORT__SEMESTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemesters()).basicAdd(otherEnd, msgs);
			case SpPackage.STUDY_COHORT__PROGRAMME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgramme((CourseOfStudy)otherEnd, msgs);
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
			case SpPackage.STUDY_COHORT__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
			case SpPackage.STUDY_COHORT__PROGRAMME:
				return basicSetProgramme(null, msgs);
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
			case SpPackage.STUDY_COHORT__PROGRAMME:
				return eInternalContainer().eInverseRemove(this, SpPackage.COURSE_OF_STUDY__STUDY_COHORTS, CourseOfStudy.class, msgs);
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
			case SpPackage.STUDY_COHORT__START_YEAR:
				return getStartYear();
			case SpPackage.STUDY_COHORT__SEMESTERS:
				return getSemesters();
			case SpPackage.STUDY_COHORT__PROGRAMME:
				return getProgramme();
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
			case SpPackage.STUDY_COHORT__START_YEAR:
				setStartYear((Integer)newValue);
				return;
			case SpPackage.STUDY_COHORT__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semester>)newValue);
				return;
			case SpPackage.STUDY_COHORT__PROGRAMME:
				setProgramme((CourseOfStudy)newValue);
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
			case SpPackage.STUDY_COHORT__START_YEAR:
				setStartYear(START_YEAR_EDEFAULT);
				return;
			case SpPackage.STUDY_COHORT__SEMESTERS:
				getSemesters().clear();
				return;
			case SpPackage.STUDY_COHORT__PROGRAMME:
				setProgramme((CourseOfStudy)null);
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
			case SpPackage.STUDY_COHORT__START_YEAR:
				return startYear != START_YEAR_EDEFAULT;
			case SpPackage.STUDY_COHORT__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
			case SpPackage.STUDY_COHORT__PROGRAMME:
				return getProgramme() != null;
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
		result.append(" (startYear: ");
		result.append(startYear);
		result.append(')');
		return result.toString();
	}

} //StudyCohortImpl
