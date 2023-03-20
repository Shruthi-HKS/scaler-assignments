package abstractfactory.interfaces;

import abstractfactory.models.Button;
import abstractfactory.models.CheckBox;
import abstractfactory.models.LightButton;
import abstractfactory.models.LightCheckBox;

public class LightFormFactory implements FormFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new LightButton();
	}

	@Override
	public CheckBox createCheckBox() {
		// TODO Auto-generated method stub
		return new LightCheckBox();
	}

}
