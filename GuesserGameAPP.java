package com.firstprogram.abc;
import java.util.Scanner;

public class GuesserGameAPP 
{

	public static void main(String[] args) 
	{
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();

	}

}
class Guesser
{
	int gnum;
	int guessNum()
	{
		System.out .println("guess no btwn 1-100");
		Scanner scan=new Scanner(System.in);
		gnum=scan.nextInt();
		return gnum;
	}
}
class Player
{
	int pnum;
	int pridictNum()
	{
		System.out.println("Pridict no btwn 1-100");
		Scanner scan=new Scanner(System.in);
		pnum=scan.nextInt();
		return pnum;
	}
}

class Umpire
{
	int numfromguesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g =new Guesser();
		numfromguesser=g.guessNum();
	}
	void collectNumFromPlayer()
	{
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numFromPlayer1=p1.pridictNum();
		numFromPlayer2=p2.pridictNum();
		numFromPlayer3=p3.pridictNum();
	}

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