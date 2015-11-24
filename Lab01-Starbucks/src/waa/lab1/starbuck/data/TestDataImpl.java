package waa.lab1.starbuck.data;

import java.util.List;

public class TestDataImpl implements DataFacade {

	private Database database;

	public TestDataImpl() {
		database = new Database();
	}

	@Override
	public boolean checkLogin(String username, String password) {
		if (password.equals(database.getPassword(username))) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public List<String> listOfCoffee(String roast) {
		return database.getAdvice(roast);
	}

}
