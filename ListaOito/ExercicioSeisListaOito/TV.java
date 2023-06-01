package ExercicioSeisListaOito;

public class TV {
    
    private int canal = 1;
    private int volume = 100;

    public int getCanal() { 
        return canal;
    }
    public void setCanal(int canal) {
        if (canal >= 1 && canal <= 100) {
            this.canal = canal;
        } else {
            System.out.println("Canal inválido.");
        }
        this.canal = canal;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    
    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        } else {
            System.out.println("Volume máximo alcançado.");
        }
    }
    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Volume mínimo alcançado.");
        }
    }
}

