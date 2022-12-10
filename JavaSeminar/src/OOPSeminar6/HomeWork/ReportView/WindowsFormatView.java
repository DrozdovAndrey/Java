package OOPSeminar6.HomeWork.ReportView;

import OOPSeminar6.HomeWork.User;

public class WindowsFormatView implements ReportViewable{
    private User user;

    public WindowsFormatView(User user) {
        this.user = user;
        report();
    }
    @Override
    public void report() {
        System.out.println("Report for user for Windows: " + user.getName());
    }
}
