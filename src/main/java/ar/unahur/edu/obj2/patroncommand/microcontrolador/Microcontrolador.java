package ar.unahur.edu.obj2.patroncommand.microcontrolador;

import java.util.List;

import ar.unahur.edu.obj2.patroncommand.comandos.Operable;
import ar.unahur.edu.obj2.patroncommand.excepciones.ErrorDeDireccion;

public class Microcontrolador implements Programable{
    private Integer acumuladorA;
    private Integer acumuladorB;
    private Integer programCounter;
    private Integer addr;

    public Microcontrolador(Integer addr) {
        this.acumuladorA = 0;
        this.acumuladorB = 0;
        this.programCounter = 0;
        try {
            this.asignarAddrValorEntre0Y1024(addr);
        } catch (ErrorDeDireccion e) {
            System.out.println(e.getMessage());
        }

    }

    private void asignarAddrValorEntre0Y1024(Integer valor){
        if(valor >= 0 && valor <= 1024){
            this.addr = valor;
        }
        else{
            throw new ErrorDeDireccion("Direccion de memoria incorrecto");
        }
    }

    @Override
    public void run(List<Operable> operaciones) {
        
    }

    @Override
    public void incProgramCounter() {
        this.programCounter++;
    }

    @Override
    public Integer getProgramCounter() {
        return this.programCounter;
    }

    @Override
    public void setAcumuladorA(Integer value) {
        this.acumuladorA = value;
    }

    @Override
    public Integer getAcumuladorA() {
        return this.acumuladorA;
    }

    @Override
    public void setAcumuladorB(Integer value) {
        this.acumuladorB = value;
    }

    @Override
    public Integer getAcumuladorB() {
        return this.acumuladorB;
    }

    @Override
    public void setAddr(Integer addr) {
        this.addr = addr;
    }

    @Override
    public Integer getAddr(Integer addr) {
       return this.addr;
    }

    @Override
    public void reset() {
        this.acumuladorA = 0;
        this.acumuladorB = 0;
        this.programCounter = 0;
    }
    

}
