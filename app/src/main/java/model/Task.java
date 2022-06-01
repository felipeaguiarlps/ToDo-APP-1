/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author felip
 */
public class Task {
    
    private int id;
    private int idproject;
    private String name;
    private String description;
    private String notes;
    private boolean isCOmpleted;
    private Date deadline;
    private Date createdAt;
    private Date updatedAt;

    public Task(int id, int idproject, String name, String description, String notes, boolean isCOmpleted, Date deadline, Date createdAt, Date updatedAt) {
        this.id = id;
        this.idproject = idproject;
        this.name = name;
        this.description = description;
        this.notes = notes;
        this.isCOmpleted = isCOmpleted;
        this.deadline = deadline;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    
    public Task(){
        this.createdAt = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdproject() {
        return idproject;
    }

    public void setIdproject(int idproject) {
        this.idproject = idproject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isIsCOmpleted() {
        return isCOmpleted;
    }

    public void setIsCOmpleted(boolean isCOmpleted) {
        this.isCOmpleted = isCOmpleted;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Task{" + "id=" + id + ", idproject=" + idproject + ", name=" + name + ", description=" + description + ", notes=" + notes + ", isCOmpleted=" + isCOmpleted + ", deadline=" + deadline + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + '}';
    }
    
    
}
