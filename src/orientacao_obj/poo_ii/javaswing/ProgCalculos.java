package orientacao_obj.poo_ii.javaswing;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProgCalculos extends JFrame {
	private JLabel lblTitulo, lblNumero, lblResultado;
	private JTextField txtNumero, txtResultado;
	private Button btnParImpar, btnFatorial, btnPrimo, btnLog2;

	public ProgCalculos() {
		lblTitulo = new JLabel("Cálculos Especiais", JLabel.CENTER);
		lblNumero = new JLabel("Número: ");
		lblResultado = new JLabel("Resultado: ");
		txtNumero = new JTextField(5);
		txtResultado = new JTextField(10);
		btnParImpar = new Button("Par/Ímpar");
		btnFatorial = new Button("Fatorial");
		btnPrimo = new Button("Primo");
		btnLog2 = new Button("Log 2");
		Ouvinte ov = new Ouvinte();
		btnParImpar.addActionListener(ov);
		btnFatorial.addActionListener(ov);
		btnPrimo.addActionListener(ov);
		btnLog2.addActionListener(ov);

		JPanel pNorte = new JPanel(new GridLayout(2, 1));
		pNorte.add(lblTitulo);
		JPanel pEntrada = new JPanel();
		pEntrada.add(lblNumero);
		pEntrada.add(txtNumero);
		pNorte.add(pEntrada);
		add(pNorte, BorderLayout.NORTH);

		JPanel pBtn = new JPanel(new GridLayout(2, 2));
		pBtn.add(btnParImpar);
		pBtn.add(btnFatorial);
		pBtn.add(btnPrimo);
		pBtn.add(btnLog2);
		add(pBtn, BorderLayout.CENTER);

		JPanel pResultado = new JPanel();
		pResultado.add(lblResultado);
		pResultado.add(txtResultado);
		add(pResultado, BorderLayout.SOUTH);

		setTitle("Programa de Cálculos");
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ProgCalculos();

	}

	private class Ouvinte implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent evt) {
			try {
				int n = Integer.parseInt(txtNumero.getText());
				Object btn = evt.getSource();
				if (btn == btnParImpar) {
					if (Calculos.isPar(n)) {
						txtResultado.setText("É par!");
					} else {
						txtResultado.setText("É ímpar!");
					}
				} else if (btn == btnFatorial) {
					txtResultado.setText("" + Calculos.fatorial(n));
				} else if (btn == btnPrimo) {
					if (Calculos.isPrimo(n)) {
						txtResultado.setText("É primo!");
					} else {
						txtResultado.setText("Não é primo!");
					}
				} else {
					txtResultado.setText("" + Calculos.log2(n));
				}
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(ProgCalculos.this, "Número inválido");
				txtNumero.setText("");
				txtNumero.requestFocus();
			}
		}

	}
}
