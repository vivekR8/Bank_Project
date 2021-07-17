public class CreateAccount {
    private String account_id;
    private String account_Holder_name;
    private Integer account_balance;
    private String account_type;
    private String branch_code;
   private static Integer add_id=100;

    public CreateAccount(String account_Holder_name, Integer account_balance, String account_type) {
        this.account_id = this.createId();
        this.account_Holder_name = account_Holder_name;
        this.account_balance = account_balance;
        this.account_type = account_type;
    }
    private String createId(){
        return ("JPMC00"+add_id++);
    }
    public String getAccount_id() {
        return account_id;
    }

    public String getAccount_Holder_name() {
        return account_Holder_name;
    }

    public Integer getAccount_balance() {
        return account_balance;
    }

    public String getAccount_type() {
        return account_type;
    }

}
