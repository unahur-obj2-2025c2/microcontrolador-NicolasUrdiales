package ar.unahur.edu.obj2.patroncommand.comandos;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public class LOD extends Operaciones{
    private Integer addr;

    

    public LOD(Programable micro, Integer addr) {
        super(micro);
        this.addr = addr;
    }



    @Override
    protected void doExecute() {
        Integer valorEnAddr = micro.getAddr(addr);
        Integer acumuladorA = micro.getAcumuladorA();
        micro.setAcumuladorA(acumuladorA + valorEnAddr);
    }

    
}
