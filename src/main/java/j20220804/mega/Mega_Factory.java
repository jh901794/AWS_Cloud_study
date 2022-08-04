package j20220804.mega;

public abstract class Mega_Factory implements BaseMega {
    @Override
    public void Room() {
        System.out.println(getChoiceRoom());
    }

    public String choiceRoom;

    public Mega_Factory() {
    }

    public Mega_Factory(String choiceRoom) {
        this.choiceRoom = choiceRoom;
    }

    public String getChoiceRoom() {
        return choiceRoom;
    }

    public void setChoiceRoom(String choiceRoom) {
        this.choiceRoom = choiceRoom;
    }
}
