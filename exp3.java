import java.util.Scanner;
//ques1
class Details{
    public String name;
    public int salary;
    public long pno;
    Details(String n , int s , long p){
        this.name = n;
        this.salary = s;
        this.pno = p;
    }
    public void display(){
        System.out.println("The name is : "+name);
        System.out.println("The phone number is : "+pno);
        System.out.println("The salary received is : "+salary);
    }
}

public class exp3 {
    public static void main(String[] args) {
        Details[] employee;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of entries : ");
        int size = sc.nextInt();
        employee = new Details[size];
        System.out.println("Enter the following details-");
        for(int i=0 ; i<size ; i++){
            String n;int s;long p;
            System.out.println("Enter name : ");
            n = sc.nextLine();
            System.out.println("Enter salary : ");
            s = sc.nextInt();
            System.out.println("Enter phone number : ");
            p = sc.nextLong();
            employee[i] = new Details(n , s , p);
        }
        System.out.println("Details saved by us - ");
        for(int i=0 ; i<size ; i++){
            employee[i].display();
        }
    }
}

export class exp3;