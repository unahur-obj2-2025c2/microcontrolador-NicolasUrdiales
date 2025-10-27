package ar.unahur.edu.obj2.patroncommand.comandos;

import java.util.ArrayList;
import java.util.List;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public class IFNZ extends Composite{

    public IFNZ(List<Operable> operaciones) {
        super(operaciones);
    }

    @Override
    protected void doExecute(Programable micro) {
        if(this.noEsCero(micro)){
            super.doExecute(micro);
        }
    }

    

    
}
