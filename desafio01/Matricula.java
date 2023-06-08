package desafio01;

public class Matricula {

	private String nomeAluno;
	private String diciplina;
	private float nota01;
	private float nota02;
	private float nota03;
	float mediaComPeso;
	float med;
	
	


public  Matricula (String nomeAluno, String diciplina) {
	this.nomeAluno = nomeAluno;
	this.diciplina = diciplina;
	}
		



public float gerarMedia(float nota01, float nota02, float nota03) {
	
	med = (nota01 + nota02 + nota03 )/3 ;

	return med;
	
}

public float gerarMedia(float nota01, float nota02, float nota03, float pesoNota01, float pesoNota02, float pesoNota03) {
	
	mediaComPeso =(nota01+pesoNota01 + nota02+pesoNota03 +nota03+pesoNota02)/6 ;
	return mediaComPeso;
	
}


public void imprimirAluno() {
	System.out.println("Nomde do aluno: " + this.nomeAluno );
	System.out.println("Disciplina: " + this.diciplina);
	System.out.println("Media com peso: " + this.mediaComPeso);
    System.out.println("media: " + this.med);
	
}

	


public float getNota01() {
	return nota01;
}

public void setNota01(float nota01) {
	if(isNotaValida(nota01)) {
		this.nota01 = nota01;
	}else{this.nota01 = 0;
	 }
	
}
private boolean isNotaValida(float nota01) {
	return nota01 >= 0 && nota01 <=10 ;
	
}

public float getNota02() {
	return nota02;
}

public void setNota02(float nota02) {
	if(isNotaValida2(nota02)){
		this.nota02 = nota02;
	}else {this.nota02 = 0;}
	}
private boolean isNotaValida2(float nota02) {
	return nota02 >= 0 && nota02 <=10 ;
}

public float getNota03() {
	return nota03;
}

public void setNota03(float nota03) {
	if(isNotaValida3(nota03)) {
	this.nota03 = nota03;
	}else {
		this.nota03 = 0;
	}
}
private boolean isNotaValida3(float nota03) {
	return nota03 >= 0 && nota03 <=10 ;

}
}