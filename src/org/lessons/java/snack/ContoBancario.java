package org.lessons.java.snack;

import java.math.BigDecimal;
import java.util.Random;

public class ContoBancario {

    private int numeroConto;
    private BigDecimal saldo;

    Random random = new Random();

    // Costuttore senza parametri per rendere tutto randomico
    public ContoBancario() {
        this.numeroConto = random.nextInt(99999);
        this.saldo = BigDecimal.ZERO;
    }

        public ContoBancario(int numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = BigDecimal.ZERO;
    }

    // metodi pubblici
    public BigDecimal getSaldo() {
        return saldo;
    }

    public int getNumeroConto(){
        return numeroConto;
    }

    // metodo per il deposito
    public BigDecimal deposito(BigDecimal importo) {
        if(importo.compareTo(new BigDecimal(0) ) < 0){
            System.out.println("Non è possibile utlizzare numeri negativi");
            return saldo;
        }
        saldo = saldo.add(importo);
        System.out.println("Deposito effettuato con successo! Nuovo saldo: " + saldo);
        return saldo;
    }

    public BigDecimal prelievo(BigDecimal importo) {
        if (importo.compareTo(saldo) > 0) {
            System.out.println("ATTENZIONE! Operazione negata: fondi insufficienti.");
            return saldo;
        }
        saldo = saldo.subtract(importo);
        System.out.println("Prelievo effettuato con successo! Nuovo saldo: " + saldo);
        return saldo;
    }
}
