
import java.util.Scanner;
import java.util.*;
import java.lang.Math;

class SlotMachine {

    //main
    public static void main(String[]args) {
      int bet=0, winnings=0;
      TripleString thePull=new TripleString();

      bet = getBet();
      while (bet !=0 && TripleString.numPulls < 40) {
          //Get pull stringpublic static TripleString pull()
    {
    int result1, result2, result3;
    TripleString thePull = new TripleString();

       //determine first roller
       result1 = (int)(Math.random() * 100);
       if (result1 < 51)
         thePull.setString1("BAR");
       else if (result1 >=51 && result1 <76)
        thePull.setString1("cherries");
       else if (result1 >= 76 && result1 < 87.5)
          thePull.setString1("space");
       else
          thePull.setString1("7");

       //determine second roller
       result2 = (int)(Math.random() * 100);
       if (result2 < 51)
         thePull.setString2("BAR");
       else if (result2 >=51 && result2 <76)
        thePull.setString2("cherries");
       else if (result2 >= 76 && result2 < 87.5)
          thePull.setString2("space");
       else
          thePull.setString2("7");

       //determine third roller
       result3 = (int)(Math.random() * 100);
       if (result3 < 51)
         thePull.setString3("BAR");
       else if (result3 >=51 && result3 <76)
        thePull.setString3("cherries");
       else if (result3 >= 76 && result3 < 87.5)
          thePull.setString3("space");
       else
          thePull.setString3("7");

       return thePull;
    }
          thePull = TripleString.pull();
          TripleString.numPulls++;
          //calculate winnings
          winnings = (thePull.getPayMultiplier() * bet);
          //add winnings to winnings array
          TripleString.saveWinnings(winnings);
          //Display the results of the pull
          display (thePull, winnings);
       }
       TripleString.displayWinnings();
   }



      public static int getBet() {
          //Gets bet from user input
          Scanner keyboard=new Scanner(System.in);
          System.out.println("Enter your bet (0 - $100)");
          int bet = keyboard.nextInt();
          return bet;
      }


    public static TripleString pull() {
        // pull function -- Return type is tripple string
    }



    public static void display (TripleString thePull, int winnings) {
        System.out.println (thePull.getString1() + " " + thePull.getString2() + " " + thePull.getString3() +
           "\n");
        if (winnings == 0)
           System.out.println ("Sorry, you lose");
        else
           System.out.println ("You win! $" + winnings);
    }



    public static String randString() {
        // he explains this one, fairly straight forward
    }



    public static int getPayMultiplier (TripleString thePull) {
        // returns the multiplier 0, 5, 15, 30, 50, 100
    }

}
