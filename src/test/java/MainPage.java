import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject{
    //Class constructor
    public MainPage(WebDriver driver){ super(driver); }
    private final String Game_Name = "Opel";
    //private final String VALID_URL = "https://www.autodeco.ro/";




    @FindBy(xpath = "//*[@id=\"_autocompleteSearchMainHeader\"]")
    private WebElement SearchField;
    @FindBy(xpath = "//*[@id=\"_doSearch\"]/i")
    private WebElement Enter;
    @FindBy(xpath = "//*[@id=\"category-page\"]/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/a/img")
    private WebElement Sticker;
    @FindBy(xpath = "//*[@id=\"logo\"]/img")
    private WebElement Home;
    //@FindBy(xpath = "//*[@id=\"main-menu\"]/a")
    //private WebElement Span;
    @FindBy(xpath = "//*[@id=\"main-menu\"]/div/ul/li[10]/a")
    private WebElement Accesories;

    public void accesories(){this.Accesories.click();}
    //public void span(){this.Span.click();}
    public void home(){this.Home.click();}
    public void sticker(){this.Sticker.click();}
    public void enter(){this.Enter.click();}
    public void searchField(){this.SearchField.sendKeys(Game_Name);}
}
