package co.edu.uniquindio.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehiculoTest {

    @Test
    public void VehiculosMisionesCompletadas(){
        Vehiculo vehiculo1 = new VehiculoTransporteTropa("1", "2002", 2010, 2000, 60, EstadoOperativo.DISPONIBLE, 200);
        assertEquals(60, vehiculo1.getMisionesCompletadas());

    }

}