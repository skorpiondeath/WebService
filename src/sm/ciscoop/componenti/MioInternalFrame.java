package sm.ciscoop.componenti;

import javax.swing.JInternalFrame;

public class MioInternalFrame extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	
	private static int openFrameCount = 0;
	private static final int xOffset = 30, yOffset = 30;

	public MioInternalFrame() {
	    super("Document #" + (++openFrameCount),
	          true, //resizable
	          true, //closable
	          true, //maximizable
	          true);//iconifiable

	    setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
	}

}
