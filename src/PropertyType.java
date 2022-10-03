
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author win
 */
public class PropertyType {
    private int Id;
    private String Name;
    private String Descrption;
    
    PropertyType(){
        
    }
    PropertyType(int Id,String Name,String Descrption){
        this.Id = Id;
        this.Name = Name;
        this.Descrption = Descrption;
        
    }
    public Integer getId(){
        return Id;
    }
    public String getName(){
        return Name;
    }
    public String getDescrption(){
        return Descrption;
    }
    public void setId(Integer Id ){
        this.Id = Id;
    }
    public void SetName(String Name){
        this.Name = Name;
    }
    public void SetDescrption(String Descrption){
        this.Descrption = Descrption;
    }
    //function to insert,remove, edit adn refresh.
    public boolean ExcuteTypeQuery(String queryType,PropertyType type){
        String Addquery = "INSERT INTO `propery_type`(`name`, `Descrption`) VALUES (?,?)";
        String Editquery = "UPDATE `propery_type` SET `name`=?,`Descrption`=? WHERE `id` = ?";
        String Removequery = "DELETE FROM `propery_type` WHERE `id` =?";
        
        PreparedStatement Statement;
        if(queryType.equals("add")){
            try {
                //query which is insert in to propery type.
                Statement = MyConnection.GetConnection().prepareStatement(Addquery);
                Statement.setString(1,type.getName());
                Statement.setString(2, type.getDescrption());
                
                return(Statement.executeUpdate()>0);
                
            } catch (SQLException ex) {
                Logger.getLogger(PropertyType.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            
        }
       
        else if(queryType.equals("edit")){
            try {
                //query which is edit the propery type.
                Statement = MyConnection.GetConnection().prepareStatement(Editquery);
                Statement.setString(1,type.getName() );
                Statement.setString(2, type.getDescrption());
                Statement.setInt(3, type.getId());
                
                return(Statement.executeUpdate()>0);
                
            } catch (SQLException ex) {
                Logger.getLogger(PropertyType.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            
        }
        else if(queryType.equals("remove")){
            try {
                //query which is remove from the propery type.
                Statement = MyConnection.GetConnection().prepareStatement(Removequery);
                Statement.setInt(1, type.getId());
                
                return(Statement.executeUpdate()>0);
                
            } catch (SQLException ex) {
                Logger.getLogger(PropertyType.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            
        }
       
        else{
            JOptionPane.showMessageDialog(null, "Enter the correct query");
        
        return false;
    }
    
}
    public HashMap<String,Integer> getTypesMap(){
        HashMap<String,Integer>map = new HashMap<>();
       
        try {
            Statement statement;
            ResultSet rs;
            statement = MyConnection.GetConnection().createStatement();
            rs = statement.executeQuery("SELECT * FROM `propery_type`");
            PropertyType type;
            while(rs.next()){
                type = new PropertyType(rs.getInt(1),rs.getString(2),rs.getString(3));
                map.put(type.getName(), type.getId());
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(PropertyType.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return map;
        
    }
    public PropertyType getTypeById(Integer id){
        PropertyType type =  new PropertyType();
          try {
            PreparedStatement statement;
            ResultSet rs;
            statement = MyConnection.GetConnection().prepareStatement("SELECT * FROM `propery_type` WHERE `id`=?");
            statement.setInt(1, id);
            
            rs = statement.executeQuery();
           
            if(rs.next()){
                type.setId(id);
                type.SetName(rs.getString(2));
                type.SetDescrption(rs.getString(3));
               
            }
            
          } catch (SQLException ex) {
            Logger.getLogger(PropertyType.class.getName()).log(Level.SEVERE, null, ex);
        }
          return type;
          
        
        
        
    }
    
   
}
