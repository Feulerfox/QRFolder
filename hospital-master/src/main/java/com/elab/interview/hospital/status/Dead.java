package com.elab.interview.hospital.status;

import com.elab.interview.hospital.Patient;
import com.elab.interview.hospital.treatment.Antibiotic;

public class Dead implements Status {
    private Patient patient;
    @Override
    public void setOwner(Patient patient) {
        this.patient = patient;
    }
    public void wait40days() {
    }
}
