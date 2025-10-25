package ar.unahur.edu.obj2.patroncommand.comandos;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public class STR extends Operaciones{
    private Integer addr;

    public STR(Programable micro, Integer addr) {
        super(micro);
        this.addr = addr;
    }



    @Override
    protected void doExecute() {
        Integer acumuladorA = micro.getAcumuladorA();
        micro.cargarValorEnMemoria(acumuladorA, addr);
    }
    


}
