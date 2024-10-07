public class Automoviles {
    private String  marca = "Mercedes Benz"; //todo esto es el molde
    private String modelo; // estos datos solo sirve para la clase
    private String color = "Verde";
    private double cilindraje;
    private float consumo=40;

    // Constructores

    // Getter y los Setter gett leer y sett asignar

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

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public float getConsumo() {
        return consumo;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    /*public void leerMarca(String marca){ el leer no necesita parametros
        this.marca = marca;  // a la propiedad marca asigna la variable marca
    }

    public void escribirMarca(String marca){ el escribir si necesita parametros
        this.marca = marca;

    }*/


    public String verDetalle(){
        String mark = "BMW";

        String dv = "La marca es "+ this.marca + "\n"+
        "El modelo es " + this.modelo + "\n"+
        "El color es " + this.color + "\n" +
         "El cilindraje es " + this.cilindraje;
        return  dv;
    }
    public String acelerar(){
        return "El auto marca " + this.marca + "\tEsta acelerando"; // retorna
    }

    public String frenar(int kmph){
        return "El auto modelo " + this.modelo + "\tEsta frenando a " + kmph; // resirve y retorna
    }

    public  float capacidadTanque(int cap, float pconsumo){ // resirve

        float cm = consumo/ (cap*pconsumo);
        return cm;
    }

    public float capacidadTanque(int cap, int pconsumo ){

        float cm = consumo / (cap*(pconsumo/100));
        return cm;
    }
}


//  en los metodos cuando en la segunda palabra se escribe la primera letra con mayuscula
// tecnica camelcase
// cuando tengo 2 metodos con el mismo nombre se llama sobrecarga de metodos
// se aplica concepto de poliformisfo mismo metodo con muchas formas
// encapsulamiento no sabe lo que pasa solo procesa y devuelve
// principio de ocultamiento siempre se accese a lo atributos por medios de los metodos
// todos lo atributos tiene que ser privados
// atributo o estado en una clase y a los metodos o comportamientos de ese estado
// para acceder a atributos privados el metodo tiene que ser publico
// this sirve para llamar al atributo de la clase
// cuando trabajo en la clase no es necesario utilizar el gett o sett
// puedes asignar medio de variables