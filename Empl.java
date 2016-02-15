package e_and_b;

public class Empl {

    private String name;
    private String additionalBosses;
    private Empl boss;

/////////////////////////////////////////////////////////////////////////////////

    public Empl(String name, Empl boss) {
        this.name = name;
        this.boss = boss;
    }

    public Empl(String name, Empl boss, String additionalBosses) {
        this.name = name;
        this.boss = boss;
        this.additionalBosses = additionalBosses;
    }

    public Empl() {}

    public Empl(String name) {
        this.name = name;
    }
/////////////////////////////////////////////////////////////////////////////////



    public String getName() {
        return name;
    }

    public Empl getBoss() {
        return boss;
    }

    public String getAdditionalBosses() {
        return additionalBosses;
    }

/////////////////////////////////////////////////////////////////////////////////


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empl)) return false;

        Empl empl = (Empl) o;

        if (getName() != null ? !getName().equals(empl.getName()) : empl.getName() != null) return false;
        if (getAdditionalBosses() != null ? !getAdditionalBosses().equals(empl.getAdditionalBosses()) : empl.getAdditionalBosses() != null)
            return false;
        return getBoss() != null ? getBoss().equals(empl.getBoss()) : empl.getBoss() == null;

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getAdditionalBosses() != null ? getAdditionalBosses().hashCode() : 0);
        result = 31 * result + (getBoss() != null ? getBoss().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "NAME = " + name + '\n' +
                "ADDITIONAL_BOSSES = " + additionalBosses + '\n' +
                "BOSS = " + boss + '\n';
            }
}
