package aulasmarcao.src.orientacoaobjetos.interfaceGUI; // Define o pacote onde a classe está localizada

import java.awt.GridLayout; // Importa a classe GridLayout para gerenciamento do layout
import javax.swing.JButton; // Importa a classe JButton para criar botões
import javax.swing.JFrame; // Importa a classe JFrame para criar a janela principal
import javax.swing.JLabel; // Importa a classe JLabel para criar rótulos (labels)
import javax.swing.JPanel; // Importa a classe JPanel para criar painéis de conteúdo
import javax.swing.JTextField; // Importa a classe JTextField para criar campos de texto

// Define a classe Agenda que herda de JFrame, o que significa que Agenda é uma janela (frame) 
public class Agenda extends JFrame {

    // Declaração de componentes da interface gráfica
    JLabel lblTitulo, lbl1, lbl2, lbl3;
    JButton btnProx, btnAnt, btnExit;
    JTextField txtNome, txtEndereco, txtFone;

    // Construtor da classe Agenda
    public Agenda() {
        // Inicializa os componentes com seus respectivos textos
        lblTitulo = new JLabel("Titulo", JLabel.CENTER); // Rótulo do título, centralizado
        lbl1 = new JLabel("Nome"); // Rótulo para o campo "Nome"
        lbl2 = new JLabel("Endereco"); // Rótulo para o campo "Endereço"
        lbl3 = new JLabel("Fone"); // Rótulo para o campo "Telefone"
        txtNome = new JTextField(); // Campo de texto para "Nome", com 20 colunas
        txtEndereco = new JTextField(); // Campo de texto para "Endereço", com 20 colunas
        txtFone = new JTextField(); // Campo de texto para "Telefone", com 20 colunas
        btnProx = new JButton("Proximo"); // Botão "Próximo"
        btnAnt = new JButton("Anterior"); // Botão "Anterior"
        btnExit = new JButton("Sair"); // Botão "Sair"

        // Adiciona o título na parte superior da janela
        add(lblTitulo, "North");

        // Configura o painel de dados com um layout de grade (3 linhas e 2 colunas)
        JPanel pDados = new JPanel(new GridLayout(3, 2));
        // Adiciona os rótulos e campos de texto ao painel de dados
        pDados.add(lbl1);
        pDados.add(txtNome);
        pDados.add(lbl2);
        pDados.add(txtEndereco);
        pDados.add(lbl3);
        pDados.add(txtFone);
        // Adiciona o painel de dados ao centro da janela
        add(pDados, "Center");

        // Cria um painel para os botões
        JPanel pBtn = new JPanel();
        // Adiciona os botões ao painel de botões
        pBtn.add(btnProx);
        pBtn.add(btnAnt);
        pBtn.add(btnExit);
        // Adiciona o painel de botões na parte inferior da janela
        add(pBtn, "South");

        // Configurações do frame (janela)
        setTitle("Agenda"); // Define o título da janela
        pack(); // Ajusta o tamanho da janela para acomodar todos os componentes
        setVisible(true); // Torna a janela visível
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Define o comportamento de fechamento da janela
    }

    // Método principal para executar a aplicação
    public static void main(String[] args) {
        new Agenda(); // Cria uma nova instância da janela Agenda
    }
}
