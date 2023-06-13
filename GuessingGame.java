package loops;
import java.util.Scanner;
import java.util.Random;

public class Game {

	public static void main(String[] args) {
	   Random rand=new Random();
	   Scanner scanner=new Scanner(System.in);
	   
	   int Randomnumber=rand.nextInt(101);
	   int trycount=0;
	   
	  
	   while(true) {
		   System.out.println("guess the number betweeen(0-100)");
		   int Playerguess=scanner.nextInt();
		   trycount++;
		   
		   if(Playerguess==Randomnumber){
		    System.out.println("Woohoo!! That's Correct! you wonn!!");
		    System.out.println("it took you "  + trycount +  " tries");
		    break;
		   }
		    else if(Playerguess>Randomnumber){
		    	System.out.println("NOPE!! The number is lower. Guess Again");
		    }
		    else{
		    	System.out.println("NOPE!! The number is Higher. Guess Again");
		    }
	   }
		scanner.close();   
	}
	
 }


