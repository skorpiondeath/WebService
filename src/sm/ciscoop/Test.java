package sm.ciscoop;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import sm.ciscoop.gui.SingletonGUI;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        try {
        	try {
        	    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        	        if ("Nimbus".equals(info.getName())) {
        	            UIManager.setLookAndFeel(info.getClassName());
        	            break;
        	        }
        	    }
        	} catch (Exception e) {
        	    // handle exception
        	}
        	//UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        	//UIManager.setLookAndFeel("com.seaglasslookandfeel.SeaGlassLookAndFeel");
		} 
		catch (Exception e) {
			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
        SingletonGUI gui = SingletonGUI.getInstance();

//		JPanel p = new JPanel(new MigLayout());
//
//		p.add(new JLabel("Company"), "gap para");
//		p.add(new JTextField(""),    "span, growx, wrap");
//		p.add(new JLabel("Contact"), "gap para");
//		p.add(new JTextField(""),    "span, growx, wrap para");
//
//		//addSeparator(p, "Propeller");
//
//		p.add(new JLabel("PTI/kW"),  "gap para");
//		p.add(new JTextField(10));
//		p.add(new JLabel("Power/kW"),"gap para");
//		p.add(new JTextField(10),    "wrap");
//		p.add(new JLabel("R/mm"),    "gap para");
//		p.add(new JTextField(10));
//		p.add(new JLabel("D/mm"),    "gap para");
//		p.add(new JTextField(10));
//
//		tabbedPane.addTab("Quick Start", p);

	}

}
