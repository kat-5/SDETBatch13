package Reples;

public class Reple145 {
    public static void main(String[] args) {
        Dog dog=new Dog("Tarzan","Mutt",50.0);
        Dog dog2=new Dog("Lucy","Mutt",10.0);
    }
}
    class Dog{
        String dogName;
        double dogWeight;
        static String dogBreed="Mutt";

        Dog(String dogName,String dogBreed ,double dogWeight ){
            this.dogName=dogName;
            this.dogWeight=dogWeight;
            this.dogBreed=dogBreed;
            System.out.println(dogName+" "+dogBreed+" "+dogWeight);

        }
    }

