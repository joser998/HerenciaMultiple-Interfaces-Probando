public class ImplementandoInterfaces implements Plantilla, Plantilla_Nombre, Plantilla_Edad{
/* Esta es una clase normal en la que Implementamos las Interfaces Plantilla, Plantilla_Nombre, etc.
    Todas las constantes declaradas en cada una de las Interfaces son heredadas aqui en esta clase por que las
        esta implementando 'implements' asi como sus metodos abstractos de cada una de las interfaces se desarrollan
        aqui, todas sus constantes y metodos viven en esta clase.
    */
    
/* Es necesario contar con una Clase con el metodo Main para poder llamar o controlar esta clase y esta a su vez 
        desarrolla todo lo creado en las interfaces...    */
        
    @Override
    public void Saludar() {
        System.out.println(saludar);
    }

    @Override
    public void MostrarNombre() {
        System.out.println(nombre);
    }
    
    @Override
    public void MostrarEdad(){
        System.out.println(edad);
    }
}