public class overloading {


    public static int add(int a,int b){
        return a + b;
    }
    public static float add(float c, float d){
        return c + d;
    }
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(12.5, 12.5));
    }
}
