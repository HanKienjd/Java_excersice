public class Mutiplication_Table {
    public static void main(String[] args){
        System.out.println("Show Mutiplication_Table");
        //Vòng lặp hàng ngang 
        for(int i = 0; i <= 10; i++){
            for(int j = 1; j <= 9; j++){
                System.out.printf("%2d * %2d = %2d  ", j, i, j * i);
            }
            System.out.println();
        }
    }
}