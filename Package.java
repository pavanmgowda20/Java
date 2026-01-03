package bank;

class Account{
    public String name;
    protected String email;
    private String password;

    //getter 
    public String getPassword(){
        return this.password;
    }

    //setter
    public void setPassword(String pass){
        this.password=pass;
    }
}
public class bank {
    public static void main(String args[]){
        Account account1=new Account();
        account1.name="apna College";
        account1.email="pavanmgowda20@gmail.com";
        account1.setPassword("abgd");
        System.out.println(account1.getPassword());
    }
}
