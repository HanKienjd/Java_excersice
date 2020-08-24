import java.util.Scanner;
public class Lesson3_Part1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input Height : ");
        int height = input.nextInt();
        input.close();

        //Xử lý ma trận  
       for(int i = 1; i <= height; i++){
           for(int j = 0; j <= 2* height; j++){
                int x = j-height;
                if(x < 0){
                    x *= -1;// để x luôn dương 
                }
                int output = i - x;
                if(output > 0){
                    System.out.printf("%2d", output);
                }else{
                    System.out.print("  ");
                }
           }
           System.out.println();
       }

    }        
}