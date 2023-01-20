package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {

    //**************************************** */
    //  Entity Properties
    //**************************************** */

    @Id //Denotes this property as the id/primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //auto generates
    public Integer id;

    public String subject;

    public String details;

    //**************************************** */
    //  Constructors
    //**************************************** */

    public Todo(){

    }

    public Todo(String subject, String details){
        this.subject = subject;
        this.details = details;
    }

    //**************************************** */
    //  GETTERS AND SETTERS
    //**************************************** */

    public Integer getId(){
        return this.id;
    }

    public void setId(Integer id){
        this.id = id;
    }

    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getDetails(){
        return this.details;
    }

    public void setDetails(String details){
        this.details = details;
    }
}
