/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.eighttwosixvalencia.tutoring.web;

import org.eighttwosixvalencia.tutoring.util.StatusType;
import java.util.Locale;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author ievans
 */
@Named
@RequestScoped
public class StatusManager {
    
    private FacesContext ctx = FacesContext.getCurrentInstance();
    private Locale locale;

    /** Creates a new instance of StatusManager */
    public StatusManager() {
        locale = ctx.getViewRoot().getLocale();
    }
    
    public String getLocalizedStatus(StatusType status) {
        return status.toString(locale);
    }

}
