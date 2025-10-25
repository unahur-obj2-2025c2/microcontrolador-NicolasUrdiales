package ar.unahur.edu.obj2.patroncommand.comandos;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public abstract class Operaciones implements Operable{
    

    @Override
    public void execute(Programable micro){
        this.doExecute(micro);
        micro.incProgramCounter();
    }

    protected abstract void doExecute(Programable micro);


}
