package abstractfactory.interfaces;

import abstractfactory.models.Button;
import abstractfactory.models.CheckBox;
import abstractfactory.models.DarkButton;
import abstractfactory.models.DarkCheckBox;

public class DarkFormFactory implements FormFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new DarkButton();
	}

	@Override
	public CheckBox createCheckBox() {
		// TODO Auto-generated method stub
		return new DarkCheckBox();
	}

}
