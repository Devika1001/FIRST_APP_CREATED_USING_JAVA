package com.firstprogram.abc;
import java.util.*;
/**
 * this represents guesser game 
 * repeats for number of chances
 * @author devika
 * @version 15.0
 * @since 29-10-2020
 */
public class GuesserGameAppDocumentation 
{
//	it created the constant chance  
public final static int CHANCE=2;
/**
 * this method collects no from guesser and 3 players
 * give the chances to player for trying it 
 * it will check the chances of player 
 * if chances are completed it will come out from loop
 * it will compare  the guesser number with all the 3 players
 * @see number collected from guesser
 * @see number collected all the 3 from players
 * @see umpire
 */
	public static void main(String[] args) 
	{
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		int i=1;
		while(i<=CHANCE)
		{
		u.collectNumFromPlayer();
		u.compare();
		++i;
		}

	}

}
/**
 *represents guesser
 *  collect number from guesser
 *  
 *  @author Devika
 *  @version 15.0
 *  @since   29-10-2020
 */
class GuesserD
{
//	the constant is created to store the input given for guesser
	private int gnum;
	/**
	 * this prints the statement enter number between ranges
	 * check the given input number is in the given range
	 * if given number is not in range then prints invalid number
	 *  and ask once again to give in put
	 *  @param gnum
	 *  @param LO
	 *  @param HIG 
	 *  @return number collected from guesser
	 */
	
	int guessNum(int LO ,int HIG)
	{
		System.out .println("enter the no between"+LO+"to"+HIG);
		Scanner scan=new Scanner(System.in);
		gnum=scan.nextInt();
		if((gnum<=HIG)&&(gnum>=LO) )
		{
		return gnum;
		}
		else
		{
			System.out.print("invalid number");
			return guessNum(LO,HIG);
		}
	}
}
/**
 * represents the player
 * collect numbers from players
*  
*  @author Devika
*  @version 15.0
*  @since   29-10-2020
*  */
class PlayerD
{
//	the constant is created to store the input given for player
	private int pnum;
	/**
	 * this prints the statement enter number between ranges for player
	 * check the given input number is in the given range
	 * if given number is not in range then prints invalid number
	 *  and ask once again to give in put
	 *  @param pnum
	 *  @param LO
	 *  @param HIG 
	 *  @return number collected from player
	 */
	int pridictNum(int LO,int HIG)
	{
		System.out.println("enter the no between"+LO+"to"+HIG);
		Scanner scan=new Scanner(System.in);
		pnum=scan.nextInt();
		if((pnum<=HIG)&&(pnum>=LO) )
		{
		return pnum;
		}
		else
		{
			System.out.print("invalid number");
			return pridictNum(LO,HIG);
		}
	}
}
/**
 * represents umpireD
 * 
 * @author Devika
 * @version 15.0
 * @since 29-10-2020
 *
 */

class UmpireD
{
//	constant created to store number from guesser
	private int numfromguesser;
//	constant created to store number from player1
	private int numFromPlayer1;
//	constant created to store number from player2
	private int numFromPlayer2;
//	constant created to store number from player3
	private int numFromPlayer3;
	/**
	 * collects number from guesser and all the three player
	 * 
	 *  @param numFromPlayer1
	 *  @param numFromPlayer2
	 *  @param numFromPlayer3
	 *   
	 *   	 */
	
	void collectNumFromGuesser()
	{
		GuesserD g =new GuesserD();
		numfromguesser=g.guessNum(1,100);
	}
	void collectNumFromPlayer()
	{
		PlayerD p1 = new PlayerD();
		PlayerD p2 = new PlayerD();
		PlayerD p3 = new PlayerD();
		numFromPlayer1=p1.pridictNum(1,100);
		numFromPlayer2=p2.pridictNum(1,100);
		numFromPlayer3=p3.pridictNum(1,100);
	}
     /**
	 * this will compare the guesser number with all the 3 players
	 * and declares the winner if no one is winner then tells to try
	 */

void compare()
{
	if(numfromguesser==numFromPlayer1)
	{
		System.out.println("player1 wins it");
	}
    if(numfromguesser==numFromPlayer2)
    {
			System.out.println("player2 wins it");
    }
    if(numfromguesser==numFromPlayer3) 
	{
			System.out.println("player3 wins it");
	}
  else if((numfromguesser!=numFromPlayer1) && (numfromguesser!=numFromPlayer2) )
		{
			System.out.println("you lost the game try again");
		}
}
}