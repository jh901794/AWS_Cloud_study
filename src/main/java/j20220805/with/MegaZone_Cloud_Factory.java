package j20220805.with;

public abstract class MegaZone_Cloud_Factory implements MegaZone_Cloud{
    @Override
    public void Room(String roomtype, int roomnum) {
        System.out.println("현재 반은 "+ roomnum + "현재 방의 타입은 " + roomtype);

    }
}
