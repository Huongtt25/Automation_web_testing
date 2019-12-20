package edumall.features.test;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;

import edumall.features.properties.Myproperties;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.util.EnvironmentVariables;

@RunWith(SerenityRunner.class)
public class Getproperties {
	
	
	private EnvironmentVariables enviroments;
	@Test
	public void get_properties() {
		String myproperites= enviroments.optionalProperty(Myproperties.Name).orElse("khong co gi");
		System.out.print(myproperites);
	}
}
