package Reples;

public class Reple151 {
}
class Main extends Method {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Method.sum2D(a));
    }
}



class Method{
    static int sum2D (int[] [] a){
        int sum=0;
        for(int[] i:a){
            for(int j : i){
                sum+=j;
            }
        }
        return sum;
    }

}

