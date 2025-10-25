package ar.unahur.edu.obj2.patroncommand.comandos;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public class LODV extends Operaciones{
    private final Integer valor;

    


    public LODV(Integer valor) {
        this.valor = valor;
    }




    @Override
    protected void doExecute(Programable micro) {
        micro.setAcumuladorA(valor);
    }

}
