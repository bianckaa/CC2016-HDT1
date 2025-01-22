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
 */
public class OsterBlender implements IBlender{

    private int velocidad;
    private boolean lleno;

    public OsterBlender(int velocidad, boolean lleno) {
        this.velocidad = 0;
        this.lleno = false;
    }

    public void setVelocidad(int velocidad) { this.velocidad = velocidad;}
    
    public void setLleno(boolean lleno) { this.lleno = lleno;}

    public int getVelocidad() { return this.velocidad; }

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
