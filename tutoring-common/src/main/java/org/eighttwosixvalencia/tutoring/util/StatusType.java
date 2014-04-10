/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.eighttwosixvalencia.tutoring.util;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author ian
 */
public enum StatusType {
    IN,
    OUT,
    HOME,
    PARK;

    public String toString(Locale locale) {
        ResourceBundle res = ResourceBundle.getBundle("org.eighttwosixvalencia.tutoring.util.StatusMessages", locale);
        return res.getString(name() + ".string");
    }
    
    @Override
    public String toString() {
        Locale locale = Locale.getDefault();
        ResourceBundle res = ResourceBundle.getBundle("org.eighttwosixvalencia.tutoring.util.StatusMessages", locale);
        return res.getString(name() + ".string");
    }
}
