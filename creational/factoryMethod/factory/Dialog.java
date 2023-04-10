package factorymethod.factory;

import factorymethod.buttons.Button;

public abstract class Dialog{
    
    public void renderWindow(){
          // ... other code ...
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}