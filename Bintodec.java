public class Bintodec {
    
    public static void binNum(int n){
        int num  = n;
        int pow = 0;
        int decNum = 0;

        while(n >0){
            int lastDig = n % 10;
            decNum = decNum + (lastDig * (int) Math.pow(2,pow));

            pow++;
            n = n/10;
        }

        System.out.println("The binary number of "+ num +" is "+decNum);
    }

    public static void main(String[] args) {
        binNum(111);
    }
   
}
