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

/**
 *
 * @author dwbs
 */
public class DescriptionConstants {
    
    public static  String defaultDescription = "Property of a phenomenon, body, or substance, where the property has a magnitude that can be expressed as a number and a unit (adapted from VIM). Mass, time, distance, heat, and angular separation are among the familiar examples of quantitative properties.\n"
            + "                                Kind of quantity, represented by sub-types, are aspect common to mutually comparable quantities. These libraries provide simple ways to convert one unit to another.\n"
            + "                          ";

    public static String transformedUnitDescription= "Transformed units are units that are dervied from other units using any UnitConverter. In this case KM is a transformed form of metre obtained by multiplying Metre by TEN. In this case we use SIPrefix.KILO.getConverter() to convert Metre to KILO.";
}
