import java.util.Scanner;

public class Aluno {
    private String matricula;
    private String nome;
    private int idade;
    private double cr;

    // Construtor padrão
    public Aluno() { }

    // Construtor completo
    public Aluno(String matricula, String nome, int idade, double cr) {
        this.setMatricula(matricula);
        this.setNome(nome);
        this.setIdade(idade);
        this.setCr(cr);
    }

    // Construtor com apenas matrícula e nome
    public Aluno(String matricula, String nome) {
        this.setMatricula(matricula);
        this.setNome(nome);
    }

    // Métodos Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }

    // Método para entrada de dados
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        boolean continua = true;

        do {
            try {
                System.out.println("=================");
                System.out.print("Nome: ");
                this.setNome(sc.nextLine());
                System.out.print("Matrícula: ");
                this.setMatricula(sc.nextLine());
                System.out.print("Idade: ");
                this.setIdade(Integer.parseInt(sc.nextLine()));
                System.out.print("CR: ");
                this.setCr(Double.parseDouble(sc.nextLine()));
                continua = false;
            } catch (NumberFormatException nfe) {
                System.out.println("Erro: Entrada inválida. Tente novamente.");
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (continua);
    }

    // Método para exibir os dados do aluno
    public void imprimir() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("CR: " + this.getCr());
    }

    // Método para limpar os dados do aluno
    public void limpar() {
        this.nome = "";
        this.matricula = "";
        this.idade = 0;
        this.cr = 0.0;
    }
}
