package usingInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class LaptopOperationIMPL implements LaptopOperation {
	private Connection con=null;
	private String query=null;
	private PreparedStatement ps=null;
	private ResultSet rs=null;
	private int status=0;
	
	@Override
	public int addLaptop(Laptop laptop) {
		try {
			con=DatabaseCon.getConnection();
			query="insert into laptop(brandName,modelN0,price,ram,storage,createdDate)values(?,?,?,?,?,now())";
			ps=con.prepareStatement(query);
			ps.setString(1, laptop.getBrandName());
			ps.setString(2, laptop.getModelN0());
			ps.setDouble(3, laptop.getPrice());
			ps.setString(4, laptop.getRam());
			ps.setString(5, laptop.getStorage());
			status=ps.executeUpdate();
			
			ps.close(); 
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public int updateLaptop(Laptop laptop) {
		try {
			con=DatabaseCon.getConnection();
			query="update laptop set brandName=?,modelN0=?,price=?,ram=?,storage=?,updatedDate=now() where lid=?";
			ps=con.prepareStatement(query);
			ps.setString(1, laptop.getBrandName());
			ps.setString(2, laptop.getModelN0());
			ps.setDouble(3, laptop.getPrice());
			ps.setString(4, laptop.getRam());
			ps.setString(5, laptop.getStorage());
			ps.setInt(6, laptop.getLid());
			status=ps.executeUpdate();
			
			ps.close(); 
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public List<Laptop> viewLaptops() {
		List<Laptop> listLaptop=new ArrayList<Laptop>();
		try {
			con=DatabaseCon.getConnection();
			query="Select lid,brandName,modelN0,price,ram,stroage,createdDate,updatedDate from laptop";
			ps=con.prepareStatement(query);
			rs=ps.executeQuery();
			while (rs.next()) {
				Laptop l=new Laptop();
				l.setLid(rs.getInt(1));
				l.setBrandName(rs.getString(2));
				l.setModelN0(rs.getString(3));
				l.setPrice(rs.getDouble(4));
				l.setRam(rs.getString(5));
				l.setStorage(rs.getString(6));
				l.setCreatedDate(rs.getString(7));
				l.setUpdatedDate(rs.getString(8));
				
				listLaptop.add(l);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listLaptop;
	}

	@Override
	public int deleteLaptop(int lid) {
		return 0;
	}

	@Override
	public Laptop getLaptopById(int lid) {
		return null;
	}
	
}
