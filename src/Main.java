public class Main {
    public static void main(String[] args) {
        House house = new House();
        Build house2 = new House();
        house.aBuild("Gdansk", "J.Slowackiego", 12, "Na krzyzowej 3" , "41-231");
        house.countPrice(123d, 250.500);
        house.setColorHouse(Colors.BLACK);
        house.setBuilding_material(Building_Material.BLOCK);
        house.setResidents(4);
        house.plane(50d,30d, 15d);
        house.setWindows(6);
        house.media(false,true);
        System.out.println(house);
        house2.aBuild("Krakow" , "A. Mickiewicza" , 21 , "Odkrosowanej 2" , "12-123");
        house2.countPrice(232d, 450.500);
        house2.setColorHouse(Colors.YELLOW);
        house2.plane(100d, 75d, 45d);
        house2.setResidents(12);
        house2.setWindows(15);
        house2.media(true,false);
        /*house.setBuilding_material(Building_material.Wood) nie dziala dla interfejsu Build poniewaz do niego nie nalezy */
        System.out.println(house2);
    }
}