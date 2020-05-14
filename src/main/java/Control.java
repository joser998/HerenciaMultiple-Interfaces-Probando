public class Control {
    public static void main(String[] args) {
    
    /* Mandamos a llamar mediante el main a los metodos de la clase ImplementandoInterfaces la cual se esta 
        encargando de el desarrollo de las interfaces...
        */
        
    /* Creamos un objeto de esta clase ImplementandoInterfaces y llamamos cada metodo de la clase misma */
        System.out.println("Llamamos Clase ImplementandoInterfaces");
        ImplementandoInterfaces implementacion = new ImplementandoInterfaces();
        implementacion.Saludar();
        implementacion.MostrarNombre();
        implementacion.MostrarEdad();
    }
}
