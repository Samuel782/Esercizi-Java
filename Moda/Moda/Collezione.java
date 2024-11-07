package Moda;

public class Collezione {
    private String nome;
    private Capo[] capiCollezione;

    private final int maxCapi = 50;
    private int nCapiInseriti;

    public Collezione(String nome){
        this.nome = nome; 
        capiCollezione = new Capo[maxCapi];
        nCapiInseriti = 0;
    }


    public boolean add(Capo capoDaAggiungere){
        if(nCapiInseriti<maxCapi){
            this.capiCollezione[nCapiInseriti] = capoDaAggiungere;
            nCapiInseriti++;
            return true;
        }else{
            return false;
        }
    }

    public String getCapiPerColore(Colore colore){
        String retValue = "";
        for(int i=0; i<nCapiInseriti; i++){
            if(this.capiCollezione[i].getColore() == colore){
                retValue += capiCollezione[i] + "; ";
            }
        }
        if(retValue == "") retValue= "Nessun Capo trovato per quel colore";
        return retValue;
    }
    
    public String getCapiPerMateriale(Materiale materiale){
        String retValue = "";
        for(int i=0; i<nCapiInseriti; i++){
            if(capiCollezione[i].getMateriale() == materiale){
                retValue += capiCollezione[i] + "; ";
            }
        }
        if(retValue == "") retValue= "Nessun Capo trovato per quel materiale";
        return retValue;
    }

    public String getCapiPerModello(Modello modello){
        String retValue = "";
        for(int i=0; i<nCapiInseriti; i++){
            if(capiCollezione[i].getModello() == modello){
                retValue += capiCollezione[i] + "; ";
            }
        }
        if(retValue == "") retValue= "Nessun Capo trovato per quel modello";
        return retValue;
    }

    public String getCapiPerPrezzo(double min, double max){
        String retValue = "";
        for(int i=0; i<nCapiInseriti; i++){
            if(capiCollezione[i].prezzo()<max && capiCollezione[i].prezzo()>min){
                retValue += capiCollezione[i] + "; ";
            }
        }
        if(retValue == "") retValue= "Nessun Capo trovato per quel range di prezzo";
        return retValue;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}


