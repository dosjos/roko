package rodekors.registrering.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JPanel;

import rodekors.registrering.model.MainComunicator;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import javax.swing.text.PlainDocument;
import java.awt.event.KeyAdapter;
import java.util.Arrays;


import javax.swing.*;

public class MainGUI extends PlainDocument {
    JComboBox comboBox;
    ComboBoxModel model;
    JTextComponent editor;
	private static final long serialVersionUID = 1L;
	private static JPanel main;
	private static JPanel top;
	private static JPanel bottom;
	private static JPanel middle;
	private static JButton knapp;
	private static JButton button_1;
	private static JButton button_2;
	private static JButton button_3;
	private static JPanel table;
	private static JLabel label;
	private static JMenuBar menuBar;
	private static JMenu menu;
	private static JMenuItem menuItem;
	private static JMenu menu_1;
	private static JMenu menu_2;
	private static JMenuItem menuItem_1;
	private static JMenuItem menuItem_2;
	private static JMenuItem menuItem_3;
	private static JMenuItem menuItem_4;
	private String[] navnICombo, navnIDag;
	private static MainComunicator mc;
	static KnappeLytter kl;
    // flag to indicate if setSelectedItem has been called
    // subsequent calls to remove/insertString should be ignored
    boolean selecting=false;
    JFrame frame;
    
    
    public MainGUI(final JComboBox comboBox, MainGUI mainGUI) {
        this.comboBox = comboBox;
        model = comboBox.getModel();
        editor = (JTextComponent) comboBox.getEditor().getEditorComponent();
        mainGUI.model = model;
        mainGUI.editor = editor;
        mainGUI.comboBox = comboBox;
    }
    
    public MainGUI() {}

	public void remove(int offs, int len) throws BadLocationException {
        // return immediately when selecting an item
        if (selecting) return;
        super.remove(offs, len);
    }
    
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        // return immediately when selecting an item
        if (selecting) return;
        // insert the string into the document
        super.insertString(offs, str, a);
        // lookup and select a matching item
        Object item = lookupItem(getText(0, getLength()));
        setSelectedItem(item);
        try{
        	setText(item.toString());
        }catch(NullPointerException e){}
        // select the completed part
        highlightCompletedText(offs+str.length());
    }
    
    private void setText(String text) throws BadLocationException {
        // remove all text and insert the completed string
        super.remove(0, getLength());
        super.insertString(0, text, null);
    }
    
    private void highlightCompletedText(int start) {
        editor.setSelectionStart(start);
        editor.setSelectionEnd(getLength());
    }
    
    private void setSelectedItem(Object item) {
        selecting = true;
        model.setSelectedItem(item);
        selecting = false;
    }
    
    private Object lookupItem(String pattern) {
        // iterate over all items
        for (int i=0, n=model.getSize(); i < n; i++) {
            Object currentItem = model.getElementAt(i);
            // current item starts with the pattern?
            if (startsWithIgnoreCase(currentItem.toString(), pattern)) {
                System.out.println("'" + currentItem + "' matches pattern '" + pattern + "'");
                return currentItem;
            }
        }
        // no item starts with the pattern => return null
        return null;
    }
    
    // checks if str1 starts with str2 - ignores case
    private boolean startsWithIgnoreCase(String str1, String str2) {
        return str1.toUpperCase().startsWith(str2.toUpperCase());
    }
    
    public void createAndShowGUI(MainComunicator mainComunicator) {
        // the combo box (add/modify items if you like to)
    	Object o[] = mainComunicator.getAllKids();
    	navnICombo = new String[o.length];
    	for(int i = 0; i < o.length; i++){
    		navnICombo[i] = (String) o[i];
    	}
    	Arrays.sort(navnICombo);
    	
        final JComboBox comboBox = new JComboBox(o);
        // has to be editable
        comboBox.setEditable(true);
        // get the combo boxes editor component
        JTextComponent editor = (JTextComponent) comboBox.getEditor().getEditorComponent();
        // change the editor's document
        editor.setDocument(new MainGUI(comboBox, this));
        editor.addKeyListener(new KeyAdapter() {
        	  public void keyPressed(KeyEvent e) {
        	    if (comboBox.isDisplayable()) comboBox.setPopupVisible(true);
        	   
        	    switch (e.getKeyCode()) {
        	      // determine if the pressed key is backspace (needed by the remove method)
        	      case KeyEvent.VK_BACK_SPACE :
        	        break;
        	      // ignore delete key
        	      case KeyEvent.VK_DELETE :
        	        e.consume();
        	        UIManager.getLookAndFeel().provideErrorFeedback(comboBox);
        	        break;
        	      case KeyEvent.VK_ENTER :
        	    	  didAction();
        	    	  break;
        	    }
        	    
        	  }
        	});
        
        
        // create and show a window containing the combo box
        frame = new JFrame();
        
        
        //this.comboBox = comboBox;
		System.out.println("Boksen har antall : " + comboBox.getItemCount());
		this.mc = mainComunicator;
		frame = new JFrame();
		main    = new JPanel();
		top     = new JPanel();
		middle  = new JPanel();
		bottom  = new JPanel();
		
		middle.setSize(400,400);
		
		
		main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
		top.setLayout(new BoxLayout(top, BoxLayout.X_AXIS));
		middle.setLayout(new BoxLayout(middle, BoxLayout.Y_AXIS));
		bottom.setLayout(new BoxLayout(bottom, BoxLayout.X_AXIS));
		
		frame.getContentPane().add(main);
		main.add(top);
		
		label = new JLabel("Skriv inn navnet ditt: ");
		top.add(label);
		
		top.add(comboBox);

		
		kl = new KnappeLytter(this);
		
		knapp = new JButton("Registrer");
		knapp.addActionListener(kl);
		top.add(knapp);
		
		
		table = new Tabell();
		middle.add(table);
		main.add(middle);
		
		
		
		main.add(bottom);
		
		button_1 = new JButton("Vis statistikk");
		bottom.add(button_1);
		
		button_2 = new JButton("En eller annen funksjon");
		bottom.add(button_2);
		
		button_3 = new JButton("Avslutt");
		bottom.add(button_3);
		button_3.addActionListener(kl);
		
		//this.setSize(400, 400);
		
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		menu = new JMenu("Fil");
		menuBar.add(menu);
		
		menuItem_4 = new JMenuItem("Ny dag");
		menu.add(menuItem_4);
		
		menuItem = new JMenuItem("Exit");
		menu.add(menuItem);
		
		menu_1 = new JMenu("Options");
		menuBar.add(menu_1);
		
		menuItem_3 = new JMenuItem("Vis statistikk");
		menu_1.add(menuItem_3);
		
		menu_2 = new JMenu("Hjelp");
		menuBar.add(menu_2);
		
		menuItem_2 = new JMenuItem("Om");
		menu_2.add(menuItem_2);
		
		menuItem_1 = new JMenuItem("Hjelp");
		menu_2.add(menuItem_1);
        frame.setDefaultCloseOperation(3);
        frame.pack(); frame.setVisible(true);
    }
    
    public void addPeeps(String string) {
		// TODO Auto-generated method stub
    	String temp[] = new String[navnICombo.length + 1];
    	navnICombo = temp;
    	navnICombo[navnICombo.length -1] = string;    	
    	addNavn(string);
	}

    
    
	private void addNavn(String string) {
		// TODO Auto-generated method stub
		comboBox.setSelectedIndex(-1);
		System.out.println(string);
		((Tabell) table).addField(string);
	}

	public void didAction() {
		System.out.println(navnICombo.length);
		Object currentItem = model.getSelectedItem();
		if(currentItem == null){
			new NewPersonGUI(mc, this);	 
			return;
		}
		for(int i = 0; i < navnICombo.length; i++){		
			System.out.println(navnICombo[i]);
			//System.out.println( editor.get);
			if(navnICombo[i].equalsIgnoreCase(currentItem.toString())){
				addNavn((String) currentItem.toString()); 
				return;
			}	
		}
	}
    
    
	private class KnappeLytter implements ActionListener{

		private MainGUI mg;
		KnappeLytter(MainGUI mg){
			this.mg = mg;
			System.out.println("Opprettet lytteren");
		}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(arg0.getSource() == knapp){
				mg.didAction();
			}
			
			if(arg0.getSource() == button_3){
				mg.turnOf();
			}
		}
	}//END CLASS


	public void turnOf() {
		mc.turnOf();
	}

	
	
}
