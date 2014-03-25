import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Collections;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class Cd extends javax.swing.JFrame {

	/**
	 * 
	 */
	private Vector<CDBean> CDs;
	private static final long serialVersionUID = 1L;
	private JMenu jMnuArchivo;
	private JTextField jtfTitulo;
	private JTextArea jtaPrestamo;
	private JTextField jtfGenero;
	private JTextField jtfAutor;
	private JLabel jlbCreditos;
	private JLabel jlbPrestamo;
	private JLabel jlbGenero;
	private JLabel jlbAutor;
	private JLabel jlbTitulo;
	private JMenuItem jmItemSalir;
	private JSeparator jSeparator1;
	private JMenuItem jmItemBuscarReg;
	private JMenuItem jmItemAnadirReg;
	private JMenuBar jMenuBar;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Cd inst = new Cd();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public Cd() {
		super();
		initGUI();
		CDs=new Vector<CDBean>();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			this.setTitle("Cd´s Prestados");
			this.setResizable(false);
			getContentPane().setBackground(new java.awt.Color(0,128,192));
			{
				jlbTitulo = new JLabel();
				getContentPane().add(jlbTitulo);
				jlbTitulo.setText("Título");
				jlbTitulo.setBounds(19, 24, 72, 16);
			}
			{
				jlbAutor = new JLabel();
				getContentPane().add(jlbAutor);
				jlbAutor.setText("Autor");
				jlbAutor.setBounds(19, 54, 45, 31);
			}
			{
				jlbGenero = new JLabel();
				getContentPane().add(jlbGenero);
				jlbGenero.setText("Género");
				jlbGenero.setBounds(19, 107, 51, 16);
			}
			{
				jlbPrestamo = new JLabel();
				getContentPane().add(jlbPrestamo);
				jlbPrestamo.setText("Préstamo");
				jlbPrestamo.setBounds(19, 177, 68, 16);
				jlbPrestamo.addFocusListener(new FocusAdapter() {
					public void focusGained(FocusEvent evt) {
						jtfFocusGained(evt);
					}
				});
			}
			{
				jlbCreditos = new JLabel();
				getContentPane().add(jlbCreditos);
				jlbCreditos.setText("copyright 2014-Cnr.");
				jlbCreditos.setBounds(524, 269, 122, 38);
			}
			{
				jtfAutor = new JTextField();
				getContentPane().add(jtfAutor);
				jtfAutor.setBounds(91, 59, 275, 21);
				jtfAutor.addFocusListener(new FocusAdapter() {
					public void focusGained(FocusEvent evt) {
						jtfFocusGained(evt);
					}
				});
			}
			{
				jtfTitulo = new JTextField();
				getContentPane().add(jtfTitulo);
				jtfTitulo.setBounds(91, 21, 275, 23);
				jtfTitulo.addFocusListener(new FocusAdapter() {
					public void focusGained(FocusEvent evt) {
						jtfFocusGained(evt);
					}
				});
			}
			{
				jtfGenero = new JTextField();
				getContentPane().add(jtfGenero);
				jtfGenero.setBounds(90, 104, 276, 23);
				jtfGenero.addFocusListener(new FocusAdapter() {
					public void focusGained(FocusEvent evt) {
						jtfFocusGained(evt);
					}
				});
			}
			{
				jtaPrestamo = new JTextArea();
				getContentPane().add(jtaPrestamo);
				jtaPrestamo.setBounds(87, 178, 277, 81);
				jtaPrestamo.setLineWrap(true);
			}
			{
				jMenuBar = new JMenuBar();
				setJMenuBar(jMenuBar);
				{
					jMnuArchivo = new JMenu();
					jMenuBar.add(jMnuArchivo);
					jMnuArchivo.setText("Archivo");
					jMnuArchivo.setMnemonic(java.awt.event.KeyEvent.VK_A);
					{
						jmItemAnadirReg = new JMenuItem();
						jMnuArchivo.add(jmItemAnadirReg);
						jmItemAnadirReg.setText("Añadir Registro");
						jmItemAnadirReg.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jmItemAnadirRegActionPerformed(evt);
							}
						});
					}
					{
						jmItemBuscarReg = new JMenuItem();
						jMnuArchivo.add(jmItemBuscarReg);
						jmItemBuscarReg.setText("Buscar Registro");
					}
					{
						jSeparator1 = new JSeparator();
						jMnuArchivo.add(jSeparator1);
					}
					{
						jmItemSalir = new JMenuItem();
						jMnuArchivo.add(jmItemSalir);
						jmItemSalir.setText("Salir");
						jmItemSalir.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								jmItemSalirActionPerformed(evt);
							}
						});
					}
				}
			}
			pack();
			this.setSize(652, 362);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private void jmItemSalirActionPerformed(ActionEvent evt) {
		int respuesta = JOptionPane.showConfirmDialog(null,
				"Esta acción cerrará la aplicación, ¿desea continuar?",
				"Atención",
				JOptionPane.YES_NO_OPTION);

				if (respuesta != JOptionPane.YES_OPTION) {
					return;
				}
				System.exit(0);
	}
	

	
     private void jtfFocusGained(FocusEvent evt) {
		javax.swing.text.JTextComponent jtb=null;
		jtb=(javax.swing.text.JTextComponent)evt.getSource();		
		jtb.selectAll();
	}
     
     public Vector<CDBean> getCDs() {
 		return CDs;
 	}
     
     private void jmItemAnadirRegActionPerformed(ActionEvent evt) {
    	 String titulo=null, autor=null, genero=null, descripcion=null;
 		
 		titulo=jtfTitulo.getText().toString();
 		
 		// Comprobamos que el titulo no sea nulo
 		if (titulo.compareTo("")==0) {
 			JOptionPane.showMessageDialog(null, "El campo titulo no puede estar vacio");
 			return;
 		}	
 		
 		autor=jtfAutor.getText().toString();
 		genero=jtfGenero.getText().toString();
 		descripcion=jtaPrestamo.getText().toString();
 		
 		CDs.add(new CDBean(titulo,autor,genero,descripcion));
 		Collections.sort(CDs);
 		System.out.println(CDs.toString().toString());
     }

}
