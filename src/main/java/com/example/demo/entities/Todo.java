package com.example.demo.entities;

import javax.persistence.Column;
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

    public String zodiac;

    public String year;

    @Column (columnDefinition = "TEXT")
    public String general;

    @Column (columnDefinition = "TEXT")
    public String wealth;
    
    @Column (columnDefinition = "TEXT")
    public String health;

    @Column (columnDefinition = "TEXT")
    public String tips; 

    @Column (columnDefinition = "TEXT")
    public String image; 

    //**************************************** */
    //  Constructors
    //**************************************** */

    public Todo(){

    }

    public Todo(
        String zodiac,
        String year,
        String general,
        String wealth,
        String health,
        String tips, 
        String image
        )
        {
        this.zodiac = zodiac;
        this.year = year;
        this.general = general;
        this.wealth = wealth;
        this.health = health; 
        this.tips = tips;  
        this.image = image; 

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

    public String getZodiac(){
        return this.zodiac;
    }

    public void setZodiac(String zodiac){
        this.zodiac = zodiac;
    }

    public String getYear(){
        return this.year;
    }

    public void setYear(String year){
        this.year = year;
    }

    public String getGeneral(){
        return this.general;
    }

    public void setGeneral(String general){
        this.general = general;
    }
    
    public String getWealth(){
        return this.wealth;
    }

    public void setWealth(String wealth){
        this.wealth = wealth;
    }

    public String getHealth(){
        return this.health;
    }

    public void setHealth(String health){
        this.health = health;
    }

    public String getTips(){
        return this.tips;
    }

    public void setTips(String tips){
        this.tips = tips;
    }

    public String getImage(){
        return this.image;
    }

    public void setImage(String image){
        this.image = image;
    }

}
