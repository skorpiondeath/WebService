package sm.ciscoop.componenti;

import java.awt.datatransfer.Transferable;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;

import javax.swing.JDesktopPane;

public class MioDesktopPane extends JDesktopPane implements DropTargetListener {

	private static final long serialVersionUID = 9068548907564241764L;

	public MioDesktopPane() {
		super();
		
		DropTarget dropTarget = new DropTarget(this, this);
		setDropTarget(dropTarget);
	}
	
	@Override
	public void dragEnter(DropTargetDragEvent dtde) {
		System.out.println("Prova");
	}

	@Override
	public void dragExit(DropTargetEvent dte) {

	}

	@Override
	public void dragOver(DropTargetDragEvent dtde) {

	}

	@Override
	public void drop(DropTargetDropEvent dtde) {
		Transferable oggetto = dtde.getTransferable();
		
	}

	@Override
	public void dropActionChanged(DropTargetDragEvent dtde) {
		
	}
}
