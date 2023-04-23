public class Hollow_Rectangle {
    public static void rect(int total_row,int total_col){
        for(int i=1;i<=total_row;i++){

            for(int j=1;j<=total_col;j++){

                if(i == 1 || i == total_row  || j == 1 || j == total_col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rect(5, 10);
    }
}
