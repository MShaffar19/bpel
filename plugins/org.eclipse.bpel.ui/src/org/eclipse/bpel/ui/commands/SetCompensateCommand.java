/*******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.bpel.ui.commands;

import org.eclipse.bpel.model.Activity;
import org.eclipse.bpel.model.Compensate;
import org.eclipse.bpel.model.CompensateScope;
import org.eclipse.bpel.ui.IBPELUIConstants;
import org.eclipse.bpel.ui.util.ModelHelper;
import org.eclipse.emf.ecore.EObject;


/** 
 * Sets a compensate activity link property of a model object.
 * Supported for compensate activity
 */
public class SetCompensateCommand extends SetCommand {

	CompensateScope fTarget;
	
	/**
	 * @see org.eclipse.bpel.ui.commands.SetCommand#getDefaultLabel()
	 */
	@Override
	public String getDefaultLabel() { 
		return IBPELUIConstants.CMD_SELECT_COMPENSATE; 
	}

	
	/**
	 * @param activity
	 * @param targetActivity
	 */
	public SetCompensateCommand (CompensateScope activity, Activity targetActivity)  {
		super(activity, targetActivity);				
	}

	/**
	 * @see org.eclipse.bpel.ui.commands.SetCommand#get()
	 */
	@Override
	public Object get() {
		CompensateScope cs = (CompensateScope) fTarget;
		return cs.getTarget();
	}
	
	/**
	 * @see org.eclipse.bpel.ui.commands.SetCommand#set(java.lang.Object)
	 */
	@Override
	public void set(Object o) {		
		CompensateScope cs = (CompensateScope) fTarget;
		if (o instanceof Activity ) {
			cs.setTarget( (Activity) o);
		}
	}
	
	public Object getTarget(){
		return fTarget;
	}
}
