package ar.unahur.edu.obj2.patroncommand.comandos;

import java.util.List;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public class WHNZ extends Composite{

    public WHNZ(List<Operable> operaciones) {
        super(operaciones);
    }

    @Override
    protected void doExecute(Programable micro) {
        while(this.noEsCero(micro)){
            super.doExecute(micro);
        }
    }

    
    
}
