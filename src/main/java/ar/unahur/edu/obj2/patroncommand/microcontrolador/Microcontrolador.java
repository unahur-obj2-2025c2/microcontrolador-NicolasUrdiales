package ar.unahur.edu.obj2.patroncommand.microcontrolador;

import java.util.List;

import ar.unahur.edu.obj2.patroncommand.comandos.Operable;

public class Microcontrolador implements Programable{
    private Integer acumuladorA;
    private Integer acumuladorB;
    private Integer programCounter;
    private Integer[] addr = new Integer[1024];

    public Microcontrolador(Integer addr) {
        this.acumuladorA = 0;
        this.acumuladorB = 0;
        this.programCounter = 0;
        for (int i = 0; i < addr; i++) {
            this.addr[i] = 0;
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
        this.addr = new Integer[addr];
    }

    @Override
    public Integer getAddr(Integer addr) {
       return this.addr[addr];
    }

    @Override
    public void reset() {
        this.acumuladorA = 0;
        this.acumuladorB = 0;
        this.programCounter = 0;
        for (int i = 0; i < this.addr.length; i++) {
            this.addr[i] = 0;
        }
    }
    

}
