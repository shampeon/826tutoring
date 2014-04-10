/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package org.eighttwosixvalencia.tutoring.web;

import java.io.Serializable;
import java.util.Locale;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author ievans
 */
@Named(value = "localeBean")
@SessionScoped
public class LocaleBean implements Serializable {
    private static final long serialVersionUID = 6469476733525879600L;
    private Locale locale = FacesContext.getCurrentInstance()
            .getViewRoot()
            .getLocale();
    
    /**
     * Creates a new instance of LocaleBean
     */
    public LocaleBean() {
    }
    
    public Locale getLocale() {
        return locale;
    }

    public String getLanguage() {
        return locale.getLanguage();
    }

    public void setLanguage(String language) {
        locale = new Locale(language);
        FacesContext.getCurrentInstance().getViewRoot().setLocale(locale);
    }

}
