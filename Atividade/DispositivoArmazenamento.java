public class DispositivoArmazenamento extends Modelo {
    private String capacidadeArmazenar;

    public DispositivoArmazenamento(String marca, String modelo, String capacidadeArmazenar) {
        super(marca, modelo);
        this.capacidadeArmazenar = capacidadeArmazenar;
    }

    public String getCapacidadeArmazenar() {
        return capacidadeArmazenar;
    }

    public void setCapacidadeArmazenar(String capacidadeArmazenar) {
        this.capacidadeArmazenar = capacidadeArmazenar;
    }

    @Override
    public String toString() {
        return "DispositivoArmazenamento [marca=" + marca + ", capacidadeArmazenar=" + capacidadeArmazenar + ", modelo="
                + modelo + "]";
    }
    
}
