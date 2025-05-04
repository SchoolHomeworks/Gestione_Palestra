package Views;

import Presenters.InterfaceViews.I_LogsView;
import Presenters.LogsPresenter;

public class P_Logs extends javax.swing.JPanel implements I_LogsView{
    private LogsPresenter _presenter;
    
    public P_Logs() {
        initComponents();
        this._presenter = new LogsPresenter(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TextA_Logs = new javax.swing.JTextArea();

        TextA_Logs.setEditable(false);
        TextA_Logs.setColumns(20);
        TextA_Logs.setRows(5);
        jScrollPane1.setViewportView(TextA_Logs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextA_Logs;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void appendMessaggio(String text) {
        TextA_Logs.append(text);
    }
    
    @Override
    public void pulisci(){
        TextA_Logs.setText("");
    }
}
