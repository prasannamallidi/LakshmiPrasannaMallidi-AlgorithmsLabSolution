package Transaction;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java. util.Scanner;

class PayMoneyTargetAchievements
{
    static int calculateNoOfTransactions(LinkedList<Integer> transactionArr ,int numOfTransactionsLimit, int targetVlaueToBeAchieved )
    {
        int temp = 0, actualTransactions = 0;
        for(int i=0; i < numOfTransactionsLimit; i++)
        {
            temp +=  transactionArr.get(i);
            if(temp >= targetVlaueToBeAchieved){
                actualTransactions = i + 1;
                break;
            }
        }
        
        return actualTransactions;
    }
    
    
    
    public static void main(String[] args)
    {
        //Intialize variables
        int transactionArrSize, numOfTransactionsLimit, targetVlaueToBeAchieved, actualTransactions =0;
        LinkedList<Integer> transactionArr = new LinkedList<Integer>();
        //Intialize scanner 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of transaction array");
        transactionArrSize = sc.nextInt();
        
        //Take the transaction values array input
        System.out.println("Enter the values of array");
        for(int i=0; i< transactionArrSize; i++)
        {
            transactionArr.add(sc.nextInt());
        }
        
        System.out.println("Enter the total no of targets that needs to be achieved");
        numOfTransactionsLimit = sc.nextInt();
        
        do{
            System.out.println("\nEnter the value of target");
            targetVlaueToBeAchieved = sc.nextInt();

            if(numOfTransactionsLimit > transactionArr.size())
            {
                System.out.println("the target is not achievable");   
            }
            else 
            {
                actualTransactions = calculateNoOfTransactions(transactionArr, numOfTransactionsLimit, targetVlaueToBeAchieved);
                
                if(actualTransactions == 0)
                {
                    System.out.println("Given target is not achieved");
                    break;
                }
                else
                {
                    System.out.println("Target achieved after " + actualTransactions + " transactions");
                }
                if(actualTransactions == 0 || actualTransactions == 1)
                    actualTransactions = 0 ;
                
            }
        }while(actualTransactions != 0);
    }
}