import java.util.*;

import javax.swing.plaf.basic.BasicBorders.SplitPaneBorder;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int flag=0;
        for(int i=0 ; i<str.length() ; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                flag++;
                break;
            }
        }
        if(flag==0) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
