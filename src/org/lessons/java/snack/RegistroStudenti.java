package org.lessons.java.snack;

public class RegistroStudenti {
    // REGISTRO STUDENTI STATICO
    // private Studente[] listaStudenti = new Studente[5];
    // private int countStudent = 0;

    // public RegistroStudenti(){

    // }

    // public void addStudent(Studente studente){
    // if(countStudent < listaStudenti.length){
    // listaStudenti[countStudent] = studente;
    // countStudent++;
    // }else{
    // System.out.println("impossibile aggiungere " + studente.studenteAnagrafe() +
    // ". La lista è al completo!");
    // }
    // }

    // //piazzo countStudent perche deve ciclare quanti elementi ho aggiunto
    // public void getListaStudenti(){
    // for(int i = 0 ;i < countStudent; i++){
    // System.out.println(listaStudenti[i].studenteAnagrafe());
    // }
    // }

    private Studente[] registro;

    public RegistroStudenti() {
        this.registro = new Studente[0];

    }

    // getter e setter
    public Studente[] getRegistro() {
        return registro;
    }

    public void setRegistro(Studente[] registro) {
        this.registro = registro;
    }

    // metodi
    public void addStudent(Studente studente) {
        // creo un nuovo registro come quello di prima +1
        Studente[] registroAggiornato = new Studente[this.registro.length + 1];

        // copio il vecchio registro nel nuovo
        for (int i = 0; i < registro.length; i++) {
            registroAggiornato[i] = this.registro[i];
        }

        // aggiungo lo studente nell'ultima posizione
        registroAggiornato[registroAggiornato.length - 1] = studente;
        // sovrascrivo il vecchio registro col nuovo
        this.registro = registroAggiornato;
    }

    public void getListaStudenti() {
        for (int i = 0; i < registro.length; i++) {
            System.out.println(registro[i].studenteAnagrafe());
        }
    }

}
