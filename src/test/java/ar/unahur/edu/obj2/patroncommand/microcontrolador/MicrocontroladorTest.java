package ar.unahur.edu.obj2.patroncommand.microcontrolador;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import ar.unahur.edu.obj2.patroncommand.comandos.ADD;
import ar.unahur.edu.obj2.patroncommand.comandos.LOD;
import ar.unahur.edu.obj2.patroncommand.comandos.LODV;
import ar.unahur.edu.obj2.patroncommand.comandos.NOP;
import ar.unahur.edu.obj2.patroncommand.comandos.Operable;
import ar.unahur.edu.obj2.patroncommand.comandos.STR;
import ar.unahur.edu.obj2.patroncommand.comandos.SWAP;

public class MicrocontroladorTest {
    Microcontrolador micro = new Microcontrolador();

    @Test
    void siElMicroEjecuta3NOP_ElCounterEstaEn3(){
        List<Operable> operaciones = List.of(new NOP(), new NOP(), new NOP());

        micro.run(operaciones);

        assertEquals(3, micro.getProgramCounter());
    }

    @Test
    void despuesDeEjecutarLosSiguientesComandosELPCSeVaA4YElAcumuladorAEs37YElB0(){
        List<Operable> operaciones = List.of(new LODV(20), new SWAP(), new LODV(17), new ADD());

        micro.run(operaciones);

        assertEquals(37, micro.getAcumuladorA());
        assertEquals(0, micro.getAcumuladorB());
        assertEquals(4, micro.getProgramCounter());
    }

    @Test
    void despuesDeVariasOperacionesElAcumuladorAQuedaEn15YElBEn0(){
        List<Operable> operaciones = List.of(
            new LODV(2),
            new STR(0),
            new LODV(8),
            new SWAP(),
            new LODV(5),
            new ADD(),
            new SWAP(),
            new LOD(0),
            new ADD()

        );


        micro.run(operaciones);

        assertEquals(15, micro.getAcumuladorA());
    }
}
