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
 * Interfaz que define los métodos básicos que deben implementar todas las licuadoras
 */
public interface IBlender  {
    void SpeedUp();
    boolean IsFull();
    void Fill();
    void Empty();
    void SpeedDown();
    int GetSpeed();
}