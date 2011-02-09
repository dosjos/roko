package rodekors.registrering.gui;


import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Tabell extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private JTable table;
    //final MyTableModel model;
    private JTextField filterText;
    private TableRowSorter<DefaultTableModel> sorter;
    public JTextField statusText;
    DefaultTableModel model;
    public Tabell() {
     //   super();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        //Create a table with a sorter.
      //  model = new MyTableModel();
    	String[] col = {"Navn", "Anommet"};
       String[][] data =  {{"en", "to"}, {"to", "tre"}};
        model = new DefaultTableModel( null , col);
        sorter = new TableRowSorter<DefaultTableModel>(model);
        table = new JTable(model);
       //
        
        table.setRowSorter(sorter);
        table.setPreferredScrollableViewportSize(new Dimension(500, 500));
        table.setFillsViewportHeight(true);
        //For the purposes of this example, better to have a single
        //selection.
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //When selection changes, provide user with row numbers for
        //both view and model.
        table.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
                    public void valueChanged(ListSelectionEvent event) {
                        int viewRow = table.getSelectedRow();
                        if (viewRow < 0) {
                            //Selection got filtered away.
                            
                        } else {
                        	int modelRow = table.convertRowIndexToModel(viewRow);
                        	
                        	int col = 0;
                        	String test = (String) model.getValueAt(modelRow, col);
                         }
                    }
                }
        );


        //Create the scroll pane and add the table to it.
        JScrollPane scrollPane = new JScrollPane(table);

        //Add the scroll pane to this panel.
        add(scrollPane);

        //Create a separate form for filterText and statusText
      //  JPanel form = new JPanel(new SpringLayout());
        

//        JLabel l2 = new JLabel("Status:", SwingConstants.TRAILING);
//        form.add(l2);
//        statusText = new JTextField();
//        l2.setLabelFor(statusText);
//        form.add(statusText);
//        SpringUtilities.makeCompactGrid(form, 2, 2, 6, 6, 6, 6);
    }

    public void  addField(String s)
    {
    	Object[] o = {s, "jess"};
    	model.insertRow(table.getRowCount(), o);
    }


    class MyTableModel extends AbstractTableModel {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	//	private String[] columnNames = {"Navn", "Anommet"};
    //   private Object[][] data =  {{"en", "to"}, {"to", "tre"}};

        
        
//        public int getColumnCount() {
//        	return columnNames.length;
//        }

//        public int getRowCount() {
//            return data.length;
//        }

//        @Override
//		public String getColumnName(int col) {
//            return columnNames[col];
//        }

//        public Object getValueAt(int row, int col) {
//            return data[row][col];
//        }

        /*
         * JTable uses this method to determine the default renderer/
         * editor for each cell.  If we didn't implement this method,
         * then the last column would contain text ("true"/"false"),
         * rather than a check box.
         */
//        @Override
//		public Class<?> getColumnClass(int c) {
//            return getValueAt(0, c).getClass();
//        }

        /*
         * Don't need to implement this method unless your table's
         * editable.
         */
        @Override
		public boolean isCellEditable(int row, int col) {
            //Note that the data/cell address is constant,
            //no matter where the cell appears onscreen.
            if (col < 5) {
                return false;
            } else {
                return true;
            }
        }

        /*
         * Don't need to implement this method unless your table's
         * data can change.
         */
        @Override
		public void setValueAt(Object value, int row, int col) {
  //          data[row][col] = value;
            fireTableCellUpdated(row, col);
        }

		@Override
		public int getColumnCount() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getRowCount() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			// TODO Auto-generated method stub
			return null;
		}


    }
    
}
