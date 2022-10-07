package com.test.concepts1;

import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;

public class PoojaProvider implements Poojadao {

	@Override
	public void addProduct( Product product) {
		try {
			Connection con=poojaConnector.getConnection();
			Statement st= con.createStatement();
			String query="INSERT INTO `productinformation`.`electronics` (`id_product`, `name_product`, `price_product`) VALUES ('"+product.getId()+"', '"+product.getName()+"', '"+product.getPrice()+"')";
		 st.executeUpdate(query);
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
	}

	@Override
	public ArrayList<Product> displayProduct() {
		ArrayList<Product>al=new ArrayList<>();
		try {
			Connection con=poojaConnector.getConnection();
			Statement st= con.createStatement();
			String query="SELECT * FROM productinformation.electronics";
			
			ResultSet resultSet=st.executeQuery(query);
			while(resultSet.next()) {
				Product product=new Product();
				product.setId(resultSet.getInt(1));
				product.setName(resultSet.getString(2));
				product.setPrice(resultSet.getDouble(3));
			al.add(product);
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		return al;	
	}

	}


