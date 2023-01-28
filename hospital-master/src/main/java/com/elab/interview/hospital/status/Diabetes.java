package com.elab.interview.hospital.status;

import com.elab.interview.hospital.Patient;
import com.elab.interview.hospital.treatment.Insulin;
import com.elab.interview.hospital.treatment.Treatment;

public class Diabetes implements Status {
    private Patient patient;
    @Override
    public void setOwner(Patient patient) {
        this.patient = patient;
    }
    @Override
    public void wait40days() {
        boolean hasInsulin = false;

        for (Treatment t :  patient.getTreatments()) {
            if (t instanceof Insulin) {
                hasInsulin = true;
            }
        }
        if (hasInsulin==false) {
            patient.setStatus(new Dead());
        }

    }
}
