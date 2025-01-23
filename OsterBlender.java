/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Seccion 31
 * Hoja de Trabajo No.1
 * Integrantes:
 * Biancka Raxón 24960
 * Diana Sosa 241040
 * Ivana Figueroa 24785
 * 
 * 
 * Clase: OsterBlender
 * Clase que implementa la interfaz IBlender y representa una licuadora de marca Oster.
 */
public class OsterBlender implements IBlender{

    private int velocidad;
    private boolean lleno;

    /**
     * Constructor para inicializar la licuadora con una determinada velocidad y estado de llenado.
     * 
     * @param velocidad  velocidad que tiene la licuadora al encenderse.
     * @param lleno estado inical de llenado en el que se encuentra la licuadora al encenderse (true si está llena, false si está vacía).
     */
    public OsterBlender(int velocidad, boolean lleno) {
        this.velocidad = 0;
        this.lleno = false;
    }

    /**
     * Establece la velocidad de la licuadora.
     * 
     */
    public void setVelocidad(int velocidad) { this.velocidad = velocidad;}
    

    /**
     * Establece el estado de llenado en el que se encuentra la licuadora.
     * 
     */
    public void setLleno(boolean lleno) { this.lleno = lleno;}

    /**
     * Obtiene la velocidad actual de la licuadora.
     * 
     */
    public int getVelocidad() { return this.velocidad; }

    /**
     * Obtiene el estado de llenado de la licuadora.
     * 
     */
    public boolean getLleno() { return this.lleno; }

    /**
     * Aumentar velocidad de licuadora.
     */
    @Override
    public void SpeedUp(){
        velocidad++;
    }
    /**
     * Verificar estado de la licuadora lleno/vacio.
     */
    @Override
    public boolean IsFull(){
        return lleno;
    }
    /**
     * Accion de llenar la licuadora
     */
    @Override
    public void Fill(){
        lleno = true;
    }
    /**
     * Accion de vaciar la licuadora
     */
    @Override
    public void Empty(){
        lleno=false;
    }
    /**
     * Aumentar velocidad de licuadora.
     */
    @Override
    public void SpeedDown (){
        velocidad--;
    }
    /**
     * Accion de verificar velocidad de la licuadora
     */
    @Override
    public int GetSpeed(){
        return velocidad;
    }
    
}
