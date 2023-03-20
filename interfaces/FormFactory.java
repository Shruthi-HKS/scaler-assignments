package abstractfactory.interfaces;

import abstractfactory.models.Button;
import abstractfactory.models.CheckBox;

public interface FormFactory {
	
	Button createButton();
	CheckBox createCheckBox();

}
