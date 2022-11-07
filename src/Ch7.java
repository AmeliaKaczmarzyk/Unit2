public class Ch7 {
    static int quotient = 0;
    static int remainder = 0;

    public static int getYears(double pop){
        int years = 2014;
        double Npop = 123.5;
        while(Npop < pop){
            Npop = Npop * 1.005;
            years++;
        }

        return years;
    }

    public static int getStuff(int n, int b){
        int p = 1;
        while (p <= n){
            n = n - p;
            p = p * b;
        }
        return n;
    }

    public static void main(String[] args) {
        getStuff(13, 2);
        System.out.println(getStuff(37, 2));
        System.out.println(getYears(150.00));
    }
}