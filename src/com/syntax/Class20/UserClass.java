package com.syntax.Class20;
public class UserClass {
    String name;
    int num;
    String address;

    void userDetails() {
        System.out.println("Customer name is " + name + " mobile number is " + num + " address is " + address);
    }

    static class UserInfo extends UserClass {
        UserInfo(String name, int num, String address) {
            this.name = name;
            this.num = num;
            this.address = address;
        }
    }

    public static void main(String[] args) {
        UserInfo userinfo = new UserInfo("Mike",6563928,"23 Spring St.");
        userinfo.userDetails();
    }
}