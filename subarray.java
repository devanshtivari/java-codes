import java.util.*;
class subarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int c=0;
        int[] arr = new int[s];
        for(int i = 0; i < s; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0 ; i < s; i++){
            int sum =0 ;
            for(int j=i ; j<s ; j++){
                sum = sum + arr[j];
                if(sum < 0){
                    c++;
                }
            }
        }
        System.out.println(c);
        
    }
}
