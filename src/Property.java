
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
public class Property {

    private int id;
    private int type;
    private int size;
    private int ownerId;
    private String price;
    private String address;
    private int bedrooms;
    private int bathrooms;
    private int age;
    private boolean balcony;
    private boolean pool;
    private boolean backyard;
    private boolean garage;
    private String description;

    public Property() {
    }

    public Property(int id, int type, int size, int ownerId, String price, String address,
            int bedrooms, int bathrooms, int age, boolean balcony, boolean pool, boolean backyard, boolean garage, String description) {
        this.id = id;
        this.type = type;
        this.size = size;
        this.ownerId = ownerId;
        this.price = price;
        this.address = address;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.age = age;
        this.balcony = balcony;
        this.pool = pool;
        this.backyard = backyard;
        this.garage = garage;
        this.description = description;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public boolean isBackyard() {
        return backyard;
    }

    public void setBackyard(boolean backyard) {
        this.backyard = backyard;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //a function to search property by ID
    public Property FindbyId(int propertyId) {
        PreparedStatement statement;
        ResultSet rs;
        String searchQuery = "SELECT * FROM `type` WHERE `Id`=?";

        Property property = null;
        try {
            statement = MyConnection.GetConnection().prepareStatement(searchQuery);
            statement.setInt(1, propertyId);
            rs = statement.executeQuery();

            //`Id`, `type`, `square_feeet`, `ownerId`, `price`, `address`, `bedrooms`, `bathrooms`, `age`, `balcony`, `pool`, `backyard`, `garage`, `description`
            if (rs.next()) {
                property = new Property(
                        rs.getInt("id"),
                        rs.getInt("type"),
                        rs.getInt("square_feet"),
                        rs.getInt("ownerID"),
                        rs.getString("price"),
                        rs.getString("address"),
                        rs.getInt("bedrooms"),
                        rs.getInt("bathrooms"),
                        rs.getInt("age"),
                        rs.getBoolean("balcony"),
                        rs.getBoolean("pool"),
                        rs.getBoolean("backyard"),
                        rs.getBoolean("garage"),
                        rs.getString("description"));
            }
            return property;
        } catch (SQLException ex) {
            Logger.getLogger(Property.class.getName()).log(Level.SEVERE, null, ex);
        }
        return property;
    }

    //a function to add new property
    public boolean addNewProperty(Property property) {
        PreparedStatement statement;
        String addQuery = "INSERT INTO `type`(`type`, `square_feet`, `ownerId`, `price`, `address`, `bedrooms`, `bathrooms`, `age`, `balcony`, `pool`, `backyard`, `garage`, `description`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            statement = MyConnection.GetConnection().prepareStatement(addQuery);
            statement.setInt(1, property.getType());
            statement.setInt(2, property.getSize());
            statement.setInt(3, property.getOwnerId());
            statement.setString(4, property.getPrice());
            statement.setString(5, property.getAddress());
            statement.setInt(6, property.getBedrooms());
            statement.setInt(7, property.getBathrooms());
            statement.setInt(8, property.getAge());
            statement.setBoolean(9, property.isBalcony());
            statement.setBoolean(10, property.isPool());
            statement.setBoolean(11, property.isBackyard());
            statement.setBoolean(12, property.isGarage());
            statement.setString(13, property.getDescription());
            return (statement.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(Property.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public Boolean EditProperty(Property property) {
        PreparedStatement statement;
        String Editquery = "UPDATE `type` SET `type`=?,`square_feet`=?,`ownerId`=?,`price`=?,`address`=?,`bedrooms`=?,`bathrooms`=?,`age`=?,`balcony`=?,`pool`=?,`backyard`=?,`garage`=?,`description`=? WHERE `Id` = ?";
        try {
            statement = MyConnection.GetConnection().prepareStatement(Editquery);

            statement.setInt(1, property.getType());
            statement.setInt(2, property.getSize());
            statement.setInt(3, property.getOwnerId());
            statement.setString(4, property.getPrice());
            statement.setString(5, property.getAddress());
            statement.setInt(6, property.getBedrooms());
            statement.setInt(7, property.getBathrooms());
            statement.setInt(8, property.getAge());
            statement.setBoolean(9, property.isBalcony());
            statement.setBoolean(10, property.isPool());
            statement.setBoolean(11, property.isBackyard());
            statement.setBoolean(12, property.isGarage());
            statement.setString(13, property.getDescription());
            statement.setInt(14, property.getId());

            return (statement.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(Property.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean DeleteProperty(int id) {
        PreparedStatement statement;

        Property properrty = new Property();
        String Deletequery = " DELETE FROM `type` WHERE `id`= ?";
        try {
            statement = MyConnection.GetConnection().prepareStatement(Deletequery);
            statement.setInt(1, id);

            return (statement.executeUpdate() > 0);

        } catch (SQLException ex) {
            Logger.getLogger(Property.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    HashMap<String, Integer> AddpropertyList() {
        HashMap<String, Integer> property = new HashMap<>();
        return null;

    }

    public ArrayList<Property> PropertyList() {
        ArrayList<Property> list = new ArrayList<>();

        Statement statement;
        ResultSet rs;
        String query = "SELECT * FROM `type`";
        try {
            statement = MyConnection.GetConnection().createStatement();
            rs = statement.executeQuery(query);
            Property property;
            while (rs.next()) {
                property = new Property(rs.getInt("id"),
                        rs.getInt("type"),
                        rs.getInt("square_feet"),
                        rs.getInt("ownerID"),
                        rs.getString("price"),
                        rs.getString("address"),
                        rs.getInt("bedrooms"),
                        rs.getInt("bathrooms"),
                        rs.getInt("age"),
                        rs.getBoolean("balcony"),
                        rs.getBoolean("pool"),
                        rs.getBoolean("backyard"),
                        rs.getBoolean("garage"),
                        rs.getString("description"));
                list.add(property);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Property.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
     public ArrayList<Property> PropertyListByType(int propertyID) {
        ArrayList<Property> list = new ArrayList<>();

        //Statement statement;
        PreparedStatement statement;
        ResultSet rs;
        String query = "SELECT * FROM `type` WHERE `type`=?";
        try {
            
                   // = MyConnection.GetConnection().createStatement();
            statement = MyConnection.GetConnection().prepareStatement(query);
            statement.setInt(1, propertyID);
            rs = statement.executeQuery();
            Property property;
            while (rs.next()) {
                property = new Property(rs.getInt("id"),
                        rs.getInt("type"),
                        rs.getInt("square_feet"),
                        rs.getInt("ownerID"),
                        rs.getString("price"),
                        rs.getString("address"),
                        rs.getInt("bedrooms"),
                        rs.getInt("bathrooms"),
                        rs.getInt("age"),
                        rs.getBoolean("balcony"),
                        rs.getBoolean("pool"),
                        rs.getBoolean("backyard"),
                        rs.getBoolean("garage"),
                        rs.getString("description"));
                list.add(property);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Property.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
public boolean addImage(int id,String Image_path) {
        PreparedStatement statement;
        String addQuery = "INSERT INTO `property_image`(`property_id`,`image`) VALUES (?,?)";
        try {
            try{
            
                FileInputStream propertyImage = new FileInputStream(new File(Image_path));
                 statement = MyConnection.GetConnection().prepareStatement(addQuery);
                  statement.setInt(1, id);
                  statement.setBinaryStream(2, propertyImage);
                   return (statement.executeUpdate() > 0);
            } catch (FileNotFoundException ex) { 
               // Logger.getLogger(Property.class.getName()).log(Level.SEVERE, null, ex);
               JOptionPane.showMessageDialog(null, ex.getMessage()+"Image has not been Added","Add Image",2);
                return false;
            }
            }
         catch (SQLException ex) {
            Logger.getLogger(Property.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
public HashMap<byte[],Integer> PropertyImageList(int propertyID) {
        HashMap<byte[],Integer>list = new HashMap<>();

        //Statement statement;
        PreparedStatement statement;
        ResultSet rs;
        String query = "SELECT * FROM `property_image` WHERE `property_id`=?";
        try {
            
                   // = MyConnection.GetConnection().createStatement();
            statement = MyConnection.GetConnection().prepareStatement(query);
            statement.setInt(1, propertyID);
            rs = statement.executeQuery();
            
            while (rs.next()) {
               list.put(rs.getBytes("image"), rs.getInt("id"));
            }

        } catch (SQLException ex) {
            Logger.getLogger(Property.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
public byte[] getImageById(int imageId) {
        //Statement statement;
        PreparedStatement statement;
        ResultSet rs;
        //SELECT `image` FROM `property_image` WHERE `id`=?
        String query = "SELECT `image` FROM `property_image` WHERE `id`=?";
        try {
            
                   // = MyConnection.GetConnection().createStatement();
            statement = MyConnection.GetConnection().prepareStatement(query);
            statement.setInt(1, imageId);
            rs = statement.executeQuery();
            
            if (rs.next()) {
              return rs.getBytes("image");
            }
            else{
                return null;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Property.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }


    }
public boolean removeImage(int imageId) {
        //Statement statement;
        PreparedStatement statement;
        ResultSet rs;
        //SELECT `image` FROM `property_image` WHERE `id`=?
        String query = "DELETE FROM `property_image` WHERE `id`=?";
        try {
            
                   // = MyConnection.GetConnection().createStatement();
            statement = MyConnection.GetConnection().prepareStatement(query);
            statement.setInt(1, imageId);
            return (statement.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(Property.class.getName()).log(Level.SEVERE, null, ex);
             return false;
        }


    }

}
