package waa.lab1.starbuck.data;

import java.util.List;

public interface DataFacade {

	public boolean checkLogin(String username, String password);

	public List<String> listOfCoffee(String roast);

}
