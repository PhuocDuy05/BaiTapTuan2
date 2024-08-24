/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.bt1;

/**
 *
 * @author ADMIN
 */


public class Vuong extends ChuNhat {

    
    public Vuong(double canh) {
        super(canh, canh);
    }

   
    @Override
    public void xuat() {
        System.out.println("Hinh vuong co canh: " + dai +
                ", dien tich: " + dienTich() + ", chu vi: " + chuVi());
    }
}

