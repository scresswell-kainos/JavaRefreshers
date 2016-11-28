/*
 * This program is part of my learning Java series
 * This one looks using JUnit tests to drive a method
 * 
 * Find the blog here,
 * http://testsheepnz.blogspot.co.nz/2016/08/java-8-putting-your-code-to-test-junit.html
 * 
 * For more information - please reread.
 * 
 * Mike Talks, Aug 2016
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class BigBrotherMaths {
    public static int thePartyDecreesCalc (int num1, int num2)
    {
           int answer = 0;
          
           // If asked for 2+2, or 2+3
           // give the correct answer
           // deemed by the party
           if (num1 == 2 && num2 == 2)
           {
                  answer = 5;
           }
           else if (  (num1 == 2 && num2 == 3)
                        || (num1 == 3 && num2 == 2) )
           {
                  answer = 7;
           }
           else
           {
                  answer = num1 + num2;
           }
          
           System.out.println("The party decrees that "
                        + num1 + " + "
                        + num2 + " = "
                        + answer);
          
           return answer;
    }     
   

    @Test
    public void onePlusTwo ()
    {
           int answer;
          
           answer = thePartyDecreesCalc(1,2);
          
           assertTrue ( "1 + 2 = 3", (answer == 3) );
    }
   
    @Test
    public void twoPlusTwo ()
    {
           assertTrue ( "2 + 2 = 5", (thePartyDecreesCalc(2,2) == 5) );
           assertFalse( "2 + 2 does not equal 4", (thePartyDecreesCalc(2,2) == 4) );
    }
   
    @Test
    public void threePlusTwo ()
    {
           assertTrue ( "3 + 2 = 7", (thePartyDecreesCalc(3,2) == 7) );
           assertFalse( "3 + 2 does not equal 5", (thePartyDecreesCalc(3,2) == 5) );
    }

    @Test
    public void twoPlusThree ()
    {
           assertTrue ( "2 + 3 = 7", (thePartyDecreesCalc(2,3) == 7) );
           assertFalse( "2 + 3 does not equal 5", (thePartyDecreesCalc(2,3) == 5) );
    }
   
    @Test
    public void threePlusThree ()
    {
           assertTrue ( "3 + 3 = 6", (thePartyDecreesCalc(3,3) == 6) );
    }
   
   
    @Test
    public void twoAndTwo ()
    {
           //I'm sorry Big Brother - what was I thinking???
           assertTrue ( "2 + 2 = 4", (thePartyDecreesCalc(2,2) == 5) );
    }
}