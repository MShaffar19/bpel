/**
 * <copyright>
 * </copyright>
 *
 * $Id: Extensions.java,v 1.2 2005/12/05 21:04:32 james Exp $
 */
package org.eclipse.bpel.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.wst.wsdl.ExtensibleElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extensions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.bpel.model.Extensions#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.bpel.model.BPELPackage#getExtensions()
 * @model
 * @generated
 */
public interface Extensions extends ExtensibleElement{
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.bpel.model.Extension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.eclipse.bpel.model.BPELPackage#getExtensions_Children()
	 * @model type="org.eclipse.bpel.model.Extension" containment="true"
	 * @generated
	 */
	EList getChildren();

} // Extensions
