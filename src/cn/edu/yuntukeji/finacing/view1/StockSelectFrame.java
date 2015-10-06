package cn.edu.yuntukeji.finacing.view1;

import java.util.HashMap;
import java.util.Map;

import cn.edu.yuntukeji.finacing.controller.Dispacher;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 *
 * @author Administrator
 */
public class StockSelectFrame extends javax.swing.JFrame {
	private Dispacher dp;
	private static StockSelectFrame stockSelectFrame = null;
    /**
     * Creates new form StockSelectFrame
     */
    private StockSelectFrame() {
    	dp = new Dispacher();
        initComponents();
    }
public static StockSelectFrame getInstance(){
	if(stockSelectFrame == null){
		stockSelectFrame = new StockSelectFrame();
	}
	return stockSelectFrame;
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboType = new javax.swing.JComboBox();
        btnSelect = new javax.swing.JButton();
        txtImport = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStockSelect = new javax.swing.JTable();
        btnPrint = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("库存查询");

        jLabel1.setText("查询条件：");

        comboType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "按名称", "按商品编号" }));

        btnSelect.setText("查询");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        tblStockSelect.setModel(new javax.swing.table.DefaultTableModel(
           null,
            new String [] {
                "商品编号", "商品名称", "当前库存", "安全库存", "建议采购价", "最近采购日期", "建议销售价", "最近销售日期"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblStockSelect);

        btnPrint.setText("打印报表");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnClose.setText("关闭");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(comboType, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnSelect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtImport, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPrint)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClose)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelect)
                    .addComponent(txtImport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrint)
                    .addComponent(btnClose))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
     
    	System.out.println(comboType.getSelectedItem());
    	JSONObject json = null;
    	if(comboType.getSelectedItem().equals("按名称")){
    		Map<String, Object> request = new HashMap<>();
    		
    		request.put("url", "Product/queryProductByProductName");	
    		Map<String,Object> salersMan  = new HashMap<>();
    		
    		salersMan.put("name", txtImport.getText());
    	
    		request.put("param", salersMan);
    		Map<String, Object> reMap = dp.execute(request);
    		json=JSONObject.fromObject(reMap.get("result"));
    		
    		
    	}else{
    		Dispacher dp = new Dispacher();
    		Map<String, Object> request = new HashMap<>();
    		request.put("url", "Product/findById/"+txtImport.getText());	
    		Map<String, Object> reMap = dp.execute(request);
    		 json=JSONObject.fromObject(reMap.get("result"));
    	}
    	System.out.println(json);
    	
		Object [][] o = new Object [1][8];
		
			
			o[0][0] =json.getString("productId");
//			
			o[0][1]= json.getString("productName");
			o[0][2]= json.getString("quantity");
			o[0][3]= json.getString("safeStok");
			o[0][4]=json.getString("suggestBuyPrice");
			JSONObject deliveryDate =json.getJSONObject("lastPurchaseDate");
			if(!deliveryDate.isEmpty()){
				o[0][5] = deliveryDate.getString("year").substring(1)+"-"+deliveryDate.getString("month")+"-"+deliveryDate.getString("date");
			}
			o[0][6]= json.getString("suggestSalePrice");
			
			JSONObject lastDeliveryDate =json.getJSONObject("lastDeliveryDate");
			if(!lastDeliveryDate.isEmpty()){
				o[0][7] = lastDeliveryDate.getString("year").substring(1)+"-"+lastDeliveryDate.getString("month")+"-"+lastDeliveryDate.getString("date");
			}
		
			 tblStockSelect.setModel(new javax.swing.table.DefaultTableModel(
			           o,
			            new String [] {
			                "商品编号", "商品名称", "当前库存", "安全库存", "建议采购价", "最近采购日期", "建议销售价", "最近销售日期"
			            }
			        ) {
			            boolean[] canEdit = new boolean [] {
			                false, false, false, false, false, false, false, false
			            };

			            public boolean isCellEditable(int rowIndex, int columnIndex) {
			                return canEdit [columnIndex];
			            }
			        });
			
		tblStockSelect.updateUI();
    	
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(StockSelectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockSelectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockSelectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockSelectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockSelectFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSelect;
    private javax.swing.JComboBox comboType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStockSelect;
    private javax.swing.JTextField txtImport;
    // End of variables declaration//GEN-END:variables
}
