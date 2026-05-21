package starter.ui;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static Target OPTION_CATEGORY = Target.the("Option category").locatedBy("//a[@id='itemc' and contains(.,'{0}')]");
    public static Target CONTAINER_CATEGORY = Target.the("Contariner category").locatedBy("//div[@class='list-group']");
    public static Target OPTION_PRODUCT = Target.the("Option product").locatedBy("//a[@class='hrefch' and text()='{0}']");
    public static Target OPTION_CART = Target.the("Option cart").locatedBy("//a[@id='cartur']");
    public static Target OPTION_HOME = Target.the("Option home").locatedBy("//a[contains(@class,'nav-link') and contains(., 'Home')]");
}
