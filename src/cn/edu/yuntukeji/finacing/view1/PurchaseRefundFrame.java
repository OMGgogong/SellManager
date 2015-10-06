/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class PurchaseRefundFrame extends javax.swing.JFrame {
	private static Dispacher dp;
	private static PurchaseRefundFrame purchaseRefundFrame = null;
    /**
     * Creates new form PurchaseRefundFrame
     */
    private PurchaseRefundFrame() {
   	 dp = new Dispacher();
        initComponents();
    }
public static PurchaseRefundFrame getInstance(){
	if(purchaseRefundFrame == null){
		purchaseRefundFrame = new PurchaseRefundFrame();
	}
	return purchaseRefundFrame;
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRefund = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPurchaseRefund = new javax.swing.JTable();
        Object[][] o = findAllDate();
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            o,
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("采购退货单管理");

        jLabel1.setText("采购退货单一览");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
        );

        tblRefund.setModel(new javax.swing.table.DefaultTableModel(
           null,
            new String [] {
                "商品编号", "商品名称", "单价", "数量", "金额"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblRefund);

        jLabel2.setText("退货明细单一览");

        btnUpdate.setText("更新");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        tblPurchaseRefund.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        btnAdd.setText("增加");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnExit.setText("退出");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnDel.setText("删除");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit)
                .addGap(31, 31, 31))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnExit)
                    .addComponent(btnDel)
                    .addComponent(btnAdd))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tblPurchaseRefund.setModel(new javax.swing.table.DefaultTableModel(
           o,
            new String [] {
                "采购退货单单号", "退货日期", "供应商简称", "总金额"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPurchaseRefund);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static Object[][] findAllDate() {
	
    	Map<String, Object> request = new HashMap<>();
    	request.put("url", "PurchaseMaster/queryGodownProduct");	
		Map<String, Object> reMap = dp.execute(request);
		JSONArray json = JSONArray.fromObject(reMap.get("result"));
		System.out.println(json);
		
		Object [][] o = new Object [json.size()][6];
		for (int i = 0;i<json.size();i++) {
			
			o[i][0] = ((JSONObject)json.get(i)).getString("purchaseId");
			JSONObject deliveryDate =((JSONObject)json.get(i)).getJSONObject("purchaseDate");
			if(!deliveryDate.isEmpty()){
				o[i][1] = deliveryDate.getString("year")+"-"+deliveryDate.getString("month")+"-"+deliveryDate.getString("day");
				o[i][5] =deliveryDate.getString("year")+"-"+deliveryDate.getString("month")+"-"+deliveryDate.getString("day");
			}
			
			o[i][2]= ((JSONObject)json.get(i)).getJSONObject("supplierId").getString("supplierSimpleName");
			o[i][3] = ((JSONObject)json.get(i)).getString("subTotal");
			
	
			}
		
		return o;
		
	}

	private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
		PurchaseRefundInformationFrame prif = PurchaseRefundInformationFrame.getInstance();
		prif.setVisible(true);
		prif.toFront();
		
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed
      
    	Map<String, Object> request = new HashMap<>();
    	request.put("url", "PurchaseMaster/removeById/"+ tblPurchaseRefund.getValueAt(tblPurchaseRefund.getSelectedRow(),0));	
		Map<String, Object> reMap = dp.execute(request);
		
		  Object[][] o = findAllDate();
		  tblPurchaseRefund.setModel(new javax.swing.table.DefaultTableModel(
		           o,
		            new String [] {
		                "采购退货单单号", "退货日期", "供应商简称", "总金额"
		            }
		        ) {
		            boolean[] canEdit = new boolean [] {
		                false, false, false, false
		            };

		            public boolean isCellEditable(int rowIndex, int columnIndex) {
		                return canEdit [columnIndex];
		            }
		        });
		
		  tblPurchaseRefund.updateUI();
		  tblRefund.setModel(new javax.swing.table.DefaultTableModel(
		           null,
		            new String [] {
		                "商品编号", "商品名称", "单价", "数量", "金额"
		            }
		        ) {
		            boolean[] canEdit = new boolean [] {
		                false, false, false, false, false
		            };

		            public boolean isCellEditable(int rowIndex, int columnIndex) {
		                return canEdit [columnIndex];
		            }
		        });
		  tblRefund.updateUI();

    }//GEN-LAST:event_btnDelActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed
    public static void  sysnView(){
    	tblPurchaseRefund.setModel(new javax.swing.table.DefaultTableModel(
    	           findAllDate(),
    	            new String [] {
    	                "采购退货单单号", "退货日期", "供应商简称", "总金额"
    	            }
    	        ) {
    	            boolean[] canEdit = new boolean [] {
    	                false, false, false, false
    	            };

    	            public boolean isCellEditable(int rowIndex, int columnIndex) {
    	                return canEdit [columnIndex];
    	            }
    	        });
    	tblPurchaseRefund.updateUI();
    }
   private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {  
    	
    	Map<String, Object> request = new HashMap<>();
		request.put("url", "PurchaseDetail/findPurchaseDetailByPurchaseId");	
		Map<String,Object> salersMan  = new HashMap<>();
		salersMan.put("purchaseId", Integer.parseInt((String) tblPurchaseRefund.getValueAt(tblPurchaseRefund.getSelectedRow(),0)));
		request.put("param", salersMan);
		Map<String, Object> reMap = dp.execute(request);
		JSONArray json = JSONArray.fromObject(reMap.get("result"));
		
		Object [][] traderInfo= new Object[json.size()][5];
		for (int i = 0; i < json.size(); i++) {
					JSONObject	productId = ((JSONObject)json.get(i)).getJSONObject("productId");
					if(!productId.isEmpty()){
						traderInfo[i][0] = productId.getString("productId");
						traderInfo[i][1] = productId.getString("productName");
					}
					traderInfo[i][2] = ((JSONObject)json.get(i)).getString("purchaseUnitPrice");
					traderInfo[i][3] = ((JSONObject)json.get(i)).getString("purchaseQuantity");
					traderInfo[i][4] = ((JSONObject)json.get(i)).getString("purchaseAmount");
		}
		tblRefund.setModel(new javax.swing.table.DefaultTableModel(
				 traderInfo,
		            new String [] {
		                "商品编号", "商品名称", "单价", "数量", "金额"
		            }
		        ));
		tblRefund.updateUI();
    }
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
            java.util.logging.Logger.getLogger(PurchaseRefundFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseRefundFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseRefundFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseRefundFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseRefundFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private static javax.swing.JTable tblPurchaseRefund;
    private javax.swing.JTable tblRefund;
    // End of variables declaration//GEN-END:variables
}
