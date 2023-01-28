package com.elab.interview.hospital.status;

import com.elab.interview.hospital.Patient;

public interface Status {
    void setOwner(Patient patient);
    void wait40days();
}
