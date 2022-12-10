package OOPSeminar6.HomeWork.Persisters;

import OOPSeminar6.HomeWork.User;

public class PersisterTXT implements Persister {
	private User user;

	public PersisterTXT(User user) {
		this.user = user;
	}
	@Override
	public void save() {
		System.out.println("Save user to TXT: " + user.getName());
	}
}