

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
    }


    private Boolean validString( String str ) {
        // checks if a string is 'legal' tbh this is a stupid method
        // but its in the spec. lol
    }


    public Boolean setString1( String str ) {
        if (str.isEmpty()){
            return false;
        }
        this.string1 = str;
        return true;
    }


    public String getString1() {
        return this.string1;
    }


    public Boolean setString2 ( String str ) {
        // same as above
    }


    public String getString2 ( String str ) {
        // same as above
    }


    public Boolean setString3 ( String str ) {
        // same as above
    }


    public String getString3 ( String str ) {
        // same as above
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


    public String displayWinnings() {
        // loop through winnings
        // then display them as a string
        // whatever that means.. I think he wants you to display element numPulls
        // value as a string
    }

} // TrippleString
