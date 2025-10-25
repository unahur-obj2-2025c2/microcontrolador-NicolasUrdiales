package ar.unahur.edu.obj2.patroncommand.comandos;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public class STR extends Operaciones{
    private final Integer addr;

    public STR(Integer addr) {
       
        this.addr = addr;
    }



    @Override
    protected void doExecute(Programable micro) {
      micro.setAddr(addr);
    }


}
