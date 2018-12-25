import java.util.Scanner;

import static java.lang.System.*;
public class Sloution {
    public static void main(String[] args) {
        Account a= new Account();
        Scanner Input= new Scanner(System.in);
        a.setName(Input.next());
        a.setPrincipal(Input.nextDouble());
        a.setRate(Input.nextDouble());
        a.setYear(Input.nextInt());
        a.setEmail(Input.next());
        a.withdrawMoney(Input.nextDouble());
        a.changeEmail(Input.next());

        out.println(a.calculatePrincipalWithSimpleInterest());
        out.println(a.calculatePrincipalWithCompoundInterest());
        //out.println(a.withdrawMoney());
        out.println(a.getCurrentBalance());
        out.println(a.getEmail());
    }
}
