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

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.measure.Unit;

/**
 *
 * @author dwbs
 */
@ManagedBean
@RequestScoped
public class ObjectConverter implements Converter {
    
    @ManagedProperty(value="#{lengthConverter}")
    public LengthConverter converter;

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        
        return converter.getUnitsList().get(value);
        
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        
        if(value instanceof ShowcaseUnit)
        {
           for(String key : converter.getUnitsList().keySet())
           {
               if(converter.getUnitsList().get(key).equals(value))
                   return key;
           }
        }
        return "";
    }

    public LengthConverter getConverter() {
        return converter;
    }

    public void setConverter(LengthConverter converter) {
        this.converter = converter;
    }
    
    
    
}
