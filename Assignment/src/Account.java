import static java.lang.System.*;

public class Account {
    private String name;
    private double Principal;
    private double Rate;
    private int Year;
    private String Email;

    //setter and getter mathods//

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrincipal() {
        return Principal;
    }

    public void setPrincipal(double principal) {
        Principal = principal;
    }

    public double getRate() {
        return Rate;
    }

    public void setRate(double rate) {
        Rate = rate;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    //all methods starts//

    double calculatePrincipalWithSimpleInterest(){
        return Principal*(1+((Rate/100)*Year));

    }

    double calculatePrincipalWithCompoundInterest(){

        return Principal* (Math.pow((1+Rate),Year));

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
}
