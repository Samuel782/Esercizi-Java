package Televisore;

public class TV {

    private boolean acceso;
    private int canaleAttuale;
    private int volumeAttuale;
    private boolean mute;

    public TV() {
        this.acceso = false;
        this.canaleAttuale = 1;
        this.volumeAttuale = 1;
        this.mute = false;
    }

    public void pulsanteRosso() {
        this.acceso = !this.acceso;
    }

    public void impostaCanale(int number) {
        if (number < 100 && number > 0)
            this.canaleAttuale = number;
    }

    public void canaleSuccessivo() {
        if (this.canaleAttuale + 1 < 100)
            this.canaleAttuale++;
        else
            this.canaleAttuale = 1;
    }

    public void silenzioso() {
        this.mute = !this.mute;
    }

    public void AumentaVolume() {
        if (this.volumeAttuale + 1 < 10 && this.mute == false)
            this.volumeAttuale++;
    }

    public void AumentaVolumeDi(int value) {
        if (this.volumeAttuale + value < 10 && this.mute == false)
            this.volumeAttuale+=value;
    }

    public void AbassaVolume() {
        if (this.volumeAttuale - 1 > 0 && this.mute == false)
            this.volumeAttuale--;
    }
    public void AbassaVolumeDi(int value) {
        if (this.volumeAttuale - value > 0 && this.mute == false)
            this.volumeAttuale-=value;
    }

    public void StatoTV() {
        System.out.println("**********************\t");
        System.out.println("* Acceso: " + (this.acceso ? "ON" : "OFF") + " *\t");
        System.out.println("* Silezioso: " + (this.mute ? "ON" : "OFF") + " *\t");
        System.out.println("* Canale: " + this.canaleAttuale + " *\t");
        System.out.println("* Volume: " + this.volumeAttuale + " *\t");
        System.out.println("**********************\t");
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.err.println("Bye");        // close open files
        } finally {
            super.finalize();
        }
    }

}