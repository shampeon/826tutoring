/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.eighttwosixvalencia.tutoring.web.util;

import org.eighttwosixvalencia.tutoring.entity.Guardian;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author ian
 */
@FacesConverter(forClass=Guardian.class, value="guardian")
public class GuardianConverter extends EntityConverter implements Converter {
 
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value.isEmpty()) {
            return null;
        }
        return this.getViewMap(context).get(value);
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object object) {
        if (object == null) {
            return "";
        }
        
        Guardian guardian = (Guardian) object;
        Long id = guardian.getId();
        if (id != null) {
            String stringId = String.valueOf(id.longValue());
            this.getViewMap(context).put(stringId, object);
            return stringId;
        } else {
            return "0";
        }
    }
}
