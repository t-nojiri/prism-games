//==============================================================================
//	
//	Copyright (c) 2002-
//	Authors:
//	* Dave Parker <d.a.parker@cs.bham.ac.uk> (University of Birmingham/Oxford)
//	* Nishan Kamaleson <nxk249@bham.ac.uk> (University of Birmingham)
//	
//------------------------------------------------------------------------------
//	
//	This file is part of PRISM.
//	
//	PRISM is free software; you can redistribute it and/or modify
//	it under the terms of the GNU General Public License as published by
//	the Free Software Foundation; either version 2 of the License, or
//	(at your option) any later version.
//	
//	PRISM is distributed in the hope that it will be useful,
//	but WITHOUT ANY WARRANTY; without even the implied warranty of
//	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//	GNU General Public License for more details.
//	
//	You should have received a copy of the GNU General Public License
//	along with PRISM; if not, write to the Free Software Foundation,
//	Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//	
//==============================================================================

package prism;

import java.util.List;

import parser.type.Type;

/**
 * Interface for classes that provide some basic (syntactic) information about a probabilistic model.
 */
public interface ModelInfo
{
	/**
	 * Get the type of probabilistic model.
	 */
	public ModelType getModelType();

	/**
	 * Does the model contain unbounded variables?
	 */
	public boolean containsUnboundedVariables();

	/**
	 * Get the number of variables in the model. 
	 */
	public int getNumVars();
	
	/**
	 * Get the names of all the variables in the model.
	 */
	public List<String> getVarNames();
	
	/**
	 * Get the types of all the variables in the model.
	 */
	public List<Type> getVarTypes();

	/**
	 * Get the name of the {@code i}th variable in the model.
	 */
	//public String getVarName(int i) throws PrismException;

	/**
	 * Get the type of the {@code i}th variable in the model.
	 */
	//public Type getVarType(int i) throws PrismException;

	/**
	 * Get the number of labels (atomic propositions) defined for the model. 
	 */
	public int getNumLabels();
	
	/**
	 * Get the name of the {@code i}th label of the model.
	 */
	public String getLabelName(int i) throws PrismException;
	
	/**
	 * Get the index of the label with name {@code label}. Returns -1 if none exists.
	 */
	public int getLabelIndex(String label);
}