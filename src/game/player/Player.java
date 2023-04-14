package game.player;

public class Player {

    protected String name;
    protected int coordinatey = 0;
    protected int coordinatex = 0;
    protected int vel = 1;

    public Player(String name, int coordinatey, int coordinatex, int vel) {
        this.name = name;
        this.coordinatey = coordinatey;
        this.coordinatex = coordinatex;
        this.vel = vel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoordinatey() {
        return coordinatey;
    }

    public void setCoordinatey(int coordinatey) {
        this.coordinatey = coordinatey;
    }

    public int getCoordinatex() {
        return coordinatex;
    }

    public void setCoordinatex(int coordinatex) {
        this.coordinatex = coordinatex;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

}
