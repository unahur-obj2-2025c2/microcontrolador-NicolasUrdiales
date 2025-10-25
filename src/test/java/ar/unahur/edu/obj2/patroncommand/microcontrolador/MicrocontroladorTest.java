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
        List<Operable> operaciones = List.of(new NOP(micro), new NOP(micro), new NOP(micro));

        micro.run(operaciones);

        assertEquals(3, micro.getProgramCounter());
    }

    @Test
    void despuesDeEjecutarLosSiguientesComandosELPCSeVaA4YElAcumuladorAEs37YElB0(){
        List<Operable> operaciones = List.of(new LODV(micro,20), new SWAP(micro), new LODV(micro, 17), new ADD(micro));

        micro.run(operaciones);

        assertEquals(37, micro.getAcumuladorA());
        assertEquals(0, micro.getAcumuladorB());
        assertEquals(4, micro.getProgramCounter());
    }

    @Test
    void despuesDeVariasOperacionesElAcumuladorAQuedaEn15YElBEn0(){
        List<Operable> operaciones = List.of(
            new LODV(micro, 2),
            new STR(micro, 0),
            new LODV(micro ,8),
            new SWAP(micro),
            new LODV(micro ,5),
            new ADD(micro),
            new SWAP(micro),
            new LOD(micro, 0),
            new ADD(micro)

        );


        micro.run(operaciones);

        assertEquals(15, micro.getAcumuladorA());
    }
}
