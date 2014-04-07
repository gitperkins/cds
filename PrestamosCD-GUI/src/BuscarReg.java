import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
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
public class BuscarReg extends javax.swing.JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton jbtAceptar;
	private JButton jbtBorrar;
	private JScrollPane jScrollPane1;
	private JList jlsListaCDs;
	private JButton jbtCancelar;
	
	CD ventanaPadre;

	/**
	* Auto-generated main method to display this JDialog
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				BuscarReg inst = new BuscarReg(frame);
				inst.setVisible(true);
			}
		});
	}
	
	public BuscarReg(JFrame frame) {
		super(frame);
		initGUI();
		ventanaPadre=(CD)frame;
		jlsListaCDs.setListData(ventanaPadre.getCDs());	
	}
	
	private void initGUI() {
		try {
			
			{
				this.setResizable(false);
				getContentPane().setLayout(null);
				this.setTitle("Buscar Registro");
				getContentPane().setBackground(new java.awt.Color(0,128,192));
				{
					jbtAceptar = new JButton();
					getContentPane().add(jbtAceptar);
					jbtAceptar.setText("Aceptar");
					jbtAceptar.setBounds(285, 21, 90, 26);
					jbtAceptar.setMnemonic(java.awt.event.KeyEvent.VK_A);
					jbtAceptar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jbtAceptarActionPerformed(evt);
						}
					});
				}
				{
					jbtCancelar = new JButton();
					getContentPane().add(jbtCancelar);
					jbtCancelar.setText("Cancelar");
					jbtCancelar.setBounds(285, 58, 90, 26);
					jbtCancelar.setMnemonic(java.awt.event.KeyEvent.VK_C);
					jbtCancelar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jbtCancelarActionPerformed(evt);
						}
					});
				}
				{
					jbtBorrar = new JButton();
					getContentPane().add(jbtBorrar);
					jbtBorrar.setText("Borrar");
					jbtBorrar.setBounds(285, 95, 90, 26);
					jbtBorrar.setMnemonic(java.awt.event.KeyEvent.VK_B);
					jbtBorrar.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							jbtBorrarActionPerformed(evt);
						}
					});
				}
				{
					jScrollPane1 = new JScrollPane();
					getContentPane().add(jScrollPane1);
					jScrollPane1.setBounds(17, 21, 247, 220);
					{
			ListModel jlsListaCDsModel=	new DefaultComboBoxModel(new String[] {""});
						jlsListaCDs = new JList();
						jScrollPane1.setViewportView(jlsListaCDs);
						jlsListaCDs.setModel(jlsListaCDsModel);
					}
					jScrollPane1.setViewportView(jlsListaCDs);
				}
			}
			setSize(400, 300);
			getRootPane().setDefaultButton(jbtAceptar);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void jbtAceptarActionPerformed(ActionEvent evt) {
		// obtiene el indice y lo visualiza en la pantalla principal.
		int i=jlsListaCDs.getSelectedIndex();
		if (i>=0)
			ventanaPadre.setRegDatos(i);
	}
	
	private void jbtCancelarActionPerformed(ActionEvent evt) {
		// Ocultamos la ventana y la eliminamos.
		this.setVisible(false);
		this.dispose();
	}
	
	public void actualizarLista() {
		// metodo para actualizar los cd´s si tenemos altas..
		jlsListaCDs.setListData(ventanaPadre.getCDs());
	}
	
	private void jbtBorrarActionPerformed(ActionEvent evt) {
		// metodo para eliminar un cd de la lista y del vector de cd´s.
		int i=jlsListaCDs.getSelectedIndex();
		if (i>=0) {
			ventanaPadre.getCDs().remove(i);
			this.actualizarLista();
		}
	}

}
