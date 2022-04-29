package DTO;
import java.util.Objects;

public class VeKHDTO {
	private String maVeKH;
	private String maVe;
	private String maKH;

	public VeKHDTO() {
	}

	public VeKHDTO(String maVeKH, String maVe, String maKH) {
		this.maVeKH = maVeKH;
		this.maVe = maVe;
		this.maKH = maKH;
	}

	public String getMaVeKH() {
		return this.maVeKH;
	}

	public void setMaVeKH(String maVeKH) {
		this.maVeKH = maVeKH;
	}

	public String getMaVe() {
		return this.maVe;
	}

	public void setMaVe(String maVe) {
		this.maVe = maVe;
	}

	public String getMaKH() {
		return this.maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public VeKHDTO maVeKH(String maVeKH) {
		setMaVeKH(maVeKH);
		return this;
	}

	public VeKHDTO maVe(String maVe) {
		setMaVe(maVe);
		return this;
	}

	public VeKHDTO maKH(String maKH) {
		setMaKH(maKH);
		return this;
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof VeKHDTO)) {
			return false;
		}
		VeKHDTO veKHDTO = (VeKHDTO) o;
		return Objects.equals(maVeKH, veKHDTO.maVeKH) && Objects.equals(maVe, veKHDTO.maVe)
				&& Objects.equals(maKH, veKHDTO.maKH);
	}

	@Override
	public int hashCode() {
		return Objects.hash(maVeKH, maVe, maKH);
	}

	@Override
	public String toString() {
		return "{" +
				" maVeKH='" + getMaVeKH() + "'" +
				", maVe='" + getMaVe() + "'" +
				", maKH='" + getMaKH() + "'" +
				"}";
	}

}
