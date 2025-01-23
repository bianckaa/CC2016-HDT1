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
 * Clase: IBlender
 * Interfaz que define los métodos básicos que deben implementar todas las marcas de licuadora.
 */
public interface IBlender  {
    /**
     * Aumenta la velocidad de la licuadora.
     */
    void SpeedUp();

    /**
     * Verifica si la licuadora está llena.
     * 
     */
    boolean IsFull();

    /**
     * Llena la licuadora con ingredientes.
     */
    void Fill();

    /**
     * Vacia la licuadora.
     */
    void Empty();

    /**
     * Disminuye la velocidad de la licuadora.
     */
    void SpeedDown();

    /**
     * Devuelve la velocidad actual de la licuadora.
     * 
     */
    int GetSpeed();
}