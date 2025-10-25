package ar.unahur.edu.obj2.patroncommand.comandos;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public class LOD extends Operaciones{
    private Integer addr;

    

    public LOD(Integer addr) {
        this.addr = addr;
    }



    @Override
    protected void doExecute(Programable micro) {
        Integer valorEnMemoria = micro.getAddr(addr);
        
        micro.setAcumuladorA(valorEnMemoria);
    }

    
}
