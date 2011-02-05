package sm.ciscoop.gui;

import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JTree;
import javax.swing.ToolTipManager;

import sm.ciscoop.componenti.DefaultMutableTreeNodeDirectory;
import sm.ciscoop.componenti.DraggableTree;
import sm.ciscoop.componenti.MioDesktopPane;
import sm.ciscoop.componenti.MioTabbedPane;
import sm.ciscoop.componenti.MioTreeCellRenderer;
import sm.ciscoop.funzioni.RicaricaServizi;

public class SingletonGUI {
	public static final String URL_SERVIZI = "http://localhost:8080/servizi/servizi.xml";
	
	private JFrame c_framePrincipale = null;
	private JMenuBar c_menuBar = null;
	private MioTreeCellRenderer c_mioTreeCellRender = null;
	private JTree c_tree = null;
	
	public static synchronized SingletonGUI getInstance() {
		return new SingletonGUI();
	}

	private SingletonGUI() {
		c_framePrincipale = new JFrame("Gestione Web Service");
		c_framePrincipale.setSize(1000, 800);
		c_framePrincipale.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c_menuBar = creaMenuBar();
		c_framePrincipale.setJMenuBar(c_menuBar);
		c_framePrincipale.add(new JSeparator());
		
		c_tree = creaAlberoServizi();
		
		JScrollPane scrollPane = new JScrollPane(c_tree);
		MioTabbedPane tabbedPane = new MioTabbedPane();

		MioDesktopPane desktop = new MioDesktopPane();
		desktop.setSize(900, 700);
		desktop.setVisible(true);
		
		JInternalFrame frameInterno = new JInternalFrame("Prova Frame", true, true, true, true);
		frameInterno.setSize(200, 200);
		frameInterno.setVisible(true);
		desktop.add(frameInterno);
		
		
		tabbedPane.addTab("Pass", desktop);
		
		JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, scrollPane, tabbedPane);
		
		frameInterno.show();
	
		
		c_framePrincipale.getContentPane().add(splitPane);
		c_framePrincipale.setVisible(true);
	}

	private JTree creaAlberoServizi() {
		DefaultMutableTreeNodeDirectory radice = new DefaultMutableTreeNodeDirectory("Servizi");
		
		DraggableTree tree = new DraggableTree(radice, c_framePrincipale);
		c_mioTreeCellRender = new MioTreeCellRenderer();
		tree.setCellRenderer( c_mioTreeCellRender );
		ToolTipManager.sharedInstance().registerComponent(tree);
		return tree;
	}

	private JMenuBar creaMenuBar() {
		JMenuBar menuBar = new JMenuBar();

		// Build the first menu.
		JMenu menu = new JMenu("Principale");
		menu.setMnemonic(KeyEvent.VK_A);
		menu.getAccessibleContext().setAccessibleDescription("The only menu in this program that has menu items");
		JMenuItem menuItem = new JMenuItem("Ricarica Servizi");
		menuItem.addActionListener(new RicaricaServizi(this));
		menu.add(menuItem);
		menuBar.add(menu);

		return menuBar;
	}
	
	public JFrame getFramePrincipale() {
		return c_framePrincipale;
	}
	public JMenuBar getMenuBar() {
		return c_menuBar;
	}
	public JTree getTree() {
		return c_tree;
	}

}
