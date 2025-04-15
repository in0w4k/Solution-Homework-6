package Chain_of_Responsibility;

public class Main {
    public static void main(String[] args) {
        SupportHandler faq = new FAQBotHandler();
        SupportHandler jun = new JuniorSupportHandler();
        SupportHandler sen = new SeniorSupportHandler();

        faq.set_next(jun);
        jun.set_next(sen);

        String[] issues = {"password_reset", "refund_request", "account_ban", "unknown_bug"};

        for (String issue : issues) {
            faq.handle(issue);
        }
    }
}
