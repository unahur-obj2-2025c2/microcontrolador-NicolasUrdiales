package ar.unahur.edu.obj2.patroncommand.comandos;

import ar.unahur.edu.obj2.patroncommand.microcontrolador.Programable;

public class LODV extends Operaciones{
    private Integer valor;

    


    public LODV(Programable micro, Integer valor) {
        super(micro);
        this.valor = valor;
    }




    @Override
    protected void doExecute() {
        micro.setAcumuladorA(valor);
    }

}
