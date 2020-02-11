public class Adapter implements  NewLocation {

    final OldLocation oldLocation;

    public Adapter(OldLocation oldLocation){
        this.oldLocation = oldLocation;

        setBuilding(oldLocation.getBuilding());
        setFloor(oldLocation.getFloor());
        setDesk(oldLocation.getDesk());

    }
    private  String building;
    private int floor;
   private  int desk;
    @Override
    public String getBuilding() {
        return this.building;
    }

    @Override
    public void setBuilding(String building) {

        this.building = building;
    }

    @Override
    public int getFloor() {
        return this.floor;
    }

    @Override
    public void setFloor(int floor) {

        this.floor = floor;
    }

    @Override
    public int getDesk() {
        return this.desk;
    }

    @Override
    public void setDesk(int desk) {

        this.desk = desk;
    }
}
