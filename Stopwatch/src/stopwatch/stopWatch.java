/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stopwatch;

/**
 *
 * @author caballeroda_sd2081
 */
public class stopWatch extends javax.swing.JFrame{
    
    static int mscnd = 0;
    static int scnd = 0;
    static int mint = 0;
    static int hours = 0;
    
    static boolean state = true;
    
    public stopWatch() {
        initComponents();
    }
//    Thread t;
//    int hcnt = 0, mcnt = 0, scnt = 0, mscnt = 0;
//    String str = "", hstr = "", mstr = "", dstr = "";
//    int cnt = 0, cnt2 = 0;
//    
//    public stopWatch() {
//        initComponents();
//        t = new Thread(this);
//        reset();
//    }
//    
//    public void reset(){
//        hcnt = 0;mcnt = 0; scnt = 0; mscnt = 0;
//        hstr = "00:00:00";mstr = "000"; dstr = "";
////        display();
//    }
    
//    public void display(){
//        
//    }
    
//    public void setTimeCounter(){
//        hstr = "";
//        if(hcnt<10){
//            hstr = "0"+hcnt;
//        }
//        else{
//            hstr = "" +hcnt;
//        }
//        
//        if(mcnt<10){
//           hstr+=":0"+mcnt; 
//        }
//        else{
//            hstr+=":"+mcnt;
//        }
//        
//        if(scnt<10){
//            hstr+=":0"+scnt; 
//        }
//        else{
//            hstr+=":"+scnt;
//        }
//    }
//    
//    public void setMTimeCounter(){
//        mstr="";
//        if(mscnt<10){
//            mstr="00"+mscnt;
//        }
//        else if(mscnt>=10 && mscnt < 100){
//            mstr="0"+mscnt;
//        }
//        else{
//            mstr=""+mscnt;
//        }
//    }
//    
//    public void run(){
//        try{
//            while(true){
//                mscnt++;
//                if(mscnt>999){
//                    mscnt=0;
//                    scnt++;
//                }
//                if(scnt>59){
//                    scnt=0;
//                    mcnt++;
//                }
//                if(mcnt>59){
//                    mcnt=0;
//                    hcnt++;
//                }
//                if(hcnt>99){
//                    reset();
//                }
//                
//                setTimeCounter();
//                setMTimeCounter();
//                Thread.sleep(1);
//            }
//        }
//        catch(Exception e){
//        }
//    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        hr = new javax.swing.JLabel();
        stop = new javax.swing.JButton();
        start = new javax.swing.JButton();
        milli = new javax.swing.JLabel();
        min = new javax.swing.JLabel();
        sec = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(0, 102, 204));
        jLabel1.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("STOPWATCH");

        hr.setBackground(new java.awt.Color(204, 102, 255));
        hr.setFont(new java.awt.Font("Times New Roman", 0, 60)); // NOI18N
        hr.setText(" 00:");

        stop.setBackground(new java.awt.Color(0, 0, 0));
        stop.setFont(new java.awt.Font("Times New Roman", 0, 50)); // NOI18N
        stop.setForeground(new java.awt.Color(255, 153, 153));
        stop.setText("STOP");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        start.setBackground(new java.awt.Color(0, 0, 0));
        start.setFont(new java.awt.Font("Times New Roman", 0, 50)); // NOI18N
        start.setForeground(new java.awt.Color(255, 153, 153));
        start.setText("START");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        milli.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        milli.setText("000");

        min.setBackground(new java.awt.Color(204, 102, 255));
        min.setFont(new java.awt.Font("Times New Roman", 0, 60)); // NOI18N
        min.setText(" 00:");

        sec.setBackground(new java.awt.Color(204, 102, 255));
        sec.setFont(new java.awt.Font("Times New Roman", 0, 60)); // NOI18N
        sec.setText(" 00:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(209, 209, 209))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(hr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(milli, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hr, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(milli, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        state = false;
    }//GEN-LAST:event_stopActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
//        if(start.getText().equals("Start")){
//            start.setText("Stop");
//            cnt++;
//            if(cnt==1){
//                t.start();
//            }
//            else{
//                t.resume();
//            }
//        }
//        else{
//            start.setText("Start");
//            t.suspend();
//        }
        
        state = true;
        
        Thread t = new Thread(){
            public void run(){
                for(;;){
                if(state == true){
                    try{
                        if(mscnd>999){
                            mscnd = 0;
                            scnd++;
                            
                        }
                        if(scnd>59){
                            mscnd = 0;
                            scnd = 0;
                            mint++;
                        }
                        if(mint>59){
                            mscnd = 0;
                            scnd = 0;
                            mint = 0;
                            hours++;
                        }
                        milli.setText(" : "+mscnd);
                        mscnd++;
                        sec.setText(" : "+scnd);
//                        scnd++;
                        min.setText(" : "+mint);
//                        mint++;
                        hr.setText(""+hours);
//                        hours++;
                        
                        Thread.sleep(1);
                    }
                     
                    catch(Exception e){
                    
                    }
                }
                
                else{
                    break;
                }
            }
          }
        };
        t.start();
    }//GEN-LAST:event_startActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(stopWatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stopWatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stopWatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stopWatch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stopWatch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel milli;
    private javax.swing.JLabel min;
    private javax.swing.JLabel sec;
    private javax.swing.JButton start;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables
}
