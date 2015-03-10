/*
   (C) Copyright 2013-2016 The RISCOSS Project Consortium
   
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

*/

package eu.riscoss.reasoner;

/**
 * Describes the nature of a given Chunk
 * 
 * @author albertosiena
 *
 */
public enum FieldType {
	INPUT_VALUE,		// The field is an input value
	OUTPUT_VALUE,		// The field is an output value
	WEIGHT,				// The field contains an arc's weight value (FBK implementation)
	DESCRIPTION,		// The field contains the description of the chunk
	QUESTION,			// The field contains the question to be asked to the user for input
	TYPE,				// Goal, Risk or Indicator
	MIN,				// Minimum value in a range, if needed
	MAX					// Maximumvalue in a range, if needed
}
