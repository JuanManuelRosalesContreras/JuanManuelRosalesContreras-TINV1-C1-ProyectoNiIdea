import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import tics.itess.domain.Chismoso;

public class ChismosoTest {
  @Test
    public void testCrearChismoso() {
        Chismoso tutor = new Chismoso(1, "María López", "Mamá", "4567891234", "maria@example.com");
        
        assertEquals(1, tutor.getId());
        assertEquals("María López", tutor.getNombre());
        assertEquals("Mamá", tutor.getParentesco());
        assertEquals("4567891234", tutor.getTelefono());
        assertEquals("maria@example.com", tutor.getCorreo());
    }

    @Test
    public void testAgregarComentario() {
        Chismoso tutor = new Chismoso(2, "Juan Pérez", "Papá", "1234567890", "juan@example.com");
        tutor.agregarComentario("Mi hijo es muy responsable");
        tutor.agregarComentario("Necesita apoyo en programación");

        assertEquals(2, tutor.getComentarios().size());
        assertTrue(tutor.getComentarios().contains("Mi hijo es muy responsable"));
    }
    
}
