package Source.DAO;

import Source.DTO.ChuyenBayDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ChuyenBayDAO {

    public ArrayList<ChuyenBayDTO> getListChuyenBay() {
        try {
            String sql = "SELECT * FROM chuyenbay";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<ChuyenBayDTO> dscb = new ArrayList<>();
            while (rs.next()) {
                ChuyenBayDTO cb = new ChuyenBayDTO();
                cb.setMaChuyenBay(rs.getInt(1));
                cb.setMaTuyenBay(rs.getInt(2));
                cb.setMaMayBay(rs.getInt(3));
                cb.setVeCL(rs.getInt(4));
                cb.setNgayCatCanh(rs.getString(5));
                cb.setNgayHaCanh(rs.getString(6));
                dscb.add(cb);
            }
            return dscb;
        } catch (SQLException e) {
        }

        return null;
    }

    public ChuyenBayDTO getChuyenBay(int ma) {
        try {
            String sql = "SELECT *FROM chuyenbay WHERE maChuyenBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, ma);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                ChuyenBayDTO cb = new ChuyenBayDTO();

                cb.setMaChuyenBay(rs.getInt(1));
                cb.setMaTuyenBay(rs.getInt(2));
                cb.setMaMayBay(rs.getInt(3));
                cb.setVeCL(rs.getInt(4));
                cb.setNgayCatCanh(rs.getString(5));
                cb.setNgayHaCanh(rs.getString(6));

                return cb;
            }
        } catch (SQLException e) {
        }

        return null;
    }

    public ArrayList<ChuyenBayDTO> getChuyenBayTheoTuyenBay(int maTuyenBay) {
        try {
            String sql = "SELECT * FROM chuyenbay WHERE maTuyenBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, maTuyenBay);
            ResultSet rs = pre.executeQuery();
            ArrayList<ChuyenBayDTO> dscb = new ArrayList<>();
            while (rs.next()) {
                ChuyenBayDTO cb = new ChuyenBayDTO();

                cb.setMaChuyenBay(rs.getInt(1));
                cb.setMaTuyenBay(rs.getInt(2));
                cb.setMaMayBay(rs.getInt(3));
                cb.setVeCL(rs.getInt(4));
                cb.setNgayCatCanh(rs.getString(5));
                cb.setNgayHaCanh(rs.getString(6));

                dscb.add(cb);
            }
            return dscb;
        } catch (SQLException e) {
        }

        return null;
    }

    public ArrayList<ChuyenBayDTO> getChuyenBayTheoMayBay(int maMayBay) {
        try {
            String sql = "SELECT * FROM chuyenbay WHERE maMayBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, maMayBay);
            ResultSet rs = pre.executeQuery();
            ArrayList<ChuyenBayDTO> dscb = new ArrayList<>();
            while (rs.next()) {
                ChuyenBayDTO cb = new ChuyenBayDTO();

                cb.setMaChuyenBay(rs.getInt(1));
                cb.setMaTuyenBay(rs.getInt(2));
                cb.setMaMayBay(rs.getInt(3));
                cb.setVeCL(rs.getInt(4));
                cb.setNgayCatCanh(rs.getString(5));
                cb.setNgayHaCanh(rs.getString(6));

                dscb.add(cb);
            }
            return dscb;
        } catch (SQLException e) {
        }

        return null;
    }

    

    // public String getAnh(int ma) {
    //     try {
    //         String sql = "SELECT HinhAnh FROM ChuyenBayDTO WHERE MaSP=?";
    //         PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
    //         pre.setInt(1, ma);
    //         ResultSet rs = pre.executeQuery();
    //         if (rs.next()) {
    //             return rs.getString("HinhAnh");
    //         }
    //     } catch (SQLException e) {
    //     }
    //     return "";
    // }

    // public void capNhatSoLuongSP(int ma, int soLuongMat) {
    //     ChuyenBayDTO sp = getChuyenBayDTO(ma);
    //     int soLuong = sp.getSoLuong();
    //     sp.setSoLuong(soLuong + soLuongMat);
    //     try {
    //         String sql = "UPDATE ChuyenBayDTO SET SoLuong=? WHERE MaSP=" + ma;
    //         PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
    //         pre.setInt(1, sp.getSoLuong());
    //         pre.executeUpdate();
    //     } catch (SQLException e) {
    //     }

    // }

    public boolean themChuyenBayDTO(ChuyenBayDTO cb) {
        try {
            String sql = "INSERT INTO chuyenbay(maChuyenBay, maTuyenBay, maMayBay, veCL, ngayCatCanh, ngayHaCanh) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, cb.getMaChuyenBay());
            pre.setInt(2, cb.getMaTuyenBay());
            pre.setInt(3, cb.getMaMayBay());
            pre.setInt(4, cb.getVeCL());
            pre.setString(5, cb.getNgayCatCanh());
            pre.setString(6, cb.getNgayHaCanh());
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean nhapChuyenBayDTOTuExcel(ChuyenBayDTO cb) {
        try {
            String sql = "DELETE * FROM chuyenbay; " +
                    "INSERT INTO chuyenbay(maChuyenBay, maTuyenBay, maMayBay, veCL, ngayCatCanh, ngayHaCanh) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, cb.getMaChuyenBay());
            pre.setInt(2, cb.getMaTuyenBay());
            pre.setInt(3, cb.getMaMayBay());
            pre.setInt(4, cb.getVeCL());
            pre.setString(5, cb.getNgayCatCanh());
            pre.setString(6, cb.getNgayHaCanh());
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean xoaChuyenBayDTO(int maChuyenBay) {
        try {
            String sql = "DELETE FROM chuyenbay WHERE maChuyenBay=" + maChuyenBay;
            Statement st = MyConnect.conn.createStatement();
            st.execute(sql);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean suaChuyenBayDTO(ChuyenBayDTO cb) {
        try {
            String sql = "UPDATE chuyenbay SET "
                    + "maTuyenBay=?, "
                    + "maMayBay=?, veCL=?, ngayCatCanh=?, ngayHaCanh=? "
                    + "WHERE maChuyenBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, cb.getMaChuyenBay());
            pre.setInt(2, cb.getMaTuyenBay());
            pre.setInt(3, cb.getMaMayBay());
            pre.setInt(4, cb.getVeCL());
            pre.setString(5, cb.getNgayCatCanh());
            pre.setString(6, cb.getNgayHaCanh());
            pre.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
