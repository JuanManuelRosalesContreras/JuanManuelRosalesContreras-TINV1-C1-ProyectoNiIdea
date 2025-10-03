import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import tics.itess.domain.Usuario;

public class UsuarioTest {
    @Test
    public void testConstructorYGetters() {
        Usuario u = new Usuario("juan123", "clave", "alumno");
        assertEquals("juan123", u.getUsername());
        assertEquals("clave", u.getPassword());
        assertEquals("alumno", u.getRol());
    }

    @Test
    public void testSetters() {
        Usuario u = new Usuario();
        u.setUsername("admin");
        u.setPassword("adminpass");
        u.setRol("administrador");
        assertEquals("admin", u.getUsername());
        assertEquals("administrador", u.getRol());
    }
}
