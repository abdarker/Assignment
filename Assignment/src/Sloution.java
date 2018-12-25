import java.util.Scanner;

import static java.lang.System.*;
public class Sloution {
    public static void main(String[] args) {
        Scanner Input= new Scanner(System.in);
        Account a= new Account(Input.next(),Input.nextDouble(),Input.nextDouble(),Input.nextInt(),Input.next());

        out.println(a.calculatePrincipalWithSimpleInterest());
        out.println(a.calculatePrincipalWithCompoundInterest());
        a.withdrawMoney(Input.nextDouble());
        out.println(a.getCurrentBalance());
        a.changeEmail(Input.next());
        out.println(a.getEmail());

    }
}
