/**
 * Nhập số tự nhiên n rồi tính tổng (lưu ý phép chia các số nguyên):
S =1 + 1/2 + 1/3 + ... + 1/n
 */
import java.util.Scanner;
public class Praction_sequence {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("number :");
    int number = input.nextInt();
    input.close();

    float sum = 0;
    for(float i = 1; i <= number; i++){
        sum+=1/i;
    }
    System.out.printf("sum : %f", sum);
   }
}