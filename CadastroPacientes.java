import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

// tela de cadastro de pacientes
class Paciente {
    private static int contadorId = 1;
    private int id_paciente;
    private String nome;
    private int idade;
    private String setor;

    public Paciente(String nome, int idade, String setor) {
        this.id_paciente = contadorId++;
        this.nome = nome;
        this.idade = idade;
        this.setor = setor;
    }

    public String getInformacoes() {
        return "ID: " + id_paciente + ", Nome: " + nome + ", Idade: " + idade + ", Setor: " + setor;
    }
}

public class CadastroPacientes {
    private List<Paciente> listaPacientes = new ArrayList<>();

    public CadastroPacientes() {
        JFrame frame = new JFrame("Cadastro de Pacientes"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        JPanel painelCadastro = new JPanel();
        painelCadastro.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel labelNome = new JLabel("Nome do Paciente:");
        JTextField campoNome = new JTextField();

        JLabel labelIdade = new JLabel("Idade:");
        JTextField campoIdade = new JTextField();

        JLabel labelSetor = new JLabel("Setor:");
        JTextField campoSetor = new JTextField();

        JButton botaoCadastrar = new JButton("Cadastrar");
        JButton botaoExibir = new JButton("Exibir Pacientes");

        painelCadastro.add(labelNome);
        painelCadastro.add(campoNome);
        painelCadastro.add(labelIdade);
        painelCadastro.add(campoIdade);
        painelCadastro.add(labelSetor);
        painelCadastro.add(campoSetor);
        painelCadastro.add(botaoCadastrar);
        painelCadastro.add(botaoExibir);

        frame.add(painelCadastro, BorderLayout.CENTER);

        JTextArea areaExibicao = new JTextArea();
        areaExibicao.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(areaExibicao);
        frame.add(scrollPane, BorderLayout.SOUTH);

        // Ação do botão de cadastro
        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nome = campoNome.getText();
                    int idade = Integer.parseInt(campoIdade.getText());
                    String setor = campoSetor.getText();

                    if (nome.isEmpty() || setor.isEmpty()) {
                        JOptionPane.showMessageDialog(frame, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    Paciente paciente = new Paciente(nome, idade, setor);
                    listaPacientes.add(paciente);

                    JOptionPane.showMessageDialog(frame, "Paciente cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    campoNome.setText("");
                    campoIdade.setText("");
                    campoSetor.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Idade deve ser um número válido!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        botaoExibir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder("Lista de Pacientes:\n");
                for (Paciente p : listaPacientes) {
                    sb.append(p.getInformacoes()).append("\n");
                }
                areaExibicao.setText(sb.toString());
            }
        });

        frame.setVisible(true); 
    }

    public static void main(String[] args) {
        new CadastroPacientes();
    }
}
