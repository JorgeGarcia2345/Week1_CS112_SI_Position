import java.util.Random;

public class GameCharacter {

    private String mName;
    private int mLevel;
    private int mHealthPoints;
    private int mGold;
    private int mMagic;

    public GameCharacter(String name, int level, int healthPoints, int gold, int magic) {
        mName = name;
        mLevel = level;
        mHealthPoints = healthPoints;
        mGold = gold;
        mMagic = magic;
    }

    public String getName() {
        return mName;
    }
    public int getLevel() {
        return mLevel;
    }
    public int getHealthPoints() {
        return mHealthPoints;
    }
    public int getGold() {
        return mGold;
    }
    public int getMagic() {
        return mMagic;
    }

    public void setName(String name) {
        mName = name;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "Name='" + mName + '\'' +
                ", Level=" + mLevel +
                ", HealthPoints=" + mHealthPoints +
                ", Gold=" + mGold +
                ", Magic=" + mMagic +
                '}';
    }

    Random rng = new Random();
    public void assist(GameCharacter other){
        int rand = rng.nextInt(5);
        switch (rand){
            case 0:
                other.mHealthPoints += this.mLevel * 5;
                this.mHealthPoints -= this.mLevel *5;
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }





}
