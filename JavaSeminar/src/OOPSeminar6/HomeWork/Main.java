package OOPSeminar6.HomeWork;

import OOPSeminar6.HomeWork.Persisters.Persister;
import OOPSeminar6.HomeWork.Persisters.PersisterBD;
import OOPSeminar6.HomeWork.Persisters.PersisterJSON;
import OOPSeminar6.HomeWork.Persisters.PersisterTXT;
import OOPSeminar6.HomeWork.ReportView.ReportViewConsole;
import OOPSeminar6.HomeWork.ReportView.ReportViewable;
import OOPSeminar6.HomeWork.ReportView.WindowsFormatView;

public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		ReportViewable view = new ReportViewConsole(user);
//		ReportViewable view = new WindowsFormatView(user);
		Persister saveUser = new PersisterTXT(user);
//		Persister saveUser = new PersisterJSON(user);
//		Persister saveUser = new PersisterBD(user);

	}
}