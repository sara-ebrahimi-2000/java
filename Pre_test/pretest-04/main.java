abstract class Account{
    static int contatore = 0;
    private int id;
    private String nomeIscritto;
    private int crediti;
    Account(String nomeIscritto,int crediti){
        this.nomeIscritto = nomeIscritto;
        this.crediti = crediti;
        contatore++;
        this.id = contatore;
    }
    Account(String nomeIscritto){
        this.nomeIscritto = nomeIscritto;
        this.crediti = 0;
        contatore++;
        this.id = contatore;
    }
    String getNomeIscritto(){
        return this.nomeIscritto;
    }
    int getCrediti(){
        return this.crediti;
    }
    void setNomeIscritto(String nomeIscritto){
        this.nomeIscritto = nomeIscritto;
    }
    void setCredit(int n){
        this.crediti = n;
    }

    int getId(){
        return this.id;
    }

    @Override
    public String toString(){
       return "Account [id="+this.id+", nomeIscritto="+this.nomeIscritto+ "crediti="+this.crediti+"]";
    }
    void aggiungiCrediti(int c){
        this.crediti += c;
    }
    void usaCrediti(int c){
        if(c <= this.crediti){
            this.crediti -= c;
        }else{
            System.out.println("Credito insufficiente");
        }
    }
    static int getNumeroAccount(){
        return contatore;
    }

    abstract void azzerareCrediti();
    abstract boolean  superatoSoglia(int soglia);

}
class GymAccount extends Account{

    GymAccount(String name,int crediti){
       super(name,crediti);
    }
    GymAccount(String name){
        super(name);
    }

    void azzerareCrediti(){
       super.setCredit(0);
    }
    boolean  superatoSoglia(int soglia){
     if(super.getCrediti() > soglia){
       return true;
     }else{
       return false;
     }
    }

    @Override
    public String toString(){
       return "Gym account [id= "+super.getId()+", nomeIscritto="+super.getNomeIscritto()+" crediti="+this.getCrediti()+"]";
    }


}

class main{
    public static void main(String[] args) {
        
    }
}