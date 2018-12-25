import static java.lang.System.*;

public class Account {

    private String name;
    private double Principal;
    private double Rate;
    private int Year;
    private String Email;

    public Account(String name,double Principal,double Rate,int Year,String Email){
        this.name= name;
        this.Principal=Principal;
        this.Rate= Rate;
        this.Year=Year;
        this.Email=Email;

    }


    //all methods starts//

    double calculatePrincipalWithSimpleInterest(){
        return Principal*(1+((Rate/100)*Year));

    }

    double calculatePrincipalWithCompoundInterest(){

        return Principal* (Math.pow((1+(Rate/100)),Year));

    }

   void withdrawMoney(double amount){

        if(amount>Principal){
            out.println("Not Possible");
        }
        else if(amount<Principal) {
            out.println("Possible");
            Principal -= amount;
        }

    }
    double getCurrentBalance(){
        return Principal;

    }

    void changeEmail(String newEmail){
        Email= newEmail;
    }

    public String getEmail() {
        return Email;
    }
}
