package factorymethod.factory;

import factorymethod.buttons.HtmlButton;
import factorymethod.buttons.Button;

public class HtmlButton extends Dialog{

    @override
    public Button createButton(){
        return new HtmlButton();
    }
}