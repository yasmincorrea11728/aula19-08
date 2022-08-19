import classes.Aluno;
import classes.Pedagoga;
import classes.Professor;

public class Principal {

    public static void main(String[] args) {
        Aluno a = new Aluno("Yasmin" , 17, 'F', "1234567", "Tecnico em Informática");

        Professor p = new Professor("André", 36, 'M', "Programação", 100000);

        Pedagoga pe = new Pedagoga("Luciney", 25, 'F', "Setor Pedagogico","Tecnico em Informática");

        a.FazerAniversário();
        pe.FazerAniversário();
        p.ReceberAumento();
        System.out.println("O salário do professor é: " + p.getSalario());
        p.ReceberAumento();
        System.out.println("O salário do professor é: " + p.getSalario());
        pe.FazerAniversário();
        pe.mudarTrabalho("Tecnico em Química");


    }
    
}
