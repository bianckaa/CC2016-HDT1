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
 * Clase: OsterBlenderTest
 * Clase de prueba para la clase OsterBlender con JUnit
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OsterBlenderTest {

  @Test  
    void testConstructor() {
        OsterBlender blender = new OsterBlender(0, false);
        assertEquals(0, blender.getVelocidad(), "La velocidad inicial debe ser 0.");
        assertFalse(blender.getLleno(), "La licuadora debe estar vacía al inicio.");
    }

    @Test
    void testSpeedUp() {
        OsterBlender blender = new OsterBlender(0, false);
        blender.SpeedUp();
        assertEquals(1, blender.getVelocidad(), "La velocidad debe ser 1 después de incrementarla.");
    }

    @Test
    void testSpeedDown() {
        OsterBlender blender = new OsterBlender(0, false);
        blender.SpeedUp();
        blender.SpeedUp();
        blender.SpeedDown();
        assertEquals(1, blender.getVelocidad(), "La velocidad debe ser 1 después de aumentarla dos veces y reducirla una.");
    }

    @Test
    void testFill() {
        OsterBlender blender = new OsterBlender(0, false);
        blender.Fill();
        assertTrue(blender.getLleno(), "La licuadora debe estar llena después de llamar al método Fill.");
    }

    @Test
    void testEmpty() {
        OsterBlender blender = new OsterBlender(0, true);
        blender.Empty();
        assertFalse(blender.getLleno(), "La licuadora debe estar vacía después de llamar al método Empty.");
    }

    @Test
    void testGetSpeed() {
        OsterBlender blender = new OsterBlender(0, false);
        blender.setVelocidad(5);
        assertEquals(5, blender.GetSpeed(), "El método GetSpeed debe devolver la velocidad configurada.");
    }

    @Test
    void testIsFull() {
        OsterBlender blender = new OsterBlender(0, false);
        assertFalse(blender.IsFull(), "La licuadora no debe estar llena inicialmente.");
        blender.Fill();
        assertTrue(blender.IsFull(), "La licuadora debe estar llena después de llamar al método Fill.");
    }
}