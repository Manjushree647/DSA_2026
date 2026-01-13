import java.util.*;


class DimodPattern{
    public static void main(String args[]){
        int n=3;
        int space=2;
        int star=1;
        int row=1;
        while(row<(n*2)-1){
            int s=0;
            while(s<space){
                System.out.print(" ");
                s++;
            }
            int i=0;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            if(star<=5)
            {
                row++;
                star+=2;
                space++;
                 System.out.println("");

            }
            else{
                row++;
                space++;
                star-=2;
                System.out.println("");

            }
        }
    }
}