import java.util.*;
public class list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0 ; i<len ; i++){
            int a = sc.nextInt();
            list.add(a);
        }
        int query = sc.nextInt();
        System.out.println("Query: " + query);
        for(int i=0 ; i<=query ; i++){
            String q = sc.nextLine();
            if(q.compareTo("Insert") == 0){
                int k = sc.nextInt();
                int p = sc.nextInt();
                list.add(k , p);
            }
            else if(q.compareTo("Delete") == 0){
                int k = sc.nextInt();
                list.remove(k);
            }
        }
        list.forEach(System.out::println);
    }
}
