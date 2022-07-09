package Reples;

public class Reple161 {


    public static void main(String[] args) throws Exception{
        Class c= Class.forName("Res");
        Object obj = c.newInstance();



    }
}

    class Res {
        private void m1() {
            System.out.println("private m1 method");

        }

        private void m1(int ye) {

            System.out.println("private m1 method with int parameter");

        }
    }



