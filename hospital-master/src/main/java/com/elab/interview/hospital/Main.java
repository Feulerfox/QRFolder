package com.elab.interview.hospital;

public class Main {
    public static void main(String[] args) {
        Quarantine quarantine=new Quarantine("F,H,H,H,T");
        System.out.println(quarantine);
        System.out.println(quarantine.report());
        //quarantine.wait40Days();
        System.out.println(quarantine.report());

        quarantine.insulin();
        quarantine.antibiotic();
        quarantine.wait40Days();
        System.out.println(quarantine.report());

        quarantine.paracetamol();
        System.out.println(quarantine.report());
        quarantine.aspirin();
        System.out.println(quarantine.report());


    }
}
