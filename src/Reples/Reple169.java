package Reples;

public class Reple169 {

    public static void main(String[] args) {
        New no=new New();
        no.avgElements(new int[]{2, 7, 3, 8, 4});

    }

}
class New{
        final void avgElements (int[] arr){
            int sum = 0;
            int n = arr.length;

            for (int i = 0; i < n; i++)
                sum += arr[i];

            System.out.println((double)sum/n);

        }

        }


