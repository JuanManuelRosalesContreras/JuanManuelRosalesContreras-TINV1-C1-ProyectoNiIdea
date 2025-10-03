import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import tics.itess.domain.FJMP;

public class FJMPTest {
    
     @Test
    public void testCrearFJMP() {
        FJMP coordinador = new FJMP(1, "Francisco Javier", "Coordinador de la carrera de TI");

        assertEquals(1, coordinador.getId());
        assertEquals("Francisco Javier", coordinador.getNombre());
        assertEquals("Coordinador de la carrera de TI", coordinador.getDescripcion());
    }

    @Test
    public void testAgregarObservacion() {
        FJMP coordinador = new FJMP(2, "FJMP", "Encargado del seguimiento de proyectos");
        coordinador.agregarObservacion("Revisar avances de los alumnos");
        coordinador.agregarObservacion("Validar portafolios");

        assertEquals(2, coordinador.getObservaciones().size());
        assertTrue(coordinador.getObservaciones().contains("Validar portafolios"));
    }
    
}
