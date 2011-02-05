package sm.ciscoop.componenti;

import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;

import javax.swing.JTabbedPane;

public class MioTabbedPane extends JTabbedPane implements DropTargetListener{

	private static final long serialVersionUID = 1L;

	public MioTabbedPane() {
		super();
	}
	
	@Override
	public void dragEnter(DropTargetDragEvent dtde) {
		System.out.println("Entrato un drag");
		
	}

	@Override
	public void dragExit(DropTargetEvent dte) {
		System.out.println("Uscito un drag");
		
	}

	@Override
	public void dragOver(DropTargetDragEvent dtde) {
		System.out.println("Drag over");
	}

	@Override
	public void drop(DropTargetDropEvent dtde) {
		System.out.println("Dropped");
		
	}

	@Override
	public void dropActionChanged(DropTargetDragEvent dtde) {
		System.out.println("Drop action change");
	}

}
