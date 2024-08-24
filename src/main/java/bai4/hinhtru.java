/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author ADMIN
 */
public class hinhtru extends hinhtron  {
      private double chieuCao;

    
    public hinhtru() {
        super();
        this.chieuCao = 0;
    }

    
    public hinhtru(double banKinh, double chieuCao) {
        super( banKinh);
        this.chieuCao = chieuCao;
    }

    
    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    
    public double getChieuCao() {
        return chieuCao;
    }

    
    @Override
    public double tinhDienTich() {
        return 2 * Math.PI * getBanKinh() * (getBanKinh() + chieuCao);
    }

   
    public double tinhTheTich() {
        return Math.PI * getBanKinh() * getBanKinh() * chieuCao;
    }
}
