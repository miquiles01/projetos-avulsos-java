import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela de Login");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        frame.add(panel);

        JLabel logo = new JLabel("Login", SwingConstants.CENTER);
        logo.setFont(new Font("Calibri", Font.BOLD, 18));
        logo.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(logo);

        panel.add(Box.createRigidArea(new Dimension(0, 20))); 

        JLabel labelLogin = new JLabel("Usuário:");
        JTextField campoLogin = new JTextField(20);
        panel.add(labelLogin);
        panel.add(campoLogin);

        panel.add(Box.createRigidArea(new Dimension(0, 10))); 

        JLabel labelSenha = new JLabel("Senha:");
        JPasswordField campoSenha = new JPasswordField(20);
        panel.add(labelSenha);
        panel.add(campoSenha);

        panel.add(Box.createRigidArea(new Dimension(0, 10))); 

        JButton botaoLogin = new JButton("Entrar");
        botaoLogin.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(botaoLogin);

        panel.add(Box.createRigidArea(new Dimension(0, 10))); 

        JButton botaoCadastro = new JButton("Cadastre-se");
        botaoCadastro.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(botaoCadastro);

        JButton botaoRecuperarSenha = new JButton("Esqueci minha senha");
        botaoRecuperarSenha.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(botaoRecuperarSenha);

        botaoLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoLogin.getText();
                String senha = new String(campoSenha.getPassword());
                
                if (usuario.equals("admin") && senha.equals("123")) {
                    JOptionPane.showMessageDialog(frame, "Login realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Usuário ou senha incorretos.", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        botaoCadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Redirecionando para a tela de cadastro.", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        botaoRecuperarSenha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Redirecionando para a recuperação de senha.", "Recuperar Senha", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        frame.setVisible(true);
    }
}
