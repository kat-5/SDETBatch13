package com.syntax.class18;

public class Book {

    //Write Book class that will have instance variables and 2 Constructors.
    // While creating an object make sure:
    //Instance variables are being initialized
    //Both Constructors are being executed

    String author;
    String name;

        public Book() {

            System.out.println("I love books");
        }
        public Book(String aut, String nm) {
            this.author = aut;
            this.name = nm;
            System.out.println("My favorite book is " + aut + " by " + nm);
        }




        public static void main (String[]args){
            Book book1 = new Book();
            Book book2= new Book( "David Abrams","Fobbit");

        }
    }


