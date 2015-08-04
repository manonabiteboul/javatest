import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.util.ArrayList;
public class Fenetre extends JFrame implements ActionListener {
	private JPanel container = new JPanel();
	private JPanel container2 = new JPanel();
	private JLabel label= new JLabel("Select which main activity you want to do:");
	private JLabel choix = new JLabel("Tu n'as pas encore choisi");
	private JButton bouton = new JButton("ca");
	private ArrayList lmanger = new ArrayList();
	private ArrayList activite= new ArrayList();
	private Categorie store = new Categorie();;

	public Fenetre(){
		lmanger.add("pain");
		lmanger.add("orange");
		lmanger.add("gateau");
		Categorie manger= new  Categorie("manger",lmanger);
		activite.add(manger);
		
		ArrayList lboire = new ArrayList();
		lboire.add("eau");
		lboire.add("jus d'orange");
		lboire.add("coca");
		lboire.add("eau");
		Categorie boire= new Categorie("boire",lboire);
		activite.add(boire);
		
		ArrayList ltoilettes = new ArrayList();
		Categorie toilettes= new Categorie("aller aux toilettes",ltoilettes);
		activite.add(toilettes);
		
		ArrayList ljouer = new ArrayList();
		ljouer.add("ball.e");
		ljouer.add("courir");
		ljouer.add("dessiner");
		Categorie jouer= new Categorie("jouer",ljouer);
		activite.add(jouer);
		JPanel options=new JPanel();
		options.setLayout(new GridLayout(4, 3));
		int n= activite.size();
		
//		JButton a = new JButton();
//			a.setText(((Categorie)activite.get(0)).getName());
//			options.add(a); 
//
//		JButton b = new JButton();
//			b.setText(((Categorie)activite.get(1)).getName());
//			options.add(b);
//			
//		JButton c = new JButton();
//		c.setText(((Categorie)activite.get(2)).getName());
//		options.add(c);
//		
//		JButton d = new JButton();
//		d.setText(((Categorie)activite.get(3)).getName());
//		options.add(d);

		
		for(int i = 0 ;i<activite.size(); i++)
		{
			JButton b = new JButton();
			b.setText(((Categorie)activite.get(i)).getName());
			options.add(b);
		}
		
	

		
		this.setTitle("Test d'apli");
		this.setSize(210,320);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		
		
		options.add(bouton);

		container.add(options, BorderLayout.CENTER);
	
		choix.setForeground(Color.BLACK);
		Font police = new Font("Tahoma", Font.PLAIN, 16 );
		choix.setFont(police);
		choix.setHorizontalAlignment(JLabel.CENTER);
		container.add(choix, BorderLayout.SOUTH);
		
		bouton.addActionListener(new BoutonListenerTest());
		
		this.setContentPane(container);
		this.setVisible(true);
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//this.setContentPane(container2);
		//container.remove(options);
		
		
	}
		




	
public void actionPerformed(ActionEvent arg0) {
	
}
class BoutonListenerTest implements ActionListener {
	public void actionPerformed(ActionEvent arg0){
		choix.setText("Tu as choisi ca");
			
			
		
	}
}
}