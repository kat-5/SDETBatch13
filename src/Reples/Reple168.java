package Reples;

public class Reple168 {

    public static void main(String[] args) {
        Simple simple = new Simple();
        simple.reto("Hello");

    }
}

class Simple {
    String nstr="";

    final void reto(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            nstr = ch + nstr;

        }
         System.out.println(nstr);
    }
}
