

import javax.swing.JFrame;
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
	}
	
	private void initGUI() {
		try {
			{
				this.setResizable(false);
				getContentPane().setLayout(null);
				this.setTitle("Buscar Registro");
			}
			setSize(400, 300);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
