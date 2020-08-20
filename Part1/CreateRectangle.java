import java.util.Scanner;
public class CreateRectangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("number of rows: ");int rows = input.nextInt();
        System.out.print("number of colums: ");int colums = input.nextInt();
        input.close();

        for(int i = 0 ; i < rows; i++){
            for(int j = 0; j < colums; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}