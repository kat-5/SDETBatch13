package com.Class25;

public class BankAccount {
    private String name;
    private String username;
    private String password;
    private double balance;
    private int age;

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        //123 Elexia
        String nameWithoutNumbers = name.replaceAll("A-Za-z", "");
        //Elexia
        if (nameWithoutNumbers.equals(name)) {
            System.out.println("Numbers not present inside the name");
            this.name = name;
        } else {
            System.out.println("only alphabets are allowed");
        }
    }

    public void setUsername(String userName) {
        if (userName.length() > 8 && userName.length() < 15) {
            System.out.println("Username accepted");
            this.username = userName;
        } else {
            System.out.println("User name should be greater than 8 characters");
        }
    }

    double getBalance(String username,String password){
      if(username.equals(this.username)&& password.equals(this.password)) {
          return balance;
      }else{
          return -1;
      }
    }

}

