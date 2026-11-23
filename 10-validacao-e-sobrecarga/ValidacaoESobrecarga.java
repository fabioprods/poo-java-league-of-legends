public class ValidacaoESobrecarga {
    public static void main(String[] args) {
        Matricula m = new Matricula("Fabio", "Algoritmos");
        m.setNota1(9);
        m.setNota2(8);
        m.setNota3(12);
        m.imprimir();
    }
}

class Matricula {
    private String nomeAluno;
    private String nomeDisciplina;
    private double nota1;
    private double nota2;
    private double nota3;


    Matricula(String nomeAluno, String nomeDisciplina) {
        this.nomeAluno = nomeAluno;
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getNomeAluno() {
        return this.nomeAluno;
    }

    public String getNomeDisciplina() {
        return this.nomeDisciplina;
    }

    public double getNota1() {
        return this.nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public double getNota3() {
        return this.nota3;
    }

    public void setNota1(double nota1) {
        if (nota1 < 0) {
            this.nota1 = 0;
        } else if (nota1 > 10) {
            this.nota1 = 10;
        } else {
            this.nota1 = nota1;
        }
    }

    public void setNota2(double nota2) {
        if (nota2 < 0) {
            this.nota2 = 0;
        } else if (nota2 > 10) {
            this.nota2 = 10;
        } else {
            this.nota2 = nota2;
        }
    }

    public void setNota3(double nota3) {
        if (nota3 < 0) {
            this.nota3 = 0;
        } else if (nota3 > 10) {
            this.nota3 = 10;
        } else {
            this.nota3 = nota3;
        }
    }

    public double calcularMediaFinal() {
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    public double calcularMediaFinal(double peso1, double peso2, double peso3) {
        return ((this.nota1 * peso1) + (this.nota2 * peso2) + (this.nota3 * peso3)) / (peso1 + peso2 + peso3);
    }

    public void imprimir() {
        System.out.println("Nome do Aluno: " + this.nomeAluno);
        System.out.println("Nome da Disciplina: " + this.nomeDisciplina);
        System.out.println("Média Final: " + this.calcularMediaFinal());
    }
}
