package comportamiento.iterator;

public class Main {

    public static void main(String[] args) {

        ListaIterador<Persona> personas = new ListaIterador<>();

        personas.add(new Persona("Elvis", 35));
        personas.add(new Persona("Juan", 25));
        personas.add(new Persona("David", 20));
        personas.add(new Persona("Julio", 28));
        personas.add(new Persona("Jhonny", 36));

        while (personas.hasMore()){
            System.out.println(personas.next());
        }

        if (personas.hasMore()){
            System.out.println(personas.next());
        }else {
            System.out.println("No hay mas elementos");
        }

    }
}
