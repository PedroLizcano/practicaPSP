package com.psp.practica.school;

import java.util.ArrayList;

public class SchoolImpl implements School{
	ArrayList<StudentRequest> Students= new ArrayList<StudentRequest>();
	ArrayList<SubjectRequest> Subjects= new ArrayList<SubjectRequest>();
	ArrayList<EvaluationRequest > Evaluations= new ArrayList<EvaluationRequest >();

	@Override
	public EvaluationResponse evaluacionDeAlumnoEnUnaAsignatura(EvaluationRequest parameters) {
		// TODO Auto-generated method stub
		EvaluationRequest evaluationrequest=new EvaluationRequest();
		EvaluationResponse evaluationresponse=new EvaluationResponse();
		evaluationrequest.setDNIStudent("");
		evaluationrequest.setIdSubject("");
		evaluationrequest.setNote(-1);
		for (StudentRequest students : Students) {
			if (students.getDNIStudent().equals(parameters.getDNIStudent())) {
				evaluationrequest.setDNIStudent(parameters.getDNIStudent());
			}
		}

		for (SubjectRequest subjects : Subjects) {
			if (subjects.getIdSubject().equals(parameters.getIdSubject())) {
				evaluationrequest.setIdSubject(parameters.getIdSubject());
			}
		}

		if(parameters.getNote()<=10&&parameters.getNote()>=0) {
			evaluationrequest.setNote(parameters.getNote());	
		}


		if(evaluationrequest.getDNIStudent().equals("")||evaluationrequest.getIdSubject().equals("")||evaluationrequest.getNote()==-1) {
			evaluationresponse.setGreet("The note has not been registered");
			return evaluationresponse;
		}




		Evaluations.add(evaluationrequest);
		evaluationresponse.setGreet("The note has  been registered");
		return evaluationresponse;


	}




	@Override
	public SubjectResponse altaDeAsignaturas(SubjectRequest parameters) {
		// TODO Auto-generated method stub

		SubjectRequest subjectrequest = new SubjectRequest();
		SubjectResponse subjectresponse = new SubjectResponse();
		subjectrequest.setIdSubject(parameters.getIdSubject());
		subjectrequest.setNameSubject(parameters.getNameSubject());
		for(int f=0;f<Subjects.size();f++) {
			if(Subjects.get(f).getIdSubject().equals(subjectrequest.getIdSubject())||Subjects.get(f).getNameSubject().equals(subjectrequest.getNameSubject())) {
				subjectresponse.setGreet("The subject has not been registered");
				return subjectresponse;
			}
		}
		Subjects.add(subjectrequest);
		subjectresponse.setGreet("The subject has been registered");
		return subjectresponse;



	}





	@Override
	public StudentResponse altaDeAlumnos(StudentRequest parameters) {
		// TODO Auto-generated method stub
		StudentRequest studentrequest =new StudentRequest();
		StudentResponse studentresponse=new StudentResponse();
		studentrequest.setAddressStudent(parameters.getAddressStudent());
		studentrequest.setDNIStudent(parameters.getDNIStudent());
		studentrequest.setNameStudent(parameters.getNameStudent());
		for(int f=0;f<Students.size();f++) {
			if(Students.get(f).getDNIStudent().equals(studentrequest.getDNIStudent())) {
				studentresponse.setGreet("The student has not been registered");
				return studentresponse;
			}
		}		
		Students.add(studentrequest);
		studentresponse.setGreet("The student has been registered");
		return studentresponse;


	}

}
