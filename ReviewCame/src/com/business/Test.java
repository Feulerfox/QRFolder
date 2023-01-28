package com.business;

import java.util.ArrayList;

class  Class1{
    private int a; // visibile solo all'interno della classe stessa
    int b; //visibilità a livello di package
    protected int c; //visibilità a livello di eredità non la vedo se istanzio direttamente class1 perchè è come se fosse interna a class1
    public int d; // visibilità globale

    //alle classi di primo livello, cioè che non sono innestate non posso mettere protected o private
}

class Class2{
    Class2(int a){

    }

    public Class2() {

    }

    void m1() {
    }
}

class Class3 extends Class2{
    //ereditarietà
    Class3(int a){
        super(a);
    }

    public Class3() {
        super();
    }

    //overloading e polimorfismo
    //questa è anche un override del metodo creato dal genitore
    void m1(){
        super.m1();
    }

    int m1(int a){return  0;}
    int m1(long a){return 0;}
}
interface IDriver{
    int m2();
}

interface IThinker{
    int m1();
}

class Class10 implements IDriver, IThinker{

    @Override
    public int m2() {
        return 0;
    }

    @Override
    public int m1() {
        return 0;
    }
}

/*
*   Framework
*   Text application
*
*   void print(){
*       render();
*       sendToNetwork()
*      }
*
*   abstract void render();
*   abstract void sendToNetwork();
*
* il framework non ne sa nulla del metodo render ma quando si invoca il print sarà il framework a stabilire l'ordine
* di invocazione dettando il ritmo.
* */

public class Test {

    public static void main(String[] args) {
        Class3 c3 = new Class3(); //c3 ===> classe3(m4)

        Class2 c2 = c3; // le variabili c2 e c3 sono puntatori, se class 2 ha figli differenti
                        //ci permette di avere un metodo polimorfico che mi permette di accedere ai
                        //diversi tipi di figli. ci perette di scrivere un metodo solo specifico per tutte le classi figlie c2 =======>

        //es Person(lavora) --> Prog(coding), mgr, any, Dev

        /*metodo polimorfico
        *
        * public void mPoli(Person p){
        *   p.lavora();
        *   if(p instanceof Prog)
        *       ((Prog)p).codig(); // in questo modo posso fare un casting di p ad un oggetto di tipo Prog e utilizzare le funzionalità aggiuntive di programmi
        * }
        *
        * posso anche fare non in maniera generica in questo modo
        *
        * mPoli(new Prog());
        * mPoli(new Mgr());
        *
        * posso anche andare sulle funzionalità specifiche, posso vedere se l'oggetto p punta ad un'istanza specifica con instanceOf
        * */

        //Incapsulamento = permette di modificare la visibilità delle classi

        //ereditarietà
        /*Java è monoereditario si può ereditare solo una classe alla volta, tutte le classi ereditano da object.
         * equals vede se due riferimenti stanno referenziando lo stesso oggetto
         * hashCode valore alfanumerico che rappresenta lo stato di un oggetto, viene calcolato un valore hashcode che è univoco
         * serve a dichiarare variabili e metodi e averli nelle classi figlie e per specializzare anche quello che abbiamo già scritto
         * questo può essere ottenuto anche attraverso l'annotazione Override
         * Final blocca l'estensione di una classe
         * Abstract blocca l'istanziazione di un oggetto di quella classe
         * */

        //polimorfismo
        /*possibilità di creare più varianti dello stesso metodo.
        * un metodo polimorfico è un metodo che permette di referenziare oggetti diversi ma con ereditarietà
        * polimorfismo attraverso le interfacce, posso implementare in una classe più interfacce, questo ci permette
        * di "aggirare" la monoereditarietà. */

    }

    class Go{
        public static void main(String[] args) {
            int a[] = new int []{1, 2};

            int k = 10;
            int nvarr[] = new int [k];

            ArrayList ar = new ArrayList(); // raw, non ho il controllo sui tipi che inserisco
            ar.add(10);
            ar.add(new Class1());

            ArrayList<Integer> al = new ArrayList<>(); //type safe
        }
    }

    class Computer{
        int i1;
        static int i2;
        //se il metodo riceve in input tutto quello che gli serve non farà mai riferiment a variabili a livello di classe
        //quindi deve essere un metodo statico
        //se dovessi accedere a variabili a livello di classe allora non può essere statico
        //istanza può chiamare statico ma non viceversa
        int m1(int a,int b, int c){
            m1a(1,2,3);
            return a+b+c;
        }

        static int m1a(int a, int b, int c){
            //i1 = 10; non è fattibile perchè non è statica, il contesto statico chiama solo cose statiche
            i2 = 10; //valido
            return a+b+c;
        }
    }
}
