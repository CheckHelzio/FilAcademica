package ccv.checkhelzio.filacademica;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by FICG on 19/10/2016.
 */

public class Ponentes {
    private int id_ponente;
    private String nombre;
    private String apellidos;
    private String universidad;
    private String profesion;
    private String descripcion;
    private ArrayList<String> eventos;
    private ArrayList<Integer> eventos_organizador;


    public Ponentes(int id_ponente) {
        this.id_ponente = id_ponente;
        setDatos(id_ponente);
    }

    public int getId_ponente() {
        return id_ponente;
    }

    public void setId_ponente(int id_ponente) {
        this.id_ponente = id_ponente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<String> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<String> eventos) {
        this.eventos = eventos;
    }

    public ArrayList<Integer> getEventos_organizador() {
        return eventos_organizador;
    }

    public void setEventos_organizador(ArrayList<Integer> eventos_organizador) {
        this.eventos_organizador = eventos_organizador;
    }

    public void setDatos(int id) {
        switch (id) {
            case 1:
                this.nombre = "Mara";
                this.apellidos = "Robles";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "Embajadora de México en Brasil";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(1, 4, 34, 31));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 2:
                this.nombre = "Beatriz";
                this.apellidos = "Paredes";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("1A", "1B"));
                break;
            case 3:
                this.nombre = "Luis";
                this.apellidos = "Maira";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("1A"));
                break;
            case 4:
                this.nombre = "Juan Luis";
                this.apellidos = "Cebrián";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("1A"));
                break;
            case 5:
                this.nombre = "Arturo";
                this.apellidos = "Valenzuela";
                this.universidad = "";
                this.profesion = "Ex Subsecretario de Asuntos Hemisféricos de Estados Unidos";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("1B"));
                break;
            case 6:
                this.nombre = "Francisco";
                this.apellidos = "Valdés";
                this.universidad = "";
                this.profesion = "Presidente FLACSO México";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("1B"));
                break;
            case 7:
                this.nombre = "José Miguel";
                this.apellidos = "Insulza";
                this.universidad = "";
                this.profesion = "Representante de Chile en la Haya";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("1C", "16A"));
                break;
            case 8:
                this.nombre = "Roger";
                this.apellidos = "Bartra Muriá";
                this.universidad = "";
                this.profesion = "Investigador emérito UNAM";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("1C"));
                break;
            case 9:
                this.nombre = "Rafael";
                this.apellidos = "Rojas";
                this.universidad = "";
                this.profesion = "Historiador y ensayista cubano";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("1C"));
                break;
            case 10:
                this.nombre = "Tabaré Ramón";
                this.apellidos = "Vázquez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("1C"));
                break;
            case 11:
                this.nombre = "Catalina";
                this.apellidos = "Botero";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("1D"));
                break;
            case 12:
                this.nombre = "Gerardo";
                this.apellidos = "Caetano";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("1D"));
                break;
            case 13:
                this.nombre = "Iván";
                this.apellidos = "Cepeda Castro";
                this.universidad = "";
                this.profesion = "Senador colombiano " +
                        "facilitador del proceso de paz en Colombia";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("1E"));
                break;
            case 14:
                this.nombre = "David";
                this.apellidos = "García Rodríguez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("1E"));
                break;
            case 15:
                this.nombre = "Larisa";
                this.apellidos = "Pizano";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("1E"));
                break;
            case 16:
                this.nombre = "Liliana";
                this.apellidos = "Tabakova";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("1E"));
                break;
            case 17:
                this.nombre = "Marisol";
                this.apellidos = "Schulz";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(2));
                this.eventos = new ArrayList<String>(Arrays.asList("10A"));
                break;
            case 18:
                this.nombre = "Rebeca";
                this.apellidos = "Grynspan";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(2));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 19:
                this.nombre = "Enrique";
                this.apellidos = "Vargas";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(2));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 20:
                this.nombre = "Sylvie";
                this.apellidos = "Durán";
                this.universidad = "";
                this.profesion = "Ministro de Cultura y Juventud de Costa Roca";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("2A"));
                break;
            case 21:
                this.nombre = "Enrique";
                this.apellidos = "Alfaro Ramírez";
                this.universidad = "";
                this.profesion = "Presidente Municipal de Guadalajara";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("2A"));
                break;
            case 22:
                this.nombre = "Antonio";
                this.apellidos = "Villarraigosa";
                this.universidad = "";
                this.profesion = "Ex Alcalde de Los Ángeles, California.";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("2A", "7A"));
                break;
            case 23:
                this.nombre = "Arnoldo";
                this.apellidos = "Barahona";
                this.universidad = "";
                this.profesion = "Alcalde de Escazú";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("2A"));
                break;
            case 24:
                this.nombre = "Alexandra";
                this.apellidos = "Schjeldrup";
                this.universidad = "";
                this.profesion = "Titular de Cultura de la Alcaldía de Panamá";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("2A"));
                break;
            case 25:
                this.nombre = "Luis Miguel";
                this.apellidos = "Usuga";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("2A"));
                break;
            case 26:
                this.nombre = "Miguel Ángel";
                this.apellidos = "Mancera";
                this.universidad = "";
                this.profesion = "Jefe de gobierno de CDMX";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("2A"));
                break;
            case 27:
                this.nombre = "Jorge";
                this.apellidos = "Castro Muñoz";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("2A"));
                break;
            case 28:
                this.nombre = "Luis Felipe";
                this.apellidos = "Castro Mendes";
                this.universidad = "";
                this.profesion = "Ministro de Cultura de Portugal";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("2A"));
                break;
            case 29:
                this.nombre = "Héctor Raúl";
                this.apellidos = "Solís Gadea";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(3, 6, 10, 17));
                this.eventos = new ArrayList<String>(Arrays.asList("17B", "25A"));
                break;
            case 30:
                this.nombre = "Karla Alejandrina";
                this.apellidos = "Planter Pérez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(3, 6, 10, 17));
                this.eventos = new ArrayList<String>(Arrays.asList("25E"));
                break;
            case 31:
                this.nombre = "Leticia";
                this.apellidos = "Leal Moya";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(3, 15));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 32:
                this.nombre = "Juan José";
                this.apellidos = "Bremer";
                this.universidad = "";
                this.profesion = "Diplomático y Especialista en Política " +
                        "Internacional ";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("3A"));
                break;
            case 33:
                this.nombre = "Herminio";
                this.apellidos = "Blanco";
                this.universidad = "";
                this.profesion = "Ex Secretario de Comercio y Fomento " +
                        "Industrial de México";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("3A"));
                break;
            case 34:
                this.nombre = "Arturo";
                this.apellidos = "Valenzuela Bowie";
                this.universidad = "";
                this.profesion = "Ex Subsecretario de Asuntos Hemisféricos de Estados Unidos";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("3A"));
                break;
            case 35:
                this.nombre = "Jeffrey";
                this.apellidos = "Davidow";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("3A","17F"));
                break;
            case 36:
                this.nombre = "Ana María";
                this.apellidos = "Salazar";
                this.universidad = "";
                this.profesion = "Especialista en Seguridad Nacional";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("3B"));
                break;
            case 37:
                this.nombre = "Gabriel Guerra";
                this.apellidos = "Castellanos";
                this.universidad = "";
                this.profesion = "Analista de política internacional";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("3B"));
                break;
            case 38:
                this.nombre = "Abraham";
                this.apellidos = "Lowenthal";
                this.universidad = "";
                this.profesion = "Académico de la Universidad del Sur de California, EUA";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("3B"));
                break;
            case 39:
                this.nombre = "Jorge";
                this.apellidos = "Chabat";
                this.universidad = "";
                this.profesion = "Investigador y especialista en política exterior de México " +
                        "Universidad de Guadalajara";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("3B"));
                break;

            case 40:
                this.nombre = "Arturo";
                this.apellidos = "Sarukhán";
                this.universidad = "";
                this.profesion = "Diplomático mexicano";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("3B"));
                break;

            case 41:
                this.nombre = "Rafael";
                this.apellidos = "Fernández de Castro";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("3B"));
                break;

            case 42:
                this.nombre = "Diego";
                this.apellidos = "Fernández de Cevallos";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("4A"));
                break;

            case 43:
                this.nombre = "José";
                this.apellidos = "Woldenberg";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("4A", "14A"));
                break;
            case 44:
                this.nombre = "Diego";
                this.apellidos = "Valadés";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("4A"));
                break;
            case 45:
                this.nombre = "Juan";
                this.apellidos = "Ramón de la Fuente";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("4A"));
                break;
            case 46:
                this.nombre = "Guillermo";
                this.apellidos = "Gómez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(34, 31));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 47:
                this.nombre = "Néstor";
                this.apellidos = "García Canclini";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("34A"));
                break;
            case 48:
                this.nombre = "Eduardo";
                this.apellidos = "Nivon";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("34A"));
                break;
            case 49:
                this.nombre = "Eduardo";
                this.apellidos = "Cruz Vázquez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("34A"));
                break;
            case 50:
                this.nombre = "Carlos";
                this.apellidos = "Lara";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("34A"));
                break;
            case 51:
                this.nombre = "Diego";
                this.apellidos = "Prieto";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("34A"));
                break;
            case 52:
                this.nombre = "Miriam";
                this.apellidos = "Vaches";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("34B"));
                break;
            case 53:
                this.nombre = "Eduardo";
                this.apellidos = "Vázquez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("34B"));
                break;
            case 54:
                this.nombre = "Enrique de la Madrid";
                this.apellidos = "";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("34B"));
                break;
            case 55:
                this.nombre = "Rafael";
                this.apellidos = "Moreno Valle";
                this.universidad = "";
                this.profesion = "Gobernador de Puebla";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("34C"));
                break;
            case 56:
                this.nombre = "Jorge Alberto";
                this.apellidos = "Lozoya";
                this.universidad = "";
                this.profesion = "Ex Embajador y Ex Secretario de Educación de Puebla";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("34C"));
                break;
            case 57:
                this.nombre = "Patricia";
                this.apellidos = "Vázquez del Mercado Herrera";
                this.universidad = "";
                this.profesion = "Secretaría de Educación de Puebla";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("34C"));
                break;
            case 58:
                this.nombre = "Ricardo";
                this.apellidos = "Villanueva";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(5));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 59:
                this.nombre = "Roberto";
                this.apellidos = "Gil Zuarth";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("5A"));
                break;
            case 60:
                this.nombre = "Manuel";
                this.apellidos = "Bartlett Díaz";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("5A"));
                break;
            case 61:
                this.nombre = "Jorge";
                this.apellidos = "Castañeda";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("5A"));
                break;

            case 62:
                this.nombre = "María Amparo";
                this.apellidos = "Cazar";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("5A"));
                break;
            case 63:
                this.nombre = "Federico";
                this.apellidos = "Reyes Heroles";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("5A"));
                break;
            case 64:
                this.nombre = "Marianne";
                this.apellidos = "Braig";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("6A"));
                break;
            case 65:
                this.nombre = "Jean";
                this.apellidos = "Rivelois";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("6A"));
                break;
            case 66:
                this.nombre = "Abril";
                this.apellidos = "Alcalá";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(7));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 67:
                this.nombre = "Gabriel";
                this.apellidos = "Torres";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(9));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 68:
                this.nombre = "Javier";
                this.apellidos = "Corral";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("9H"));
                break;
            case 69:
                this.nombre = "David";
                this.apellidos = "Carbajal";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(10, 25));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 70:
                this.nombre = "Enrique";
                this.apellidos = "Florescano";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("10E"));
                break;
            case 71:
                this.nombre = "Jean";
                this.apellidos = "Meyer";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("10B", "25D"));
                break;
            case 72:
                this.nombre = "Lorenzo";
                this.apellidos = "Meyer";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("10D", "14A"));
                break;
            case 73:
                this.nombre = "Héctor";
                this.apellidos = "Aguilar Camín";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("10C"));
                break;
            case 74:
                this.nombre = "Raúl";
                this.apellidos = "Padilla";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("10A", "18D"));
                break;
            case 75:
                this.nombre = "Romeo";
                this.apellidos = "Tello";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("10A"));
                break;
            case 76:
                this.nombre = "Laura";
                this.apellidos = "Niembro";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(11));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 77:
                this.nombre = "Juan Manuel";
                this.apellidos = "Durán";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(12));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 78:
                this.nombre = "Pierre";
                this.apellidos = "Salama";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("12A"));
                break;
            case 79:
                this.nombre = "Alexis";
                this.apellidos = "Saludjian";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("12A"));
                break;
            case 80:
                this.nombre = "Miguel Alemán";
                this.apellidos = "Velasco";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("13A"));
                break;
            case 81:
                this.nombre = "Raúl";
                this.apellidos = "Padilla López";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(14));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 82:
                this.nombre = "Enrique";
                this.apellidos = "Krauze";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(14));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 83:
                this.nombre = "Jesús Silva";
                this.apellidos = "Herzog Márquez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("14A"));
                break;
            case 84:
                this.nombre = "Manlio Fabio";
                this.apellidos = "Beltrones";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("14A"));
                break;
            case 85:
                this.nombre = "Santiago";
                this.apellidos = "Creel";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("14A"));
                break;
            case 86:
                this.nombre = "Cuauhtémoc";
                this.apellidos = "Cárdenas";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("14A"));
                break;
            case 87:
                this.nombre = "Aurelio";
                this.apellidos = "Nuño";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("31A"));
                break;
            case 88:
                this.nombre = "Eruviel";
                this.apellidos = "Ávila";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("31B"));
                break;
            case 89:
                this.nombre = "Ricardo";
                this.apellidos = "Monreal";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("31B"));
                break;
            case 90:
                this.nombre = "Anna";
                this.apellidos = "Platonova";
                this.universidad = "";
                this.profesion = "(Unión Europea) " +
                        "Organización Internacional para las Migraciones";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("15A"));
                break;

            case 91:
                this.nombre = "Flor de María";
                this.apellidos = "Rigoni";
                this.universidad = "";
                this.profesion = "Activista de los Derechos de los Migrantes";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("15A"));
                break;

            case 92:
                this.nombre = "Sally";
                this.apellidos = "O´Neill";
                this.universidad = "";
                this.profesion = "Defensora de los Derechos Humanos";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("15A"));
                break;

            case 93:
                this.nombre = "Benedetto";
                this.apellidos = "Giuntini";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("15A"));
                break;
            case 94:
                this.nombre = "Carlos";
                this.apellidos = "García de Alba";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("15A"));
                break;
            case 95:
                this.nombre = "Mark";
                this.apellidos = "Aspinwall";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(16));
                this.eventos = new ArrayList<String>(Arrays.asList("16B"));
                break;
            case 96:
                this.nombre = "Arturo";
                this.apellidos = "Santa Cruz";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(16));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 97:
                this.nombre = "Rafael";
                this.apellidos = "Rojas Gutiérrez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("16B"));
                break;
            case 98:
                this.nombre = "Jorge";
                this.apellidos = "Durand";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("16B"));
                break;
            case 99:
                this.nombre = "Sonja";
                this.apellidos = "Wolf";
                this.universidad = "";
                this.profesion = "(CIDE, Aguascalientes) – Crimen organizado";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("16B"));
                break;
            case 100:
                this.nombre = "Alexander";
                this.apellidos = "Segovia";
                this.universidad = "";
                this.profesion = "(INCIDE, El Salvador) – Economía";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("16B"));
                break;
            case 101:
                this.nombre = "Giovanni";
                this.apellidos = "Mantilla";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("16C"));
                break;
            case 102:
                this.nombre = "Thiago";
                this.apellidos = "Rodrigues";
                this.universidad = "";
                this.profesion = "(INCIDE, El Salvador) – Economía";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("16C"));
                break;
            case 103:
                this.nombre = "Thomas";
                this.apellidos = "Legler";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("16C"));
                break;
            case 104:
                this.nombre = "Héctor";
                this.apellidos = "Schamis";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("16C"));
                break;
            case 105:
                this.nombre = "Arturo";
                this.apellidos = "Santacruz";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("16C"));
                break;
            case 106:
                this.nombre = "Karla";
                this.apellidos = "Alejandrina Planter";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(17));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 107:
                this.nombre = "Judit";
                this.apellidos = "Bokser Liewerant";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17A","17F"));
                break;
            case 108:
                this.nombre = "Jaime";
                this.apellidos = "Preciado Coronado";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17A", "22A", "25C"));
                break;
            case 109:
                this.nombre = "Joachim";
                this.apellidos = "Michael";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17A"));
                break;
            case 110:
                this.nombre = "Federicho";
                this.apellidos = "Finchelstein";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17A"));
                break;
            case 111:
                this.nombre = "Rolando";
                this.apellidos = "Cordera";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17B"));
                break;
            case 112:
                this.nombre = "Sarah";
                this.apellidos = "Crorona Berkin";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17C", "20D"));
                break;
            case 113:
                this.nombre = "Gilda";
                this.apellidos = "Waldman";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17C","17F","32F"));
                break;
            case 114:
                this.nombre = "Paulina";
                this.apellidos = "Martínez Gómez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17D"));
                break;
            case 115:
                this.nombre = "Robert";
                this.apellidos = "Boyer";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17E"));
                break;
            case 116:
                this.nombre = "Salomé";
                this.apellidos = "Gómez Pérez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(32));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 117:
                this.nombre = "Praticia";
                this.apellidos = "Velázquez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(32));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 118:
                this.nombre = "Teun";
                this.apellidos = "Van Dijk";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("32L"));
                break;
            case 119:
                this.nombre = "Thomas";
                this.apellidos = "Brussig";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("32M"));
                break;
            case 120:
                this.nombre = "Alexander";
                this.apellidos = "Peer";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("32M"));
                break;
            case 121:
                this.nombre = "Pierre";
                this.apellidos = "Chatillon";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("32N"));
                break;
            case 122:
                this.nombre = "Bernard";
                this.apellidos = "Pozier";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("32N"));
                break;
            case 123:
                this.nombre = "Ottmar";
                this.apellidos = "Ette";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("32A"));
                break;
            case 124:
                this.nombre = "Rolf";
                this.apellidos = "G. Renner";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("32B"));
                break;
            case 125:
                this.nombre = "Olivia C";
                this.apellidos = "Díaz Pérez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("32C"));
                break;
            case 126:
                this.nombre = "Paulo";
                this.apellidos = "Soethe";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("32D"));
                break;
            case 127:
                this.nombre = "Margarita";
                this.apellidos = "Ramos Godínez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("32E"));
                break;
            case 128:
                this.nombre = "Gilda";
                this.apellidos = "Waldmann";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("32F"));
                break;
            case 129:
                this.nombre = "Sergio";
                this.apellidos = "Ugalde Quintana";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("32G"));
                break;
            case 130:
                this.nombre = "Werner";
                this.apellidos = "Mackenbach";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("32I"));
                break;
            case 131:
                this.nombre = "Cátedra";
                this.apellidos = "Wilhelm";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("32I"));
                break;
            case 132:
                this.nombre = "Alexander";
                this.apellidos = "Von Humboldt";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("32I"));
                break;
            case 133:
                this.nombre = "Dulce María";
                this.apellidos = "Zúñiga";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(18));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 134:
                this.nombre = "José Luis";
                this.apellidos = "Iturrioz";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(18));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 135:
                this.nombre = "Miguel";
                this.apellidos = "León-Portilla";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18B", "18D"));
                break;
            case 136:
                this.nombre = "Natalio";
                this.apellidos = "Hernández";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18B", "18F"));
                break;
            case 137:
                this.nombre = "José María";
                this.apellidos = "Murià";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18B", "18D", "18F"));
                break;

            case 138:
                this.nombre = "María Clara";
                this.apellidos = "Sharupi";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18E"));
                break;

            case 139:
                this.nombre = "Hugo";
                this.apellidos = "Jamioy Juagibioy";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18E"));
                break;
            case 140:
                this.nombre = "Kamentsá";
                this.apellidos = "Putumayo";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18E"));
                break;

            case 141:
                this.nombre = "ArirumaKowii";
                this.apellidos = "Maldonado";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18E"));
                break;
            case 142:
                this.nombre = "Gregorio";
                this.apellidos = "Gómez Centurión";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18E"));
                break;
            case 143:
                this.nombre = "Hermann";
                this.apellidos = "Bellinghausen";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18E"));
                break;
            case 144:
                this.nombre = "Antonio";
                this.apellidos = "Gamoneda";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18G"));
                break;

            case 145:
                this.nombre = "Daniel";
                this.apellidos = "Munduruku";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18H"));
                break;
            case 146:
                this.nombre = "Juan";
                this.apellidos = "Gregorio Regino";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18H"));
                break;
            case 147:
                this.nombre = "Gregorio";
                this.apellidos = "Gómez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18H"));
                break;
            case 148:
                this.nombre = "Ariruma";
                this.apellidos = "Kowii";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18A", "18H"));
                break;
            case 149:
                this.nombre = "Cessia Esther";
                this.apellidos = "Chuc";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18H"));
                break;
            case 150:
                this.nombre = "Roxana Sarahi";
                this.apellidos = "Romero Monroy";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18I"));
                break;

            case 151:
                this.nombre = "César Alex";
                this.apellidos = "Antúnez Ortiz";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18I"));
                break;

            case 152:
                this.nombre = "Rubén";
                this.apellidos = "Darío Gómez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18I"));
                break;

            case 153:
                this.nombre = "Isaac";
                this.apellidos = "Martínez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18I"));
                break;

            case 154:
                this.nombre = "Vladimir";
                this.apellidos = "Medina";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18I"));
                break;

            case 155:
                this.nombre = "Vicente";
                this.apellidos = "Marcial Cerqueda";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18A"));
                break;

            case 156:
                this.nombre = "José del Val";
                this.apellidos = "Blanco";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18A"));
                break;

            case 157:
                this.nombre = "Fidencio";
                this.apellidos = "Briceño Chel";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18C"));
                break;

            case 158:
                this.nombre = "Nelson";
                this.apellidos = "Martínez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18C"));
                break;

            case 159:
                this.nombre = "Xitákame";
                this.apellidos = "Ramírez de la Cruz";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18C"));
                break;
            case 160:
                this.nombre = "Yasnaya";
                this.apellidos = "Elena Aguilar";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18C"));
                break;
            case 161:
                this.nombre = "Paula";
                this.apellidos = "Gómez López";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18C"));
                break;
            case 162:
                this.nombre = "Enrique";
                this.apellidos = "Servin Herrera";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("18F"));
                break;
            case 163:
                this.nombre = "Guillermo";
                this.apellidos = "Orozco Gómez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(19));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 164:
                this.nombre = "Fabiola";
                this.apellidos = "Alcalá";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("19A"));
                break;
            case 165:
                this.nombre = "Maricela";
                this.apellidos = "Portillo";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("19A"));
                break;
/*
            case 166:
                this.nombre = "Diego";
                this.apellidos = "Zavala";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("19A"));
                break;
*/
            case 167:
                this.nombre = "Antonio";
                this.apellidos = "Ponce";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(20));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 168:
                this.nombre = "José Igor Israel";
                this.apellidos = "González Aguirre";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20A"));
                break;
            case 169:
                this.nombre = "Ramón";
                this.apellidos = "Gómez Zamudio";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20A"));
                break;
            case 170:
                this.nombre = "Almendra Cristal";
                this.apellidos = "Orozco Barranco";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20A"));
                break;
            case 171:
                this.nombre = "Tomás";
                this.apellidos = "Fontaines Ruiz";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20B"));
                break;
            case 172:
                this.nombre = "Alicia de Jesús";
                this.apellidos = "Iniciarte González";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20B"));
                break;
            case 173:
                this.nombre = "Juan Gerardo";
                this.apellidos = "Martínez Borrayo";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20B"));
                break;
            case 174:
                this.nombre = "Durruty de Alba";
                this.apellidos = "Martínez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20B"));
                break;
            case 175:
                this.nombre = "Cármen de la Peza";
                this.apellidos = "Casares";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20C"));
                break;
            case 176:
                this.nombre = "Elba Noemí";
                this.apellidos = "Gómez Gómez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20D"));
                break;
            case 177:
                this.nombre = "Monique";
                this.apellidos = "Landesmann";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20D"));
                break;
            case 178:
                this.nombre = "Ángeles";
                this.apellidos = "González";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20E"));
                break;
            case 179:
                this.nombre = "Miguel";
                this.apellidos = "Agustín Romero";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20E"));
                break;
            case 180:
                this.nombre = "Verónica";
                this.apellidos = "Ortiz Lefort";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20F"));
                break;
            case 181:
                this.nombre = "Martha";
                this.apellidos = "Vergara Fregoso";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20F"));
                break;
            case 182:
                this.nombre = "Jordi";
                this.apellidos = "Planas Coll";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20G"));
                break;
            case 183:
                this.nombre = "Romualdo";
                this.apellidos = "López Zarate";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20G"));
                break;
            case 184:
                this.nombre = "Martín";
                this.apellidos = "Bonfil Olivera";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20H"));
                break;
            case 185:
                this.nombre = "Juan";
                this.apellidos = "Nepote";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20H"));
                break;
            case 186:
                this.nombre = "Pablo";
                this.apellidos = "Gentili";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20H"));
                break;
            case 187:
                this.nombre = "Alfonso Enrique";
                this.apellidos = "Islas Rodríguez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20I"));
                break;
            case 188:
                this.nombre = "Juan";
                this.apellidos = "Delval Merino";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20I"));
                break;
            case 189:
                this.nombre = "Laura";
                this.apellidos = "Topete";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(21));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 190:
                this.nombre = "Pablo";
                this.apellidos = "Arredondo Ramírez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(22));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 191:
                this.nombre = "Francisco";
                this.apellidos = "Hernández Lomelí";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(22));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 192:
                this.nombre = "Álvaro";
                this.apellidos = "Márquez Fernández";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("22B"));
                break;
            case 193:
                this.nombre = "Jorge Alonso";
                this.apellidos = "Sánchez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("22B"));
                break;
            case 194:
                this.nombre = "Guillermo de la Peña";
                this.apellidos = "Topete";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("22C"));
                break;
            case 195:
                this.nombre = "Brahiman";
                this.apellidos = "Saganogo";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(23));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 196:
                this.nombre = "Gonzalo";
                this.apellidos = "Santonja";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(23));
                this.eventos = new ArrayList<String>(Arrays.asList("23E"));
                break;
            case 197:
                this.nombre = "Anne Folger";
                this.apellidos = "Staples Dean";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("23A"));
                break;
            case 198:
                this.nombre = "Darío Armando";
                this.apellidos = "Flores Soria";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("23A", "23D"));
                break;
            case 199:
                this.nombre = "Gómez Agero";
                this.apellidos = "";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("23B"));
                break;
            case 200:
                this.nombre = "Juan Manuel de Prada";
                this.apellidos = "";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("23B"));
                break;
            case 201:
                this.nombre = "Bernardo";
                this.apellidos = "Barranco Villafán";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("23C"));
                break;
            case 202:
                this.nombre = "Marina";
                this.apellidos = "Ruano Gutiérrez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("23D"));
                break;
            case 203:
                this.nombre = "Cándida Elizabeth";
                this.apellidos = "Vivero Marín";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(24));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 204:
                this.nombre = "Alfonso";
                this.apellidos = "Hernández Rodríguez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(24));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 205:
                this.nombre = "Manuela";
                this.apellidos = "Camus";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("24A", "24E"));
                break;
            case 206:
                this.nombre = "Elizabeth";
                this.apellidos = "Vivero";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("24A", "24E"));
                break;
            case 207:
                this.nombre = "Alfonso";
                this.apellidos = "Hernández";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("24A", "24E"));
                break;
            case 208:
                this.nombre = "Salvador";
                this.apellidos = "Chávez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("24B"));
                break;
            case 209:
                this.nombre = "José Elías";
                this.apellidos = "García Ortiz";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("24B"));
                break;
            case 210:
                this.nombre = "Paula";
                this.apellidos = "Islas";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("24B"));
                break;
            case 211:
                this.nombre = "María Juana";
                this.apellidos = "González Tovar";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("24B"));
                break;
            case 212:
                this.nombre = "Virginia";
                this.apellidos = "Enciso Huerta";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("24B"));
                break;
            case 213:
                this.nombre = "Marisa";
                this.apellidos = "Martínez Moscoso";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("24B"));
                break;
            case 214:
                this.nombre = "Paulo";
                this.apellidos = "Verdín";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("24C"));
                break;
            case 215:
                this.nombre = "Alejandra";
                this.apellidos = "López";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("24C"));
                break;
            case 216:
                this.nombre = "Isabel";
                this.apellidos = "Guzmán";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("24C"));
                break;
            case 217:
                this.nombre = "María Antonia";
                this.apellidos = "Chávez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("24D"));
                break;
            case 218:
                this.nombre = "Fernanda Gil";
                this.apellidos = "Lozano";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("24D"));
                break;
            case 219:
                this.nombre = "Mariana";
                this.apellidos = "Espeleta Olivera";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("24D"));
                break;
            case 220:
                this.nombre = "María Candelaria";
                this.apellidos = "Ochoa Ávalos";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("24D"));
                break;
            case 221:
                this.nombre = "Edgardo";
                this.apellidos = "Íñiguez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("24D"));
                break;
            case 222:
                this.nombre = "María Carmela";
                this.apellidos = "Chávez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("24D"));
                break;
            case 223:
                this.nombre = "Martín Reyes";
                this.apellidos = "Raewyn Connell";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("24D"));
                break;
            case 224:
                this.nombre = "Roberta";
                this.apellidos = "S. Jacobson";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("24E"));
                break;
            case 225:
                this.nombre = "María Pilar";
                this.apellidos = "Gutiérrez Lorenzo";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(25));
                this.eventos = new ArrayList<String>(Arrays.asList("25E"));
                break;
            case 226:
                this.nombre = "David";
                this.apellidos = "Carbajal López";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("25A"));
                break;
            case 227:
                this.nombre = "Jaime";
                this.apellidos = "Olveda";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("25A"));
                break;
            case 228:
                this.nombre = "Edwin";
                this.apellidos = "Williamson";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("25B"));
                break;
            case 229:
                this.nombre = "Silvestre";
                this.apellidos = "Villegas Revueltas";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("25B"));
                break;
            case 230:
                this.nombre = "Gladys";
                this.apellidos = "Lizama Silva";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("25B"));
                break;
            case 231:
                this.nombre = "Pedro";
                this.apellidos = "Castro Martinez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("25C"));
                break;
            case 232:
                this.nombre = "Antonio";
                this.apellidos = "López Vega";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("25C"));
                break;
            case 233:
                this.nombre = "Mario Alfonso";
                this.apellidos = "Aldana Rendon";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("25C"));
                break;
            case 234:
                this.nombre = "Cuauthémoc";
                this.apellidos = "Mayorga Madrigal";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(26));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 235:
                this.nombre = "José Luis";
                this.apellidos = "González";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(26));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 236:
                this.nombre = "Ambrosio";
                this.apellidos = "Velasco";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("26A"));
                break;
            case 237:
                this.nombre = "Kim";
                this.apellidos = "Diaz";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("26A"));
                break;
            case 238:
                this.nombre = "Santiago";
                this.apellidos = "Rey";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("26A"));
                break;
            case 239:
                this.nombre = "Aureliano";
                this.apellidos = "Ortega Esquivel";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("26A"));
                break;
            case 240:
                this.nombre = "Rodolfo";
                this.apellidos = "Arango";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("26A"));
                break;
            case 241:
                this.nombre = "José de Jesús";
                this.apellidos = "Becerra Ramírez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(27));
                this.eventos = new ArrayList<String>(Arrays.asList("27A"));
                break;
            case 242:
                this.nombre = "José Luis";
                this.apellidos = "Castellanos González";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(27));
                this.eventos = new ArrayList<String>(Arrays.asList("27A"));
                break;
            case 243:
                this.nombre = "Rodolfo";
                this.apellidos = "Vázquez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("27A"));
                break;
            case 244:
                this.nombre = "Jesús";
                this.apellidos = "Ibarra Cárdenas";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("27A"));
                break;
            case 245:
                this.nombre = "José Ramón";
                this.apellidos = "Cossio Díaz";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("27B"));
                break;
            case 246:
                this.nombre = "Adrián Joaquín";
                this.apellidos = "Miranda Camarena";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("27B"));
                break;
            case 247:
                this.nombre = "Rogelio Barba";
                this.apellidos = "Alvarez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("27C"));
                break;
            case 248:
                this.nombre = "Luiz";
                this.apellidos = "Flávio Gomes";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("27C"));
                break;
            case 249:
                this.nombre = "Alice";
                this.apellidos = "Bianchini";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("27C"));
                break;
            case 250:
                this.nombre = "Manuel";
                this.apellidos = "Atienza Rodríguez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("27D"));
                break;
            case 251:
                this.nombre = "Carlos Ramiro";
                this.apellidos = "Ruiz Moreno";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("27D"));
                break;
            case 252:
                this.nombre = "José Guillermo";
                this.apellidos = "Vallarta Plata";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("27E"));
                break;
            case 253:
                this.nombre = "José Trinidad";
                this.apellidos = "Padilla López";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("27E"));
                break;
            case 254:
                this.nombre = "Alejandro";
                this.apellidos = "Sánchez Cortés";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(28));
                this.eventos = new ArrayList<String>(Arrays.asList("28C"));
                break;
            case 255:
                this.nombre = "Viktor";
                this.apellidos = "Boga";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(28));
                this.eventos = new ArrayList<String>(Arrays.asList("28C"));
                break;
            case 256:
                this.nombre = "José Luis";
                this.apellidos = "Barrios";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("28A", "28C"));
                break;
            case 257:
                this.nombre = "Ricardo";
                this.apellidos = "Duarte";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("28B", "28C"));
                break;
            case 258:
                this.nombre = "Daniel";
                this.apellidos = "Montero Fayad";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("28C"));
                break;
            case 259:
                this.nombre = "Hariet";
                this.apellidos = "Quint";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(29));
                this.eventos = new ArrayList<String>(Arrays.asList("29A", "29I", "29X"));
                break;
            case 260:
                this.nombre = "Luis";
                this.apellidos = "Medina Gutiérrez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29A"));
                break;
            case 261:
                this.nombre = "Jorge";
                this.apellidos = "Souza Jauffred";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29B"));
                break;
            case 262:
                this.nombre = "Susana";
                this.apellidos = "Hernández Araico";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29C"));
                break;
            case 263:
                this.nombre = "Tanius";
                this.apellidos = "Karam";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29D"));
                break;
            case 264:
                this.nombre = "Sara";
                this.apellidos = "Poot Herrera";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29E"));
                break;
            case 265:
                this.nombre = "Patricia";
                this.apellidos = "Córdova Abundis";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29E", "29M"));
                break;
            case 266:
                this.nombre = "Gabriel";
                this.apellidos = "Gómez López";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29F"));
                break;
            case 267:
                this.nombre = "Celina";
                this.apellidos = "Vázquez Parada";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29G"));
                break;
            case 268:
                this.nombre = "Wolfgang";
                this.apellidos = "Vogt";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29G", "29S"));
                break;
            case 269:
                this.nombre = "Teresa";
                this.apellidos = "González Arce";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29H", "29V"));
                break;
            case 270:
                this.nombre = "Luis";
                this.apellidos = "Medina";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29H"));
                break;
            case 271:
                this.nombre = "Hernán";
                this.apellidos = "Horna";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29J"));
                break;
            case 272:
                this.nombre = "Inga-Lill";
                this.apellidos = "Aronsson";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29K"));
                break;
            case 273:
                this.nombre = "Celina";
                this.apellidos = "Vázquez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29K"));
                break;
            case 274:
                this.nombre = "Gerardo";
                this.apellidos = "Gutiérrez Cham";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29L"));
                break;
            case 275:
                this.nombre = "Blanca Estela";
                this.apellidos = "Ruiz Zaragoza";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29M", "29V"));
                break;
            case 276:
                this.nombre = "Jorge";
                this.apellidos = "Gómez Bocanegra";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29N"));
                break;
            case 277:
                this.nombre = "Leonardo";
                this.apellidos = "Rossiello";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29O"));
                break;
            case 278:
                this.nombre = "Luis Antonio";
                this.apellidos = "Medina Gutiérrez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29P"));
                break;

            case 279:
                this.nombre = "María Mercedes";
                this.apellidos = "Galván Dávila";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29P", "29R"));
                break;

            case 280:
                this.nombre = "Raúl";
                this.apellidos = "Aceves";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29Q"));
                break;
            case 281:
                this.nombre = "Sergio";
                this.apellidos = "Figueroa Buenrostro";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29S"));
                break;
            case 282:
                this.nombre = "María del Rosario";
                this.apellidos = "Velázquez Gumeta";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29T"));
                break;
            case 283:
                this.nombre = "Luis";
                this.apellidos = "Martín Ulloa";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29U"));
                break;
            case 284:
                this.nombre = "Ricardo";
                this.apellidos = "Castillo";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29W"));
                break;
            case 285:
                this.nombre = "Marco Aurelio";
                this.apellidos = "Larios";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29X"));
                break;
            case 286:
                this.nombre = "Carmen Beatriz";
                this.apellidos = "López Portillo";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29Y"));
                break;
            case 287:
                this.nombre = "Marco Aurelio";
                this.apellidos = "Larios López";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29Y"));
                break;
            case 288:
                this.nombre = "Dulce María";
                this.apellidos = "Zúñiga";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29Z"));
                break;
            case 289:
                this.nombre = "Luis Antonio";
                this.apellidos = "Medina Gutiérrez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("29Z"));
                break;
            case 290:
                this.nombre = "Josefina";
                this.apellidos = "Callicó";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(30));
                this.eventos = new ArrayList<String>(Arrays.asList("30F"));
                break;
            case 291:
                this.nombre = "Geoffrey";
                this.apellidos = "Hewings";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("30A"));
                break;
            case 292:
                this.nombre = "Carmen";
                this.apellidos = "Ramos";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("30B"));
                break;
            case 293:
                this.nombre = "Hugo";
                this.apellidos = "Eduardo Beteta";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("30B", "30E"));
                break;
            case 294:
                this.nombre = "Ramón";
                this.apellidos = "Padilla";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("30B"));
                break;
            case 295:
                this.nombre = "Horacio";
                this.apellidos = "Sobarzo";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("30B"));
                break;
            case 296:
                this.nombre = "Luis Manuel";
                this.apellidos = "Sánchez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("30B"));
                break;
            case 297:
                this.nombre = "Joaquim";
                this.apellidos = "Guilhoto";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("30C"));
                break;
            case 298:
                this.nombre = "Noé Aron";
                this.apellidos = "Fuentes";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("30C"));
                break;
            case 299:
                this.nombre = "Alejandro";
                this.apellidos = "Brugués";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("30C"));
                break;
            case 300:
                this.nombre = "Gabriel";
                this.apellidos = "Tapia";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("30C"));
                break;
            case 301:
                this.nombre = "Carlos";
                this.apellidos = "Azzoni";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("30C"));
                break;
            case 302:
                this.nombre = "Normand";
                this.apellidos = "Assuad";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("30D"));
                break;
            case 303:
                this.nombre = "José Manuel";
                this.apellidos = "Sánchez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("30D"));
                break;
            case 304:
                this.nombre = "Rodolfo";
                this.apellidos = "Minzer";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("30D"));
                break;
            case 305:
                this.nombre = "Roberto";
                this.apellidos = "Orozco";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("30D"));
                break;
            case 306:
                this.nombre = "Daniel";
                this.apellidos = "Vargas";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("30D"));
                break;
            case 307:
                this.nombre = "Evaristo Jaime";
                this.apellidos = "González";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("30D"));
                break;
            case 308:
                this.nombre = "Fidel";
                this.apellidos = "Aroche";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("30F"));
                break;
            case 309:
                this.nombre = "Marco Antonio";
                this.apellidos = "Marquez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("30F"));
                break;
            case 310:
                this.nombre = "Carlos";
                this.apellidos = "Quenan";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(33));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 311:
                this.nombre = "Armando";
                this.apellidos = "Zacarías";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(33));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 312:
                this.nombre = "Hugo";
                this.apellidos = "Beteta";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(33));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;

            case 313:
                this.nombre = "Andrés";
                this.apellidos = "Serbin";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("33A"));
                break;

            case 314:
                this.nombre = "Ana";
                this.apellidos = "Covarrubias";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("33A"));
                break;

            case 315:
                this.nombre = "Stephan";
                this.apellidos = "Sberro";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("33A"));
                break;

            case 316:
                this.nombre = "Elodie";
                this.apellidos = "Brun";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("33A"));
                break;

            case 317:
                this.nombre = "Roberto";
                this.apellidos = "Hernández";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("33A"));
                break;

            case 318:
                this.nombre = "Jonathan";
                this.apellidos = "Luckhurst";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("33A"));
                break;
            case 319:
                this.nombre = "Olaf";
                this.apellidos = "Kaltmeier";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17B"));
                break;

            case 320:
                this.nombre = "Stefan";
                this.apellidos = "Peters";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17B"));
                break;
            case 321:
                this.nombre = "Federico";
                this.apellidos = "Finchelstein";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17C"));
                break;
            case 322:
                this.nombre = "Ludger";
                this.apellidos = "Pries";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17D"));
                break;
            case 323:
                this.nombre = "Eleonora";
                this.apellidos = "Rohland";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17D"));
                break;
            case 324:
                this.nombre = "José";
                this.apellidos = "Gordon";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17F"));
                break;
            case 325:
                this.nombre = "Ruth";
                this.apellidos = "Ban";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("32O"));
                break;
            case 326:
                this.nombre = "Elizabeth";
                this.apellidos = "Flores";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("32P"));
                break;
            case 327:
                this.nombre = "Isabelle";
                this.apellidos = "Courteau";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("32N"));
                break;
            case 328:
                this.nombre = "Olivia";
                this.apellidos = "Díaz";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("32Q"));
                break;
            case 329:
                this.nombre = "Janny Amaya";
                this.apellidos = "Trujillo";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21C"));
                break;
            case 330:
                this.nombre = "José Paz";
                this.apellidos = "López Rivas";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21C"));
                break;
            case 331:
                this.nombre = "Isabel Mercado";
                this.apellidos = "Archila";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21C"));
                break;
            case 332:
                this.nombre = "Valentina";
                this.apellidos = "Arreola Ochoa";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21C"));
                break;
            case 333:
                this.nombre = "Ahtziri";
                this.apellidos = "Molina Roldán";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21C"));
                break;
            case 334:
                this.nombre = "Tomás";
                this.apellidos = "Ejea Mendoza";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21C"));
                break;
            case 335:
                this.nombre = "Marco Antonio";
                this.apellidos = "Chávez Aguayo";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21C"));
                break;
            case 336:
                this.nombre = "Luis Gabriel";
                this.apellidos = "Hernández Valencia";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21C"));
                break;
            case 337:
                this.nombre = "José Luis";
                this.apellidos = "Mariscal Orozco";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21C"));
                break;
            case 338:
                this.nombre = "Israel Tonatiuh";
                this.apellidos = "Lay Arellano";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21C"));
                break;
            case 339:
                this.nombre = "Ana Rosa";
                this.apellidos = "Castellanos Castellanos";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21C"));
                break;
            case 340:
                this.nombre = "María Elena";
                this.apellidos = "Chan Núñez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21C","21E"));
                break;
            case 341:
                this.nombre = "Rebeca";
                this.apellidos = "Mateos Morfín";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21D"));
                break;
            case 342:
                this.nombre = "Manuel";
                this.apellidos = "Moreno Castañeda";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21D"));
                break;
            case 343:
                this.nombre = "Rosana";
                this.apellidos = "Ruiz Sánchez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21D"));
                break;
            case 344:
                this.nombre = "Dolores del Carmen";
                this.apellidos = "Chinas Salazar";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21D"));
                break;
            case 345:
                this.nombre = "Carmen Julia";
                this.apellidos = "Prudencio González";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21D"));
                break;
            case 346:
                this.nombre = "Miguel";
                this.apellidos = "Zapata Ros";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21E","21G"));
                break;
            case 347:
                this.nombre = "Martín";
                this.apellidos = "Restrepo";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21E","21H"));
                break;
            case 348:
                this.nombre = "Erica";
                this.apellidos = "Casado";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21E"));
                break;
            case 349:
                this.nombre = "Julieta";
                this.apellidos = "Palma";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21E"));
                break;
            case 350:
                this.nombre = "María";
                this.apellidos = "Flores Briseño";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21E"));
                break;
            case 351:
                this.nombre = "Juan de Dios";
                this.apellidos = "Rodríguez Velázquez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21E"));
                break;
            case 352:
                this.nombre = "Jorge Carlos";
                this.apellidos = "Sanabria Zepeda";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21E","21H"));
                break;
            case 353:
                this.nombre = "Rafael";
                this.apellidos = "Morales Gamboa";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21E"));
                break;
            case 354:
                this.nombre = "Juan Manuel";
                this.apellidos = "Álvarez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21E"));
                break;
            case 355:
                this.nombre = "María del Carmen";
                this.apellidos = "Coronado Gallardo";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21E"));
                break;
            case 356:
                this.nombre = "Beatriz de la Mora";
                this.apellidos = "";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21E"));
                break;
            case 357:
                this.nombre = "Irving";
                this.apellidos = "Sánchez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21E"));
                break;
            case 358:
                this.nombre = "Cristopher";
                this.apellidos = "Pegueros";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21E"));
                break;
           case 359:
                this.nombre = "Paulina";
                this.apellidos = "Ramirez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21E"));
                break;
           case 360:
                this.nombre = "Adrián";
                this.apellidos = "Orozco Quiñones";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21E"));
                break;
           case 361:
                this.nombre = "José María";
                this.apellidos = "Antón";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21F","21L"));
                break;
           case 362:
                this.nombre = "José Alberto";
                this.apellidos = "Becerra Santiago";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21G"));
                break;
           case 363:
                this.nombre = "José Manuel";
                this.apellidos = "Ríos";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21G"));
                break;
           case 364:
                this.nombre = "Ignacio Criado";
                this.apellidos = "Ríos";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21G"));
                break;
           case 365:
                this.nombre = "Jorge Alberto";
                this.apellidos = "Alatorre Flores";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21G"));
                break;
           case 366:
                this.nombre = "Roberto";
                this.apellidos = "Arias de la Mora";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21G"));
                break;
           case 367:
                this.nombre = "José Barbosa";
                this.apellidos = "Corbacho";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21G"));
                break;
           case 368:
                this.nombre = "Rafael";
                this.apellidos = "Vidal Uribe";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21G"));
                break;
           case 369:
                this.nombre = "Antonio";
                this.apellidos = "Gago Huguet";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21G"));
                break;
           case 370:
                this.nombre = "Erik";
                this.apellidos = "Huesca Morales";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21H"));
                break;
           case 371:
                this.nombre = "Felipe";
                this.apellidos = "Centeno";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21J"));
                break;
           case 372:
                this.nombre = "Carlos Alberto";
                this.apellidos = "Guzmán Machuca";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21J"));
                break;
           case 373:
                this.nombre = "Josep María";
                this.apellidos = "Duart";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21K"));
                break;
           case 374:
                this.nombre = "Alma";
                this.apellidos = "Rosa de la Selva";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21L"));
                break;
           case 375:
                this.nombre = "Rosario";
                this.apellidos = "Rogel";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21L"));
                break;
           case 376:
                this.nombre = "Enrique";
                this.apellidos = "Sánchez Ruiz";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21L"));
                break;
           case 377:
                this.nombre = "Rodolfo";
                this.apellidos = "Uribe Iniesta";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21L"));
                break;
           case 378:
                this.nombre = "Jesús";
                this.apellidos = "Galindo Cáceres";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21L"));
                break;
           case 379:
                this.nombre = "Dinorah";
                this.apellidos = "Miller Flores";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21M"));
                break;
           case 380:
                this.nombre = "Libna Elizabeth";
                this.apellidos = "Oviedo Castillo";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21M"));
                break;
           case 381:
                this.nombre = "Marcela";
                this.apellidos = "García Bátiz";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21O"));
                break;
           case 382:
                this.nombre = "Cristina";
                this.apellidos = "Yoshida";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("21O"));
                break;
           case 383:
                this.nombre = "Tiziano";
                this.apellidos = "Leoni";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("28C"));
                break;
           case 384:
                this.nombre = "Argelia";
                this.apellidos = "Castillo";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("28C"));
                break;
           case 385:
                this.nombre = "Jorge Juanes";
                this.apellidos = "López";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("28C"));
                break;
           case 386:
                this.nombre = "Silvia Patricia";
                this.apellidos = "López González";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(35));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
           case 387:
                this.nombre = "Jorge Eduardo";
                this.apellidos = "Londoño Ulloa";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("35A"));
                break;
           case 388:
                this.nombre = "Luis";
                this.apellidos = "Díaz Muller";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("35B"));
                break;
           case 389:
                this.nombre = "Pablo";
                this.apellidos = "Sánchez Alatorre";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("35C"));
                break;
           case 390:
                this.nombre = "Héctor Julio";
                this.apellidos = "Prieto Cely";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("35D"));
                break;

        }
    }
}
