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

        RegistroStudenti registro = new RegistroStudenti();

        ContoBancario conto = new ContoBancario(152465);

        System.out.println();

        System.out.println("----STUDENTI----");
        System.out.println(stud.studenteAnagrafe());
        System.out.println(stud2.studenteAnagrafe());

        System.out.println("------REGISTRO STUDENTI------");
        registro.addStudent(stud);
        registro.addStudent(stud2);
        registro.addStudent(stud3);
        registro.addStudent(stud4);
        registro.addStudent(stud5);
        registro.addStudent(stud6);

        registro.getListaStudenti();
        

        System.out.println();
        // DEPOSITO
        System.out.println("----CONTO BANCARIO----");
        System.out.println(conto.getSaldo());
        conto.deposito(new BigDecimal(30.50));
        System.out.println(conto.getSaldo());
        conto.deposito(new BigDecimal(30.50));
        // PRELIEVO
        conto.prelievo(new BigDecimal(61));

    }
}
