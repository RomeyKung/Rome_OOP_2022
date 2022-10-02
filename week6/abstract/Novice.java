public class Novice extends Player{
    public Novice(){
        setHP(10.0);
        setMP(10.0);
        setATK(5.0);
    }
    public void addEquipment(Item i){
        i.use(this);
    }
    public void attack(Player p){
        p.attacked(this.getATK());
    }
    public void attacked(double n){
        this.setHP(-n);
    }
}
