/*******************************************************************************
 * Copyright (c) 2006 Oracle Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Oracle Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.bpel.validator.xpath;

import org.eclipse.bpel.validator.model.ARule;

/**
 * @author Michal Chmielewski (michal.chmielewski@oracle.com)
 * @date Mar 23, 2007
 *
 */
public class For extends XPathValidator {

	
	/**
	 * @see org.eclipse.bpel.validator.xpath.XPathValidator#checkDurationExpression()
	 */
	
	@Override
	@ARule(
		sa = 0,
		desc = "Checks duration expression on for, and repeatUntil",
		author = "michal.chmielewski@oracle.com",
		date = "01/30/2007",
		order = 17
	)
	
	public void checkDurationExpression () {
		super.checkDurationExpression();
	}

}
