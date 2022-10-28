public class Main {
    public static void main(String[] args) {
        System.out.println(digitSwap(5));

    }
    public static int digitSwap(int num){
        return (num % 10) * 10 + (num % 100 / 10) + (num - (num % 100));
    }
}