package factorymethod.factory;

import factorymethod.buttons.Button;
import factorymethod.buttons.WindowsButton;

public class WindowDialog extends Dialog{
    @override
    public Button createButton(){
        return new WindowsButton();
    }
}