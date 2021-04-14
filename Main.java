package zumo;

/**
 * 
 * @author David
 */
public class Main {

    public static void main(String[] args) {
        Zumo unDeposito;
        int relleno;
        /*Creacion de un depósito con zumo de pomelo,
        inicialmente contiene 20 litros,
        su capacidad máxima es de el precio del litro es 2€*/
        unDeposito= new Zumo(20,2,"Pomelo",40);
        
        acciones_Zumo(unDeposito, 1.0);
        relleno=unDeposito.obtenerLitros();
        System.out.println("El depósito contiene "+relleno+" litros");
    }   

    public static void acciones_Zumo(Zumo unDeposito, double peso) {
        try{
            System.out.println("Vamos a tomar zumo");
            unDeposito.sacarZumo(5, 20);//Se intentan comprar 5 litros de zumo con 20€
        }catch(Exception e) {
            System.out.println("Error al sacar el zumo");
        }
        try {
            System.out.println("Rellenando depósito");
            unDeposito.rellenar(30);//Se intenta rellenar el depósito añadiendo 30 litros
        }catch (Exception e){
            System.out.println("Fallo al rellenar el depósito");
        }
    }   
}
