public class Nombre {

    //ATRIBUTOS
    private int numero;
    private String numeroRomano;

    //CONSTRUCTOR

    public Nombre(int numero, String numeroRomano){
    this.numero = numero;
    this.numeroRomano = numeroRomano;
    }
    //MÉTODOS

    private String hex(int y){
        return Integer.toHexString(y);
    }
    private String bin(int x){
        return Integer.toBinaryString(x);
    }
}