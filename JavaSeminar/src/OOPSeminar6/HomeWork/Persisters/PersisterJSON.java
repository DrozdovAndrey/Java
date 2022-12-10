package OOPSeminar6.HomeWork.Persisters;

import OOPSeminar6.HomeWork.User;

public class PersisterJSON implements Persister {
	private User user;

	public PersisterJSON(User user) {
		this.user = user;
		save();
	}
	@Override
	public void save() {
		System.out.println("Save user to JSON: " + user.getName());
	}
}