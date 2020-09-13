import java.util.*;

public class seriefibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int lim; 
        int i = 1;

        System.out.println("Ingrese la cantidad de iteraciones para la serie fubonacci");
        lim = sc.nextInt();
        sc.close();
        System.out.println("\n" + n1 + "\n" + n2);
        do
        {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2; n2 = n3;
            i++;
        } while(i<=lim);
    }
}
