/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.eighttwosixvalencia.tutoring.web.util;

import org.eighttwosixvalencia.tutoring.entity.Student;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author ian
 */
@FacesConverter(forClass=Student.class)
public class StudentConverter extends EntityConverter implements Converter {

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
        Student student = (Student) object;
        Long id = student.getId();
        if (id != null) {
            String stringId = String.valueOf(id.longValue());
            this.getViewMap(context).put(stringId, object);
            return stringId;
        } else {
            return "0";
        }
    }

}
