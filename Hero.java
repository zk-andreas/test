public class Hero {
    //Champion;BE;RP;HP;HP+;HP5;HP5+;Resource;MP;MP+;MP5;MP5+;MS;AD;AD+;AS;AS+;Range;Armor;Armor+;MR;MR+;Release date;Attributes
    long ReleaseDate;
    String Champion, Resource, Atrributes, Range;
    int BE, RP, HPplus, MS;
    double HP, HP5, HP5plus, MP, MPplus, MP5, MP5plus, AD, ADplus, AS, ASplus, Armor, ArmorPlus, MR, MRplus;

    public Hero(String champion, int BE, int RP, double HP, int HPplus, int HP5, double HP5plus , String resource, double MP, double MPplus, double MP5, double
                MP5plus, int MS, double AD, double ADplus, double AS, double ASplus, String range, double armor, double armorPlus, double MR,
                double MRplus, long releaseDate, String atrributes) {
        Champion = champion;
        Resource = resource;
        ReleaseDate = releaseDate;
        Atrributes = atrributes;
        Range = range;
        this.BE = BE;
        this.RP = RP;
        this.HPplus = HPplus;
        this.MS = MS;
        this.HP = HP;
        this.HP5 = HP5;
        this.HP5plus = HP5plus;
        this.MP = MP;
        this.MPplus = MPplus;
        this.MP5 = MP5;
        this.MP5plus = MP5plus;
        this.AD = AD;
        this.ADplus = ADplus;
        this.AS = AS;
        this.ASplus = ASplus;
        Armor = armor;
        ArmorPlus = armorPlus;
        this.MR = MR;
        this.MRplus = MRplus;
    }

    public String getChampion() {
        return Champion;
    }

    public String getResource() {
        return Resource;
    }

    public Long getReleaseDate() {
        return ReleaseDate;
    }

    public String getAtrributes() {
        return Atrributes;
    }

    public int getBE() {
        return BE;
    }

    public int getRP() {
        return RP;
    }

    public int getHPplus() {
        return HPplus;
    }

    public int getMS() {
        return MS;
    }

    public String getRange() {
        return Range;
    }

    public double getHP() {
        return HP;
    }

    public double getHP5() {
        return HP5;
    }

    public double getHP5plus() {
        return HP5plus;
    }

    public double getMP() {
        return MP;
    }

    public double getMPplus() {
        return MPplus;
    }

    public double getMP5() {
        return MP5;
    }

    public double getMP5plus() {
        return MP5plus;
    }

    public double getAD() {
        return AD;
    }

    public double getADplus() {
        return ADplus;
    }

    public double getAS() {
        return AS;
    }

    public double getASplus() {
        return ASplus;
    }

    public double getArmor() {
        return Armor;
    }

    public double getArmorPlus() {
        return ArmorPlus;
    }

    public double getMR() {
        return MR;
    }

    public double getMRplus() {
        return MRplus;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "Champion='" + Champion + '\'' +
                ", Resource='" + Resource + '\'' +
                ", ReleaseDate='" + ReleaseDate + '\'' +
                ", Atrributes='" + Atrributes + '\'' +
                ", BE=" + BE +
                ", RP=" + RP +
                ", HPplus=" + HPplus +
                ", MS=" + MS +
                ", Range=" + Range +
                ", HP=" + HP +
                ", HP5=" + HP5 +
                ", HP5plus=" + HP5plus +
                ", MP=" + MP +
                ", MPplus=" + MPplus +
                ", MP5=" + MP5 +
                ", MP5plus=" + MP5plus +
                ", AD=" + AD +
                ", ADplus=" + ADplus +
                ", AS=" + AS +
                ", ASplus=" + ASplus +
                ", Armor=" + Armor +
                ", ArmorPlus=" + ArmorPlus +
                ", MR=" + MR +
                ", MRplus=" + MRplus +
                '}';
    }
}
