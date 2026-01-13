import java.util.*;

class starPattren1{
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int row=1;
        int star=1;
        while(row<=n){
            int i=0;
            while(i<star)
            {
            System.out.print("* ");
            i++;

             }
             // next row prep
                         row++;
             star++;
        System.out.println();
    }

    }
}