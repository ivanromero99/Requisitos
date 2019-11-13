package Interfaz;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;

import javax.swing.JFrame;

public class Window {

	public static Window window = new Window();

	private JFrame frame;

	public Window() {
		frame = new JFrame();
		frame.setTitle("TreceSoft");
		frame.setResizable(false);
		/*
		 * GridBagLayout gridBagLayout = new GridBagLayout();
		 * gridBagLayout.columnWeights = new double[] { 0.0 }; gridBagLayout.rowWeights
		 * = new double[] { 0.0, Double.MIN_VALUE };
		 * 
		 * frame.getContentPane().setLayout(gridBagLayout);
		 */
		frame.setBounds(100, 100, 1200, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}

	public JFrame getFrame() {
		return this.frame;
	}

	public static void open(OpenableWindow openable) {
		Container container = window.getFrame().getContentPane();
		/*
		 * if (container.getComponents().length != 0) { container.remove(0); }
		 */

		container.removeAll();

		if (openable.isCentered()) {
			GridBagLayout gridBagLayout = new GridBagLayout();
			gridBagLayout.columnWeights = new double[] { 0.0 };
			gridBagLayout.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
			window.getFrame().setLayout(gridBagLayout);
		} else {
			window.getFrame().setLayout(new BorderLayout());
		}

		container.add(openable.getWindow());

		// window.getFrame().setVisible(false);
		window.getFrame().setVisible(true);
	}
}
