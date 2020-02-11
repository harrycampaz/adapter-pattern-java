public class Main {

    public static void main(String[] args) {

        OldLocation oldLocation = new CustomerLocation();

        oldLocation.setBuilding("Pymes Software");
        oldLocation.setFloor(4);
        oldLocation.setFloor(21);


        NewLocation newLocation = new Adapter(oldLocation);


        System.out.println(new StringBuilder()
                .append(newLocation.getBuilding()).append(" Piso: ").append(newLocation.getFloor()).append(" Desk: ").append(oldLocation.getDesk()));

    }
}
