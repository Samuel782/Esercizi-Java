package GestioneAuto; 

public class Auto {
    //attributi - o variabili di istanza 
    String targa; 
    String telaio;
    int velocitàMax;
    double capacitàSerbatoio; 
    double litriAttuali;
    boolean isAccesa; 

    //metodi (funzuiona)
    
    public void accedi(){
        isAccesa=true;
    }
    public void faiRifornimento(double litri){  //aumenta i litri attuali di una certa quantità
        litriAttuali += litri; 
    }
        
}