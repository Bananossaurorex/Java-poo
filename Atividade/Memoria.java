public class Memoria extends Modelo {
    private float capacidadeArmazenamento;

    public Memoria(String marca, String modelo, float capacidadeArmazenamento) {
        super(marca, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public float getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(float capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    @Override
    public String toString() {
        return "Memoria [marca=" + marca + ", capacidadeArmazenamento=" + capacidadeArmazenamento + ", modelo=" + modelo
                + "]";
    }

    
}
