import java.util.Scanner;
// import java.lang.Math;
public class Count_of_Number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Number: ");
        int number = input.nextInt();
        input.close();

        int count = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                System.out.print(" " + i);
                count++;
            }
        }
        System.out.println("\ncount: " + count );
    }
}