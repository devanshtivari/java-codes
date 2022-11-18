import java.util.*;
public class split{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strarr = str.split("\\s+");
        for(int i=0; i<strarr.length; i++){
            System.out.println(strarr[i]);
        }

    }
}