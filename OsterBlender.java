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
 * Clase que implementa la interfaz IBlender.
 * Establecer las caracteristicas de una licuadora y las acciones que puede realizar mediante la interfaz IBlender.
 */
public class OsterBlender implements IBlender{
    // La velocidad actual de la licuadora.
    private int velocidad;
    // Indica si la licuadora está llena o vacía.
    private boolean lleno;


    /**
     * Constructor para crear una licuadora con velocidad inicial y estado lleno/vacío.
     *
     * @param velocidad La velocidad con la que empieza la licuadora.
     * @param lleno True si la licuadora está llena, false si está vacía.
     */
    public OsterBlender(int velocidad, boolean lleno) {
        this.velocidad = velocidad;
        this.lleno = lleno;
    }

    /**
     * Métodos para cambiar y obtener la velocidad y el estado de la licuadora.
     * - Los setters permiten cambiar la velocidad o el estado lleno/vacío.
     * - Los getters devuelven el valor actual de la velocidad o si está llena.
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
     * 
     * @return true si la licuadora esta llena, false si esta vacia.
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
     * 
     * @return la velocidad de la licuadora en numero entero
     */
    @Override
    public int GetSpeed(){
        return velocidad;
    }
    
}
