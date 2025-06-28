package org.lessons.java.snack;

public class RegistroStudenti {

    private Studente[]  listaStudenti;
    private int countStudent = 0;


    public RegistroStudenti(){
        listaStudenti = new Studente[5];

    }

    public void addStudent(Studente studente){
        if(countStudent < listaStudenti.length){
            listaStudenti[countStudent] = studente;
            countStudent++;
        }else{
            System.out.println("impossibile aggiungere un nuovo studente. La lista è al completo");
        }
    }

    public void getListaStudenti(){
        for(int i = 0 ;i < countStudent; i++){
            System.out.println(listaStudenti[i].studenteAnagrafe());
        }
        System.out.println();
    }





}
