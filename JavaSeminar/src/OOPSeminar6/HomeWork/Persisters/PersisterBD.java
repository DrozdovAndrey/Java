package OOPSeminar6.HomeWork.Persisters;

import OOPSeminar6.HomeWork.User;

public class PersisterBD implements Persister {
	private User user;

	public PersisterBD(User user) {
		this.user = user;
		save();
	}

	public void save(){
		System.out.println("Save user to database: " + user.getName());
	}
}