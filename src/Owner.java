
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
public class Owner {
    private int id;
    private String Fname;
    private String Lname;
    private String phoneNo;
    private String Address;
    private String Email;
    
    public Owner(){
        
    }
    public Owner(int id,String Fname,String Lname,String phoneNo, String Email,String Address){
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
    
    //Function to to owner data to database
    Boolean Addowner(Owner owner){
        
        PreparedStatement statement;
        
        String query = "INSERT INTO `owner_type`(`First_name`, `Last_name`, `Phone_No`, `Email`, `Address`) VALUES (?,?,?,?,?)";
        try {
            statement = MyConnection.GetConnection().prepareStatement(query);
            statement.setString(1, owner.getFname());
            statement.setString(2, owner.getLname());
            statement.setString(3, owner.getphoneNo());
            statement.setString(4, owner.getEmail());
            statement.setString(5, owner.getAddress());
            return(statement.executeUpdate()>0);
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Owner.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
    }
    public boolean DeleteOwner(int id){
         PreparedStatement statement;
        
        Owner owner = new Owner();
        String Deletequery = "DELETE FROM `owner_type` WHERE `id`=?";
        try {
            statement = MyConnection.GetConnection().prepareStatement(Deletequery);
            statement.setInt(1, id);
            
            return(statement.executeUpdate()>0);
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Owner.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
    }
    public Boolean EditOwner(Owner owner){
         PreparedStatement statement;
        String Editquery = "UPDATE `owner_type` SET `First_name`=?,`Last_name`=?,`Phone_No`=?,`Email`=?,`Address`=?  WHERE `id`=?";
        try {
            statement = MyConnection.GetConnection().prepareStatement(Editquery);
            statement.setString(1, owner.getFname());
            statement.setString(2, owner.getLname());
            statement.setString(3, owner.getphoneNo());
            statement.setString(4, owner.getEmail());
            statement.setString(5, owner.getAddress());
            statement.setInt(6, owner.getId());
            return(statement.executeUpdate()>0);
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Owner.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public ArrayList<Owner> ownereList(){
        ArrayList<Owner> list = new ArrayList<>();
        
        Statement statement;
        ResultSet result;
        String query = "SELECT * FROM `owner_type`";
        try {
            statement = MyConnection.GetConnection().createStatement();
            result = statement.executeQuery(query);
            Owner owner;
            while(result.next()){
                owner = new Owner(
                result.getInt(1),
                result.getString(2),
                result.getString(3),
                result.getString(4),
                result.getString(5),
                result.getString(6));
                list.add(owner);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Owner.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        
        return list;
        
    }
    
    
}
