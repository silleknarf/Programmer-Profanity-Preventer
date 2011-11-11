import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;


public class Main extends JFrame implements ActionListener {
// Programmer Profanity Preventer
	/**
	 * @param args
	 */
	
	JButton openButton;
	final JFileChooser fc = new JFileChooser();
	
	public Main() {
		super();
        //Create and set up the window.
    JFrame frame = new JFrame("Programmer Profanity Preventer");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);

    //Create the menu bar.  Make it have a green background.
    JMenuBar greenMenuBar = new JMenuBar();
    greenMenuBar.setOpaque(true);
    greenMenuBar.setBackground(new Color(154, 165, 127));
    //greenMenuBar.setPreferredSize(new Dimension(500, 500));

    //Create a yellow label to put in the content pane.
    JPanel blackLabel = new JPanel();
    blackLabel.setBackground(new Color(0, 0, 0));
    
    openButton = new JButton("Find the fucking swearing...");
    openButton.setPreferredSize(new Dimension(400, 20));
    openButton.addActionListener(this);
    
    //frame.add(openButton);
    fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    
    //Set the menu bar and add the label to the content pane.
    frame.setJMenuBar(greenMenuBar);
    frame.getContentPane().add(openButton, BorderLayout.CENTER);

    //Display the window.
    frame.pack();
    frame.setVisible(true);
	}
	
	
	public void replaceAllThatFuckingSwearing(File folder) {
		Regexes reg = new Regexes();
		ReadWriteTextFile rwtf = new ReadWriteTextFile();
		File toTraverse = folder;
		FolderTraverser ft = new FolderTraverser(toTraverse);
		File[] files = ft.traverse();	
		
		String fileContents = new String();
		for (File file : files) {
			fileContents = rwtf.getContents(file);
			fileContents = reg.replaceAllSwears(fileContents);
			try {
				rwtf.setContents(file, fileContents);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(file.getName());
		}
	}
    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Main();
            }
        });
    }
	
	public void actionPerformed(ActionEvent e) {
		 
        //Handle open button action.
        if (e.getSource() == openButton) {
        	int returnVal = fc.showOpenDialog(Main.this);
        	
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                replaceAllThatFuckingSwearing(fc.getSelectedFile());
            	System.exit(0);
            } else {
            	System.exit(0);
            }
        }
	}
	
}
