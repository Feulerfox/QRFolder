package com.elab.interview.hospital.status;

import com.elab.interview.hospital.Patient;
import com.elab.interview.hospital.treatment.Aspirin;
import com.elab.interview.hospital.treatment.Paracetamol;
import com.elab.interview.hospital.treatment.Treatment;

public class Fever implements Status {
    private Patient patient;
    @Override
    public void setOwner(Patient patient) {
        this.patient = patient;
    }
    @Override
    public void wait40days() {
        boolean hasAspirin = false;
        boolean hasParacetamol = false;

        for (Treatment t : patient.getTreatments()) {
            if (t instanceof Aspirin) {
                hasAspirin = true;
            }
            if (t instanceof Paracetamol) {
                hasParacetamol = true;
            }
        }

        if (hasAspirin != hasParacetamol) {
            patient.setStatus(new Healthy());
        }
    }
}
