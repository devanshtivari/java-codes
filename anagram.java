import java.util.Arrays;
import java.util.Scanner;
public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        char array1[] = str1.toCharArray();
        char array2[] = str2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        int flag = 0;
        for(int i=0 ; i<Math.min(array1.length, array2.length) ; i++){
            if(array1[i] != array2[i]){
                flag++;
                break;
            }
        }
        if(flag == 0 && (array1.length == array2.length)){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}
