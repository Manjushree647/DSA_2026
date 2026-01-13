package pattern_2026;

public class OpenBoxPattern {
    //decalre all waht you want

 public static void main(String[] args) {
       int n=5;
    int row=1;//1 to n 
    int star1=1;//1 to 5
    int star2=1;//1 to 5
    int space=(n+2);//dec
    while(row<=n)
    {
        //star1 
        int s1=0;
        while (s1<star1) {
            System.out.print("* ");
            s1++;
        }
        //space dec by2 
        int sp=0;
        while(sp<space)
        {
            System.out.print("  ");
            sp++;
        }
        //star2
        int s2=0;
        while (s2<star2) {
            System.out.print("* ");
            s2++;
        }
        //next row prep
        star1++;
        space-=2;
        star2++;
        row++;
        System.out.println();
        
    }
    
 }
}
