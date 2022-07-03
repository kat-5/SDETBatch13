package com.Homework.Class25;

public class RegistrationClass {

    private String email;
    private String userName;
    private String password;

    public void email(String email) {
        this.email = email;
            if (email.contains("yahoo")) {
                System.out.println("email accepted");
            } else {
                System.out.println("only yahoo accounta are allowed are allowed");
            }
        }

    public void userName(String userName) {
        this.userName = userName;
        if(userName.isEmpty()){
            System.out.println("Username cant be empty");
        } else if (userName.length()>6) {
            System.out.println("Username accepted");
        }else{
            System.out.println("User name should be at least 6 characters long");
        }
    }

    public void setPassword(String password) {
        this.password = password;

        if(password.isEmpty() || password.contains(userName)){
            System.out.println("Password cant be empty or contain user name");
        } else if (password.length()>6){
            System.out.println("Password accepted");
        }else{
            System.out.println("Password should be at least 6 characters long");
        }
    }


    }
