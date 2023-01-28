package com.elab.interview.hospital.status;

import com.elab.interview.hospital.Patient;
import com.elab.interview.hospital.treatment.Antibiotic;
import com.elab.interview.hospital.treatment.Treatment;

public class Tubercolosis implements Status{
    private Patient patient;
    @Override
    public void setOwner(Patient patient) {
        this.patient = patient;
    }
    @Override
    public void wait40days() {
        boolean hasAntibiotics = false;

        for (Treatment t :  patient.getTreatments()) {
            if (t instanceof Antibiotic) {
                hasAntibiotics = true;
            }
        }
        if (hasAntibiotics) {
            patient.setStatus(new Healthy());
        }

    }
}
