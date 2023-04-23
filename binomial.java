public class binomial {
   
    public static int factorial(int n){
        int f = 1;
          for(int i =1;i<=n;i++){
            f = f*i;
          }
             return f;
    }

    public static void bino(int a,int b){
        int a_f = factorial(a);
        int b_f  = factorial(b);
        int c_f = factorial(a - b);

        int bino_fact = a_f /( b_f * c_f);
      System.out.println("the binomial coefficient is  "+bino_fact);

    }
    public static void main(String[] args) {
       
        bino(5,2);
    }
}
