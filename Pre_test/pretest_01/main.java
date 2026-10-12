
class NegativeException extends Exception{

    NegativeException(String message) {
      super(message);
    }
}

class ToomanybooksException extends Exception{
    ToomanybooksException(String message){
        super(message);
    }
}


class LibraryAccount{

   static int counter;
   private int id;
   private String memberName;
   private int booksBorrowed;

    LibraryAccount(String memberNmae,int booksBorrowed) {
       this.memberName = memberNmae;
       this.booksBorrowed = booksBorrowed;
       counter++;
       this.id = counter;

    }

    LibraryAccount(String memberNmae) {
       this.memberName = memberNmae;
       this.booksBorrowed = 0;
       counter++;
       this.id = counter;
    }
   
    String getmemberName(){
        return this.memberName;
    }
    int getbooksBorrowed(){
        return this.booksBorrowed;
    }
    void setmemberName(String name){
       this.memberName = name;
    }


    @Override
   public String toString(){
       return "LibraryAccount " + this.id +  " , dell’utente " + this.memberName  + " , che ha in prestito " + this.booksBorrowed + " libri";
   }
    
   void borrow(int n) throws NegativeException{
    try{
        int[] check= new int[n];
    }catch(NegativeArraySizeException e){
      throw new NegativeException("the number cannot be negative");
    }
    this.booksBorrowed += n;
   }

   void returnBooks(int n) throws NegativeException,ToomanybooksException {
       try{
        int[] check= new int[n];
    }catch(NegativeArraySizeException e){
      throw new NegativeException("the number cannot be negative");
    }
    try {
         int[] check= new int[this.booksBorrowed-n];
    } catch (NegativeArraySizeException e) {
         throw new ToomanybooksException("the number of reduced cannot be more than tha book borrowed ! ");
    }
    this.booksBorrowed -=n;
   }

   static int getNumAccounts(){
     return counter;
   }

}

class LibraryAccountControlled extends LibraryAccount{
     private int maxBook;

    LibraryAccountControlled(String name,int maxBook) {
        super(name,maxBook);

    }
     
}


class main{
    public static void main(String[] args) {
     
    }
}