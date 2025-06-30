package org.lessons.java.snack;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Studente stud = new Studente("Mario", "Rossi", 25);
        Studente stud2 = new Studente("Gianluca", "Severo", 31);
        Studente stud3 = new Studente("Marco", "vacchi", 28);
        Studente stud4 = new Studente("Enrico", "Ciccolini", 31);
        Studente stud5 = new Studente("Andrea", "Rispoli", 26);
        Studente stud6 = new Studente("Valerio", "Scoppola", 12);
        Studente stud7 = new Studente("Namoooo", "Daje", 25);

        RegistroStudenti registro = new RegistroStudenti();

        ContoBancario conto = new ContoBancario(152465);

        System.out.println();

        System.out.println("----STUDENTI----");
        System.out.println(stud.studenteAnagrafe());
        System.out.println(stud2.studenteAnagrafe());

        System.out.println();

        System.out.println("------REGISTRO STUDENTI------");
        registro.addStudent(stud);
        registro.addStudent(stud2);
        registro.addStudent(stud3);
        registro.addStudent(stud4);
        registro.addStudent(stud5);
        registro.addStudent(stud6);
        registro.addStudent(stud7);
        registro.getListaStudenti();

        // registro.getListaStudenti();

        

        System.out.println();

        System.out.println("----CONTO BANCARIO----");
        System.out.println("Numero conto: " + conto.getNumeroConto());
        System.out.println(conto.getSaldo());
        // DEPOSITO
        conto.deposito(new BigDecimal(30.50));
        conto.deposito(new BigDecimal(330.50));
        // PRELIEVO
        conto.prelievo(new BigDecimal(61));

    }
}
