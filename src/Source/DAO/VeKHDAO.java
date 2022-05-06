package Source.DAO;


import Source.DTO.VeKHDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class VeKHDAO {
    public ArrayList<VeKHDTO> getListVe() {
        try {
            String sql = "SELECT * FROM ve-kh";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<VeKHDTO> dsvkh = new ArrayList<>();
            while (rs.next()) {
                VeKHDTO veKH = new VeKHDTO();
                veKH.setMaVe(rs.getString(1));
                veKH.setMaVe(rs.getString(2));
                veKH.setMaKH(rs.getString(3));
                dsvkh.add(veKH);
            }
            return dsvkh;
        } catch (SQLException e) {
        }

        return null;
    }

    public VeKHDTO getVeKH(int maVeKH) {
        try {
            String sql = "SELECT * FROM ve-kh WHERE maVeKH=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, maVeKH);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                VeKHDTO veKH = new VeKHDTO();
                veKH.setMaVe(rs.getString(1));
                veKH.setMaVe(rs.getString(2));
                veKH.setMaKH(rs.getString(3));
                return veKH;
            }
        } catch (SQLException e) {
        }

        return null;
    }

    public ArrayList<VeKHDTO> getVeTheoMaVe(int maVe) {
        try {
            String sql = "SELECT * FROM ve-kh WHERE maVe=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, maVe);
            ResultSet rs = pre.executeQuery();
            ArrayList<VeKHDTO> dsvkh = new ArrayList<>();
            while (rs.next()) {
                VeKHDTO veKH = new VeKHDTO();
                veKH.setMaVe(rs.getString(1));
                veKH.setMaVe(rs.getString(2));
                veKH.setMaKH(rs.getString(3));
                dsvkh.add(veKH);
            }
            return dsvkh;
        } catch (SQLException e) {
        }
        return null;
    }

    public ArrayList<VeKHDTO> getVeTheoMaKH(int maKH) {
        try {
            String sql = "SELECT * FROM ve-kh WHERE maKH=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setInt(1, maKH);
            ResultSet rs = pre.executeQuery();
            ArrayList<VeKHDTO> dsvkh = new ArrayList<>();
            while (rs.next()) {
                VeKHDTO veKH = new VeKHDTO();
                veKH.setMaVe(rs.getString(1));
                veKH.setMaVe(rs.getString(2));
                veKH.setMaKH(rs.getString(3));
                dsvkh.add(veKH);
            }
            return dsvkh;
        } catch (SQLException e) {
        }

        return null;
    }

    // public String getAnh(int ma) {
    // try {
    // String sql = "SELECT HinhAnh FROM VeKHDTO WHERE MaSP=?";
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
    //     VeKHDTO ve = getVeKHDTO(ma);
    //     int soLuong = ve.getSoLuong();
    //     sp.setSoLuong(soLuong + soLuongMat);
    //     try {
    //         String sql = "UPDATE VeKHDTO SET SoLuong=? WHERE MaSP=" + ma;
    //         PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
    //         pre.setInt(1, sp.getSoLuong());
    //         pre.executeUpdate();
    //     } catch (SQLException e) {
    //     }

    // }

    public boolean themVeKHDTO(VeKHDTO veKH) {
        try {
            String sql = "INSERT INTO Ve(maVeKH, maVe, maKH) "
                    + "VALUES (?, ?, ?)";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, veKH.getMaVeKH());
            pre.setString(2, veKH.getMaVe());
            pre.setString(3, veKH.getMaKH());
            pre.execute();
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    // public boolean nhapVeKHDTOTuExcel(VeKHDTO veKH) {
    //     try {
    //         String sql = "DELETE * FROM ve; " +
    //                 "INSERT INTO ve(maVeKH, maVe, maKH) "
    //                 + "VALUES (?, ?, ?)";
    //         PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
    //         pre.setString(1, veKH.getMaVeKH());
    //         pre.setString(2, veKH.getMaVe());
    //         pre.setString(3, veKH.getMaKH());
    //         pre.execute();
    //         return true;
    //     } catch (SQLException e) {
    //     }
    //     return false;
    // }

    public boolean xoaVeKHDTO(int maVeKH) {
        try {
            String sql = "DELETE FROM ve-kh WHERE maVeKH=" + maVeKH;
            Statement st = MyConnect.conn.createStatement();
            st.execute(sql);
            return true;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean suaVeKHDTO(VeKHDTO veKH) {
        try {
            String sql = "UPDATE ve-kh SET "
                    + "maVeKH=?, "
                    + "maVe=?, maKH=? "
                    + "WHERE maVeKH=?";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            pre.setString(1, veKH.getMaVeKH());
            pre.setString(2, veKH.getMaVe());
            pre.setString(3, veKH.getMaKH());
            pre.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
