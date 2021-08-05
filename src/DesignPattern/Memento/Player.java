package DesignPattern.Memento;

public class Player {
    private int life = 100;
    private int magic = 100;

    public void fightBoss() {
        life -= 100;
        magic -= 100;
        if (life <= 0){
            System.out.println("壮烈牺牲");
        }
    }

    public Memento saveState(){
        return new Memento(life, magic);
    }

    public void restoreState(Memento memento){
        this.life = memento.life;
        this.magic = memento.magic;
        System.out.println("读档成功");
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
