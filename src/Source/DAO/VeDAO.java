package Source.DAO;

import Source.DTO.VeDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class VeDAO {
    public ArrayList<VeDTO> getListVe() {
        try {
            String sql = "SELECT * FROM ve";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<VeDTO> dsv = new ArrayList<>();
            while (rs.next()) {
                VeDTO ve = new VeDTO();
                ve.setMaVe(rs.getString(1));
                ve.setMaChuyenBay(rs.getString(2));
                ve.setMaLoaiVe(rs.getString(3));
                ve.setMaGhe(rs.getString(4));
                ve.setGioLenMayBay(rs.getString(5));
                dsv.add(ve);
            }
            return dsv;
        } catch (SQLException e) {
        }

        return null;
    }

    public VeDTO getVe(int ma) {
        try {
            String sql = "SELECT * FROM ve WHERE maVe=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, ma);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                VeDTO ve = new VeDTO();
                ve.setMaVe(rs.getString(1));
                ve.setMaChuyenBay(rs.getString(2));
                ve.setMaLoaiVe(rs.getString(3));
                ve.setMaGhe(rs.getString(4));
                ve.setGioLenMayBay(rs.getString(5));
                return ve;
            }
        } catch (SQLException e) {
        }

        return null;
    }

    public ArrayList<VeDTO> getVeTheoMaChuyenBay(int maChuyenBay) {
        try {
            String sql = "SELECT * FROM ve WHERE maChuyenBay=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, maChuyenBay);
            ResultSet rs = pre.executeQuery();
            ArrayList<VeDTO> dsv = new ArrayList<>();
            while (rs.next()) {
                VeDTO ve = new VeDTO();
                ve.setMaVe(rs.getString(1));
                ve.setMaChuyenBay(rs.getString(2));
                ve.setMaLoaiVe(rs.getString(3));
                ve.setMaGhe(rs.getString(4));
                ve.setGioLenMayBay(rs.getString(5));
                dsv.add(ve);
            }
            return dsv;
        } catch (SQLException e) {
        }
        return null;
    }

    public ArrayList<VeDTO> getVeTheoMaLoaiVe(int maLoaiVe) {
        try {
            String sql = "SELECT * FROM ve WHERE maLoaiVe=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, maLoaiVe);
            ResultSet rs = pre.executeQuery();
            ArrayList<VeDTO> dsv = new ArrayList<>();
            while (rs.next()) {
                VeDTO ve = new VeDTO();

                ve.setMaVe(rs.getString(1));
                ve.setMaChuyenBay(rs.getString(2));
                ve.setMaLoaiVe(rs.getString(3));
                ve.setMaGhe(rs.getString(4));
                ve.setGioLenMayBay(rs.getString(5));
                dsv.add(ve);
            }
            return dsv;
        } catch (SQLException e) {
        }

        return null;
    }

    // public String getAnh(int ma) {
    // try {
    // String sql = "SELECT HinhAnh FROM VeDTO WHERE MaSP=?";
    // PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
    // pre.setInt(1, ma);
    // ResultSet rs = pre.executeQuery();
    // if (rs.next()) {
    // return rs.getString("HinhAnh");
    // }
    // } catch (SQLException e) {
    // }
    // return "";
    // }

    // public void capNhatSoLuongVe(int maVe, int soLuongMat) {
    //     VeDTO ve = getVeDTO(ma);
    //     int soLuong = ve.getSoLuong();
    //     sp.setSoLuong(soLuong + soLuongMat);
    //     try {
    //         String sql = "UPDATE VeDTO SET SoLuong=? WHERE MaSP=" + ma;
    //         PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
    //         pre.setInt(1, sp.getSoLuong());
    //         pre.executeUpdate();
    //     } catch (SQLException e) {
    //     }

    // }

    public boolean themVeDTO(VeDTO ve) {
        try {
            String sql = "INSERT INTO Ve(maVe, maTuyenBay, maMayBay, veCL, ngayCatCanh, ngayHaCanh) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, ve.getMaVe());
            pre.setString(2, ve.getMaChuyenBay());
            pre.setString(3, ve.getMaLoaiVe());
            pre.setString(4, ve.getMaGhe());
            pre.setString(5, ve.getGioLenMayBay());
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean nhapVeDTOTuExcel(VeDTO ve) {
        try {
            String sql = "DELETE * FROM ve; " +
                    "INSERT INTO ve(maVe, maChuyenBay, maLoaiVe, maGhe, gioLenMayBay) "
                    + "VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, ve.getMaVe());
            pre.setString(2, ve.getMaChuyenBay());
            pre.setString(3, ve.getMaLoaiVe());
            pre.setString(4, ve.getMaGhe());
            pre.setString(5, ve.getGioLenMayBay());
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean xoaVeDTO(int maVe) {
        try {
            String sql = "DELETE FROM ve WHERE maVe=" + maVe;
            Statement st = MyConnect.conn.createStatement();
            st.execute(sql);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean suaVeDTO(VeDTO ve) {
        try {
            String sql = "UPDATE ve SET "
                    + "maChuyenBay=?, "
                    + "maLoaiVe=?, maGhe=?, gioLenMayBay=? "
                    + "WHERE maVe=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, ve.getMaVe());
            pre.setString(2, ve.getMaChuyenBay());
            pre.setString(3, ve.getMaLoaiVe());
            pre.setString(4, ve.getMaGhe());
            pre.setString(5, ve.getGioLenMayBay());
            pre.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
