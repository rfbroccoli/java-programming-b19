class Main {
    // output နဲ့ function
    static String getResponseFromMailServer(String mailSubject) {
        // String mailBody = "Body";
        // String mailSubject = "Subject";

        String response = "Email with subject '" + mailSubject + "' is successfully sent";
        // System.out.println(response);
        return response;
    }

    // input နဲ့ function
    static void sendCustomizedMail(String mailSubject, String mailBody) {
        // String mailBody = "Body";
        // String mailSubject = "Subject";

        System.out.println("Connect to mail server");
        System.out.println("Send mail data");
        System.out.println("Mail Subject : " + mailSubject);
        System.out.println("Mail Body : " + mailBody);
        System.out.println("Receive response from mail server");
    }

    // ရိုးရိုး function
    static void sendMail() {
        sendCustomizedMail("Hello World", "Hello Body");
        // System.out.println("Connect to mail server");
        // System.out.println("Send mail data");
        // System.out.println("Mail Subject : Hello World");
        // System.out.println("Mail Body : Body");
        // System.out.println("Receive response from mail server");
    }

    public static void main(String[] args) {
        String something = getResponseFromMailServer("Meeting Invitation");
        sendMail();
        System.out.println(something);
        sendCustomizedMail("Meeting Invitation", "Meeting Info");
        // System.out.println("--- something else ---");
        // sendMail();
    }
}