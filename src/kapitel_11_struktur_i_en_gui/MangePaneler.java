/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel_11_struktur_i_en_gui;

/**
 *
 * @author j
 */
public class MangePaneler extends javax.swing.JPanel {
	/** Creates new form MangePaneler */
	public MangePaneler() {
		initComponents();
		this.jacobPanel1.ejer = this;
    /*
		jTabbedPane1.setUI(new javax.swing.plaf.basic.BasicTabbedPaneUI() {
			protected int calculateTabAreaHeight(int t, int h, int m) {
				return 0;
			}
		});
    */
	}

	public void sætFane(int fane) {
		jTabbedPane1.setSelectedIndex(fane);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jTabbedPane1 = new javax.swing.JTabbedPane();
    grafikpanel1 = new kapitel_10.Grafikpanel();
    grafikdemo1 = new kapitel_10.Grafikdemo();
    jacobPanel1 = new kapitel_11_struktur_i_en_gui.JacobPanel();
    java2DDemo1 = new kapitel_10.Java2DDemo();

    setLayout(new java.awt.BorderLayout());

    javax.swing.GroupLayout grafikpanel1Layout = new javax.swing.GroupLayout(grafikpanel1);
    grafikpanel1.setLayout(grafikpanel1Layout);
    grafikpanel1Layout.setHorizontalGroup(
      grafikpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 491, Short.MAX_VALUE)
    );
    grafikpanel1Layout.setVerticalGroup(
      grafikpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 306, Short.MAX_VALUE)
    );

    jTabbedPane1.addTab("tab2", grafikpanel1);

    javax.swing.GroupLayout grafikdemo1Layout = new javax.swing.GroupLayout(grafikdemo1);
    grafikdemo1.setLayout(grafikdemo1Layout);
    grafikdemo1Layout.setHorizontalGroup(
      grafikdemo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 491, Short.MAX_VALUE)
    );
    grafikdemo1Layout.setVerticalGroup(
      grafikdemo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 306, Short.MAX_VALUE)
    );

    jTabbedPane1.addTab("tab3", grafikdemo1);
    jTabbedPane1.addTab("tab4", jacobPanel1);

    javax.swing.GroupLayout java2DDemo1Layout = new javax.swing.GroupLayout(java2DDemo1);
    java2DDemo1.setLayout(java2DDemo1Layout);
    java2DDemo1Layout.setHorizontalGroup(
      java2DDemo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 491, Short.MAX_VALUE)
    );
    java2DDemo1Layout.setVerticalGroup(
      java2DDemo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 306, Short.MAX_VALUE)
    );

    jTabbedPane1.addTab("tab4", java2DDemo1);

    add(jTabbedPane1, java.awt.BorderLayout.CENTER);
  }// </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private kapitel_10.Grafikdemo grafikdemo1;
  private kapitel_10.Grafikpanel grafikpanel1;
  private javax.swing.JTabbedPane jTabbedPane1;
  private kapitel_11_struktur_i_en_gui.JacobPanel jacobPanel1;
  private kapitel_10.Java2DDemo java2DDemo1;
  // End of variables declaration//GEN-END:variables
}
