import java.util.Scanner;
public class Lesson3_Part1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input Height : ");
        int height = input.nextInt();
        input.close();

        //Xử lý vòng lặp 
        // for(int x = 0; x < height; x++){
            for(int i= 0; i <= height; i++){
                for(int j = 0; j < height; j++){
                    if(j <= height -i){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print(i);
                    }
                }
            }
            // for(int j = height-1; j >0; j--){
            //     System.out.print(j);
            // }
            System.out.println();
        // }    
        }
}