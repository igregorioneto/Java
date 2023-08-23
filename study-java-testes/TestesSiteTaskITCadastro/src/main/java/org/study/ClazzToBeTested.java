package org.study;

public class ClazzToBeTested {

    public String sendGcdByMail(String destinatary) {
        Mailer mailer =  new Mailer();
        String message = new String();
        message += "To: eu@teste.com";
        message += getGcd(20, 10);
        message += "um monte de coisa";
        return mailer.sendMail(destinatary, message);
    }

    public void sendGcdByMail() {
        throw new IllegalArgumentException("Missing parameter");
    }

    public static void main(String[] args) {
        ClazzToBeTested tested = new ClazzToBeTested();
        tested.sendGcdByMail("Teste");
    }


    private static int getGcd(int firstNumber, int secondNumber) {
        int result = 0;
        while (secondNumber != 0) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }
        return firstNumber;
    }
}

class Mailer {
    public String sendMail(String destinatary, String content) {
        return "From: " + destinatary + " Content: " + content;
    }
}
