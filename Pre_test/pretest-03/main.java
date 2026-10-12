class GameAccount{
    static int contatore = 0;
    private int id;
    private String nomeGiocatore;
    private int punteggio;
    GameAccount(String name,int point){
        this.nomeGiocatore = name;
        this.punteggio = point;
        contatore++;
        this.id = contatore;
    }
      GameAccount(String name){
        this.nomeGiocatore = name;
        this.punteggio = 0;  
        contatore++;
        this.id = contatore;
    }
    String getnomeGiocatore(){
        return this.nomeGiocatore;
    }
    int getpunteggio(){
        return this.punteggio;
    }
    void setnomeGiocatore(String name){
        this.nomeGiocatore = name;
    }

    public String toString(){
        return "GameAccount[id= "+ this.id +  
        " nomeGiocatore = " + this.nomeGiocatore +
          " , punteggio= " + this.punteggio + "]";
    }
    void guadagnaPunti(int p){
        if(p >= 0){
            this.punteggio += p;
        }else{
            System.out.println("The number cannot be negative");
        }
    }
    void spendiPunti(int p){
        if(p >= 0 && p <= this.punteggio){
            this.punteggio -= p;
        }else if(p < 0){
          System.out.println("the number cannot be negative");;
        }else{
            System.out.println("Errore: non hai punti sufficienti.");
        }
    }

    static int getNumeroAccount(){
        return contatore;
    }


}

class GameAccountYoung extends GameAccount{
    int limiteSpesa;

    GameAccountYoung(String name,int point,int limit) {
        super(name,point);
        this.limiteSpesa = limit;
    }

    GameAccountYoung(String name,int limit) {
        super(name);
        this.limiteSpesa = limit;
    }
    void spendiPunti(int p){
     if(p > limiteSpesa){
        int differenc = p - limiteSpesa;
        System.out.println("Spesa oltre il limite consentito di " + differenc + " punti");
     }else{
        super.spendiPunti(p);
     }
    }


}


class main{
    public static void main(String[] args) {
        GameAccountYoung n1 = new  GameAccountYoung("sara",15,200);
        n1.spendiPunti(400);
        System.out.println(n1);
        
    }
}