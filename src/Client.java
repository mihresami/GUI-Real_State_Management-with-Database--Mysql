
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
public class Client {
    private int id;
    private String Fname;
    private String Lname;
    private String phoneNo;
    private String Address;
    private String Email;
    
    public Client(){
        
    }
    public Client(int id,String Fname,String Lname,String phoneNo, String Email,String Address){
        this.id = id;
        this.Fname = Fname;
        this.Lname = Lname;
        this.Address = Address;
        this.phoneNo = phoneNo;
        this.Email = Email;
    }
    
    public void setId(int id){
        this.id = id;
        
    }
    public void setFname(String Fname){
        this.Fname = Fname;
    }
    public void setLname(String Lname){
        this.Lname = Lname;
    }
    public void setphoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }
    public void setAddress(String Address){
        this.Address = Address;
    }
    public int getId(){
        return id;
    }
    public String getFname(){
        return Fname;
    }
    public String getLname(){
        return Lname;
    }
    public String getphoneNo(){
        return phoneNo;
    }
    public String getEmail(){
        return Email;
    }
    public String getAddress(){
        return Address;
    }
    
    //Function to to Client data to database
    Boolean AddClient(Client client){
        
        PreparedStatement statement;
        
        String query = "INSERT INTO `client_type`(`First_name`, `Last_name`, `Phone_No`, `Email`, `Address`) VALUES (?,?,?,?,?)";
        try {
            statement = MyConnection.GetConnection().prepareStatement(query);
            statement.setString(1, client.getFname());
            statement.setString(2, client.getLname());
            statement.setString(3, client.getphoneNo());
            statement.setString(4, client.getEmail());
            statement.setString(5, client.getAddress());
            return(statement.executeUpdate()>0);
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
    }
    public boolean DeleteClient(int id){
         PreparedStatement statement;
        
        Client client = new Client();
        String Deletequery = "DELETE FROM `client_type` WHERE `id`=?";
        try {
            statement = MyConnection.GetConnection().prepareStatement(Deletequery);
            statement.setInt(1, id);
            
            return(statement.executeUpdate()>0);
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
    }
    public Boolean EditClient(Client client){
         PreparedStatement statement;
        String Editquery = "UPDATE `client_type` SET `First_name`=?,`Last_name`=?,`Phone_No`=?,`Email`=?,`Address`=?  WHERE `id`=?";
        try {
            statement = MyConnection.GetConnection().prepareStatement(Editquery);
            statement.setString(1, client.getFname());
            statement.setString(2, client.getLname());
            statement.setString(3, client.getphoneNo());
            statement.setString(4, client.getEmail());
            statement.setString(5, client.getAddress());
            statement.setInt(6, client.getId());
            return(statement.executeUpdate()>0);
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public ArrayList<Client> clientList(){
        ArrayList<Client> list = new ArrayList<>();
        
        Statement statement;
        ResultSet result;
        String query = "SELECT * FROM `client_type`";
        try {
            statement = MyConnection.GetConnection().createStatement();
            result = statement.executeQuery(query);
            Client client;
            while(result.next()){
                client = new Client(
                result.getInt(1),
                result.getString(2),
                result.getString(3),
                result.getString(4),
                result.getString(5),
                result.getString(6));
                list.add(client);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        
        return list;
        
    }
    
    
}
