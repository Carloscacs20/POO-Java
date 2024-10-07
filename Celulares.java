public class Celulares {
    private String marca;
    private String modelo;
    private String color;
    private int almacenamiento;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String verDetalle(){


        String dv = "La marca es "+ this.marca + "\n"+
                "El modelo es " + this.modelo + "\n"+
                "El color es " + this.color + "\n" +
                "El almacenamineto "+ this.almacenamiento + "Gb";
        return  dv;
    }
}