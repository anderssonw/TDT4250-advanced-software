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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import sp.CourseOfStudy;
import sp.SpPackage;
import sp.StudyCohort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Of Study</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link sp.impl.CourseOfStudyImpl#getName <em>Name</em>}</li>
 *   <li>{@link sp.impl.CourseOfStudyImpl#getStudyCohorts <em>Study Cohorts</em>}</li>
 *   <li>{@link sp.impl.CourseOfStudyImpl#getSpecializations <em>Specializations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseOfStudyImpl extends MinimalEObjectImpl.Container implements CourseOfStudy {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStudyCohorts() <em>Study Cohorts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyCohorts()
	 * @generated
	 * @ordered
	 */
	protected EList<StudyCohort> studyCohorts;

	/**
	 * The cached value of the '{@link #getSpecializations() <em>Specializations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseOfStudy> specializations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseOfStudyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpPackage.Literals.COURSE_OF_STUDY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpPackage.COURSE_OF_STUDY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<StudyCohort> getStudyCohorts() {
		if (studyCohorts == null) {
			studyCohorts = new EObjectContainmentWithInverseEList<StudyCohort>(StudyCohort.class, this, SpPackage.COURSE_OF_STUDY__STUDY_COHORTS, SpPackage.STUDY_COHORT__PROGRAMME);
		}
		return studyCohorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseOfStudy> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectResolvingEList<CourseOfStudy>(CourseOfStudy.class, this, SpPackage.COURSE_OF_STUDY__SPECIALIZATIONS);
		}
		return specializations;
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
			case SpPackage.COURSE_OF_STUDY__STUDY_COHORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStudyCohorts()).basicAdd(otherEnd, msgs);
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
			case SpPackage.COURSE_OF_STUDY__STUDY_COHORTS:
				return ((InternalEList<?>)getStudyCohorts()).basicRemove(otherEnd, msgs);
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
			case SpPackage.COURSE_OF_STUDY__NAME:
				return getName();
			case SpPackage.COURSE_OF_STUDY__STUDY_COHORTS:
				return getStudyCohorts();
			case SpPackage.COURSE_OF_STUDY__SPECIALIZATIONS:
				return getSpecializations();
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
			case SpPackage.COURSE_OF_STUDY__NAME:
				setName((String)newValue);
				return;
			case SpPackage.COURSE_OF_STUDY__STUDY_COHORTS:
				getStudyCohorts().clear();
				getStudyCohorts().addAll((Collection<? extends StudyCohort>)newValue);
				return;
			case SpPackage.COURSE_OF_STUDY__SPECIALIZATIONS:
				getSpecializations().clear();
				getSpecializations().addAll((Collection<? extends CourseOfStudy>)newValue);
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
			case SpPackage.COURSE_OF_STUDY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SpPackage.COURSE_OF_STUDY__STUDY_COHORTS:
				getStudyCohorts().clear();
				return;
			case SpPackage.COURSE_OF_STUDY__SPECIALIZATIONS:
				getSpecializations().clear();
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
			case SpPackage.COURSE_OF_STUDY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SpPackage.COURSE_OF_STUDY__STUDY_COHORTS:
				return studyCohorts != null && !studyCohorts.isEmpty();
			case SpPackage.COURSE_OF_STUDY__SPECIALIZATIONS:
				return specializations != null && !specializations.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CourseOfStudyImpl
