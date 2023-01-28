package com.elab.interview.hospital.parser;

import com.elab.interview.hospital.Patient;
import com.elab.interview.hospital.status.*;

import java.util.ArrayList;

public class Parser {
    public ArrayList<Patient> parserStatus(String input){
        ArrayList<Patient> patients=new ArrayList<>();
        String[] arrayStr=input.split(",");

        for (String s: arrayStr) {
         switch (s){
             case "H":
                 patients.add(new Patient(new Healthy()));
                 break;
             case "F":
                 patients.add(new Patient(new Fever()));
                 break;
             case "D":
                 patients.add(new Patient(new Diabetes()));
                 break;
             case "T":
                 patients.add(new Patient(new Tubercolosis()));
                 break;
             case "X":
                 patients.add(new Patient(new Dead()));
                 break;
         }
        }
        return patients;
    }
}
