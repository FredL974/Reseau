package fr.ensisa.hassenforder.chatrooms.client.ui;

import fr.ensisa.hassenforder.chatrooms.client.model.Channel;
import fr.ensisa.hassenforder.chatrooms.client.model.ChannelType;

/**
 *
 * @author Hassenforder
 */
public class ChannelDescriptionUI extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;
	
	private Channel description;
    private GUIListener listener;

    /**
     * Creates new form ChannelDescription
     */
    public ChannelDescriptionUI() {
        initComponents();
    }

    public ChannelDescriptionUI(Channel description, GUIListener listener) {
        initComponents();
        setDescription(description);
        setListener (listener);
    }

    public void setDescription (Channel description) {
        this.description = description;
        if (description != null) {
            jChannelName.setText(description.getName());
            jChannelType.setText(description.getType().toString().toLowerCase());
            if (description.isSubscribed()) {
                jSubscribed.setSelected(true);
            }
            if (description.getType() == ChannelType.MODERATOR) {
                jSubscribed.setEnabled(false);
            }
        }
    }

    public void setListener (GUIListener listener) {
        this.listener = listener;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jChannelName = new javax.swing.JLabel();
        jChannelType = new javax.swing.JLabel();
        jSubscribed = new javax.swing.JCheckBox();

        jChannelName.setText("jLabel1");
        jChannelName.setToolTipText("");
        jChannelName.setName(""); // NOI18N

        jChannelType.setText("jLabel2");

        jSubscribed.setText("subscribed");
        jSubscribed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSubscribedMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jChannelName, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jChannelType, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSubscribed)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(jChannelName)
                .addComponent(jChannelType)
                .addComponent(jSubscribed))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jSubscribedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSubscribedMouseClicked
        if (listener != null) {
            listener.notifyChannelSubscriptionChange (description, jSubscribed.isSelected());
        }
    }//GEN-LAST:event_jSubscribedMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jChannelName;
    private javax.swing.JLabel jChannelType;
    private javax.swing.JCheckBox jSubscribed;
    // End of variables declaration//GEN-END:variables
}
