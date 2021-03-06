/*******************************************************************************
 * Copyright (c) 2018 CEA
 * This program and the accompanying materials are made available under the 
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 * 	Benoit Lelandais - initial implementation
 * 	Marie-Pierre Oudot - initial implementation
 * 	Jean-Sylvain Camier - Nabla generation support
 *******************************************************************************/
package fr.cea.nabla.typing

class ComparisonAndEqualityTypeProvider implements BinaryOperatorTypeProvider 
{
	override NablaType typeFor(NablaType leftType, NablaType rightType) 
	{
		if (NablaType::isBasicType(leftType) && NablaType::isBasicType(rightType) && leftType.base == rightType.base) 
			BasicTypeProvider::BOOL
		else
			NablaType::UNDEFINED
	}	
}