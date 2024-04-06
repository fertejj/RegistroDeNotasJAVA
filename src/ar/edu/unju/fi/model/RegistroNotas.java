package ar.edu.unju.fi.model;

public class RegistroNotas {
	private String codigo;
	private Alumno alumno;
	private Materia materia;
	private Float notalFinal;
	
	public RegistroNotas() {
		// TODO Auto-generated constructor stub
	}

	public RegistroNotas(String codigo, Alumno alumno, Materia materia, Float notalFinal) {
		super();
		this.codigo = codigo;
		this.alumno = alumno;
		this.materia = materia;
		this.notalFinal = notalFinal;
	}
	
	

	@Override
	public String toString() {
		return "Registro de Nota - Codigo Notarial: " + codigo + ", Alumno: " + alumno + ", Materia: " + materia + ", Nota Final: "
				+ notalFinal;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Float getNotalFinal() {
		return notalFinal;
	}

	public void setNotalFinal(Float notalFinal) {
		this.notalFinal = notalFinal;
	}
	
	
}
