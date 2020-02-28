package org.example.escuela;


import java.util.ArrayList;


public class EscuelaImpl implements Escuela{
	ArrayList<AlumnoRequest> alumno= new ArrayList<AlumnoRequest>();
	ArrayList<AsignaturaRequest> asignaturas= new ArrayList<AsignaturaRequest>();
	ArrayList<EvaluacionRequest > evaluaciones= new ArrayList<EvaluacionRequest >();

	@Override
	public EvaluacionResponse escuelaevaluacion(EvaluacionRequest parameters) {
		// TODO Auto-generated method stub

		EvaluacionRequest request=new EvaluacionRequest();
		EvaluacionResponse response=new EvaluacionResponse();
		request.setDNIalumno("");
		request.setIdasignatura("");
		request.setNota(-1);
		for (AlumnoRequest alumnos : alumno) {
			if (alumnos.getDNIalumno().equals(parameters.getDNIalumno())) {
				request.setDNIalumno(parameters.getDNIalumno());
			}
		}
		
		for (AsignaturaRequest asignaturas : asignaturas) {
			if (asignaturas.getIdasignatura().equals(parameters.getIdasignatura())) {
				request.setIdasignatura(parameters.getIdasignatura());
			}
		}
		
		if(parameters.getNota()<=10&&parameters.getNota()>=0) {
			request.setNota(parameters.getNota());	
		}
		
		
		if(request.getDNIalumno().equals("")||request.getIdasignatura().equals("")||request.getNota()==-1) {
			response.setGreet("no dado de alta");
			return response;
		}
		
		
		
		
		evaluaciones.add(request);
		response.setGreet("se ha dado de alta");
		return response;
		




		
	}

	@Override
	public AlumnoResponse escuelaalumno(AlumnoRequest parameters) {
		// TODO Auto-generated method stub
		AlumnoRequest request =new AlumnoRequest();
		AlumnoResponse response=new AlumnoResponse();
		request.setDireccionalumno(parameters.getDireccionalumno());
		request.setDNIalumno(parameters.getDNIalumno());
		request.setNamealumno(parameters.getNamealumno());
		for(int f=0;f<alumno.size();f++) {
			if(alumno.get(f).getDNIalumno().equals(request.getDNIalumno())) {
				response.setGreet("Usuario no dado de alta");
				return response;
			}
		}		
		alumno.add(request);
		response.setGreet("se ha dado de alta");
		return response;

	}






	@Override
	public AsignaturaResponse escuelaasignatura(AsignaturaRequest parameters) {
		// TODO Auto-generated method stub
		AsignaturaRequest request = new AsignaturaRequest();
		AsignaturaResponse response = new AsignaturaResponse();
		request.setIdasignatura(parameters.getIdasignatura());
		request.setNameasignatura(parameters.getNameasignatura());
		for(int f=0;f<asignaturas.size();f++) {
			if(asignaturas.get(f).getIdasignatura().equals(request.getIdasignatura())||asignaturas.get(f).getNameasignatura().equals(request.getNameasignatura())) {
				response.setGreet("asignatura no dada de alta");
				return response;
			}
		}
		asignaturas.add(request);
		response.setGreet("se ha dado de alta");
		return response;




	}
	
}

