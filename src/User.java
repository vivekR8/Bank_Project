
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/*
 * Login
 * *    ---prints balance, account number ,branch code
 * * 	Deposit Amount
 * * 	Withdraw Amount
 * * 	Money Transfer
 * * 	Mini Statement
 * View Balance
 * *	---prints balance
 * OpenAccount
 * *    ---Ask for necessary details
 */



//public class User {
//    static boolean Login(List<Customer> c,String Acc,String password)
//    {
//        boolean ch=false;
//        if(c.stream().anyMatch(u->((u.getAccno()).equals(Acc))&&u.getpassword().equals(password)))
//        {
//
//        }
//        return ch;
//    }
//
//    public static void main(String[] args) {
//        
//        Scanner sc= new Scanner(System.in);
//        List<Customer> accounts=new ArrayList<Customer>();
//        String accno,password;
//        int j=101;
//        Boolean z;
//        Customer c;
//        while(true)
//        {
//            System.out.println("1)Login \n2)Create Account\n3)Quick Balance Check\n4)Exit");
//            int i=sc.nextInt();
//            sc.nextLine();
//            switch(i)
//            {
//                case 1:
//                    System.out.print("Enter your Account Number:");
//                    accno=sc.nextLine();
//                    System.out.print("Enter passwordword:");
//                    password=sc.nextLine();
//                    System.out.println(accounts.get(0).getAccno());
//                    z=Login(accounts,accno,password);
//                    if(z==false)
//                        System.out.println("Wrong Credentials");
//
//                    break;
//                case 2:
//                    c=new Customer();
//                    c.createAcc();
//                    accounts.add(c);
//                    c.setAccno("SBI0023"+String.valueOf(j));
//                    c.setBranch("SBI0023");
//                    break;
//            }
//            j++;
//        }
//    }
//}

public class User
{
    private String firstName,middleName,lastName,email,password,pan;
    List <String> account_no_List= new ArrayList<>();
    public int balance;
    public String getfirstName() {
        return firstName;
    }
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getmiddleName() {
        return middleName;
    }
    public void setmiddleName(String middleName) {
        this.middleName = middleName;
    }
    public String getlastName() {
        return lastName;
    }
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getpassword() {
        return password;
    }
    public void setpassword(String password) {
        this.password = password;
    }
    public String getPan() {
        return pan;
    }
    public void setPan(String pan) {
        this.pan = pan;
    }
    
    public long getMobile() {
        return mobile;
    }
    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
    private long mobile;
    public void createUser()
    {
        boolean b;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter First Name:");
            this.firstName=sc.nextLine();
            b=Pattern.matches("[A-Za-z]+",firstName);
            if(!b)
                System.out.println("Only alphabets are allowed");
        }while(!b);
		do{
			System.out.print("Enter Middle Name(If Any):");
			this.middleName=sc.nextLine();
			b=Pattern.matches("[A-Za-z]*",middleName);
			if(!b)
				System.out.println("Only alphabets are allowed");
		}while(!b);
		do{
			System.out.print("Enter Last Name:");
			this.lastName=sc.nextLine();
			b=Pattern.matches("[A-Za-z]+",lastName);
			if(!b)
				System.out.println("Only alphabets are allowed");
		}while(!b);
		do{
			System.out.print("Enter Email Id:");
			this.email=sc.nextLine();
			b=Pattern.matches("^[A-za-z0-9_.]*@[A-Za-z]+.[A-Za-z]{2,4}$",email);
			if(!b)
				System.out.println("Only alphabets are allowed");
		}while(!b);
		do{
			System.out.print("Enter Phone Number:");
			this.mobile=Long.parseLong(sc.nextLine());
			b=Pattern.matches("^[7-9]{1}[0-9]{9}$",String.valueOf(mobile));
			if(!b)
				System.out.println("Only alphabets are allowed");
		}while(!b);
		do{
			System.out.print("Enter your PAN Number:");
			this.pan=sc.nextLine();
			b=Pattern.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}$",pan);
			if(!b)
				System.out.println("Only alphabets are allowed");
		}while(!b);
        do{
            System.out.print("Enter your passwordword:");
            this.password=sc.nextLine();
            b=Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$",password);
            if(!b)
                System.out.println("Atleast one uppercase,lowercase,number,special character required");
        }while(!b);
        System.out.println("------------Creating User------------");
    }
}


