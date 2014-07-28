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

import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.measure.Unit;
import javax.measure.quantity.Length;
import org.unitsofmeasurement.impl.AbstractQuantity;
import org.unitsofmeasurement.impl.util.US;

/**
 *
 * @author dwbs
 */
@ManagedBean
@SessionScoped
public class LengthConverter {

    private ShowcaseUnit fromUnit;
    private ShowcaseUnit toUnit;
    private String fromValue;
    private String toValue;
    private String description=DescriptionConstants.defaultDescription;

   
    private String codeSnippet=CodeFragmentConstants.defaultCodeFragment;
    

    public LengthConverter() {

    }
    private Map<String, ShowcaseUnit> unitsList = new HashMap<>();

    @PostConstruct
    public void init() {
        
        

        unitsList.put("FOOT", new ShowcaseUnit(US.FOOT,DescriptionConstants.defaultDescription,CodeFragmentConstants.defaultCodeFragment));
        unitsList.put("FOOT_SURVEY", new ShowcaseUnit(US.FOOT_SURVEY,DescriptionConstants.defaultDescription,CodeFragmentConstants.defaultCodeFragment));
        unitsList.put("INCH", new ShowcaseUnit(US.INCH,DescriptionConstants.defaultDescription,CodeFragmentConstants.defaultCodeFragment));
        unitsList.put("LIGHT_YEAR", new ShowcaseUnit(US.LIGHT_YEAR,DescriptionConstants.defaultDescription,CodeFragmentConstants.defaultCodeFragment));
        unitsList.put("METER", new ShowcaseUnit(US.METER,DescriptionConstants.defaultDescription,CodeFragmentConstants.defaultCodeFragment));
        unitsList.put("MILE", new ShowcaseUnit(US.MILE,DescriptionConstants.defaultDescription,CodeFragmentConstants.defaultCodeFragment));
        unitsList.put("NAUTICAL_MILE", new ShowcaseUnit(US.NAUTICAL_MILE,DescriptionConstants.defaultDescription,CodeFragmentConstants.defaultCodeFragment));
        unitsList.put("YARD", new ShowcaseUnit(US.YARD,DescriptionConstants.defaultDescription,CodeFragmentConstants.defaultCodeFragment));
        unitsList.put("KILO METER", new ShowcaseUnit(IndianSystemOfUnits.KILOMETRE,DescriptionConstants.transformedUnitDescription,CodeFragmentConstants.transformedCodeFragment));

    }

    public String getToValue() {
        getConvertedValue();
        return toValue;
    }

    public void setToValue(String toValue) {
        this.toValue = toValue;
    }
    

    public ShowcaseUnit getToUnit() {
        return toUnit;
    }

    public void setToUnit(ShowcaseUnit toUnit) {
        this.toUnit = toUnit;
    }

    public ShowcaseUnit getFromUnit() {
        return fromUnit;
    }

    public void setFromUnit(ShowcaseUnit fromUnit) {
        this.fromUnit = fromUnit;
    }

    public Map<String,ShowcaseUnit> getUnitsList() {
        return unitsList;
    }

    public void setUnitsList(Map<String, ShowcaseUnit> unitsList) {
        this.unitsList = unitsList;
    }

    public String getFromValue() {
        return fromValue;
    }

    public void setFromValue(String fromValue) {
        this.fromValue = fromValue;
    }
     public String getDescription() {
        return description;
    }

    public void setDescription(String desccription) {
        this.description = desccription;
    }

    public String getCodeSnippet() {
        return codeSnippet;
    }

    public void setCodeSnippet(String codeSnippet) {
        this.codeSnippet = codeSnippet;
    }

    public void getConvertedValue() {

        {

            if (fromValue == null || fromValue.isEmpty() || fromUnit == null) {
                return;
            }
            double inputVal = 0.0d;
            try {
                inputVal = Double.parseDouble(fromValue);
            } catch (NumberFormatException ne) {
                return;
            }

            AbstractQuantity<Length> l = AbstractQuantity.of(inputVal, fromUnit.getUnit());
            l = l.to(toUnit.getUnit(), MathContext.DECIMAL32);
            this.description=toUnit.getDescription();
            this.codeSnippet=toUnit.getCodeFragment();

            this.toValue = l.toString();

        }
    }

}
