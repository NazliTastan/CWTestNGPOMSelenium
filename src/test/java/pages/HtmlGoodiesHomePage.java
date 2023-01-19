package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HtmlGoodiesHomePage {
    public WebElement washington;

    public HtmlGoodiesHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "box1")
    public WebElement Oslo;
    @FindBy(id = "box2")
    public WebElement Stockholm;
    @FindBy(id = "box3")
    public WebElement Washington;
    @FindBy(id = "box4")
    public WebElement Copenhag;
    @FindBy(id = "box5")
    public WebElement Seoul;
    @FindBy(id = "box6")
    public WebElement Rome;
    @FindBy(id = "box7")
    public WebElement Madrid;


    @FindBy(id = "box106")
    public WebElement italy;

    @FindBy(id = "box107")
    public WebElement spain;

    @FindBy(id = "box101")
    public WebElement norway;

    @FindBy(id = "box104")
    public WebElement denmark;

    @FindBy(id = "box105")
    public WebElement sKorea;

    @FindBy(id = "box102")
    public WebElement sweden;

    @FindBy(id = "box103")
    public WebElement us;
}
