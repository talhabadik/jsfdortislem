
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Talha PC
 */
@ManagedBean
@RequestScoped
public class managedBeanSinifi {

int sayi1;
int sayi2;
int sonuc;
String islem;

    public String getIslem() {
        return islem;
    }

    public void setIslem(String islem) {
        this.islem = islem;
    }


    public int getSayi1() {
        return sayi1;
    }

    public void setSayi1(int sayi1) {
        this.sayi1 = sayi1;
    }

    public int getSayi2() {
        return sayi2;
    }

    public void setSayi2(int sayi2) {
        this.sayi2 = sayi2;
    }

    public int getSonuc() {
        return sonuc;
    }

    public void setSonuc(int sonuc) {
        this.sonuc = sonuc;
    }
    public void hesapla(){
        if(this.islem.equals("toplama"))
        {
    sonuc = sayi1+sayi2;
    
        }
        else if(this.islem.equals("cikarma"))
        {
    sonuc = sayi1-sayi2;
        }
         else if(this.islem.equals("carpma"))
        {
    sonuc = sayi1*sayi2;
        }
         else if(this.islem.equals("bolme")){
             sonuc=sayi1/sayi2;
         }
         
         
    }
    
}
