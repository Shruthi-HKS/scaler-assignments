package abstractfactory.test;

import abstractfactory.interfaces.DarkFormFactory;
import abstractfactory.interfaces.FormFactory;
import abstractfactory.models.Button;
import abstractfactory.models.CheckBox;

public class AbstractFactoryTest {

	private FormFactory formFactory;
	
	public static void main(String[] args) {
		AbstractFactoryTest test = new AbstractFactoryTest();
		test.formFactory = new DarkFormFactory();
		
		Button button = test.formFactory.createButton();
		CheckBox checkBox = test.formFactory.createCheckBox();
		button.onClick();
		button.render();
		checkBox.select();
		checkBox.render();
	}
}
