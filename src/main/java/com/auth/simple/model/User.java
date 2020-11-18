package com.auth.simple.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@ToString
public class User {
   @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
     private int id;
   private String username;
   private String password;
   public String email;

    public User(User user) {
        this.id= user.id;
        this.username = user.username;
        this.password =user.password;
        this.email = user.email;
    }



    public User(){

        }

}
