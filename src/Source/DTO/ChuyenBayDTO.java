package Source.DTO;
import java.util.Objects;

public class ChuyenBayDTO {
    private int maChuyenBay;
    private int maTuyenBay;
    private int maMayBay;
    private int veCL;
    private String ngayCatCanh;
    private String ngayHaCanh;

    public ChuyenBayDTO() {
    }

    public ChuyenBayDTO(int maChuyenBay, int maTuyenBay, int maMayBay, int veCL, String ngayCatCanh, String ngayHaCanh) {
        this.maChuyenBay = maChuyenBay;
        this.maTuyenBay = maTuyenBay;
        this.maMayBay = maMayBay;
        this.veCL = veCL;
        this.ngayCatCanh = ngayCatCanh;
        this.ngayHaCanh = ngayHaCanh;
    }

    public int getMaChuyenBay() {
        return this.maChuyenBay;
    }

    public void setMaChuyenBay(int maChuyenBay) {
        this.maChuyenBay = maChuyenBay;
    }

    public int getMaTuyenBay() {
        return this.maTuyenBay;
    }

    public void setMaTuyenBay(int maTuyenBay) {
        this.maTuyenBay = maTuyenBay;
    }

    public int getMaMayBay() {
        return this.maMayBay;
    }

    public void setMaMayBay(int maMayBay) {
        this.maMayBay = maMayBay;
    }

    public int getVeCL() {
        return this.veCL;
    }

    public void setVeCL(int veCL) {
        this.veCL = veCL;
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

    public ChuyenBayDTO maChuyenBay(int maChuyenBay) {
        setMaChuyenBay(maChuyenBay);
        return this;
    }

    public ChuyenBayDTO maTuyenBay(int maTuyenBay) {
        setMaTuyenBay(maTuyenBay);
        return this;
    }

    public ChuyenBayDTO maMayBay(int maMayBay) {
        setMaMayBay(maMayBay);
        return this;
    }

    public ChuyenBayDTO veCL(int veCL) {
        setVeCL(veCL);
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
        return Objects.equals(maChuyenBay, chuyenBayDTO.maChuyenBay) && Objects.equals(maTuyenBay, chuyenBayDTO.maTuyenBay) && Objects.equals(maMayBay, chuyenBayDTO.maMayBay) && veCL == chuyenBayDTO.veCL && Objects.equals(ngayCatCanh, chuyenBayDTO.ngayCatCanh) && Objects.equals(ngayHaCanh, chuyenBayDTO.ngayHaCanh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maChuyenBay, maTuyenBay, maMayBay, veCL, ngayCatCanh, ngayHaCanh);
    }

    @Override
    public String toString() {
        return "{" +
            " maChuyenBay='" + getMaChuyenBay() + "'" +
            ", maTuyenBay='" + getMaTuyenBay() + "'" +
            ", maMayBay='" + getMaMayBay() + "'" +
            ", veCL='" + getVeCL() + "'" +
            ", ngayCatCanh='" + getNgayCatCanh() + "'" +
            ", ngayHaCanh='" + getNgayHaCanh() + "'" +
            "}";
    }

}
