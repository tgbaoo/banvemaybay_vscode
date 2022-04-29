package DTO;
import java.util.Objects;

public class LoaiVeDTO {
	private String maLoaiVe;
	private String tenLoaiVe;
	private String donGia;

	public LoaiVeDTO() {
	}

	public LoaiVeDTO(String maLoaiVe, String tenLoaiVe, String donGia) {
		this.maLoaiVe = maLoaiVe;
		this.tenLoaiVe = tenLoaiVe;
		this.donGia = donGia;
	}

	public String getMaLoaiVe() {
		return this.maLoaiVe;
	}

	public void setMaLoaiVe(String maLoaiVe) {
		this.maLoaiVe = maLoaiVe;
	}

	public String getTenLoaiVe() {
		return this.tenLoaiVe;
	}

	public void setTenLoaiVe(String tenLoaiVe) {
		this.tenLoaiVe = tenLoaiVe;
	}

	public String getDonGia() {
		return this.donGia;
	}

	public void setDonGia(String donGia) {
		this.donGia = donGia;
	}

	public LoaiVeDTO maLoaiVe(String maLoaiVe) {
		setMaLoaiVe(maLoaiVe);
		return this;
	}

	public LoaiVeDTO tenLoaiVe(String tenLoaiVe) {
		setTenLoaiVe(tenLoaiVe);
		return this;
	}

	public LoaiVeDTO donGia(String donGia) {
		setDonGia(donGia);
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof LoaiVeDTO)) {
			return false;
		}
		LoaiVeDTO loaiVeDTO = (LoaiVeDTO) o;
		return Objects.equals(maLoaiVe, loaiVeDTO.maLoaiVe) && Objects.equals(tenLoaiVe, loaiVeDTO.tenLoaiVe)
				&& Objects.equals(donGia, loaiVeDTO.donGia);
	}

	@Override
	public int hashCode() {
		return Objects.hash(maLoaiVe, tenLoaiVe, donGia);
	}

	@Override
	public String toString() {
		return "{" +
				" maLoaiVe='" + getMaLoaiVe() + "'" +
				", tenLoaiVe='" + getTenLoaiVe() + "'" +
				", donGia='" + getDonGia() + "'" +
				"}";
	}
}
