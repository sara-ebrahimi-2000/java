class BankAccount{
    static int counter = 0;

    private int id;
    private String name;
    private double balance;

    BankAccount(String name,double  total){
        this.name = name;
        this.balance = total;
        counter++;
        this.id = counter;
    }
     
    
    BankAccount(String name){
        this.name = name;
        this.balance = 0;
        counter++;
        this.id = counter;
    }

    String getName(){
        return this.name;
    }
    double getBalance(){
        return this.balance;
    }
    void setName(String name){
        this.name = name;
    }
    @Override
    public String toString(){
      return "[id = "+ this.id + " name =  " +  this.name +" balance =  "+this.balance;
    }

    void deposit(double  n){
        if(n > 0){
        this.balance += n;}
        else{ System.out.println("the deposite canote be negative !");}
    }
    void withdraw(double n){
        if(n <= this.balance && n  > 0 ){
            this.balance -= n;
        }else{
            System.out.println("Insufficient money.");
        }
        
    }

    static int getNumAccounts(){
        return counter;
    }
   
    public boolean equals(Object obj){
     if(this == obj) return true;
     if (obj == null || getClass() != obj.getClass())  return false;
     BankAccount other = (BankAccount) obj;
     return this.id == other.id;
     
    }




  


   

}

 class  BankAccountYoung extends BankAccount {

    private double limit;

    public BankAccountYoung(String name,double total,double limit) {
        super(name,total);
        this.limit = limit;
    }
    public BankAccountYoung(String name,double limit){
        super(name);
        this.limit = limit;
    }

    @Override
    public void withdraw(double n){
        if(n > 0 && n <= limit && n <= getBalance()){
            super.withdraw(n);
        }else if(n >= limit){
            System.out.println(" the withdraw is bigger than the limit ! ");
        }else{
            System.out.println("insufficient");
        }

    }
    public  String toString(){
        return "the Young acount " + super.toString();
    }

}


class main{
    public static void main(String[] args) {
    BankAccount a1 = new BankAccount("sara");
    BankAccountYoung a2 = new BankAccountYoung("sima",200,100);
    a2.withdraw(80);
    System.out.println(a1);
    System.out.println(a2);
       
    }
}