import java.util.Scanner;
public class OneTwo{
    public static String getLine(int line) {
        String phrase = "";
        switch (line) {
            case 1:
            case 2:
                phrase = "Buckle your shoe";
                break;
            case 3:
            case 4:
                phrase = "Close the door";
                break;
            case 5:
            case 6:
                phrase = "Pick up sticks";
                break;
            case 7:
            case 8:
                phrase = "Don\'t be late";
                break;
            case 9:
            case 10:
                phrase = "Do it again";
                break;
            default:
                phrase = "Does not compute";
        }
        return phrase;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int line = 0;
        while (true) {
            System.out.println("Enter a number 1 - 10 (or 0 to quit)");
            line = in.nextInt();
            if (line == 0)
                break;
            System.out.println(getLine(line));
            }
            System.out.println("Bye");
        }
    }

