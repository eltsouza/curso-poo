package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;

public class AlunoList  extends Pessoa{
	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private List<DisciplinaList> disciplinas = new ArrayList<DisciplinaList>();
	
	public void setDisciplinas(List<DisciplinaList> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<DisciplinaList> getDisciplinas() {
		return disciplinas;
	}
	
	public AlunoList() { //cria os dados na memoria do java
	
	}
	
/*	public AlunoList(String nomePadrao) {		
		nome = nomePadrao;		
	}
	
	public AlunoList(String nomePadrao, int idadePadrao) {		
		nome = nomePadrao;
		idade = idadePadrao;
	}*/
	
	//Os metódos comuns Getters e Setters
   
	//O operador this, indica que é para apontar para o atributo da classe aluno.
	//O operador usper, indica que o atributo é herdado da superclasse, no caso Pessoa.
	
	public void setNome(String nome) {
		super.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public double getMediaNota() {
		
		double somaNotas = 0.0;
		
		for (DisciplinaList disciplinaList : disciplinas) {
			
			//somaNotas += disciplinaList.getNota();
			  somaNotas += disciplinaList.getMediaNotas();
			
		}
		return somaNotas / disciplinas.size();
	}

	public boolean getAlunoAprovado() {
		
		double media = this.getMediaNota();
		
		if(media >= 70) {
			return true;
		}else {
			return false;
		}
	}
	public String getAlunoAprovado2() {
		
		double media = this.getMediaNota();
		
		if(media >= 50) {
		  if (media >= 70) {
  			return StatusAluno.APROVADO; //"Aluno foi aprovado. Parabéns.";
		  }else {
 			return  StatusAluno.RECUPERACAO;//"Aluno está de recuperação. Ultima chance.";
		  }
		}else {
			return  StatusAluno.REPROVADO;//"Aluno foi reprovado. Estude mais peste.";
		}
	}
	
	//	


	@Override
	public String toString() {
		return "AlunoList [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola
				+ ", serieMatriculado=" + serieMatriculado + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataMatricula == null) ? 0 : dataMatricula.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((nomeEscola == null) ? 0 : nomeEscola.hashCode());
		result = prime * result + ((nomeMae == null) ? 0 : nomeMae.hashCode());
		result = prime * result + ((nomePai == null) ? 0 : nomePai.hashCode());
		result = prime * result + ((numeroCpf == null) ? 0 : numeroCpf.hashCode());
		result = prime * result + ((registroGeral == null) ? 0 : registroGeral.hashCode());
		result = prime * result + ((serieMatriculado == null) ? 0 : serieMatriculado.hashCode());
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
		AlunoList other = (AlunoList) obj;
		if (dataMatricula == null) {
			if (other.dataMatricula != null)
				return false;
		} else if (!dataMatricula.equals(other.dataMatricula))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (nomeEscola == null) {
			if (other.nomeEscola != null)
				return false;
		} else if (!nomeEscola.equals(other.nomeEscola))
			return false;
		if (nomeMae == null) {
			if (other.nomeMae != null)
				return false;
		} else if (!nomeMae.equals(other.nomeMae))
			return false;
		if (nomePai == null) {
			if (other.nomePai != null)
				return false;
		} else if (!nomePai.equals(other.nomePai))
			return false;
		if (numeroCpf == null) {
			if (other.numeroCpf != null)
				return false;
		} else if (!numeroCpf.equals(other.numeroCpf))
			return false;
		if (registroGeral == null) {
			if (other.registroGeral != null)
				return false;
		} else if (!registroGeral.equals(other.registroGeral))
			return false;
		if (serieMatriculado == null) {
			if (other.serieMatriculado != null)
				return false;
		} else if (!serieMatriculado.equals(other.serieMatriculado))
			return false;
		return true;
	}
	
	
	@Override //identifica método sobreescrito, ou seja, já existe na SUPERCLASSE e está sendo reecrito na classe filha
	public boolean pessoaMaiorIdade() {
		//return super.pessoaMaiorIdade();
		
		return idade >= 21; // mudando a regra
		
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "Heheheh! pessoa é maior de idade. " : "Lascou! pessoa é menor de idade"; 
	}

	@Override
	public double salario() {
		return 1500.90;
	}



		
	

}

