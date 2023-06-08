package desafio01;

public class testeMatricula {

	public static void main(String[] args) {
		
		Matricula aluno01 = new Matricula("Lucas","POO");
		
		
		aluno01.setNota01 (7.8f);
		aluno01.setNota02 (9.9f);
		aluno01.setNota03 (10.0f);
		
		aluno01.gerarMedia(10.0f,9.9f, 10.0f, 2.0f, 3.0f,4.0f); 
			
		
			aluno01.imprimirAluno();
}
}