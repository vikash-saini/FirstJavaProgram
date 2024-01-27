package Bank;

class Account{
    public String name;
    protected String email;
    private int Salary;

    public int getSalary(){
        return this.Salary;
    }

    public void setSalary(int Salary){
        this.Salary= Salary;
    }
}
public class Bank {
    private static String name;


    public static void main(String[] args) {


        Account b = new Account();
        b.name ="vikas";
        b.email="sainivikas358@gmail.com";
//        b.Salary=10000;

        b.setSalary(10000);
        b.getSalary();
        System.out.println("user Salary: "+b.getSalary());

    }

    public void setBankName(String bnkName){
        name = bnkName;
    }

    public String getBankName(){
        return name;
    }

}
