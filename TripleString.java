

public class TripleString {

    //Private data members
    private String string1;
    private String string2;
    private String string3;
    static final int MAX_LEN = 20;
    static final int MAX_PULLS = 40;
    private int numPulls;
    private static int pullWinnings[];

    // default constructor
    public TripleString() {
        // initialize all tripple string private variables here
        //this can also be overloaded to pass in strings as the default constructor
        //but he wants them to be preinitialized to ""
        this.numPulls = 0;
        this.pullWinnings = new int[this.MAX_PULLS];
        this.string1 = 0;
        this.string2 = 0;
        this.string3 = 0;
    }


    private boolean validString(String str)
    {
       return (!(str.equalsIgnoreCase("")) && str.length() <= MAX_LEN);
    }


    //Mutator for String1
    public boolean setString1(String spin)
    {
       if (validString(spin))
       {
          this.string1=spin;
          return true;
       }
       else
          return false;
    }

    //Mutator for String2
    public Boolean setString2(String spin)
    {
       if (validString(spin))
       {
          this.string2=spin;
          return true;
       }
       else
          return false;
    }

    //Mutator for String3
    public Boolean setString3(String spin)
    {
       if (validString(spin))
       {
          this.string3=spin;
          return true;
       }
       else
          return false;
    }

    //Accessor for String1
    public String getString1()
    {
       return this.string1;
    }

    //Accessor for String2
    public String getString2()
    {
       return this.string2;
    }

    //Accessor for String3
    public String getString3()
    {
       return this.string3;
    }



    public Boolean increaseNumPulls () {
        if (this.numPulls == 39) {
            return false;
        }
        this.numPulls++;
        return true;
    }


    public int getNumPulls () {
        return this.numPulls;

    }


    public String toSring() {
        // concatitnate string1+2+3 and return the full string;
    }


    public Boolean saveWinnings( int winnings ) {
        // set the value of pullwinnings[numpulls] to winnings.
        // check if number has set / mutation is legal, then return true;
        // else return false. (IE something is already saved in that element)
    }


    public static void displayWinnings()
    {
       for (int i = 0; i < TripleString.numPulls; i++)
       {
          TripleString.totalWinnings = TripleString.totalWinnings +
             TripleString.pullWinnings[i];
       }
       System.out.println ("Congratulations!  You've won a total of $"
             + TripleString.totalWinnings + ".");
    }

    public int getPayMultiplier()
    {
       int payMultiplier = 1;
       if (getString1() == "cherries")
          {
             if (getString2() == "cherries")
                {
                   if (getString3() == "cherries")
                      payMultiplier = 30;
                   else
                      payMultiplier = 15;
                 }
             else
                payMultiplier = 5;
          }
       else if (getString1() == "BAR" && getString2() == "BAR"
          && getString3() == "BAR")
          payMultiplier = 50;
       else if (getString1() == "7" && getString2() == "7"
             && getString3() == "7")
          payMultiplier = 100;
       return payMultiplier;
    }


    public static void saveWinnings (int winnings)
    {
       pullWinnings[TripleString.numPulls-1]=winnings;
    }



    public static TripleString pull()
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



} // TrippleString
