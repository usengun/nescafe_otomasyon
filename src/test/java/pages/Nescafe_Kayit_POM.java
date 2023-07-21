package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverClass;
import utilities.MyMethods;

public class Nescafe_Kayit_POM extends MyMethods {
    public Nescafe_Kayit_POM() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath = "//label[@for='menuitem3']")
    private WebElement profilIkonu;

    @FindBy(xpath = "//ul[@class='register-menu active']//a[contains(text(),'Kayıt ol')]")
    private WebElement kayitOlButonu;

    @FindBy(xpath = "(//input[@name='profile.firstName'])[3]")
    private WebElement ad;

    @FindBy(xpath = "(//input[@name='profile.lastName'])[3]")
    private WebElement soyad;

    @FindBy(xpath = "(//select[@name='profile.birthDay'])[3]")
    private WebElement dogumTarihiGun;

    @FindBy(xpath = "(//select[@name='profile.birthMonth'])[3]")
    private WebElement dogumTarihiAy;

    @FindBy(xpath = "(//select[@name='profile.birthYear'])[3]")
    private WebElement dogumTarihiYil;

    @FindBy(xpath = "(//input[@name='profile.email'])[1]")
    private WebElement email;

    @FindBy(xpath = "(//input[@name='profile.password'])[1]")
    private WebElement sifre;

    @FindBy(xpath = "(//input[@name='profile.passwordRetype'])[1]")
    private WebElement sifreOnayi;

    @FindBy(xpath = "//input[@name='preferences.terms.TRnescafe_RGtcandprivacy.isConsentGranted']")
    private WebElement aydinlatmaMetniveGizlilikPolitikası;

    @FindBy(xpath = "//label[@for='gigya-checkbox-29967629431485264']")
    private WebElement yurtdisiAktarimi;

    @FindBy(xpath = "//label[@for='gigya-checkbox-129959784605786700']")
    private WebElement nestleGrupHaberBulteni;

    @FindBy(xpath = "//input[@value='Üye ol']")
    private WebElement uyeOlButonu;

    public WebElement getProfilIkonu() {
        return profilIkonu;
    }

    public WebElement getKayitOlButonu() {
        return kayitOlButonu;
    }

    public WebElement getAd() {
        return ad;
    }

    public WebElement getSoyad() {
        return soyad;
    }

    public WebElement getDogumTarihiGun() {
        return dogumTarihiGun;
    }
    public WebElement getDogumTarihiAy() {
        return dogumTarihiAy;
    }

    public WebElement getDogumTarihiYil() {
        return dogumTarihiYil;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getSifre(){
        return sifre;
    }

    public WebElement getSifreOnayi(){
        return sifreOnayi;
    }

    public WebElement getAydinlatmaMetniveGizlilikPolitikası(){
        return aydinlatmaMetniveGizlilikPolitikası;
    }

    public WebElement getYurtdisiAktarimi(){
        return yurtdisiAktarimi;
    }

    public WebElement getNestleGrupHaberBulteni(){
        return nestleGrupHaberBulteni;
    }

    public WebElement getUyeOlButonu(){
        return uyeOlButonu;
    }
}
