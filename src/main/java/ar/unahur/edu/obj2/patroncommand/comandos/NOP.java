package ar.unahur.edu.obj2.patroncommand.comandos;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public class NOP extends Operaciones{

    public NOP(Programable micro) {
        super(micro);
    }

    @Override
    protected void doExecute() {}
        
}
