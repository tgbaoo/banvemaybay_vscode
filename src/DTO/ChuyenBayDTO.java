package DTO;
import java.util.Objects;

public class ChuyenBayDTO {
    private String maChuyenBay;
    private String maTuyenBay;
    private String maMayBay;
    private int soLgVeConLai;
    private String ngayCatCanh;
    private String ngayHaCanh;

    public ChuyenBayDTO() {
    }

    public ChuyenBayDTO(String maChuyenBay, String maTuyenBay, String maMayBay, int soLgVeConLai, String ngayCatCanh, String ngayHaCanh) {
        this.maChuyenBay = maChuyenBay;
        this.maTuyenBay = maTuyenBay;
        this.maMayBay = maMayBay;
        this.soLgVeConLai = soLgVeConLai;
        this.ngayCatCanh = ngayCatCanh;
        this.ngayHaCanh = ngayHaCanh;
    }

    public String getMaChuyenBay() {
        return this.maChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public String getMaTuyenBay() {
        return this.maTuyenBay;
    }

    public void setMaTuyenBay(String maTuyenBay) {
        this.maTuyenBay = maTuyenBay;
    }

    public String getMaMayBay() {
        return this.maMayBay;
    }

    public void setMaMayBay(String maMayBay) {
        this.maMayBay = maMayBay;
    }

    public int getSoLgVeConLai() {
        return this.soLgVeConLai;
    }

    public void setSoLgVeConLai(int soLgVeConLai) {
        this.soLgVeConLai = soLgVeConLai;
    }

    public String getNgayCatCanh() {
        return this.ngayCatCanh;
    }

    public void setNgayCatCanh(String ngayCatCanh) {
        this.ngayCatCanh = ngayCatCanh;
    }

    public String getNgayHaCanh() {
        return this.ngayHaCanh;
    }

    public void setNgayHaCanh(String ngayHaCanh) {
        this.ngayHaCanh = ngayHaCanh;
    }

    public ChuyenBayDTO maChuyenBay(String maChuyenBay) {
        setMaChuyenBay(maChuyenBay);
        return this;
    }

    public ChuyenBayDTO maTuyenBay(String maTuyenBay) {
        setMaTuyenBay(maTuyenBay);
        return this;
    }

    public ChuyenBayDTO maMayBay(String maMayBay) {
        setMaMayBay(maMayBay);
        return this;
    }

    public ChuyenBayDTO soLgVeConLai(int soLgVeConLai) {
        setSoLgVeConLai(soLgVeConLai);
        return this;
    }

    public ChuyenBayDTO ngayCatCanh(String ngayCatCanh) {
        setNgayCatCanh(ngayCatCanh);
        return this;
    }

    public ChuyenBayDTO ngayHaCanh(String ngayHaCanh) {
        setNgayHaCanh(ngayHaCanh);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ChuyenBayDTO)) {
            return false;
        }
        ChuyenBayDTO chuyenBayDTO = (ChuyenBayDTO) o;
        return Objects.equals(maChuyenBay, chuyenBayDTO.maChuyenBay) && Objects.equals(maTuyenBay, chuyenBayDTO.maTuyenBay) && Objects.equals(maMayBay, chuyenBayDTO.maMayBay) && soLgVeConLai == chuyenBayDTO.soLgVeConLai && Objects.equals(ngayCatCanh, chuyenBayDTO.ngayCatCanh) && Objects.equals(ngayHaCanh, chuyenBayDTO.ngayHaCanh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maChuyenBay, maTuyenBay, maMayBay, soLgVeConLai, ngayCatCanh, ngayHaCanh);
    }

    @Override
    public String toString() {
        return "{" +
            " maChuyenBay='" + getMaChuyenBay() + "'" +
            ", maTuyenBay='" + getMaTuyenBay() + "'" +
            ", maMayBay='" + getMaMayBay() + "'" +
            ", soLgVeConLai='" + getSoLgVeConLai() + "'" +
            ", ngayCatCanh='" + getNgayCatCanh() + "'" +
            ", ngayHaCanh='" + getNgayHaCanh() + "'" +
            "}";
    }
}
