/**
 *  Unit-API - Units of Measurement API for Java
 *  Copyright 2013-2014, Jean-Marie Dautelle, Werner Keil, V2COM and individual
 *  contributors by the @author tag.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.unitsofmeasurement.impl.enums.unit;

import static org.junit.Assert.*;
import static org.unitsofmeasurement.impl.enums.unit.TimeUnit.*;
import javax.measure.quantity.Time;
import org.junit.Test;
import org.unitsofmeasurement.impl.enums.quantity.TimeQuantity;


/**
 * @author Werner Keil
 *
 */
public class TimeQuantityTest {

	@Test
	public void testInstanciate() {
		Time t =  new TimeQuantity(23d, HOUR); // 23.0 h
		assertEquals(Double.valueOf(23.0d), t.getValue());
		assertEquals(HOUR, t.getUnit());
		//assertEquals("km", l.getUnit().getSymbol());
	}
	
	@Test
	public void testToString() {
		Time t =  new TimeQuantity(23.0d, MINUTE); // 23.0 min
		assertEquals("23.0m", t.toString());
	}
}
