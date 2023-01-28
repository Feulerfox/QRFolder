package com.elab.interview.hospital;

import com.elab.interview.hospital.parser.Parser;
import com.elab.interview.hospital.printer.Printer;
import com.elab.interview.hospital.treatment.Antibiotic;
import com.elab.interview.hospital.treatment.Aspirin;
import com.elab.interview.hospital.treatment.Insulin;
import com.elab.interview.hospital.treatment.Paracetamol;

import java.util.ArrayList;

public class Quarantine {

	private ArrayList<Patient> patients=new ArrayList<>();

	public ArrayList<Patient> getPatients() {
		return patients;
	}

	public Quarantine(String participants) {
		patients= new Parser().parserStatus(participants);
	}
	public String report() {
		return new Printer().statusReporter(patients);
	}
	public void wait40Days() {
		for (Patient p: patients) {
			p.wait40days();
		}
	}
	public void paracetamol() {
		for (Patient p: patients) {
			p.applyTreatment(new Paracetamol());
		}
	}
	public void insulin() {
		//patients.stream().forEach (p -> p.applyTreatment(new Insulin()));
		for (Patient p: patients) {
			p.applyTreatment(new Insulin());
		}
	}
	public void antibiotic() {
		for (Patient p: patients) {
			p.applyTreatment(new Antibiotic());
		}
	}
	public void aspirin() {
		for (Patient p: patients) {
			p.applyTreatment(new Aspirin());
		}
	}
}

