package org.lessons.java.snack;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Studente stud = new Studente("Mario", "Rossi", 25);
        Studente stud2 = new Studente("Gianluca", "Severo", 31);

        ContoBancario conto = new ContoBancario();

        System.out.println();

        System.out.println("----STUDENTI----");
        System.out.println(stud.studenteAnagrafe());
        System.out.println(stud2.studenteAnagrafe());

        System.out.println();
        //DEPOSITO
        System.out.println("----CONTO BANCARIO----");
        System.out.println(conto.getSaldo());
        conto.deposito(new BigDecimal(30.50));
        System.out.println(conto.getSaldo());
        conto.deposito(new BigDecimal(30.50));
        //PRELIEVO
        conto.prelievo(new BigDecimal(61));

    }
}
