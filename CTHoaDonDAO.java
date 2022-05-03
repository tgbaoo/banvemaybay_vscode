

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CTHoaDonDAO {

	    public ArrayList<CTHoaDon> getListCTHoaDon() {
	        ArrayList<CTHoaDon> dscthd = new ArrayList<>();
	        try {
	            String sql = "SELECT * FROM cthoadon";
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banvemaybay" , "root" , "") ;
	            Statement stmt = con.createStatement();
	            ResultSet rs = stmt.executeQuery(sql);
	            while(rs.next()) {
	                CTHoaDon cthd = new CTHoaDon();
	                cthd.setMaHD(rs.getNString(1));
	                cthd.setMaLoaiVe(rs.getNString(2));
	                cthd.setMaVeKH(rs.getNString(3));
	                cthd.setSoLgVe(rs.getInt(4));
	                cthd.setMaKM(rs.getNString(5));
	                cthd.setThue(rs.getNString(6));
	                cthd.setThanhTien(rs.getInt(7));
	                dscthd.add(cthd);
	            }
	        } catch(SQLException ex) {
	        }
	        return dscthd;
	    }

	    public ArrayList<CTHoaDon> getListCTHoaDonTheoMaHD(int maHD) {
	        ArrayList<CTHoaDon> dscthd = new ArrayList<>();
	        try {
	            String sql = "SELECT * FROM cthoadon WHERE maHD="+maHD;
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banvemaybay" , "root" , "") ;
	            Statement stmt = con.createStatement();
	            ResultSet rs = stmt.executeQuery(sql);
	            while(rs.next()) {
	            	 CTHoaDon cthd = new CTHoaDon();
		                cthd.setMaHD(rs.getNString(1));
		                cthd.setMaLoaiVe(rs.getNString(2));
		                cthd.setMaVeKH(rs.getNString(3));
		                cthd.setSoLgVe(rs.getInt(4));
		                cthd.setMaKM(rs.getNString(5));
		                cthd.setThue(rs.getNString(6));
		                cthd.setThanhTien(rs.getInt(7));
	                dscthd.add(cthd);
	            }
	        } catch(SQLException ex) {
	            return null;
	        }
	        return dscthd;
	    }

	    public ArrayList<CTHoaDon> getListCTHoaDonTheoMaLoaiVe(int maLoaiVe) {
	        ArrayList<CTHoaDon> dscthd = new ArrayList<>();
	        try {
	            String sql = "SELECT * FROM cthoadon WHERE maLoaiVe ="+maLoaiVe;
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banvemaybay" , "root" , "") ;
	            Statement stmt = con.createStatement();
	            ResultSet rs = stmt.executeQuery(sql);
	            while(rs.next()) {
		            	CTHoaDon cthd = new CTHoaDon();
		            	cthd.setMaHD(rs.getNString(1));
		                cthd.setMaLoaiVe(rs.getNString(2));
		                cthd.setMaVeKH(rs.getNString(3));
		                cthd.setSoLgVe(rs.getInt(4));
		                cthd.setMaKM(rs.getNString(5));
		                cthd.setThue(rs.getNString(6));
		                cthd.setThanhTien(rs.getInt(7));
	            }
	        } catch(SQLException ex) {
	            return null;
	        }
	        return dscthd;
	    }

	    public boolean addCTHoaDon(CTHoaDon cthd) {
	        boolean result = false;
	        try {
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banvemaybay" , "root" , "") ;
		    	String query = "insert into cthoadon values(? , ? ,? ,? , ? , ?) ";
		    	PreparedStatement prep = con.prepareStatement(query);
//	            prep.setString(1, cthd.getMaHD());
	            prep.setString(2, cthd.getMaLoaiVe());
	            prep.setString(3, cthd.getMaVeKH());
	            prep.setInt(4, cthd.getSoLgVe());
	            prep.setString(5, cthd.getMaKM());
	            prep.setString(6, cthd.getThue());
	            prep.setInt(7, cthd.getThanhTien());
	            result = prep.executeUpdate() > 0;
	        } catch(SQLException ex) {
	            ex.printStackTrace();
	            return false;
	        }
	        return result;
	    }

	    public boolean deleteCTHoaDon(int maHD, int maLoaiVe) {
	        boolean result = false;
	        try {
	            String sql = "DELETE FROM cthoadon WHERE maHD="+maHD+" AND maLoaiVe="+maLoaiVe;
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banvemaybay" , "root" , "") ;
	            Statement stmt = con.createStatement();
	            result = stmt.executeUpdate(sql) > 0;
	        } catch(SQLException ex) {
	            return false;
	        }
	        return result;
	    }

	    public boolean deleteCTHoaDon(int maHD) {
	        boolean result = false;
	        try {
	            String sql = "DELETE FROM cthoadon WHERE MaHD="+maHD;
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banvemaybay" , "root" , "") ;
	            Statement stmt = con.createStatement();
	            result = stmt.executeUpdate(sql) > 0;
	        } catch(SQLException ex) {
	            return false;
	        }
	        return result;
	    }

	    public boolean updateCTHoaDon(int maHD, int maSP, CTHoaDon cthd) {
	        boolean result = false;
	        try {
	            String sql = "UPDATE cthoadon SET maHD=?, maLoaiVe=?, maVeKH = ? , soLgVe=?, maKM = ?  , thue = ? , thanhTien=? "
	                    + "WHERE MaHD=? AND MaSP=?";
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banvemaybay" , "root" , "") ;
	            PreparedStatement prep = con.prepareStatement(sql);
	            prep.setString(1, cthd.getMaHD());
	            prep.setString(2, cthd.getMaLoaiVe());
	            prep.setString(3, cthd.getMaVeKH());
	            prep.setInt(4, cthd.getSoLgVe());
	            prep.setString(5, cthd.getMaKM());
	            prep.setString(6, cthd.getThue());
	            prep.setInt(7, cthd.getThanhTien());
	            result = prep.executeUpdate() > 0;
	        } catch(SQLException ex) {
	            return false;
	        }
	        return result;
	    }
	}

