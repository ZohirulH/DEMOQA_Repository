import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ElementsCheckBoxPageTest extends ElementsCheckBoxPage {
@BeforeTest
public void Setup(){StartBrowser();SetupReport("ElementsPageTest");}

    @Test
    public void Test() throws InterruptedException {
    NavigateTo(Url);
    Thread.sleep(1000);
    Click(CheckBox);
    Click(CheckBoxToggle);
    Click(CB_DesktopBox);
    Thread.sleep(1000);
    Click(CheckBoxCollapse);
    Click(CheckBoxExpand);
    Click(CheckBoxHome);









 }












}
