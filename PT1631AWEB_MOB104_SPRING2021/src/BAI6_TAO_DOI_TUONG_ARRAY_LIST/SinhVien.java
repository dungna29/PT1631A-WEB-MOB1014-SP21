/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI6_TAO_DOI_TUONG_ARRAY_LIST;

/**
 *
 * @author DungNAPC
 */
public class SinhVien {
    private String tenSv;
    private String maSv;
    private int tuoi;
    private double diemJava;

    public SinhVien() {
    }

    public SinhVien(String tenSv, String maSv, int tuoi, double diemJava) {
        this.tenSv = tenSv;
        this.maSv = maSv;
        this.tuoi = tuoi;
        this.diemJava = diemJava;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "tenSv=" + tenSv + ", maSv=" + maSv + ", tuoi=" + tuoi + ", diemJava=" + diemJava + '}';
    }
    
    
}
