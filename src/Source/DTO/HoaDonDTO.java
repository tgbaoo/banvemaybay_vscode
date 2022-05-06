package Source.DTO;
import java.sql.Date;

public class HoaDonDTO {
    private String maHD;
    private String maNV;
    private String maKHThanhToan;
    private Date ngayLap;
    private int tongTien;
    
    public HoaDonDTO() {
    	
    }
    
	public HoaDonDTO(String maHD, String maNV, String maKHThanhToan, Date ngayLap, int tongTien) {
		super();
		this.maHD = maHD;
		this.maNV = maNV;
		this.maKHThanhToan = maKHThanhToan;
		this.ngayLap = ngayLap;
		this.tongTien = tongTien;
	}

	public String getMaHD() {
		return maHD;
	}

	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getMaKHThanhToan() {
		return maKHThanhToan;
	}

	public void setMaKHThanhToan(String maKHThanhToan) {
		this.maKHThanhToan = maKHThanhToan;
	}

	public Date getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}

	public int getTongTien() {
		return tongTien;
	}

	public void setTongTien(int tongTien) {
		this.tongTien = tongTien;
	}
    
	
	
    
    
}
