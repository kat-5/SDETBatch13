package com.Class25;

public interface Washable {
    // all interfaces by default are abstract
    //private String male="LG" interface can only have public fields
    //protected String make="LG"; interface can only have public fields

    //public static final String make="LG"; no need to write public static final
    //because they are that by default

    String make="Samsung";
    abstract void wash();
    // anywhere you have a final field you have to give a value

}

interface FiveG{
    void speed();
}

interface FastChargeAble{
    void charging();
}

class S21Ultra implements Washable,FastChargeAble,FiveG{


    @Override
    public void wash() {
        System.out.println("You guys can wash me easy");
    }

    @Override
    public void charging() {
        System.out.println("I support fast charging now because i implemented this requiered");
    }

    @Override
    public void speed() {
        System.out.println("you can download things super fast because now i also support 5G");
    }
}



