/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package org.eighttwosixvalencia.tutoring.web.util;

import java.util.HashMap;
import java.util.Map;
import javax.faces.context.FacesContext;

/**
 *
 * @author ievans
 */
public class EntityConverter {

    private static final String key = "org.eighttwosixvalencia.tutoring.web.util.EntityConverter";

    public EntityConverter() {
    }

    protected Map<String, Object> getViewMap(FacesContext context) {
        Map<String, Object> viewMap = context.getViewRoot().getViewMap();
        @SuppressWarnings({"unchecked", "rawtypes"})
        Map<String, Object> idMap = (Map) viewMap.get(key);
        if (idMap == null) {
            idMap = new HashMap<String, Object>();
            viewMap.put(key, idMap);
        }
        return idMap;
    }
}
