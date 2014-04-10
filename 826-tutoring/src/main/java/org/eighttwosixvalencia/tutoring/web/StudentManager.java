/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.eighttwosixvalencia.tutoring.web;

import org.eighttwosixvalencia.tutoring.entity.Student;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;

/**
 *
 * @author ian
 */
@Named
@RequestScoped
public class StudentManager {

    protected Student newStudent;
    protected Student selectedStudent;

    public StudentManager(Student newStudent) {
        this.newStudent = newStudent;
    }

    public StudentManager() {
        this.newStudent = new Student();
    }

    /**
     * Get the value of newStudent
     *
     * @return the value of newStudent
     */
    public Student getNewStudent() {
        return newStudent;
    }

    /**
     * Set the value of newStudent
     *
     * @param newStudent new value of newStudent
     */
    public void setNewStudent(Student newStudent) {
        this.newStudent = newStudent;
    }

    public Student getSelectedStudent() {
        return selectedStudent;
    }
    
    public void setSelectedStudent(Student student) {
        this.selectedStudent = student;
    }

    public void onRowSelect(SelectEvent event) {  
        FacesMessage msg = new FacesMessage("Student Selected", ((Student) event.getObject()).getName());  
  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    } 
    
    public void onRowUnselect(UnselectEvent event) {  
        FacesMessage msg = new FacesMessage("Student Unselected", ((Student) event.getObject()).getName());  
  
        FacesContext.getCurrentInstance().addMessage(null, msg);  
    }  

}
