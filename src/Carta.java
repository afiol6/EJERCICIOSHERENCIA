public class Carta {

    //ATRIBUTOS

    public static String [] coll= {"oros","copes","espases","bastos"};
    public static int [] numeros = {1,2,3,4,5,6,7,8,9,10,11,12};

    //CONSTRUCTOR
public Carta (String coll[], int numeros[]){
    this.coll = coll;
    this.numeros = numeros;
    }

    public String[] getColl() {
        return coll;
    }

    public void setColl(String coll[]) {
        this.coll = coll;
    }

    public int[] getNumeros() {
        return numeros;
    }

}
