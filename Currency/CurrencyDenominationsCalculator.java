package Currency;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;

class CurrencyDenominationsCalculator
{
    public static void main(String[] args)
    {
        //Intialize variables
        int currencyArrSize, amountToBePaid;
        LinkedList<Integer> currencyDenominations = new LinkedList<Integer>();
        
        //Intialize scanner
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of currency denominations");
        currencyArrSize = sc.nextInt();
        
        System.out.println("Enter the currency denominations value");
        for(int i=0; i< currencyArrSize ; i++)
        {
            currencyDenominations.add(sc.nextInt());    
        }
        Collections.sort(currencyDenominations, Comparator.reverseOrder());
        
        
        System.out.println("Enter the amount you want to pay");
        amountToBePaid = sc.nextInt();
        
        calculateDenominations(currencyDenominations, amountToBePaid);
    }
    
    static void calculateDenominations(LinkedList<Integer> currencyDenominations, int amountToBePaid)
    {
        int noOfCurrencyDenominationsAvailable = currencyDenominations.size();
        for(int i=0; i< noOfCurrencyDenominationsAvailable ; i++)
        {
            int currencyNoteCounter = 0;
            if(amountToBePaid >= currencyDenominations.get(i))
            {
                currencyNoteCounter = amountToBePaid / currencyDenominations.get(i);
                amountToBePaid = amountToBePaid - currencyNoteCounter * currencyDenominations.get(i); 
                if(currencyNoteCounter > 0)
                    System.out.println(currencyDenominations.get(i)+ " : " + currencyNoteCounter);    
            }
        }
        
    }
}