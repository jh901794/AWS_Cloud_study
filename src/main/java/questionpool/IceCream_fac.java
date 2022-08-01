package questionpool;

public abstract class IceCream_fac implements IceCream{
    @Override
    public void gugucon() {
        System.out.println("구구콘맛입니다.");
    }

    @Override
    public void worldcon() {
        System.out.println("월드콘맛입니다.");
    }

    @Override
    public void bibibig() {
        System.out.println("비비빅맛입니다.");
    }
}
