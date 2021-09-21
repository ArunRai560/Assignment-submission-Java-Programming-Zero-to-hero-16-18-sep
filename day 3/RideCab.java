import java.util.Scanner;
class Cab {
    int fare;
    int d;

    public Cab() {
        fare = 30;
    }
    //parameterized constructor
    public Cab(int fare) 
	{
        this.fare = fare;   //"this" gives reference of current object being used
        
    }

  
    
}

class RideCab {
    public static void main(String[] args) {
        int cd; //distance of cab from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cab distance from user: ");
        cd = sc.nextInt();

        if(cd > 5) {
            Cab ob = new Cab(30 + (cd - 5) * 10); //invokes parameterized constructor
            System.out.print("Enter the distance travelled: ");
            ob.d = sc.nextInt();

            ob.fare += 10 * ob.d;

            System.out.println("Total fare: Rs " + ob.fare);

            
        }
        else {
            Cab ob = new Cab();
            System.out.print("Enter the distance travelled: ");
            ob.d = sc.nextInt();

            ob.fare += 10 * ob.d;

            System.out.println("Total fare: Rs " + ob.fare);

            
        }

    }
}







/*

output

C:\Users\Arun Rai\Desktop>javac RideCab.java

C:\Users\Arun Rai\Desktop>java RideCab
Enter the cab distance from user: 5
Enter the distance travelled: 5
Total fare: Rs 80


*/