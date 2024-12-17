class Hospital {
    private int id_paciente;
    private String nome;
    private String setor;
    
    // Construtor combinando parâmetros
    public Hospital(int id_paciente, String nome, String setor) {
        this.id_paciente = id_paciente;
        this.nome = nome;
        this.setor = setor;
    }
    
    // Construtor específico para 'id_paciente'
    public Hospital(int id_paciente) {
        this.id_paciente = id_paciente;
    }
    
    // Construtor específico para 'nome'
    public Hospital(String nome) {
        this.nome = nome;
    }
    
    // Construtor específico para 'setor'
    public Hospital(String nome, String setor) {
        this.nome = nome;
        this.setor = setor;
    }
}

class Paciente extends Hospital {
    // Construtor correto chamando superclasse
    public Paciente(String nome) {
        super(nome); // Chama o construtor da superclasse
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Paciente
        Paciente paciente = new Paciente("João");

        System.out.println("Paciente criado com sucesso!");
    }
}
