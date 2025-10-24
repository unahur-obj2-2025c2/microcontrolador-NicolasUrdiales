package ar.unahur.edu.obj2.patroncommand.microcontrolador;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MicrocontroladorTest {
    Microcontrolador micro = new Microcontrolador(200);

    @Test
    void prueba(){
        micro.incProgramCounter();
        assertEquals(1,micro.getProgramCounter());
    }
}
