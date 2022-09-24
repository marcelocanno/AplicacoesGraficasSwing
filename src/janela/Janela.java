package janela;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Janela extends JFrame{

		public Janela() {
			setTitle("Robot Alive");
			setSize(600,400);
			setLocation(600,400);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			/* menus
			
			
			*/
			
			JMenuBar menu = new JMenuBar();
			
			JMenu menuArquivo = new JMenu("Arquivo");
			menuArquivo.setMnemonic('A');
			
			
			JMenu menuEditar = new JMenu("Editar");
			menuEditar.setMnemonic('E');
			
			JMenuItem itemNovo = new JMenuItem("Novo");
			itemNovo.setMnemonic('N');
			
			JMenuItem itemSair = new JMenuItem(new SairAction());
			itemSair.setText("Sair");
			itemSair.setMnemonic('S');
			
			
			menuArquivo.add(itemNovo);
			menuArquivo.add(itemSair);
			
			
			JMenuItem itemCopiar = new JMenuItem("Copiar");
			itemCopiar.setMnemonic('C');
			menuEditar.add(itemCopiar);
			
			menu.add(menuArquivo);
			menu.add(menuEditar);
			
			
			setJMenuBar(menu);
			setVisible(true);
		}
	
		
	public static void main(String[] args) {
		new Janela();

	}

}
