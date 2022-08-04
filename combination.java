import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        int i, n, r, c, tn=1, tr=1, tnr=1;
        
        System.out.println("C(n,r) = n!/(r!*(n-r)!)");
        
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        n= input.nextInt();
        System.out.print("r = ");
        r= input.nextInt();
        
        for (i=1; i<=n; i++){
            tn = tn*i;
        }
        
        for (i=1; i<=r; i++){
            tr = tr*i;
        }
        
        for (i=1; i<=(n-r); i++){
            tnr = tnr*i;
        }
        
        c = tn / (tr*tnr);
        System.out.println("C("+n+","+r+") = "+c);
    }

}
