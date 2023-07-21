package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.Nescafe_Giris_Yap_POM;
import pages.Nescafe_Kayit_POM;
import utilities.DriverClass;


public class Nescafe_Giris_Yap {

    JavascriptExecutor jse = (JavascriptExecutor) DriverClass.getDriver();

    Nescafe_Giris_Yap_POM nky = new Nescafe_Giris_Yap_POM();
    @And("Üye Girişi seçeneğine tıkla.")
    public void üyeGirişiSeçeneğineTıkla() {
        nky.clickMethod(nky.getGirisYap());
    }

    @And("Gelen giriş sayfasını doldururken geçersiz bir email değeri gir.")
    public void gelenGirişSayfasınıDoldururkenGeçersizBirEmailDeğeriGir() {
        nky.waitUntilVisible(nky.getEmail());
        jse.executeScript("arguments[0].value = 'abcd';", nky.getEmail());
        nky.waitUntilVisible(nky.getSifre());
        jse.executeScript("arguments[0].value = '999999';", nky.getSifre());



    }


    @Then("Giriş yap butonuna tıkla.")
    public void girişYapButonunaTıkla() {
        nky.clickMethod(nky.getGirisYapButonu());

    }

    @And("Gelen giriş sayfasını doldururken geçersiz bir şifre değeri gir.")
    public void gelenGirişSayfasınıDoldururkenGeçersizBirŞifreDeğeriGir() {
        nky.waitUntilVisible(nky.getEmail());
        jse.executeScript("arguments[0].value = 'abcd@gmail.com';", nky.getEmail());

        nky.waitUntilVisible(nky.getSifre());
        jse.executeScript("arguments[0].value = '9';", nky.getSifre());


    }

    @And("Gelen giriş sayfasını doldururken email kısmını boş bırak.")
    public void gelenGirişSayfasınıDoldururkenEmailKısmınıBoşBırak() {
        nky.waitUntilVisible(nky.getEmail());
        jse.executeScript("arguments[0].value = ' ';", nky.getEmail());

        nky.waitUntilVisible(nky.getSifre());
        jse.executeScript("arguments[0].value = '999999';", nky.getSifre());


    }

    @And("Gelen giriş sayfasını doldururken şifre kısmını boş bırak.")
    public void gelenGirişSayfasınıDoldururkenŞifreKısmınıBoşBırak() {
        nky.waitUntilVisible(nky.getEmail());
        jse.executeScript("arguments[0].value = 'abcd@gmail.com';", nky.getEmail());

        nky.waitUntilVisible(nky.getSifre());
        jse.executeScript("arguments[0].value = ' ';", nky.getSifre());


    }

    @And("Gelen giriş sayfasını doldururken tüm değerleri uygun bir şekilde gir.")
    public void gelenGirişSayfasınıDoldururkenTümDeğerleriUygunBirŞekildeGir() {
        nky.waitUntilVisible(nky.getEmail());
        jse.executeScript("arguments[0].value = 'utkucan910gmail.com';", nky.getEmail());

        nky.waitUntilVisible(nky.getSifre());
        jse.executeScript("arguments[0].value = '99999999';", nky.getSifre());


    }
}
