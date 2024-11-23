package inheritanceexcercise;

public class Consultant extends Person {
    
    String company;
    int consultantId;

    public Consultant() {
    }

    public Consultant(String company, int consultantId, int id, String firsName, String lastName, String address, String phoneNumber) {
        super(id, firsName, lastName, address, phoneNumber);
        this.company = company;
        this.consultantId = consultantId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getConsultantId() {
        return consultantId;
    }

    public void setConsultantId(int consultantId) {
        this.consultantId = consultantId;
    }
    
    
}

    