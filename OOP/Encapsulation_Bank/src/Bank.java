class Bank{
    private String accountHolder;
    private double balance;
    
    public void setaccountHolder(String name){
        accountHolder = name;
    }
    public void setbalance(double amount){
        balance = amount;
    }
    public String getaccountHolder(){
        return accountHolder;

    }
    public double getbalance(){
        return balance;
    }
 
}