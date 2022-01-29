public interface Build {

    double plane(double pl_Build, double pl_Outside, double pl_Parking);

    String aBuild(String town, String street, int nr_House, String nrLocal, String postCode);

    void setWindows(int value);

    void setResidents(int value);

    void setColorHouse(Colors color);

    double countPrice(double plane, double price);

    void media(boolean internet, boolean gas);
}