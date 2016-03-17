/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prime;
import java.util.Scanner;
/**
 *
 * @author Durga
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int from,to,i,count=0,count1=0;
        System.out.print("Enter Range of no.: ");
        Scanner s=new Scanner(System.in);
        from=s.nextInt();
        System.out.print(" - ");
        Scanner s1=new Scanner(System.in);
        to=s1.nextInt();
        
        for(i=from;i<=to;i++)
        {
            if(i==1)
            {
                System.out.println("Prime No. "+i);
            }
            else {
                for(int j=1;j<=i/2;j++)
                {
                    if(i%j==0)
                        count++;
                }
                if(count==1){
                    System.out.println("No is Prime "+i);
                    count1++;
                }
                count=0;
            }
        }
        
        if(count1==0)
            System.out.println("No prime numbers");
        
    }
    
}
