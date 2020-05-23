package cursojava.classes;

import java.util.Arrays;

public class Disciplina {
	
	private double[] nota = new double[4];
	private String disciplina;
	
		
	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

    
	public double getMediaNotas() {
		
		double somaNotas = 0;
		
		for (int i = 0; i < nota.length; i++) {
			
			somaNotas += nota[i];
			
		}
	
	    return somaNotas / nota.length;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
		result = prime * result + Arrays.hashCode(nota);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		if (disciplina == null) {
			if (other.disciplina != null)
				return false;
		} else if (!disciplina.equals(other.disciplina))
			return false;
		if (!Arrays.equals(nota, other.nota))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Disciplina [nota1=" + nota + ", disciplina1=" + disciplina + ", nota2=" + nota + ", disciplina2="
				+ disciplina + ", nota3=" + nota + ", disciplina3=" + disciplina + ", nota4=" + nota
				+ ", disciplina4=" + disciplina + ", getNota1()=" + getNota() + ", getDisciplina1()="
				+ getDisciplina() + ", getNota2()=" + getNota() + ", getDisciplina2()=" + getDisciplina()
				+ ", getNota3()=" + getNota() + ", getDisciplina3()=" + getDisciplina() + ", getNota4()=" + getNota()
				+ ", getDisciplina4()=" + getDisciplina() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
