import java.util.Scanner;
public class a {
    public static void demo(int a, int b){
      
      Scanner in = new Scanner(System.in);
      int t=in.nextInt();
      for(int i=0;i<t;i++){
          
         a = in.nextInt();
           b = in.nextInt();
          int n = in.nextInt();
  
              for (int j = 0; j<n; j++){
          a += Math.pow(2,j)*b;
          System.out.print(a + " ");
      }
          System.out.println();
      }
      in.close();


}
public static void main(String[] args) {
  demo(0,10);
}
}
