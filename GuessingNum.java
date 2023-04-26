import java.util.*;

class Guess
{
	Scanner sc=new Scanner(System.in);
	int k=5;
	int guess,num,i;
	public Guess(int num)
        {
	    this.num=num;
        }
	public void display()
        {
	System.out.println("\nA number is generated randomly by the computer between 1 to 100");
	System.out.println("Guess the number within 5 trails");
	for(i=0;i<k;i++)
	{
	     System.out.print("\nGuess the number: ");
	     guess=sc.nextInt();
	     if(num==guess)
	     {
		 System.out.println("Congratulations!" + "You guessed the number correctly");
		 break;
	     }
	     else if(num>guess && i!=k-1)
	     {
		 System.out.println("The number is greater than "+guess);
	     }
	     else if(num<guess && i!=k-1)
	     {
		 System.out.println("The number is less than "+guess);
	     }
	}
	if(i==k)
	{
	    System.out.println("You'r trails are over");
	    System.out.print("The number was: "+num);
	}
       }
}
public class GuessingNum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Random randnum=new Random();
	int num=randnum.nextInt(100);
	Guess G=new Guess(num);
	G.display();
	
    }
}