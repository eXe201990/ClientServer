package ro.oldtech.agenda.client.view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainViewJFrame implements ActionListener {

	JFrame mainFrame = new JFrame();
	ViewPanelComunicare panelComunicare = new ViewPanelComunicare();
	ViewPanelProprietati panelProprietati = new ViewPanelProprietati();
	ViewPanelUtilizator panelUtilizatori = new ViewPanelUtilizator();
	ViewPanelDespreAjutor panelDespreAjutor = new ViewPanelDespreAjutor();
	ViewPanelAgendaAdaugare panelAgendaAdaugare = new ViewPanelAgendaAdaugare();
	ViewPanelAgendaInterogare panelAgendaInterogare = new ViewPanelAgendaInterogare();

	private void closeAllPanels() {
		panelComunicare.setBounds(0, 0, 0, 0);
		panelComunicare.setVisible(false);
		panelProprietati.setBounds(0, 0, 0, 0);
		panelProprietati.setVisible(false);
		panelUtilizatori.setBounds(0, 0, 0, 0);
		panelUtilizatori.setVisible(false);
		panelAgendaAdaugare.setBounds(0, 0, 0, 0);
		panelAgendaAdaugare.setVisible(false);
		panelAgendaInterogare.setBounds(0, 0, 0, 0);
		panelAgendaInterogare.setVisible(false);
		panelDespreAjutor.setBounds(0, 0, 0, 0);
		panelDespreAjutor.setVisible(false);
	}

	public MainViewJFrame() {
		// TODO Auto-generated constructor stub
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setTitle("Agenda Client");
		mainFrame.setSize(900, 600);
		mainFrame.getContentPane().setLayout(null);
		
		mainFrame.setIconImage(new ImageIcon("resources/book.png").getImage());

		mainFrame.getContentPane().add(panelComunicare);
		mainFrame.getContentPane().add(panelProprietati);
		mainFrame.getContentPane().add(panelUtilizatori);
		mainFrame.getContentPane().add(panelAgendaAdaugare);
		mainFrame.getContentPane().add(panelAgendaInterogare);
		mainFrame.getContentPane().add(panelDespreAjutor);

		closeAllPanels();

		JMenuBar menuBar = new JMenuBar();
		mainFrame.setJMenuBar(menuBar);

		JMenu mnFisier = new JMenu("Fisier");
		mnFisier.setIcon(new ImageIcon("resources/book_open.png"));
		menuBar.add(mnFisier);

		JMenuItem mntmIesire = new JMenuItem("Iesire");
		mntmIesire.setIcon(new ImageIcon("resources/door_out.png"));
		mntmIesire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				mainFrame.dispose();
				System.exit(0);

			}
		});
		mnFisier.add(mntmIesire);

		JMenu mnConfigurare = new JMenu("Configurare");
		mnConfigurare.setIcon(new ImageIcon("resources/wrench_orange.png"));
		menuBar.add(mnConfigurare);

		JMenuItem mntmUtilizator = new JMenuItem("Utilizator");
		mntmUtilizator.setIcon(new ImageIcon("resources/user.png"));
		mntmUtilizator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeAllPanels();
				panelUtilizatori.setSize(500, 500);
				panelUtilizatori.setVisible(true);

			}
		});
		mnConfigurare.add(mntmUtilizator);

		JMenuItem mntmProprietati = new JMenuItem("Proprietati");
		mntmProprietati.setIcon(new ImageIcon("resources/script_gear.png"));
		mntmProprietati.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeAllPanels();
				panelProprietati.setSize(500, 500);
				panelProprietati.setVisible(true);
			}
		});
		mnConfigurare.add(mntmProprietati);

		JMenuItem mntmComunicare = new JMenuItem("Comunicare");
		mntmComunicare.setIcon(new ImageIcon("resources/connect.png"));
		mntmComunicare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeAllPanels();
				panelComunicare.setSize(500, 500);
				panelComunicare.setVisible(true);
			}
		});
		mnConfigurare.add(mntmComunicare);

		JMenu mnAgenda = new JMenu("Agenda");
		mnAgenda.setIcon(new ImageIcon("resources/book_go.png"));
		menuBar.add(mnAgenda);

		JMenuItem mntmAdaugare = new JMenuItem("Adaugare");
		mntmAdaugare.setIcon(new ImageIcon("resources/vcard_add.png"));
		mntmAdaugare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeAllPanels();
				panelAgendaAdaugare.setSize(500, 500);
				panelAgendaAdaugare.setVisible(true);
			}
		});
		mnAgenda.add(mntmAdaugare);

		JMenuItem mntmInterogare = new JMenuItem("Interogare");
		mntmInterogare.setIcon(new ImageIcon("resources/report.png"));
		mntmInterogare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeAllPanels();
				panelAgendaInterogare.setSize(500, 500);
				panelAgendaInterogare.setVisible(true);
			}
		});
		mnAgenda.add(mntmInterogare);

		JMenu mnDespre = new JMenu("Despre");
		mnDespre.setIcon(new ImageIcon("resources/exclamation.png"));
//		mnDespre.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				closeAllPanels();
//				panelDespreAjutor.setSize(500, 500);
//				panelDespreAjutor.setVisible(true);
//			}
//		});
		menuBar.add(mnDespre);

		JMenuItem mntmAjutor = new JMenuItem("Ajutor");
		mntmAjutor.setIcon(new ImageIcon("resources/help.png"));
		mntmAjutor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeAllPanels();
				panelDespreAjutor.setSize(500, 500);
				panelDespreAjutor.setVisible(true);
			}
		});
		mnDespre.add(mntmAjutor);
		
		mainFrame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
