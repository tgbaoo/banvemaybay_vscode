package Source.DTO;
import java.util.Objects;

public class VeDTO {
    private String maVe;
    private String maChuyenBay;
    private String maLoaiVe;
    private String maGhe;
    private String gioLenMayBay;

    public VeDTO() {
    }

    public VeDTO(String maVe, String maChuyenBay, String maLoaiVe, String maGhe, String gioLenMayBay) {
        this.maVe = maVe;
        this.maChuyenBay = maChuyenBay;
        this.maLoaiVe = maLoaiVe;
        this.maGhe = maGhe;
        this.gioLenMayBay = gioLenMayBay;
    }

    public String getMaVe() {
        return this.maVe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public String getMaChuyenBay() {
        return this.maChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public String getMaLoaiVe() {
        return this.maLoaiVe;
    }

    public void setMaLoaiVe(String maLoaiVe) {
        this.maLoaiVe = maLoaiVe;
    }

    public String getMaGhe() {
        return this.maGhe;
    }

    public void setMaGhe(String maGhe) {
        this.maGhe = maGhe;
    }

    public String getGioLenMayBay() {
        return this.gioLenMayBay;
    }

    public void setGioLenMayBay(String gioLenMayBay) {
        this.gioLenMayBay = gioLenMayBay;
    }

    public VeDTO maVe(String maVe) {
        setMaVe(maVe);
        return this;
    }

    public VeDTO maChuyenBay(String maChuyenBay) {
        setMaChuyenBay(maChuyenBay);
        return this;
    }

    public VeDTO maLoaiVe(String maLoaiVe) {
        setMaLoaiVe(maLoaiVe);
        return this;
    }

    public VeDTO maGhe(String maGhe) {
        setMaGhe(maGhe);
        return this;
    }

    public VeDTO gioLenMayBay(String gioLenMayBay) {
        setGioLenMayBay(gioLenMayBay);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof VeDTO)) {
            return false;
        }
        VeDTO veDTO = (VeDTO) o;
        return Objects.equals(maVe, veDTO.maVe) && Objects.equals(maChuyenBay, veDTO.maChuyenBay)
                && Objects.equals(maLoaiVe, veDTO.maLoaiVe) && Objects.equals(maGhe, veDTO.maGhe)
                && Objects.equals(gioLenMayBay, veDTO.gioLenMayBay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maVe, maChuyenBay, maLoaiVe, maGhe, gioLenMayBay);
    }

    @Override
    public String toString() {
        return "{" +
                " maVe='" + getMaVe() + "'" +
                ", maChuyenBay='" + getMaChuyenBay() + "'" +
                ", maLoaiVe='" + getMaLoaiVe() + "'" +
                ", maGhe='" + getMaGhe() + "'" +
                ", gioLenMayBay='" + getGioLenMayBay() + "'" +
                "}";
    }
}