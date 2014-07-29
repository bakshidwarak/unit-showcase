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
public class CodeFragmentConstants {

    public static final String defaultCodeFragment = "\n"
            + "            AbstractQuantity<Length> l = AbstractQuantity.of(inputVal, US.METER);         \n"
            + "            l = AbstractQuantity.of(inputVal, US.FOOT);        \n"
            + "            l = l.to(toUnit, MathContext.DECIMAL32);";

    public static final String transformedCodeFragment = "\n"
            + "            AbstractQuantity<Length> l = AbstractQuantity.of(inputVal, US.METER);         \n"
            + "            l = AbstractQuantity.of(inputVal, US.KILOMETER);        \n"
            + "            l = l.to(toUnit, MathContext.DECIMAL32);\n\n"
            + "            TransformedUnit<Length> KILOMETRE\n"
            + "            = new TransformedUnit<Length>(SI.METRE,SIPrefix.KILO.getConverter());";
    static String dimensionCodeExample = "\n"
            + "            BaseUnit<LuminousIntensity> CANDELA \n"
            + "            = new BaseUnit<LuminousIntensity>(\"cd\", QuantityDimension.LUMINOUS_INTENSITY\")\n;"
            + "            public static final Dimension LUMINOUS_INTENSITY = new QuantityDimension('J');";
}
