import java.util.Scanner;
public class Sum_of_number {
   public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("number :");
    int number = input.nextInt();
    input.close();

    int sum = 0;
    //Số lẻ
    if(number % 2 != 0){
    for(int i = 1; i <= number; i++){
        sum+=i;
        i++;
    }
    System.out.println(sum);
    //
    }else{
    //Số chẵn 
    for(int i = 2; i <= number; i++){
        sum+=i;
        i++;
    }
    System.out.println(sum);
    }
   }

}