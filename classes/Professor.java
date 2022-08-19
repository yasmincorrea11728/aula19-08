package classes;

public class Professor extends Pessoa{

    private String especialidade;
    private double salario;


    public Professor(String nome, int idade, char sexo, String especialidade, double salario) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }


public void ReceberAumento(){
    this.salario = this.salario + (this.salario * 0.1);
    
}


public String getSetor() {
    return especialidade;
}


public void setSetor(String especialidade) {
    this.especialidade = especialidade;
}


public double getSalario() {
    return salario;
}


public void setSalario(double salario) {
    this.salario = salario;
}
    }