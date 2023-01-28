package com.elab.interview.hospital;


import com.elab.interview.hospital.status.Dead;
import com.elab.interview.hospital.status.Status;
import com.elab.interview.hospital.treatment.Aspirin;
import com.elab.interview.hospital.treatment.Paracetamol;
import com.elab.interview.hospital.treatment.Treatment;

import java.util.ArrayList;

public class Patient {

    private ArrayList<Treatment> treatments = new ArrayList<>();
    private Status status;
    private Quarantine quarantine;

    public Patient(Status status) {
        this.status = status;
        status.setOwner(this);
    }

    public ArrayList<Treatment> getTreatments() {
        return treatments;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public void wait40days() {
        this.status.wait40days();
    }

    public void applyTreatment(Treatment treatment){
        treatments.add(treatment);
        check();
    }

    public void check(){
        boolean isOnParacetamol=false;
        boolean isOnAspirin=false;

        for (Treatment t: treatments) {
            if (t instanceof Aspirin){
                isOnAspirin=true;
            }
            if (t instanceof Paracetamol){
                isOnParacetamol=true;
            }
        }
        if(isOnAspirin && isOnParacetamol){
                this.status=new Dead();
        }
    }


}
