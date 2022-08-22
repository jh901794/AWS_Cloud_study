package Before.j20220805.with;

public abstract class MegaZone_Cloud_Factory implements MegaZone_Cloud{
    @Override
    public void Room(String roomtype, int roomnum) {
        System.out.println("���� ���� "+ roomnum + "���� ���� Ÿ���� " + roomtype);

    }
}
