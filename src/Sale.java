
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
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
public class Sale {
    private int id;
    private int propertyId;
    private int clientId;
    private String finalPrice;
    private String sellingDate;
    
    public Sale(int id,int propertyId,int clientId,String finalPrice,String sellingDate)
    {
        this.id = id;
        this.propertyId = propertyId;
        this.clientId = clientId;
        this.finalPrice = finalPrice;
        this.sellingDate = sellingDate;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(String finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getSellingDate() {
        return sellingDate;
    }

    public void setSellingDate(String sellingDate) {
        this.sellingDate = sellingDate;
    }
    public Sale(){
        
    }
    Boolean addSale(Sale sale){
        
        PreparedStatement statement;
        
        String query = "INSERT INTO `sale`(`property_id`, `client_id`, `final_price`, `sale_date`) VALUES (?,?,?,?)";
        try {
            statement = MyConnection.GetConnection().prepareStatement(query);
            statement.setInt(1, sale.getPropertyId());
            statement.setInt(2, sale.getClientId());
            statement.setString(3, sale.getFinalPrice());
            statement.setString(4, sale.getSellingDate());
            
            return(statement.executeUpdate()>0);
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Sale.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
    }
     public boolean deleteSale(int id){
         PreparedStatement statement;
        
        Client client = new Client();
        String Deletequery = "DELETE FROM `sale` WHERE `id`=?";
        try {
            statement = MyConnection.GetConnection().prepareStatement(Deletequery);
            statement.setInt(1, id);
            
            return(statement.executeUpdate()>0);
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Sale.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
    }
    public Boolean editSale(Sale sale){
         PreparedStatement statement;
        String Editquery = "UPDATE `sale` SET `property_id`=?,`client_id`=?,`final_price`=?,`sale_date`=? WHERE `id`=?";
        try {
            statement = MyConnection.GetConnection().prepareStatement(Editquery);
            statement.setInt(1, sale.getPropertyId());
            statement.setInt(2, sale.getClientId());
            statement.setString(3, sale.getFinalPrice());
            statement.setString(4,sale.getSellingDate());
            statement.setInt(5, sale.getId());
            return(statement.executeUpdate()>0);
            
        
        } catch (SQLException ex) {
            Logger.getLogger(Sale.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
        public ArrayList<Sale> saleList(){
        ArrayList<Sale> list = new ArrayList<>();
        
        Statement statement;
        ResultSet result;
        String query = "SELECT * FROM `sale`";
        try {
            statement = MyConnection.GetConnection().createStatement();
            result = statement.executeQuery(query);
            Sale sale;
            while(result.next()){
                sale = new Sale(
                result.getInt(1),
                result.getInt(2),
                result.getInt(3),
                result.getString(4),
                result.getString(5));
                
                list.add(sale);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Sale.class.getName()).log(Level.SEVERE, null, ex);
        }
  
        
        return list;
        
    }
    
    
}
