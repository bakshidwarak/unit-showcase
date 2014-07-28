/*
 * Copyright 2014 JUGChennai.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.unitshowcase;

import javax.measure.Quantity;
import javax.measure.quantity.Length;
import org.unitsofmeasurement.impl.AbstractUnit;
import org.unitsofmeasurement.impl.TransformedUnit;
import org.unitsofmeasurement.impl.util.AbstractSystemOfUnits;
import org.unitsofmeasurement.impl.util.SI;
import org.unitsofmeasurement.impl.util.SIPrefix;

/**
 *
 * @author dwbs
 */
public class IndianSystemOfUnits extends AbstractSystemOfUnits{
    
    /**
     * The singleton instance.
     */
    private static final IndianSystemOfUnits INSTANCE = new IndianSystemOfUnits();

     /**
     * DefaultQuantityFactory constructor (prevents this class from being instantiated).
     */
    private IndianSystemOfUnits() {
    }

     /**
     * The Indian system based  for length quantities (standard name <code>km</code>).
     * One kilo metre was defined as 1000 m.
     */
    public static final TransformedUnit<Length> KILOMETRE
            = new TransformedUnit<Length>(SI.METRE,SIPrefix.KILO.getConverter());

    @Override
    public String getName() {
        return "Indian Units";
    }
    
     /**
     * Adds a new unit and maps it to the specified quantity type.
     *
     * @param  unit the unit being added.
     * @param type the quantity type.
     * @return <code>unit</code>.
     */
    private static <U extends AbstractUnit<?>>  U addUnit(U unit, Class<? extends Quantity<?>> type) {
        INSTANCE.units.add(unit);
        INSTANCE.quantityToUnit.put(type, unit);
        return unit;
    }
    
}
