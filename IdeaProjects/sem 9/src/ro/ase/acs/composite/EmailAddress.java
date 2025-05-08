package ro.ase.acs.composite;

import java.util.List;

public class EmailAddress implements EmailReceiver {
    private String adress;

    public EmailAddress(String adress) {
        this.adress = adress;
    }

    @Override
    public void receive(String message) {
        System.out.println(adress + ": " + message);
    }

    @Override
    public void addReceiver(EmailReceiver receiver) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteReceiver(EmailReceiver receiver) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<EmailReceiver> getReceiver() {
        throw new UnsupportedOperationException();
    }
}
