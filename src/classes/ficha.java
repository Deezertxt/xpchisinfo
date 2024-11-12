package classes;

public class ficha {
    private String posX;
    private String posY;
    private String color;
    private boolean turno;
    
    public ficha(String posX, String posY, String color, boolean turno) {
        this.posX = posX;
        this.posY = posY;
        this.color = color;
        this.turno = turno;
    }
    public String getPosX() {
        return posX;
    }
    public void setPosX(String posX) {
        this.posX = posX;
    }
    public String getPosY() {
        return posY;
    }
    public void setPosY(String posY) {
        this.posY = posY;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isTurno() {
        return turno;
    }
    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    
}
