package org.lessons.java.snack;

public class RegistroStudenti {

    private Studente[]  listaStudenti = new Studente[5];
    private int countStudent = 0;


    public RegistroStudenti(){

    }

    public void addStudent(Studente studente){
        if(countStudent < listaStudenti.length){
            listaStudenti[countStudent] = studente;
            countStudent++;
        }else{
            System.out.println("impossibile aggiungere " + studente.studenteAnagrafe() + ". La lista è al completo!");
        }
    }

    //piazzo countStudent perche deve ciclare quanti elementi ho aggiunto
    public void getListaStudenti(){
        for(int i = 0 ;i < countStudent; i++){
            System.out.println(listaStudenti[i].studenteAnagrafe());
        }
    }

}
