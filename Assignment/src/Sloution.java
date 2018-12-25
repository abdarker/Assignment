import java.util.Scanner;

import static java.lang.System.*;
public class Sloution {
    public static void main(String[] args) {
        Scanner Input= new Scanner(System.in);
        Account a= new Account(Input.next(),Input.nextDouble(),Input.nextDouble(),Input.nextInt(),Input.next());
        double amount= Input.nextDouble();
        a.changeEmail(Input.next());
        out.println(a.calculatePrincipalWithSimpleInterest());
        out.println(a.calculatePrincipalWithCompoundInterest());

        a.withdrawMoney(amount);
        out.println(a.getCurrentBalance());

        out.println(a.getEmail());

    }
}
