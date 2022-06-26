import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * @author DHYEY DODIYA
 */
public class game {
     public static void main(String args[])
        {
            Random r=new Random();
            int r1=r.nextInt(100);
            System.out.println(r1);
            int score=100,chance=5;
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<chance;i++)
            {
                System.out.println("Enter your number ");
                int num=sc.nextInt();
                if(r1==num)
                {
                    System.out.println("Yeah! Your number is Matched with Generated number ");
                    System.out.print("Your guessing score is "+score+"%");
                    break;
                }
                else if(num<r1)
                {
                    score=score-20;
                    System.out.println("Your number is less than Generated Number! TRY AGAIN");
                }
                else if(num>r1)
                {
                    score=score-20;
                    System.out.println("Your number is More than Generated Number! TRY AGAIN");
                }
            }
        }
}
