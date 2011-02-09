package rodekors.registrering.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import rodekors.registrering.api.gui.RegisterPerson;
import rodekors.registrering.model.MainComunicator;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSplitPane;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;

public class NewPersonGUI extends JFrame implements RegisterPerson{

	JPanel main;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	JLabel label, label_1, label_2,label_3,label_4,label_5,label_6,label_7,label_8;
	private ButtonGroup buttonGroup;
	JButton button_1, button;
	MainComunicator mc;
	knappeLytter kl;
	MainGUI mg;
	
	NewPersonGUI(MainComunicator mc, MainGUI mg){
		this.mc = mc;
		this.mg = mg;
		mg.frame.setEnabled(false);
		main = new JPanel();
		getContentPane().add(main);
		main.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),}));
		
		label = new JLabel("Fornavn: *");
		main.add(label, "2, 2, right, default");
		
		textField = new JTextField();
		main.add(textField, "4, 2, fill, default");
		textField.setColumns(10);
		
		label_1 = new JLabel("Etternavn: *");
		main.add(label_1, "2, 4, right, default");
		
		textField_1 = new JTextField();
		main.add(textField_1, "4, 4, fill, default");
		textField_1.setColumns(10);
		
		label_2 = new JLabel("Fullt personnummer: *");
		main.add(label_2, "2, 6, right, default");
		
		textField_2 = new JTextField();
		main.add(textField_2, "4, 6, fill, default");
		textField_2.setColumns(10);
		
		label_3 = new JLabel("Kjønn: *");
		main.add(label_3, "2, 8, right, default");
		
		JPanel panel_1 = new JPanel();
		main.add(panel_1, "4, 8, fill, fill");
		
		buttonGroup = new ButtonGroup();
		
		JRadioButton radioButton = new JRadioButton("Mann");
		buttonGroup.add(radioButton);
		radioButton.setActionCommand("Mann");
		panel_1.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Kvinne");
		buttonGroup.add(radioButton_1);
		radioButton_1.setActionCommand("Kvinne");
		panel_1.add(radioButton_1);
		
		label_4 = new JLabel("Adresse");
		main.add(label_4, "2, 10, right, default");
		
		textField_4 = new JTextField();
		main.add(textField_4, "4, 10, fill, default");
		textField_4.setColumns(10);
		
		label_5 = new JLabel("Postkode: *");
		main.add(label_5, "2, 12, right, default");
		
		textField_5 = new JTextField();
		main.add(textField_5, "4, 12, fill, default");
		textField_5.setColumns(10);
		
		label_6 = new JLabel("Sted: *");
		main.add(label_6, "2, 14, right, default");
		
		textField_6 = new JTextField();
		main.add(textField_6, "4, 14, fill, default");
		textField_6.setColumns(10);
		
		label_7 = new JLabel("Epost:");
		main.add(label_7, "2, 16, right, default");
		
		textField_7 = new JTextField();
		main.add(textField_7, "4, 16, fill, default");
		textField_7.setColumns(10);
		
		label_8 = new JLabel("Telefonnummer:");
		main.add(label_8, "2, 18, right, default");
		
		textField_8 = new JTextField();
		main.add(textField_8, "4, 18, fill, default");
		textField_8.setColumns(10);
		
		JLabel label_9 = new JLabel("Felt med * MÅ fylles ut");
		main.add(label_9, "4, 20, left, default");
		
		JPanel panel = new JPanel();
		main.add(panel, "4, 22, fill, fill");
		panel.setLayout(new GridLayout(1, 0, 0, 0));
	
		kl = new knappeLytter(this);
		
		button = new JButton("Lagre");
		button.addActionListener(kl);
		panel.add(button);
		
		button_1 = new JButton("Avbryt");
		button_1.addActionListener(kl);
		panel.add(button_1);
		
		setTitle("Registrer av ny person");
		setVisible(true);
		this.setPreferredSize(new Dimension(400,360));
		pack();
		setDefaultCloseOperation(3);
	}
	
	
	private class knappeLytter implements ActionListener{
		boolean done;
		NewPersonGUI npg;
		String fName, lName, snr, place, postNr, gender; //mandatory
		String adress, mail, tlf;
		knappeLytter(NewPersonGUI npg){
			this.npg = npg;
		}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(arg0.getSource() == button){
				done = true;;
				//TODO a lot of variable checking.....
				if(npg.textField.getText().length() < 2){//Fornavn
					done = false;
					npg.label.setForeground(Color.RED);
				}else npg.label.setForeground(Color.BLACK);
				if(npg.textField_1.getText().length() < 2){
					done = false;
					npg.label_1.setForeground(Color.RED);
				}else npg.label_1.setForeground(Color.BLACK);
				if(npg.textField_2.getText().length() != 11){
					done = false;
					npg.label_2.setForeground(Color.RED);
				}//TODO legg in pnumer sjekk
				else npg.label_2.setForeground(Color.BLACK);
				
				if(npg.textField_5.getText().length() < 2){
					done = false;
					npg.label_5.setForeground(Color.RED);
				}else npg.label_5.setForeground(Color.BLACK);
				if(npg.textField_6.getText().length() < 2){
					done = false;
					npg.label_6.setForeground(Color.RED);
				}else npg.label_6.setForeground(Color.BLACK);

				int i = Integer.parseInt(npg.textField_5.getText());
				if(i < 1 || i > 9999){
					done = false;
					npg.label_5.setForeground(Color.RED);
				}
				
				if(npg.textField_7.getText().length() > 3 && !npg.textField_7.getText().contains("@")){
					npg.label_7.setForeground(Color.RED);
					done = false;
				}
				if(done){
					fuckOfAndDoItSomewhereElse();
				}
				
				
				
			}else if(arg0.getSource() == button_1){
				mg.frame.setEnabled(true);
				npg.dispose();
			}
			
		}
		private void fuckOfAndDoItSomewhereElse() {
			String fnavn, enavn, post, addr, place, mail, pnr, tlf, kjonn;
			
			fnavn = npg.textField.getText();
			enavn = npg.textField_1.getText();
			pnr = npg.textField_2.getText();
			kjonn = buttonGroup.getSelection().getActionCommand();
			addr = npg.textField_4.getText();
			post = npg.textField_5.getText();
			place = npg.textField_6.getText();
			mail = npg.textField_7.getText();
			tlf = npg.textField_8.getText();
			
			boolean dones = mc.registerKid(fnavn, enavn, pnr, place, post, kjonn, addr, mail, tlf);
			
			if(!dones){
				//TODO lag feilmelding
			}else{
				mg.frame.setEnabled(true);
				mg.addPeeps(fnavn + " " + enavn);
				dispose();
			}
			
		}
		
	}
	
}
