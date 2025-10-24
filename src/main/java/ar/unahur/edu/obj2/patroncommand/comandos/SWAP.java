package ar.unahur.edu.obj2.patroncommand.comandos;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public class SWAP extends Operaciones{

    public SWAP(Programable micro) {
        super(micro);
    }

    


    @Override
    protected void doExecute() {
        Integer acumuladorA = micro.getAcumuladorA();
        Integer acumuladorB = micro.getAcumuladorB();

        micro.setAcumuladorA(acumuladorB);
        micro.setAcumuladorB(acumuladorA);
    }

    

}
