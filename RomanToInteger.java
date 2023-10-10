
package com.exe.java;

import java.util.Scanner;

/**
 *
 * @author Shasawat mishra
 */
public class RomanToInteger {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Roman number: ");
        String RomanNum=sc.nextLine().toUpperCase();
        int result=romanToInteger(RomanNum);
        System.out.println("Integer Equivalent to: "+result);
        sc.close();
    }
    public static int romanToInteger(String num)
    {
        int result=0;
        int prevalue=0;
        int len=num.length()-1;
        for(int i=len;i>=0;i--)
        {
            char currentChar=num.charAt(i);
            int currentValue=getRomanValue(currentChar);
                    
                    if(currentValue<prevalue)
                    {
                        result-=currentValue;
                    }else{
                        result+=currentValue;
                    }
                    prevalue=currentValue;
            
            
        }
        return result;
    }
    public static int getRomanValue(char c)
    {
        switch(c)
        {
            case 'I': return 1;
            case 'V':return 5;
            case 'X': return 10;
            case 'L':return 50;
            case 'C':return 500;
            case 'M':return 1000;
            default : return 0;
        }
    }
    
}
