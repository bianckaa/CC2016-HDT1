/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Seccion 31
 * Hoja de Trabajo No.1
 * Integrantes:
 * -Biancka Raxón 24960
 * -Diana Sosa 241040
 * -Ivana Figueroa 24785
 * 
 * 
 * Clase: OsterBlenderTest
 * Clase de prueba para la clase OsterBlender con JUnit
 * 
 * Proposito : Verificar el funcionamiento de los metodos de la clase OsterBlender
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OsterBlenderTest {


    /**
     * Prueba el constructor de objeto OsterBlender.
     * Verifica que los atributos velocidad y lleno se inicialicen correctamente.
     */
  @Test  
    void testConstructor() {
        OsterBlender blender = new OsterBlender(0, false);
        assertEquals(0, blender.getVelocidad(), "La velocidad inicial al ejecutar el programa es 0.");
        assertFalse(blender.getLleno(), "La licuadora debe estar vacía cuando se inicie el programa.");
    }

    /**
     * Prueba el metodo SpeedUp de objeto OsterBlender.
     * Verifica que aumente 1 la velocidad cada vez que se ejecute.
     */
    @Test
    void testSpeedUp() {
        OsterBlender blender = new OsterBlender(0, false);
        blender.SpeedUp();
        assertEquals(1, blender.getVelocidad(), "La velocidad debe ser 1 despues de llamar el metodo.");
    }

    /**
     * Prueba el metodo SpeedDown de objeto OsterBlender.
     * Veridica que disminuya 1 la velocidad cada vez que se ejecute.
     */
    @Test
    void testSpeedDown() {
        OsterBlender blender = new OsterBlender(1, false);
        blender.SpeedDown();
        assertEquals(0, blender.getVelocidad(), "La velocidad debe ser 1 después de reducirla una vez con el método.");
    }

    /**
     * 
     * 
     */
    @Test
    void testFill() {
        OsterBlender blender = new OsterBlender(0, false);
        blender.Fill();
        assertTrue(blender.getLleno(), "La licuadora debe estar llena despues de llamar al metodo Fill.");
    }

    @Test
    void testEmpty() {
        OsterBlender blender = new OsterBlender(0, true);
        blender.Empty();
        assertFalse(blender.getLleno(), "La licuadora debe estar vacia despues de llamar al metodo Empty.");
    }

    @Test
    void testGetSpeed() {
        OsterBlender blender = new OsterBlender(5, false);
        blender.setVelocidad(5);
        assertEquals(5, blender.GetSpeed(), "El metodo GetSpeed debe devolver la velocidad configurada en 5.");
    }

    @Test
    void testIsFull() {
        OsterBlender blender = new OsterBlender(0, false);
        assertFalse(blender.IsFull(), "La licuadora no debe estar llena al inicio.");
        blender.Fill();
        assertTrue(blender.IsFull(), "La licuadora debe estar llena despues de llamar al metodo Fill.");
    }
}