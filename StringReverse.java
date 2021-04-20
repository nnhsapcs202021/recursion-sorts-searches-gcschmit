
/**
 * Write a description of class StringReverse here.
 *
 * @author gcschmit
 * @version 20 April 2021
 */
public class StringReverse
{
    public static String reverse(String str)
    {
        // must have a terminating case
        if(str.equals(""))
        {
            return str;
        }
        
        String firstChar = str.substring(0, 1);
        String restOfString = str.substring(1);
        
        // recurse - caall this method with the simplier problem
        String restOfStringReversed = reverse(restOfString);
        
        String strReversed = restOfStringReversed + firstChar;
        return strReversed;
    }
    
    public static String reverseIter(String str)
    {
        String strReversed = "";
        
        for(int i = 0; i < str.length(); i++)
        {
            strReversed = str.substring(i, i + 1) + strReversed;
        }
        
        return strReversed;
    }
    
    
}
