/**
 */
package sp.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sp.Course;
import sp.CourseOfStudy;
import sp.SpPackage;
import sp.StudyPlan;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Study Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sp.impl.StudyPlanImpl#getProgrammes <em>Programmes</em>}</li>
 *   <li>{@link sp.impl.StudyPlanImpl#getOfferedCourses <em>Offered Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudyPlanImpl extends MinimalEObjectImpl.Container implements StudyPlan {
	/**
	 * The cached value of the '{@link #getProgrammes() <em>Programmes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammes()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseOfStudy> programmes;

	/**
	 * The cached value of the '{@link #getOfferedCourses() <em>Offered Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferedCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> offeredCourses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudyPlanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpPackage.Literals.STUDY_PLAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseOfStudy> getProgrammes() {
		if (programmes == null) {
			programmes = new EObjectContainmentEList<CourseOfStudy>(CourseOfStudy.class, this, SpPackage.STUDY_PLAN__PROGRAMMES);
		}
		return programmes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Course> getOfferedCourses() {
		if (offeredCourses == null) {
			offeredCourses = new EObjectContainmentEList<Course>(Course.class, this, SpPackage.STUDY_PLAN__OFFERED_COURSES);
		}
		return offeredCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SpPackage.STUDY_PLAN__PROGRAMMES:
				return ((InternalEList<?>)getProgrammes()).basicRemove(otherEnd, msgs);
			case SpPackage.STUDY_PLAN__OFFERED_COURSES:
				return ((InternalEList<?>)getOfferedCourses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpPackage.STUDY_PLAN__PROGRAMMES:
				return getProgrammes();
			case SpPackage.STUDY_PLAN__OFFERED_COURSES:
				return getOfferedCourses();
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
			case SpPackage.STUDY_PLAN__PROGRAMMES:
				getProgrammes().clear();
				getProgrammes().addAll((Collection<? extends CourseOfStudy>)newValue);
				return;
			case SpPackage.STUDY_PLAN__OFFERED_COURSES:
				getOfferedCourses().clear();
				getOfferedCourses().addAll((Collection<? extends Course>)newValue);
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
			case SpPackage.STUDY_PLAN__PROGRAMMES:
				getProgrammes().clear();
				return;
			case SpPackage.STUDY_PLAN__OFFERED_COURSES:
				getOfferedCourses().clear();
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
			case SpPackage.STUDY_PLAN__PROGRAMMES:
				return programmes != null && !programmes.isEmpty();
			case SpPackage.STUDY_PLAN__OFFERED_COURSES:
				return offeredCourses != null && !offeredCourses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StudyPlanImpl
