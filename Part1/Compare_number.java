import java.util.Scanner;
public class Compare_number {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("number :");
    int number = input.nextInt();
    input.close();
    int count = 1;

    for(int i = 0; i <=  100; i++){ 
        if(i == number){
            System.out.printf("\nCompare_number: %d", number);
            break;
        }else{
            System.out.printf("\n%d != %d", i, number);
        }
        count++;//dếm bước thực hiện 
    }
    System.out.printf("\nCount = %d", count);
   }
}