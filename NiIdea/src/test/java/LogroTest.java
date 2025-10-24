import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import tics.itess.domain.Logro;

public class LogroTest {
    @Test
    public void testConstructorYGetters() {
        Logro l = new Logro(12345, "Proyecto", "Sistema de Inventario", "2025-05-01");
        assertEquals(12345, l.getId());
        assertEquals("Proyecto", l.getTipo());
        assertEquals("Sistema de Inventario", l.getDescripcion());
        assertEquals("2025-05-01", l.getFecha());
    }

    @Test
    public void testSettersYdetalles() {
        Logro l = new Logro();
        l.setTipo("Certificación");
        l.setDescripcion("Oracle Java Foundations");
        l.setFecha("2025-06-10");
        assertEquals("Certificación", l.getTipo());
        assertTrue(l.detalles().contains("Oracle Java Foundations"));
    }
}
