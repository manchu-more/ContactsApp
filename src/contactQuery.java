
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class contactQuery {
   public boolean insertConatct(contact cont){ 
       boolean contactIsCreated= true;
       Connection con= myConnection.getConnection();
        PreparedStatement ps;
       try {
           ps=con.prepareStatement("INSERT INTO `mycontact`( `Name`, `Phone Number`, `Email`) VALUES (?,?,?)");
       ps.setString(1,cont.getName());
       ps.setString(2,cont.getPhone());
       ps.setString(3,cont.getEmail());
       
       
          if(ps.executeUpdate()!=0){
              JOptionPane.showMessageDialog(null,"New contact Created");
              contactIsCreated= true;
          }
          else{
              JOptionPane.showMessageDialog(null,"Something Went Wrong");
       contactIsCreated= false;
       } }catch (SQLException ex) {
           Logger.getLogger(contactQuery.class.getName()).log(Level.SEVERE, null, ex);
       }
       return contactIsCreated;
   }

   public ArrayList<contact> contactList(int userId){
       ArrayList<contact> clist;
       clist=new ArrayList<contact>();
       Connection con=myConnection.getConnection();
       Statement st;
       ResultSet rs;
       
       try {
           st=con.createStatement();
       rs=st.executeQuery("SELECT `id`, `Name`, `Phone Number`, `Email` FROM `mycontact` WHERE userid="+userId); 
       
       contact ct;
       while(rs.next()){
       ct= new contact(rs.getInt("id"),rs.getString("Name"),rs.getString("Phone Number"),rs.getString("Email"),0);
       clist.add(ct);
       }
       } catch (SQLException ex) {
           Logger.getLogger(contactQuery.class.getName()).log(Level.SEVERE, null, ex);
       }return clist;
   }

    void insertContact(contact c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    ArrayList<contact> contactList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
