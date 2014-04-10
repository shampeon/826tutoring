/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.eighttwosixvalencia.tutoring.web.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author ievans
 */
@FacesConverter(value="phone")
public class PhoneConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) 
            throws ConverterException {
        
        if (value.isEmpty()) {
            return null;
        }
        String convertedValue = value.trim();
        if (convertedValue.contains("-")) {
            
        }
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
