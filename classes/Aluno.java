package classes;

public class Aluno extends Pessoa{

    private String matrícula;
    private String curso;

    public Aluno(){}

    public Aluno(String nome, int idade, char sexo, String matrícula, String curso) {
        super(nome, idade, sexo);
        this.matrícula = matrícula;
        this.curso = curso;
    }

public void CancelarMatrícula(){
    System.out.println("Matrícula cancelada com sucesso.");
    this.curso = " ";
    this.matrícula = " ";
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getIdade() {
    return idade;
}

public void setIdade(int idade) {
    this.idade = idade;
}

public char getSexo() {
    return sexo;
}

public void setSexo(char sexo) {
    this.sexo = sexo;
}

public String getMatrícula() {
    return matrícula;
}

public void setMatrícula(String matrícula) {
    this.matrícula = matrícula;
}

public String getCurso() {
    return curso;
}

public void setCurso(String curso) {
    this.curso = curso;
    }
}