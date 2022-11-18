import java.util.*;

public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> arr =  new ArrayList<String>();
        String str = sc.nextLine();
        int len = sc.nextInt();
        int i=0,j=len;
        while(j != str.length()+1){
            arr.add(str.substring(i,j));
            i++;
            j++;         
        }
        Collections.sort(arr);
        System.out.println(arr.get(0));
        System.out.println(arr.get(arr.size()-1));
    }
    
}
