package Model;

import java.util.Date;

public class DrHouse {
    private int id;
    private String patient;
    private String sympton;
    private String diagnose;
    private Date date;
    private String krankenhaus;

    public DrHouse(int id, String patient, String sympton, String diagnose, Date date, String krankenhaus) {
        this.id = id;
        this.patient = patient;
        this.sympton = sympton;
        this.diagnose = diagnose;
        this.date = date;
        this.krankenhaus = krankenhaus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getSympton() {
        return sympton;
    }

    public void setSympton(String sympton) {
        this.sympton = sympton;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getKrankenhaus() {
        return krankenhaus;
    }

    public void setKrankenhaus(String krankenhaus) {
        this.krankenhaus = krankenhaus;
    }

    @Override
    public String toString() {
        return "DrHouse{" +
                "id=" + id +
                ", patient='" + patient + '\'' +
                ", sympton='" + sympton + '\'' +
                ", diagnose='" + diagnose + '\'' +
                ", date=" + date +
                ", krankenhaus='" + krankenhaus + '\'' +
                '}';
    }
}
