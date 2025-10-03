import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import tics.itess.domain.*;
import java.util.List;

public class PortafolioTest {
    
    @Test
    public void testConstructorYGetters() {
        Alumno a = new Alumno("TI701-003", "María");
        Portafolio p = new Portafolio("Portafolio María", "Proyectos", "2025-07-01", a);
        assertEquals("Portafolio María", p.getTitulo());
        assertEquals("María", p.getAlumno().getNombre());
        assertNotNull(p.getLogros());
        assertEquals(0, p.getLogros().size());
    }

    @Test
    public void testAgregarEliminarLogroYGenerarResumen() {
        Alumno a = new Alumno("TI701-004", "Luis");
        Portafolio p = new Portafolio("P Luis", "Descripción", "2025-07-02", a);
        Logro l1 = new Logro(67445,"Proyecto", "Web App", "2025-05-01");
        Logro l2 = new Logro(33458, "Certificación", "Java", "2025-06-10");

        p.agregarLogro(l1);
        p.agregarLogro(l2);
        assertEquals(2, p.getLogros().size());

        boolean removed = p.eliminarLogro(l1);
        assertTrue(removed);
        assertEquals(1, p.getLogros().size());

        String resumen = p.generarResumen();
        assertTrue(resumen.contains("Logros (1)"));
        assertTrue(resumen.contains("Java") || resumen.contains("Web App") || resumen.contains("Certificación"));
    }
    
}
