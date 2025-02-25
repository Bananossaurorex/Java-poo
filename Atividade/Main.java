public class Main {
public static void main(String[] args) {
    System.out.println("ola");

    Processador processador = new Processador(null, null, 0.0);
    System.out.println(processador.toString());

    Memoria memoria = new Memoria(null, null, 0);
    System.out.println(memoria.toString());

    PlacaMae placaMae = new PlacaMae(null, null, null);
    System.out.println(placaMae.toString());

    DispositivoArmazenamento dispositivoArmazenamento = new DispositivoArmazenamento(null, null, null);
    System.out.println(dispositivoArmazenamento.toString());
}
}
