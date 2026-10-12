class Card  {
    static int counter=0;
   private int id;
   private  String name;
   private int point;

    Card(String name,int point){
        this.name =name;
        this.point = point;
        counter++;
        this.id = counter;
    }
     Card(String name){
        this.name =name;
        this.point = 0;
        counter++;
        this.id = counter;
    }
    String getName(){
        return name;
    }
    int getId(){
        return id;
    }
    int getPoint(){
       return point;
    }
    void setName(String name){
        this.name = name;
    }

   void add(int n){
        if(n > 0){
            this.point += n;
        }else{
            System.out.println("Error The number is Negetive");
        }
    }
    void decrease(int n){
        if(n <= this.point){
            this.point -= n;
        }else{
            System.out.println(n - this.point+" are missing");
        }
    }

    static int getNumeroCard(){
        return counter;
    }
    @Override
    public String toString(){
     return "Card [id=" + this.id + ", name=" + this.name + ", points=" + this.point + "]";

    }


}
interface AdvancedPointFeatures {
    void resetPoints();
    boolean hasReachedThreshold(int threshold);
}

class CustomerCard extends Card implements AdvancedPointFeatures {
      CustomerCard(String name,int point){
        super(name,point);
      }
    @Override
     public void resetPoints(){
      decrease(super.getPoint());
     }
    @Override
    public boolean hasReachedThreshold(int threshold){
        if(super.getPoint() >= threshold ){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString(){
     return "costumerCard [id=" + super.getId() + ", name=" + this.getName() + ", points=" + super.getPoint() + "]";

    }

   
}

class main{
    public static void main(String[] args) {
        
    }
}