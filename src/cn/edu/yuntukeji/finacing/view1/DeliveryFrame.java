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
public class DeliveryFrame extends javax.swing.JFrame {
	private static Dispacher dp;
	private static DeliveryFrame deliveryFrame = null;

	/**
	 * Creates new form DeliveryFrame
	 */
	private DeliveryFrame() {
		dp = new Dispacher();
		initComponents();
	}
public static DeliveryFrame getInstance() {
	if (deliveryFrame == null) {
		deliveryFrame = new DeliveryFrame();
	}
	return deliveryFrame;
}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		tblSale = new javax.swing.JTable();
		jLabel2 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		tblSaleDetial = new javax.swing.JTable();
		btnUpdate = new javax.swing.JButton();
		btnAdd = new javax.swing.JButton();
		btnDel = new javax.swing.JButton();
		btnExit = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("销售单管理");
		Object[][] o = findAllDate();
		jLabel1.setText("销售单一览");

		tblSale.setModel(new javax.swing.table.DefaultTableModel(o,
				new String[] { "销售订单号", "销售员", "订单日期", "客户", "总金额", "送货地址",
						"是否出库", "出库日期" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false,
					false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(tblSale);

		jLabel2.setText("销售单明细一览");

		tblSaleDetial.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null } }, new String[] {
						"商品编号", "商品名称", "单价", "数量", "金额" }));

		tblSale.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTable1MouseClicked(evt);
			}
		});
		jScrollPane2.setViewportView(tblSaleDetial);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel1)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																761,
																Short.MAX_VALUE)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel2)
																		.addGap(0,
																				0,
																				Short.MAX_VALUE))
														.addComponent(
																jScrollPane2))
										.addContainerGap()));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												183,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jLabel2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane2,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												168, Short.MAX_VALUE)));

		btnUpdate.setText("更新");
		btnUpdate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnUpdateActionPerformed(evt);
			}
		});

		btnAdd.setText("增加");
		btnAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnAddActionPerformed(evt);
			}
		});

		btnDel.setText("删除");
		btnDel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnDelActionPerformed(evt);
			}
		});

		btnExit.setText("退出");
		btnExit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnExitActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap(
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE).addComponent(btnAdd)
								.addGap(18, 18, 18).addComponent(btnUpdate)
								.addGap(18, 18, 18).addComponent(btnDel)
								.addGap(18, 18, 18).addComponent(btnExit)
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(jPanel1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(btnExit)
												.addComponent(btnDel)
												.addComponent(btnUpdate)
												.addComponent(btnAdd))
								.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddActionPerformed
		DeliveryInformationFrame dif = DeliveryInformationFrame.getInstance();
		dif.setVisible(true);
		dif.toFront();

	}// GEN-LAST:event_btnAddActionPerformed

	private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnUpdateActionPerformed

	}// GEN-LAST:event_btnUpdateActionPerformed

	private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDelActionPerformed

		Map<String, Object> request = new HashMap<>();
		request.put(
				"url",
				"DeliveryMaster/removeById/"
						+ tblSale.getValueAt(tblSale.getSelectedRow(), 0));
		Map<String, Object> reMap = dp.execute(request);
		JSONObject json = JSONObject.fromObject(reMap.get("result"));
		Object[][] o = findAllDate();
		tblSale.setModel(new javax.swing.table.DefaultTableModel(o,
				new String[] { "销售订单号", "销售员", "订单日期", "客户", "总金额", "送货地址",
						"是否出库", "出库日期" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false,
					false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		tblSale.updateUI();

	}// GEN-LAST:event_btnDelActionPerformed

	private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExitActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnExitActionPerformed

	private static Object[][] findAllDate() {

		Map<String, Object> request = new HashMap<>();
		request.put("url", "DeliveryMaster/findAll");
		Map<String, Object> reMap = dp.execute(request);
		JSONArray json = JSONArray.fromObject(reMap.get("result"));
		System.out.println(json);

		Object[][] o = new Object[json.size()][8];
		for (int i = 0; i < json.size(); i++) {

			o[i][0] = ((JSONObject) json.get(i)).getString("deliveryId");
			JSONObject salesManId = ((JSONObject) json.get(i))
					.getJSONObject("salesManId");

			JSONObject customerId = ((JSONObject) json.get(i))
					.getJSONObject("customerId");
			JSONObject deliveryDate = ((JSONObject) json.get(i))
					.getJSONObject("deliveryDate");

			if (!salesManId.isEmpty()) {
				o[i][1] = salesManId.getString("salesMamId");
				// o[i][6]=
				// lt.getString("year")+"-"+lt.getString("month")+"-"+lt.getString("day");
			}
			if (!customerId.isEmpty()) {
				o[i][3] = customerId.getString("id");
			}
			if (!deliveryDate.isEmpty()) {

				o[i][2] = deliveryDate.getString("year").substring(1) + "-"
						+ deliveryDate.getString("month") + "-"
						+ deliveryDate.getString("date");
				o[i][7] = deliveryDate.getString("year").substring(1) + "-"
						+ deliveryDate.getString("month") + "-"
						+ deliveryDate.getString("date");
			}

			o[i][4] = ((JSONObject) json.get(i)).getString("subTotal");
			o[i][5] = ((JSONObject) json.get(i)).getString("deliveryAddress");
			o[i][6] = ((JSONObject) json.get(i)).getString("deliveryProperty");

		}

		return o;
	}

	public static void sysnView() {
		tblSale.setModel(new javax.swing.table.DefaultTableModel(findAllDate(),
				new String[] { "销售订单号", "销售员", "订单日期", "客户", "总金额", "送货地址",
						"是否出库", "出库日期" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false,
					false, false, false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		tblSale.updateUI();
	}

	private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
		System.out.println("ccc");
		Map<String, Object> request = new HashMap<>();
		request.put("url", "DeliveryDetail/findDeliveryDetailBydeliveryId");
		Map<String, Object> salersMan = new HashMap<>();
		salersMan.put(
				"deliveryId",
				Integer.parseInt((String) tblSale.getValueAt(
						tblSale.getSelectedRow(), 0)));
		request.put("param", salersMan);
		Map<String, Object> reMap = dp.execute(request);
		JSONArray json = JSONArray.fromObject(reMap.get("result"));
		System.out.println("saleman：：" + json);

		Object[][] traderInfo = new Object[json.size()][5];
		for (int i = 0; i < json.size(); i++) {
			JSONObject productId = ((JSONObject) json.get(i))
					.getJSONObject("productId");
			if (!productId.isEmpty()) {
				traderInfo[i][0] = productId.getString("productId");
				traderInfo[i][1] = productId.getString("productName");
			}
			traderInfo[i][2] = ((JSONObject) json.get(i))
					.getString("salesUnitPrice");
			traderInfo[i][3] = ((JSONObject) json.get(i))
					.getString("salesQuantity");
			traderInfo[i][4] = ((JSONObject) json.get(i))
					.getString("salesAmount");
		}
		tblSaleDetial.setModel(new javax.swing.table.DefaultTableModel(
				traderInfo, new String[] { "商品编号", "商品名称", "单价", "数量", "金额" }));
		tblSaleDetial.updateUI();
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(DeliveryFrame.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(DeliveryFrame.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(DeliveryFrame.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(DeliveryFrame.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new DeliveryFrame().setVisible(true);
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
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private static javax.swing.JTable tblSale;
	private javax.swing.JTable tblSaleDetial;
	// End of variables declaration//GEN-END:variables
}
