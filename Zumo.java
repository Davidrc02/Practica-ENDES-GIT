
package zumo;

public class Zumo {

    Zumo(int i, int i0, String pomelo, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the litros
     */
    public int obtenerLitros() {
        return litros;
    }

    /**
     * @param litros the litros to set
     */
    public void setLitros(int litros) {
        this.litros = litros;
    }

    /**
     * @return the precio_litros
     */
    public int getPrecio_litros() {
        return precio_litros;
    }

    /**
     * @param precio_litros the precio_litros to set
     */
    public void setPrecio_litros(int precio_litros) {
        this.precio_litros = precio_litros;
    }

    /**
     * @return the sabor
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * @param sabor the sabor to set
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    /**
     * @return the litros_max
     */
    public int getLitros_max() {
        return litros_max;
    }

    /**
     * @param litros_max the litros_max to set
     */
    public void setLitros_max(int litros_max) {
        this.litros_max = litros_max;
    }
    private int litros;//contenido actual del deposito de zumo.
    private int precio_litros;
    private String sabor;
    private int litros_max;//capacidad máxima del depósito.
    
    /*Constructor por defecto*/
    public Zumo(){
    }

    /*Método que permite rellenar el depósito de zumo
    siempre y cuando la capacidad no se sobrepase. 
    Este método será probado con JUnit.*/
    public void rellenar(int litros) throws Exception{
        if((this.obtenerLitros()+litros)>this.getLitros_max())
        {throw new Exception("No se puede sobrepasar la capacidad del depósito");}
        this.setLitros(this.obtenerLitros() - litros);
    }


    public void sacarZumo(int i, int i0) {
        
    }
}