//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Automoviles bmw = new Automoviles(); //instanciar y Automoviles() esto es el constructor
        bmw.setMarca("BMW");  // set asigna
        bmw.setModelo("1350W");
        bmw.setColor("Negro");
        bmw.setCilindraje(3.2);

        System.out.println("bmw = " + bmw.getMarca());
        System.out.println("bmw.verDetalle" + bmw.verDetalle());
        System.out.println("bmw.acelerar() = " + bmw.acelerar());
        System.out.println("bmw.frenar() = " + bmw.frenar(80));
        System.out.println("bmw.capacidadTanque(cap 48, pconsumo 0.7f) = " + bmw.capacidadTanque(48, 0.7f)); // 0.7f cuando es nativo el java no sabe identificar y toca avisarle q tipo es
        System.out.println("bmw.capacidadTanque(48, 70) = " + bmw.capacidadTanque(48, 7f));

        Celulares celu = new Celulares();
        celu.setMarca("Nokia");
        celu.setModelo("51F5");
        celu.setColor("Rojo");
        celu.setAlmacenamiento(512);

        System.out.println("celu.getMarca() = " + celu.getMarca());
        System.out.println("celu = " + celu.getModelo());
        System.out.println("celu = " + celu.getColor());
        System.out.println("celu.getAlmacenamiento() = " + celu.getAlmacenamiento());
        System.out.println("celu = " + celu.verDetalle());


    }

}