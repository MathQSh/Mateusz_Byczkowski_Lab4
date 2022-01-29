public class House implements Build {

    private int lpWindows;
    private int lpResidents;
    private Colors colorHouse;
    private double plane;
    private double price;
    private boolean internet;
    private boolean gas;
    private double pl_Build;
    private double pl_Outside;
    private double pl_Parking;
    private String town;
    private String street;
    private Integer nr_House;
    private String nrLocal;
    private String postCode;
    private Building_Material building_material;


    public void setBuilding_material(Building_Material building_material) {
        this.building_material = building_material;
    }

    public Building_Material getBuilding_material() {
        return building_material;
    }


    @Override
    public String toString() {
        return "House " +
                "Liczba Okien=" + lpWindows +
                ", Liczba mieszkancow= " + lpResidents +
                ", Kolor Domu= " + colorHouse +
                ", powierzchnia= " + plane +
                ", cena= " + price +
                ", internet= " + internet +
                ", gas= " + gas +
                ", Budynek = " + pl_Build +
                ", Podrowko = " + pl_Outside +
                ", Parking= " + pl_Parking +
                ", miasto = " + town + '\'' +
                ", ulica = " + street + '\'' +
                ", nr Domu = " + nr_House +
                ", nr Lokalu = " + nrLocal + '\'' +
                ", Kod pocztowy = " + postCode + '\'' +
                ", Budulec = " + building_material
                ;
    }

    @Override
    public double plane(double pl_Build, double pl_Outside, double pl_Parking) {
        this.pl_Build = pl_Build;
        this.pl_Outside = pl_Outside;
        this.pl_Parking = pl_Parking;
        return 0d;
    }
    public double getPl_Build() {
        return pl_Build;
    }

    public double getPl_Outside() {
        return pl_Outside;
    }

    public double getPl_Parking() {
        return pl_Parking;
    }

    @Override
    public String aBuild(String town, String street, int nr_House, String nrLocal, String postCode) {
        this.town = town;
        this.street = street;
        this.nr_House = nr_House;
        this.nrLocal = nrLocal;
        this.postCode = postCode;
        return "aBuild";
    }

    public String getTown() {
        return town;
    }

    public String getStreet() {
        return street;
    }

    public Integer getNr_House() {
        return nr_House;
    }

    public String getNrLocal() {
        return nrLocal;
    }

    public String getPostCode() {
        return postCode;
    }

    @Override
    public void setWindows(int value) {
        this.lpWindows = value;
    }
    public int getLpWindows() {
        return lpWindows;
    }

    @Override
    public void setResidents(int value) {
        this.lpResidents = value;
    }
    public int getLpResidents() {
        return lpResidents;
    }

    @Override
    public void setColorHouse(Colors color) {
        this.colorHouse = color;
    }
    public Colors getColorHouse(){
        return colorHouse;
    }

    @Override
    public double countPrice(double plane, double price) {
        this.plane = plane;
        this.price = price;
        return 0d;
    }

    public double getPlane() {
        return plane;
    }

    public double getPrice() {
        return price;
    }
    @Override
    public void media(boolean internet, boolean gas) {
        this.internet = internet;
        this.gas = gas;
    }

    public boolean isInternet() {
        return internet;
    }

    public boolean isGas() {
        return gas;
    }

}