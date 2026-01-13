import java.util.*;

class dimonadpattern
{
    public static void main(String args[])
    {
        //declare things ..! 
        int row=1;
        int num=3;
        int space=num-1;
        int star=1;

        //while loop
        while(row<=num*2-1)
        {
            //loop space
            int i=0;
            while(i<space)
            {
                System.out.print("  ");
                i++;
            }

            //loop star
            int j=0;
            while(j<star)
            {
                System.out.print("* ");
                j++;
            }

            if(row<num)
            {
                space--;
                star+=2;
            }
            else
            {
                space++;
                star-=2;
            }
        }
    }
}