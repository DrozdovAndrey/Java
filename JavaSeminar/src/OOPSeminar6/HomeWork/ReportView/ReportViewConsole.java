package OOPSeminar6.HomeWork.ReportView;

import OOPSeminar6.HomeWork.User;

public class ReportViewConsole implements ReportViewable{
    private User user;

    public ReportViewConsole(User user) {
        this.user = user;
        report();
    }
    @Override
    public void report() {
        System.out.println("Report for user in console: " + user.getName());
    }
}
