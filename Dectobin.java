public class Dectobin {
    public static void binNum(int n){
        int num = n;
        int pow =0;
        int bin =0;

        while(n>0){
            int rem = n % 2;
            bin = bin +(rem *(int) Math.pow(10,pow));
            pow++;
             n/=2;
        }
        System.out.println("The Binary number is "+ bin +" of decimal num "+num);
    }
    public static void main(String[] args) {
        binNum(8);
    }
}
