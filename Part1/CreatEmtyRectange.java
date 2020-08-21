import java.util.Scanner;
public class CreatEmtyRectange{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("number of rows: ");int rows = input.nextInt();
        System.out.print("number of colums: ");int colums = input.nextInt();
        input.close();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < colums; j++){

                if(i == (rows -1) || i == 0 || j == 0 || j == (colums -1))
                {
                        System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}