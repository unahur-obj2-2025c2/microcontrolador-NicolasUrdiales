package ar.unahur.edu.obj2.patroncommand.comandos;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public class ADD extends Operaciones{

    public ADD(Programable micro) {
        super(micro);
    }

    @Override
    protected void doExecute() {
        Integer suma = micro.getAcumuladorA() + micro.getAcumuladorB();
        micro.setAcumuladorA(suma);
        micro.setAcumuladorB(0);
    }

    

    
}
