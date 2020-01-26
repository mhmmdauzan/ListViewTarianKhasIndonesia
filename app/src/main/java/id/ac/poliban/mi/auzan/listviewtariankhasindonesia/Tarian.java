package id.ac.poliban.mi.auzan.listviewtariankhasindonesia;

public class Tarian {
    private String tari;
    private String tarianName;
    private String tarianDesc;

    public Tarian(String tari, String tarianName, String tarianDesc) {
        this.tari = tari;
        this.tarianName = tarianName;
        this.tarianDesc = tarianDesc;
    }

    public String getTari() {
        return tari;
    }

    public void setTari(String tari) {
        this.tari = tari;
    }

    public String getTarianName() {
        return tarianName;
    }

    public void setTarianName(String tarianName) {
        this.tarianName = tarianName;
    }

    public String getTarianDesc() {
        return tarianDesc;
    }

    public void setTarianDesc(String tarianDesc) {
        this.tarianDesc = tarianDesc;
    }

    @Override
    public String toString() {
        return String.format("%30s\n\n%s", getTarianName(), getTarianDesc());
    }
}
