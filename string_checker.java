import java.util.*;
public class string_checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        System.out.println(first.length()+second.length());
        if(first.compareTo(second) > 0) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println((Character.toString(first.charAt(0))).toUpperCase() + first.substring(1, first.length()) + " " + (Character.toString(second.charAt(0))).toUpperCase() + second.substring(1, second.length()));
    }
}
