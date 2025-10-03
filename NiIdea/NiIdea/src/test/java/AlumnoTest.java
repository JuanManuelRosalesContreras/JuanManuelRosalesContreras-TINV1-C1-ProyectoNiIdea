
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import tics.itess.domain.Alumno;

public class AlumnoTest {

    @Test
    public void testConstructorYGetters() {
        Alumno a = new Alumno("TI701-001", "Juan Manuel");
        assertEquals("TI701-001", a.getNoControl());
        assertEquals("Juan Manuel", a.getNombre());
    }

    @Test
    public void testSettersYmostrarInfo() {
        Alumno a = new Alumno();
        a.setNoControl("TI701-002");
        a.setNombre("Pedro");
        assertEquals("TI701-002", a.getNoControl());
        assertEquals("Pedro", a.getNombre());
        assertEquals("Alumno: Pedro, No. de control: TI701-002", a.mostrarInfo());
    }

}
