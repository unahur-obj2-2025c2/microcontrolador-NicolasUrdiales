package ar.unahur.edu.obj2.patroncommand.comandos;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public abstract class Operaciones implements Operable{
    protected Programable micro;
    
    public Operaciones(Programable micro){
        this.micro = micro;
    }

    @Override
    public void execute(){
        this.doExecute();
        micro.incProgramCounter();
    }

    protected abstract void doExecute();


}
