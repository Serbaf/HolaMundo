import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.fermax.spuche.java.pruebas.Greeter;

public class GreeterTest
{
	
	private Greeter greeter = new Greeter();

	@Test
	public void greeterSayHello()
	{
		assertThat(greeter.sayHello(), containsString("Hello"));
	}

}
