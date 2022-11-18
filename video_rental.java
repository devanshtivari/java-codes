import java.util.*;


public class video_rental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of entries : ");
        int entries = sc.nextInt();
        Details[] d1 = new Details[entries];
        System.out.println("Enter the values-\n");
        for(int i=0 ; i<entries ; i++){
            System.out.println("Enter the title of video : ");
            d1[i].title = sc.next();
            System.out.println("Enter the price of the video : ");
            d1[i].price = sc.nextFloat();
            System.out.println("Enter the number of stars : ");
            d1[i].stars = sc.nextInt();
        }
        System.out.println("The entered values are: ");
        for(int i=0 ; i<entries ; i++){
            System.out.println(i+1+". "+d1[i].title+"-");
            System.out.print("Price: "+d1[i].price+"   Stars: "+d1[i].stars);
            System.out.println();
        }
    }
}

class Details {
    public static String title;
    public static float price;
    public static int stars;
}
