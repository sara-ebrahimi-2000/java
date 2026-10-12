
class BarAccount{
    static int counter = 0;

    private int id ;
    private String memberName;
    private int availableCoffees;

    BarAccount(String name,int coffee){
        this.memberName = name;
        this.availableCoffees = coffee;
        counter++;
        this.id = counter;
    }
     BarAccount(String name){
        this.memberName = name;
        this.availableCoffees = 0;
        counter++;
        this.id = counter;
    }

    String getMemberName(){
        return this.memberName;
    }
    int getAvailableCoffees(){
        return this.availableCoffees;
    }
    int getId(){
        return this.id;
    }


    void setMemberName(String name){
        this.memberName = name;
    }
    @Override
    public String toString(){
        return  " BarAccount " + this.id +
         ", dell'utente " +this.memberName + 
         " , che ha "+ this.availableCoffees + 
         " caffe disponibili sulla tessera";
    }

    void refill(int n){
        if(n >= 0) {
            this.availableCoffees += n;
        }else{
            System.out.println("The number cannot be negative");
        }
    }


    int consume(int n){
        if(n > this.availableCoffees){
           return -1;
        }else{
           return this.availableCoffees -= n;
        }
    }
    static int getNumAccounts(){
        return counter;
    }
}
class BarAccountLunch extends BarAccount{
    private int availableLunches;
    BarAccountLunch(String memberName,int availableCoffees,int availableLunches){
        super(memberName,availableCoffees);
        this.availableLunches = availableLunches;
    }

   int consumeLunches(int n){
    if(n > this.availableLunches){
       return -1;
    }else{
       return this.availableLunches -= n;
    }
   }

   void refillLunches(int n){
    this.availableLunches += n;
    if(n >= 10){
        super.refill(1);
    }
   }
    @Override
     public String toString(){
        return  "BarAccount" + super.getId() +
        ", dell'utente " + super.getMemberName() +
        ", che ha  "+ super.getAvailableCoffees()  +
       "caffe disponibili sulla tessera e " + this.availableLunches +
        "pranzi disponibili";
    }


    

}

class main{
    public static void main(String[] args) {


        
    }
}