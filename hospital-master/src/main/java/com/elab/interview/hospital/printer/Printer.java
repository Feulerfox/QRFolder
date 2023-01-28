package com.elab.interview.hospital.printer;

import com.elab.interview.hospital.Patient;
import com.elab.interview.hospital.status.*;

import java.util.ArrayList;

public class Printer {

    public String statusReporter(ArrayList<Patient> patients){
        int healthyPatientsCount = 0;
        int patientsWithFeverCount = 0;
        int patientsWithDiabetesCount = 0;
        int patientsWithTuberculosisCount = 0;
        int deadPatients = 0;

        Status status = null;

        for(Patient p : patients) {
            status = p.getStatus();
            if(status instanceof Healthy) {
                healthyPatientsCount++;
            }
            else if (status instanceof Fever) {
                patientsWithFeverCount++;
            }
            else if (status instanceof Diabetes) {
                patientsWithDiabetesCount++;
            }
            else if (status instanceof Tubercolosis) {
                patientsWithTuberculosisCount++;
            }
            else {
                deadPatients++;
            }
        }

        String str="";
        str+="F:"+patientsWithFeverCount+" ";
        str+="H:"+healthyPatientsCount+" ";
        str+="D:"+patientsWithDiabetesCount+" ";
        str+="T:"+patientsWithTuberculosisCount+" ";
        str+="X:"+deadPatients;
        return str ;
    }


}
