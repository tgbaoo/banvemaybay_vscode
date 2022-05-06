package Source.DAO;

import Source.DTO.LoaiVeDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoaiVeDAO {

    public ArrayList<LoaiVeDTO> getDanhSachLoai() {
        try {
            String sql = "SELECT * FROM loaiVe";
            PreparedStatement pre = MyConnect.conn.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            ArrayList<LoaiVeDTO> dsl = new ArrayList<>();
            while (rs.next()) {
                LoaiVeDTO loai = new LoaiVeDTO();
                loai.setMaLoaiVe(rs.getString(1));
                loai.setTenLoaiVe(rs.getString(2));
                loai.setDonGia(rs.getInt(3));
                dsl.add(loai);
            }
            return dsl;
        } catch (SQLException e) {
        }
        return null;
    }

    public boolean themLoai(LoaiVeDTO loai) {
        try {
            String sql = "insert into loaiVe(tenLoaiVe) "
                    + "values ("
                    + "'" + loai.getTenLoaiVe() + "')";
            Statement st = MyConnect.conn.createStatement();
            int x = st.executeUpdate(sql);
            return x > 0 ? true : false;
        } catch (SQLException ex) {
            Logger.getLogger(LoaiVeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public boolean xoaLoai(int maLoaiVe) {
        try {
            String sql = "DELETE FROM loaiVe WHERE maLoaiVe=" + maLoaiVe;
            Statement st = MyConnect.conn.createStatement();
            int x = st.executeUpdate(sql);
            return x > 0 ? true : false;
        } catch (SQLException e) {
        }
        return false;
    }

    public boolean suaLoai(int maLoaiVe, String tenLoaiVe) {
        try {
            String sql = "UPDATE Loai SET TenLoai='" + tenLoaiVe + "' WHERE MaLoai=" + maLoaiVe;
            Statement st = MyConnect.conn.createStatement();
            int x = st.executeUpdate(sql);
            return x > 0 ? true : false;
        } catch (SQLException e) {
        }
        return false;
    }
}
