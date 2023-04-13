import org.openqa.selenium.By;

public class ElementsCheckBoxPage extends ReusableMethods{

    String CheckBox ="//span[normalize-space()='Check Box']";
    String CheckBoxToggle ="//button[@title='Toggle']//*[name()='svg']";
    String CheckBoxHome ="//span[@class='rct-checkbox']//*[name()='svg']";
    String CheckBoxExpand ="//button[@title='Expand all']//*[name()='svg']";
    String CheckBoxCollapse ="(//button[@title='Collapse all'])[1]";
    String CB_DesktopToggle = "(//button[@title='Toggle'])[2]";
    String CB_DesktopBox = "//label[@for='tree-node-desktop']//span[@class='rct-checkbox']//*[name()='svg']";
    String CB_DesktopNotes ="//label[@for='tree-node-notes']//span[@class='rct-checkbox']//*[name()='svg']";
    String CB_DesktopCommands = "//label[@for='tree-node-commands']//span[@class='rct-checkbox']//*[name()='svg']//*[name()='path' and contains(@d,'M19 5v14H5')]";
    String CB_DocumentsToggle ="(//*[name()='svg'][@class='rct-icon rct-icon-expand-open'])[3]";
    String CB_DocumentsBox = "(//*[name()='svg'][@class='rct-icon rct-icon-uncheck'])[5]";
    String CB_WorkSpaceToggle = "(//button[@title='Toggle'])[4]";
    String CB_WorkSpaceBox = "(//span[@class='rct-checkbox'])[6]";
    String CB_WorkSpaceReactBox = "(//span[@class='rct-checkbox'])[7]";
    String CB_WorkSpaceAngularBox = "(//span[@class='rct-checkbox'])[8]";
    String CB_WorkSpaceVeuBox = "(//span[@class='rct-checkbox'])[9]";
    String CB_OfficeToggle = "(//button[@title='Toggle'])[5]";
    String CB_OfficeBox = "(//span[@class='rct-checkbox'])[5]";
    String CB_OfficePublicBox = "(//span[@class='rct-checkbox'])[6]";
    String CB_OfficePrivateBox = "(//span[@class='rct-checkbox'])[7]";
    String CB_OfficeClassifiedBox = "(//span[@class='rct-checkbox'])[8]";
    String CB_OfficeGeneralBox = "(//span[@class='rct-checkbox'])[9]";
    String CB_DownloadsToggle = "(//button[@title='Toggle'])[6]";
    String CB_DownloadsBox = "(//span[@class='rct-node-icon'])[10]";
    String CB_DownloadsWordBox = "(//span[@class='rct-checkbox'])[11]";
    String CB_DownloadsFileBox = "(//span[@class='rct-checkbox'])[12]";



}
