package ar.unahur.edu.obj2.patroncommand;

import java.util.ArrayList;
import java.util.List;

import ar.unahur.edu.obj2.patroncommand.comandos.Operable;
import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public class Programa {
    private Programable micro;
    private List<Operable> operaciones = new ArrayList<>();

    public void agregarOperacion(Operable operacion){
        operaciones.add(operacion);
    }

    public void vaciarOperaciones(){
        operaciones.clear();
    }

    public void ejecutar(){
        micro.run(operaciones);
    }

    public void resetearMicro(){
        micro.reset();
    }

    
}
