package ar.unahur.edu.obj2.patroncommand.microcontrolador;

import java.util.Arrays;
import java.util.List;

import ar.unahur.edu.obj2.patroncommand.comandos.Operable;

public class Microcontrolador implements Programable{
    private Integer acumuladorA;
    private Integer acumuladorB;
    private Integer programCounter;
    private List<Integer> memoria = Arrays.asList(new Integer[1024]);

    public Microcontrolador() {
        this.acumuladorA = 0;
        this.acumuladorB = 0;
        this.programCounter = 0;
        
       
        
    }

    

    @Override
    public void run(List<Operable> operaciones) {
        operaciones.forEach(o -> o.execute(this));
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
        memoria.set(addr, acumuladorA);
    }

    @Override
    public Integer getAddr(Integer addr) {
       return memoria.get(addr);
    }

    @Override
    public void reset() {
        this.acumuladorA = 0;
        this.acumuladorB = 0;
        this.programCounter = 0;
        memoria = Arrays.asList(new Integer[1024]);
    }



    
    

}
