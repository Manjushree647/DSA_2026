package pattern_2026;

public class patternStar3 {
    public static void main(String[] args) {
        int n=3;
        int row=1;
        int star=(n*2)-1;
        int space=0;
        while (row<=n) 
        {
            int s=0;
            while (s<space) {
                System.out.print(" ");
                
                s++;
            }
            int i=0;
            while (i<star) {
                System.out.print("*");
                i++; 
            }
            star-=2;
            space++;
            row++;
            System.out.println();
            
        }
    }
    
}
