public class Baralla {

 //METODOS

    public void  generarCartas(){
        for (int i=0;i<Carta.coll.length;i++){
            System.out.println(Carta.coll[i]);
            for (int j=0;j<Carta.numeros.length;j++){
                System.out.println(Carta.numeros[j]);
            }
        }
    }
}