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
 * 
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
     * prueba el metodo Fill de objeto OsterBlender.
     * verifica que se llene la licuadora luego de utilizar el metodo
     * 
     */
    @Test
    void testFill() {
        OsterBlender blender = new OsterBlender(0, false);
        blender.Fill();
        assertTrue(blender.getLleno(), "La licuadora debe estar llena despues de llamar al metodo Fill.");
    }


    /**
     * Prueba del metodo empty de objeto OsterBlender
     * verifica que la licuadora se vacie despues de llamar al metodo
     * 
     */
    @Test
    void testEmpty() {
        OsterBlender blender = new OsterBlender(0, true);
        blender.Empty();
        assertFalse(blender.getLleno(), "La licuadora debe estar vacia despues de llamar al metodo Empty.");
    }

    /**
     * Prueba del metodo getSpeed de objeto OsterBlender
     * verifica que devuelva la velocidad en la que se encuentra la licuadora
     */
    @Test
    void testGetSpeed() {
        OsterBlender blender = new OsterBlender(5, false);
        blender.setVelocidad(5);
        assertEquals(5, blender.GetSpeed(), "El metodo GetSpeed debe devolver la velocidad configurada en 5.");
    }

      /**
     * Prueba del metodo Is full de objeto OsterBlender
     * veridica que devuelva true si la licuadora esta llena y false si esta vacia
     * 
     */
    @Test
    void testIsFull() {
        OsterBlender blender = new OsterBlender(0, false);
        assertFalse(blender.IsFull(), "La licuadora no debe estar llena al inicio.");
        blender.Fill();
        assertTrue(blender.IsFull(), "La licuadora debe estar llena despues de llamar al metodo Fill.");
    }
}