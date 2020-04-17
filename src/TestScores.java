import java.util.Arrays;
import java.util.Scanner;
public class TestScores {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num [] = new int [10];
        int smallest = 0;
        int biggest = 0;
        int sum = 0;
        int average = 0;
        //loop 10 times to read users input
        System.out.println("Please enter 10 numbers");
        for (int i = 0; i< 10; i++){
            num[i] = sc.nextInt();

        }

        //first the lowerst
        smallest = num[0];
        for (int i = 0; i <10; i++){
            if(smallest > num[i]){
              smallest = num[i];
            }
        }

        //biggest number
        biggest = num[0];
        for (int i = 0; i <10; i++){
            if(biggest < num[i]){
                biggest= num[i];
            }
        }

        for (int i = 0; i <10; i++){
            sum += num[i];
            }
        average = sum/10;
        System.out.println("The biggest: " + biggest);
        System.out.println("The smallest: " + smallest);
        System.out.println(Arrays.toString(num));

        }



}
