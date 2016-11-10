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
                this.eventos = new ArrayList<String>(Arrays.asList("1D","22A"));
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
                this.descripcion = "Administrador de Empresas de la EAN – Escuela de Administración de Negocios de Bogotá. posgrado en Gestión de Ciudades y Emprendimientos Creativos de la Universidad Nacional de Córdoba.\n" +
                        "Cofundador de la Corporación Cultural Ateneo Porfirio Barba Jacob, presidente de la Red Colombia de productores Culturales, director del Festival Iberoamericano de Teatro sede Medellín, director Ejecutivo del Circuito de Salas Teatrales, del Semanario Cultural, director de eventos Culturales de la Alcaldía de Medellín durante el 2007 y Secretario de Cultura Ciudadana de Medellín 2008-2011. \n" +
                        "Funcionario responsable por la alcaldía de Medellín del III Congreso Iberoamericano de Cultura. Trabajó en el desarrollo e implementación de las políticas públicas de Seguridad Alimentaria, LGBTI, Afrodescendientes, Juventud, Cultura Viva Comunitaria, Salas Abiertas y en el Plan Decenal de Cultura de Medellín. Fue miembro de la junta directiva del Museo de Antioquia, el Museo de Arte Moderno de Medellín, la Biblioteca Pública Piloto Latinoamericana, el Teatro Pablo Tobón Uribe y el Parque Explora, entre otros. \n\n" +
                        "Como Secretario de Cultura, participó en el diseño e implementación de campañas de Cultura Ciudadana, Movilidad, Seguridad Vial y de Convivencia de la Alcaldía de Medellín. Ha participado como conferencista en el Seminario Iberoamericano de Políticas Públicas, Gestión y Diplomacia Cultural en 2009 en Madrid, Culturgal 2010 en Pontevedra, foro Internacional sobre Violencia en las Ciudades en 2008 en Ciudad Juárez, Foro ¿Hay contenidos culturales en nuestros medios? Universidad Eafit 2010 en Medellín, Medellín, modelo en la proyección Cultural al Mundo para la Intendencia de Montevideo y el Ministerio de Educación y Cultura de Uruguay, Seminario Formación de Audiencias, 2012 Concepción–Chile. Con la organización Cultura México realizó conferencias en las ciudades de Saltillo, Pachuca, Puebla, Tijuana, Oaxaca y Cuernavaca en 2012. Conferencista en el coloquio internacional Mundo Contemporáneo; Educación Artística y Cultura en Aguascalientes 2012. \n" +
                        "Participó en el encuentro de especialistas por la consolidación del espacio cultural iberoamericano – SEGIB 2013 en México DF. Ha sido jurado del programa nacional de salas concertadas del Ministerio de Cultura de Colombia en 2012, del programa nacional de concertación cultural en 2012, 2013, 2014 y 2015. Profesor de la maestría de gestión cultural de la Universidad de Antioquia en 2013. Director de la Gran Feria de Antioquia 2013. Participó como conferencista en la Sexta Cumbre Mundial de las Artes y la Cultura en Santiago de Chile en 2014 y fue ponente en el seminario “Políticas Públicas Culturales en el Siglo XXI” en Victoria de Durango en octubre de 2014.";
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
                this.universidad = "Universidad de Guadalajara";
                this.profesion = "";
                this.descripcion = "Doctor en Filosofía con especialidad en Sociología (Ph. D.) por la New School for Social Research. Actualmente funge como Rector del Centro Universitario de Ciencias Sociales y Humanidades de la Universidad de Guadalajara. Es editorialista del diario MILENIO JALISCO y miembro del Sistema Nacional de Investigadores Nivel I (SNI) desde 2009. Ha publicado Enciclopedia de la Época. Jalisco en el Mundo Contemporáneo, como coordinador y colaborador; Por una Democracia con Significado, como coordinador y participante; Creación de nuevos municipios en México, procesos y perspectivas, como coordinador y colaborador y Jalisco a Futuro, Construyendo el Porvenir, 1999-2025, como co-autor. Sus temas de investigación y docencia son la teoría social y política, la democracia, la modernidad, la filosofía política y el sistema político mexicano y jalisciense.";
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
                this.descripcion = "Nació en la Ciudad de México en 1944. Ha representado a su país como embajador en Suecia (1982), la Unión Soviética (1988-90), Alemania (1990-98), España (1998-2000), Estados Unidos (2001-2004), en el Reino Unido (2004-2010) y en Cuba (2013-2016). Presidió la Comisión de Relaciones Exteriores de la Cámara de Diputados y coordinó los trabajos de las Reuniones Interparlamentarias México-Estados Unidos (1985-87). Entre otras tareas públicas fue Director del Instituto Nacional de Bellas Artes (1976-82), así como Subsecretario de Asuntos Culturales de la Secretaría de Educación Pública y Presidente del Festival Internacional Cervantino (1983-85). Ha impartido conferencias sobre temas culturales y política exterior en importantes universidades de Europa y los Estados Unidos y ha sido condecorado por los gobiernos de Alemania, España y el Reino Unido.";
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
                this.descripcion = "Abogada graduada por Harvard y la Universidad de California en Berkeley. Analista y comunicadora en programas de televisión como “El primer café”, “Contrastes  40”,  en Canal 40 de TV Azteca y programas en inglés “Imagen News” y “Living in Mexico” para grupo Imagen. Los temas que analiza versan sobre seguridad, justicia y política. Además, participa en columnas semanales en los periódicos El Universal, El Imparcial de Hermosillo, La Crónica de Mexicali, La Frontera de Tijuana, El Informador de Guadalajara, y la Opinión en California, EUA.\n\n" +
                        "Ha ocupado varios cargos públicos, fue Subsecretaria Adjunta de Defensa para Política y Apoyo Antidrogas del Departamento de Defensa de los Estados Unidos en 1998. También, fue asesora, durante su estancia en la Casa Blanca, del Enviado Especial para las Américas del Presidente Clinton en 1997. En Colombia se desempeñó como Agregada Judicial en la Embajada de los Estados Unidos en Bogotá. Debido a su desempeño en el Pentágono, la revista Hispanic Business Magazine la reconoció como uno de los 100 Hispano Americanos más influyentes en los EEUU.";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("3B"));
                break;
            case 37:
                this.nombre = "Gabriel Guerra";
                this.apellidos = "Castellanos";
                this.universidad = "";
                this.profesion = "Analista de política internacional";
                this.descripcion = "Presidente y Director General de Guerra Castellanos y Asociados, empresa líder en temas de Comunicación Estratégica y Relaciones Públicas, fundada en 2001.\n" +
                        "En 2016,  Guerra Castellanos y Asociados inauguró sus oficinas en Dallas, Texas ofreciendo servicio a clientes en Estados Unidos.\n" +
                        "Tiene una amplia experiencia en asuntos internacionales, al haber vivido y estudiado en Israel y la antigua República Democrática Alemana, donde sus padres fueron representantes de México. Habla español, inglés y alemán, tiene conocimientos básicos de francés y ruso.\n\n" +
                        " En el sector público, Guerra Castellanos fue Agregado Cultural en la Embajada de México en la antigua Unión Soviética; Agregado de Prensa en la Embajada de México en Alemania y Cónsul General de México en Toronto. Fue también Director de Información Internacional de la Presidencia de la República.\n" +
                        "Es Miembro Fundador del Consejo Mexicano de Asuntos Internacionales (COMEXI) y miembro de diversos Consejos Asesores en México.\n" +
                        "Actualmente publica una columna semanal en el periódico El Universal.\n" +
                        "Participa en diversos programas de análisis y noticias en las principales cadenas nacionales de radio y televisión;  a menudo es citado por medios internacionales.\n" +
                        "Con frecuencia da conferencias y charlas sobre asuntos internacionales, medios de comunicación, economía y política para diversos públicos en México, Canadá y los Estados Unidos de América.";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("3B"));
                break;
            case 38:
                this.nombre = "Abraham";
                this.apellidos = "Lowenthal";
                this.universidad = "";
                this.profesion = "Académico de la Universidad del Sur de California, EUA";
                this.descripcion = "Abraham Lowenthal es el primer Catedrático Robert F. Erburu de Ética, Globalización y Desarrollo en la Universidad del Sur de California, donde también es profesor de relaciones internacionales. Presidente fundador del Consejo del Pacífico sobre Política Internacional, Lowenthal es actualmente presidente emérito y miembro principal de dicha organización. Se le reconoce mundialmente como una de las principales autoridades en temas relacionados con América Latina.";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("3B"));
                break;
            case 39:
                this.nombre = "Jorge";
                this.apellidos = "Chabat";
                this.universidad = "";
                this.profesion = "Investigador y especialista en política exterior de México " +
                        "Universidad de Guadalajara";
                this.descripcion = "Es Profesor-Investigador de tiempo completo en la División de Estudios Internacionales del Centro de Investigación y Docencia Económicas, A.C. (CIDE) desde 1983. Fue Director de la propia División de Estudios Internacionales del CIDE de 1996 a 1999. Obtuvo la Licenciatura en Relaciones Internacionales en El Colegio de México y la Maestría y el Doctorado en Estudios Internacionales en la Universidad de Miami. Es miembro del Sistema Nacional de Investigadores, Nivel 2. Ha publicado más de 40 artículos en los temas de Política Exterior de México, Relaciones México-Estados Unidos, Narcotráfico y Seguridad Nacional en libros y revistas especializadas como Current History, Journal of Interamerican Studies and World Affairs y Annals of the American Academy of Political and Social Science. Entre sus publicaciones se encuentran: John Bailey y Jorge Chabat (eds), Transnational crime and public security: challenges to Mexico and the United States. San Diego: University of California San Diego, 2002; “Violence in Mexico: in search of an explanation”, en Bruce Bagley, Hanna Kassab y Jonathan Rosen (eds), Reconceptualizing security in the western hewmisphere in the 21st Century”, Nueva York: Lexington Books, 2015. Actualmente es Profesor visitante en el Departamento de Estudios del Pacífico del Centro Universitario de Ciencias Sociales y Humanidades de la Universidad de Guadalajara. En 2014 la Universidad Juárez Autónoma de Tabasco le otorgó el Premio Juchimán de Plata por su trayectoria académica en el tema de Seguridad Nacional.";
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
                this.universidad = "Frei Universität Berlin";
                this.profesion = "";
                this.descripcion = "Marianne Braig es profesora de ciencias políticas en el Instituto de América Latina (LAI), en la Universidad Libre de Berlín. De 2003 a 2006, fue directora del mismo Instituto. De 1997 a 2002 fue profesora de relaciones internacionales en la facultad de ciencias políticas en la Universidad de Joham Wolfgang Goethe. Además ha sido profesora visitante en otros países como Chile, México y Brasil. Desde 1977, Marianne Braig viaja regularmente a América Latina con fines de investigación y enseñanza. Especialmente visita la Universidad Nacional Autónoma de México, donde también estudió. Sus intereses de investigación incluyen: la segmentación de género en el mercado laboral, la política social comparativa y la transformación y el desarrollo en América Latina. Desde 2002, es directora científica del Centro para la Promoción de la Mujer y Estudios de Género de la Universidad Libre. ";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("6A"));
                break;
            case 65:
                this.nombre = "Jean";
                this.apellidos = "Rivelois";
                this.universidad = "Estudios Superiores en Ciencias Sociales";
                this.profesion = "";
                this.descripcion = "Miembro del Instituto de Investigación para el desarrollo. Doctor por la Escuela de Estudios Superiores en Ciencias Sociales. Ha realizado estancias de investigación en México y Brasil. Entre sus temas de investigación se encuentra las políticas de gobernanza frente a las connivencias entre actores criminales e institucionales, la corrupción y la violencia utilizada por actores criminales, las políticas públicas de lucha contra la corrupción, las políticas de seguridad: entre eficacidad y legitimidad. Algunas de sus  publicaciones son: “Droga, corrupción y metamorfosis política (comparación entre México y Brasil)” (1999); “Droga y poder (de México al paraíso)” (1999); “La transformación de espacios urbanos ventrales: riesgos, desafíos y estrategias en un contexto de desarrollo sostenido urbano” (2007); “Margen social y territorial en Mérida (México)” (2008).";
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
                this.eventos = new ArrayList<String>(Arrays.asList("7A"));
                break;
            case 78:
                this.nombre = "Pierre";
                this.apellidos = "Salama";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("7A","12A"));
                break;
            case 79:
                this.nombre = "Alexis";
                this.apellidos = "Saludjian";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("7A","12A"));
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
                this.apellidos = "Bökser Liewerant";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "Judit Bökser Liwerant estudió la licenciatura en Sociología y Ciencia Política en la Universidad Hebrea de Jerusalén, la maestría en Ciencia Política en la misma universidad y el doctorado en Ciencias Políticas en la Universidad Nacional Autónoma de México. Ha sido Jefa de la División de Estudios de Posgrado de la Facultad de Ciencias Políticas y Sociales y Coordinadora del Nuevo Programa de Posgrado en Ciencias Políticas y Sociales de la UNAM. También es directora asociada de la Revista Mexicana de Ciencias Políticas y Sociales. Es miembro de numerosas instituciones académicas y agrupaciones científicas nacionales e internacionales, entre ellas en el Comité de Ciencias Sociales del Consejo Nacional de Ciencia y Tecnología y en el Consejo Académico del Centro para los Estudios Universitarios de la Cultura Judía, de Universidad Hebrea de Jerusalén. Algunas de las publicaciones más importantes de la Dra. Bökser son: Léxico de la política (2000); Encuentros y Alteridad. Vida y Cultura judía en América Latina (1999); y “Cárdenas y los Judíos: entre el Exilio y la Inmigración” artículo escrito en Canadian Journal of Latin American and Caribbean Studies (1996). Las áreas de investigación en donde se ha desarrollado Judith Bökser son: teoría política, modernidad, minorías y cuestión nacional, judaísmo contemporáneo, identidades colectivas y ciudadanía, procesos de globalización. \n";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17A","17F"));
                break;
            case 108:
                this.nombre = "Jaime Antonio";
                this.apellidos = "Preciado Coronado";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "Doctor en Estudios Latinoamericanos con especialidad en Geografía y Ordenación Territorial, por la Universidad de Paris III. Profesor-Investigador del Departamento de Estudios Ibéricos y Latinoamericanos en la Universidad de Guadalajara. Fundador  del Centro de Estudios Latinoamericanos por invitación de Manuel Rodríguez Lapuente, y el Centro de Estudios Ibéricos y Latinoamericanos.\n\n" +
                        "Fue becario del gobierno francés entre 1985 y 1991 y logró mención honorífica en las tesis de maestría y de doctorado. Entre otros reconocimientos ha recibido estímulos a la docencia y al desempeño académico en la U de G, desde 1989. Es miembro del Grupo de Liderazgo Académico: Democracia e Integración en América Latina, desde 1997 a la fecha. Así como miembro del Sistema Nacional de Investigadores, Nivel 2, desde 1992. Fue galardonado con el premio “Cátedra México” (2010), otorgado por la Universidad de Toulouse, Francia y por el Consejo Europeo de Investigaciones sobre América Latina (CEISAL). Entre sus obras se encuentra como coordinador del Número doble del Anuario de la Integración Latinoamericana y Caribeña 2006-2007 (2010). Además de Las elecciones estadounidenses de cara a las Américas, (2009), en coedición con Ignacio Medina.";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17A", "22A", "25C"));
                break;
            case 109:
                this.nombre = "Joachim";
                this.apellidos = "Michel";
                this.universidad = "Universität Bielefeld";
                this.profesion = "";
                this.descripcion = "El Dr. Joachim Michael es profesor e investigador del departamento de Estudios Iberoamericanos de la Universidad de Bielefeld  en Alemania. Efectuó sus estudios en filología portuguesa, historia y economía en  Lisboa y Río de Janeiro. Realizó la tesis titulada \"El punto de inflexión de la Televisión: las telenovelas latinoamericanas doctorándose en lenguas romances por la Universidad de Friburgo de Brisgovia. Fue catedrático de medios de comunicación, literatura y cultura iberoamericana en la Facultad de Humanidades  de la Universidad de Hamburgo, además de ser profesor invitado del Departamento de Lenguas Modernas en el Centro Universitario de Ciencias Sociales y Humanidades de la Universidad de Guadalajara de 2008 a 2015.\n\n" +
                        "Entre otras de sus publicitaciones se pueden señalar “Telenovela de culto. De la TV a la Modernidad” (2003); \"México como melodrama: sobre la santidad en una era post-sagrada\" (2006); \"El pasaje intermedial de los géneros\" (2006); \"Sobre la imaginación audiovisual en México: de la cine-nación a la tele-nación\" (2008); \" Experiencia brasileña? La visión de Flusser de una edad post-alfabética” (2009); \"Globalización: la telenovela conquista al mundo y el mundo conquista a la telenovela\" (2009); \"México pos-apocalíptico\" (2012); \"Los jóvenes y las Maras en Centroamérica: del olvido al terror\" (2013); \"Narco-violencia y literatura en México\" (2013) y “La violencia y la edad: ¿jóvenes y juventud en el cine mexicano contemporáneo?” (2015).";
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
                this.apellidos = "Cordera Campos";
                this.universidad = "Universidad Nacional Autónoma de México (UNAM)";
                this.profesion = "";
                this.descripcion = "Es licenciado en Economía por la UNAM, con estudios de posgrado en la London School of Economics. Ha sido nombrado por la UNAM profesor emérito y Doctor Honoris Causa por la UAM. Es investigador del Sistema Nacional de Investigadores. Actualmente es coordinador del Programa Universitario de Estudios del Desarrollo, colaborador semanal del periódico La Jornada, miembro del consejo editorial de la revista ECONOMÍAunam de la UNAM y miembro del Instituto de Estudios para la Transición Democrática y de la Academia Mexicana de Economía Política. Además, es presidente de la Fundación Pereyra, A.C. y director de la revista Configuraciones.\n" +
                        "Entre sus publicaciones se encuentran: México frente a la crisis. Hacia un nuevo curso de desarrollo, Manifiesto Lineamientos de política para el crecimiento sustentable y la protección social universal (2012); México La disputa por la nación perspectivas y opciones de desarrollo (2010); y  Pobreza, desigualdad y exclusión social en la Ciudad del Siglo XXI, en coordinación con Patricia Ramírez Kuri y Alicia Ziccardi (2009).";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17B"));
                break;
            case 112:
                this.nombre = "Sarah";
                this.apellidos = "Crorona Berkin";
                this.universidad = "Universidad de Guadalajara";
                this.profesion = "";
                this.descripcion = "Sarah Corona Berkin obtuvo su doctorado en Comunicación por la Universidad Católica de Lovaina, Bélgica, y ahora es miembro del Sistema Nacional de Investigadores (SNI), nivel III. Ha impartido clases en varias universidades de México y del extranjero como en la Universidad de Guadalajara; la Universidad Autónoma Metropolitana; la Universidad de Florida en Gainsville, Estados Unidos; y la Universidad de Bielefeld, en Alemania. Sus investigaciones versan sobre los campos de la comunicación escrita y en imágenes en distintos grupos sociales, la educación intercultural y la comunicación, la educación indígena, así como la lectura en distintos grupos sociales.\n\n" +
                        "Obtuvo el “Gold Addy Award” (2006) de la American Advertising Federation por el Calendario Intercultural Wixárika y Mención Honorífica del Premio al Mejor Libro de Antropología e Historia 2007 (CONACULTA/INAH) por Entre voces… Fragmentos de educación “entre-cultural”.";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17C", "20D"));
                break;
            case 113:
                this.nombre = "Gilda";
                this.apellidos = "Waldman";
                this.universidad = "Universidad Nacional Autónoma de México (UNAM)";
                this.profesion = "";
                this.descripcion = "Gilda Waldman realizó la maestría y doctorado en Sociología en la Facultad de Ciencias políticas y Sociales en la UNAM y defendió el doctorado en la especialización en estudios judaicos en la Universidad Latino-americana. La Dra. Gilda Waldman tiene entre sus publicaciones el libro Melancolía y utopía. La reflexión de la Escuela de Frankfurt en torno a la crisis de la cultura (1999), Memorias (in)cognitas: contiendas en la Historia. Waldman fue coordinadora de la Maestría y Doctorado en Sociología de la División de Estudios de Posgrado (UNAM) y posteriormente responsable de la Maestría en Estudios Políticos y Sociales (UNAM). Es miembro del Sistema Nacional de Investigadores y del Comité Académico del Programa de Posgrado en Ciencias  Políticas y Sociales (UNAM). Waldman ha colaborado en ensayos, traducciones, críticas literarias de la Revista de la Universidad, y de Casa del Tiempo, así como en otros periódicos. Además es socia en el programa de Radio UNAM Tras las huellas de los libros, autores y lectores.";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17C","17F","32F"));
                break;
            case 114:
                this.nombre = "Paulina";
                this.apellidos = "Martínez Gómez";
                this.universidad = "Universidad de Guadalajara";
                this.profesion = "";
                this.descripcion = "La Dra. Paulina Martínez González, es docente e investigadora de la Universidad de Guadalajara en el Departamento de Estudios sobre Movimientos Sociales y de la Maestría en Ciencia Política del Centro Universitario de la Ciénega. Pertenece al Sistema Nacional de Investigadores (nivel I) y como profesora del Centro Universitario de Ciencias Sociales y Humanidades imparte cátedra de Ecología Política y de Enfoques Teóricos de la Ciencia Política.\n" +
                        "Entre algunas de sus publicaciones podemos señalar: \"Cultura política, emociones y democracia. El movimiento por el 28 de Mayo en Guadalajara\" (2006); \"Impactos de la contaminación del Río Santiago en el bienestar de los habitantes de El Salto, Jalisco Espacio Abierto\" (2009); “La lucha por la justicia ambiental en Jalisco: Un Salto de Vida, por la defensa del Santiago” (2010); \"Semblanza de un conflicto ambiental. San Francisco de Ixcatán, en defensa de la vida, la naturaleza y la cultura\"(2012); \"Participación ciudadana y desarrollo democrático\" (2013); \"Límites y posibilidades de la participación política en las democracias contemporáneas. Reflexiones sobre el caso mexicano\" (2013); \"La pesca artesanal en Jalisco. Conflictos en torno a la conservación biocultural y la reproducción del capital. El caso de Careyitos\" (2014); \"Redes y relaciones en la vida social de los ocotlenses\" (2014).";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17D"));
                break;
            case 115:
                this.nombre = "Robert";
                this.apellidos = "Boyer";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "Economista francés de la escuela de la regulación. Estudió en varias escuelas prestigiosas como la Escuela Politécnica en Francia  y el Instituto de Estudios Políticos de París, también llamado Sciences Po. Rober Boyer ha realizado distintas actividades académicas y administrativas como: economista en el Centro para la Investigación Económica y  sus Aplicaciones (CEPREMAP),  Director de estudios de la Escuela de Estudios Superiores en Ciencias Sociales; miembro del comité ejecutivo de la Society for the Advancement of Socio-Economics  y miembro  del comité de dirección de la Asociación Francesa de Ciencia Económica. Sus principales publicaciones son:  Acumulation, inflation, crises (Acumulación, inflación, crisis) (1978); La teoría de la regulación: una análisis crítico (1989); L'après-fordisme (El posfordismo) (1993); y  The Future  of Economic Growth (El futuro del Crecimiento Económico) (2004).";
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
                this.descripcion = "Teun A. van Dijk fue profesor de Estudios del Discurso en la Universidad de Amsterdam hasta el 2004, y actualmente es profesor en la Universitat Pompeu Fabra de Barcelona. Después de sus trabajos en poética generativa, gramática del texto y la psicología del procesamiento del texto, su investigación desde principios de los años 80 toma una perspectiva más crítica la cual trata la reproducción del racismo en el discurso, las noticias en la prensa, la ideología, el conocimiento y el contexto. Autor de varios libros en esas áreas y también ha editado The Handbook of Discourse Analysis (4 vols., 1985), el libro introductorio Discourse Studies (2 vols., 1997; la nueva edición de un volumen, 2011) así como The Study of discourse (5 vols., 2007). Por otra parte, ha fundado seis revistas internacionales, Poetics, Text (ahora Text and Talk), Discourse & Society, Discourse Studies, Discourse & Communication, y la revista de Internet Discurso & Sociedad (www.dissoc.org), de las cuales aún dirige las últimas cuatro. \n" +
                        "Sus últimos libros en inglés son Ideology (1998), Racism and Discourse in Spain and Latin America (2005), Discourse and Context (2008), Society and Discourse (2009) y Discourse and Knowledge (2014). Sus últimos libros editados son Racism at the top (2000, con Ruth Wodak) y Racism and Discourse in Latin America (2009). En la actualidad, está trabajando en un nuevo libro sobre discurso y conocimiento. Teun A. van Dijk, que tiene tres doctorados honoris causa, ha dado conferencias en muchos países, sobre todo en América Latina. Fundó con Adriana Bolivar la Asociación Latino-americana de Estudios del Discurso (ALED) en 1995";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("32L"));
                break;
            case 119:
                this.nombre = "Thomas";
                this.apellidos = "Brussig";
                this.universidad = "Universidad Libre de Berlín";
                this.profesion = "";
                this.descripcion = "Una de las grandes voces de la generación posterior al cambio político en Alemania, compartirá el humor y sátira de sus obras. Nació en 1964 en Berlín, en el lado Este. Realizó estudios de sociología en la Universidad Libre de Berlín, y de dramaturgia para cine y televisión en la Escuela Konrad Wolf, en Potsdam-Babelsberg. Desde 1995 es escritor independiente. Brussig debutó con su primera novela Wasserfarben, en 1991. Su éxito se dio en 1995 con su novela sobre la reunificación alemana, Helden wie wir (Héroes como nosotros), a la que le siguió en 1999, Am kürzeren Ende der Sonnenallee (La avenida del sol). Los dos libros fueron llevados al cine. En 2015 publicó el libro Das gibt´s in keinem Russenfilm. Brussig trabaja con sátira y de diversas maneras los acontecimientos del Este en sus novelas. Sus libros se han traducido a 28 idiomas y ha recibido distintos premios.";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("32M"));
                break;
            case 120:
                this.nombre = "Alexander";
                this.apellidos = "Peer";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "Ofrece su visión como escritor independiente y crítico literario. Nació en 1971, en Salzburgo; estudió alemán, filosofía y periodismo. Trabaja como escritor independiente, lector y director de talleres de escritura, además de algunos programas de radio (Ö1). Ocasionalmente escribe reportajes, críticas para todo tipo de revistas y periódicos. Es miembro del PEN Club de Austria. Cuenta con numerosas publicaciones en antologías y revistas literarias en Austria, Alemania y Suiza. Ha participado en más de cien lecturas en festivales, en casas la literatura y bibliotecas en Austria, y en muchos países europeos. Por su trabajo ha recibido varios premios y becas.";
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
                this.descripcion = "Nacido en Trois-Rivières, Quebec, en 1955, Bernard Pozier, poeta, director literario de la editorial Écrits des Forges, vicepresidente de la Casa de Poesía de Montréal y miembro del Consejo Académico del festival Letras en la mar, ha colaborado desde 1989 en intercambios de poesía entre México y Quebec. \n" +
                        "En Quebec, Francia y en otros países, participó en varias actividades así como en el Encuentro de Poetas del Mundo Latino en la Ciudad de México, Oaxaca, Morelia, Aguascalientes y San Luis Potosí.  También fue invitado al Festival Cervantino de Guanajuato, al Festival Letras en la Mar de Puerto Vallarta, a la Feria del Libro del Palacio de Minería, a la Feria del libro de Toluca y a la Feria Internacional del Libro de Guadalajara.\n" +
                        "Por una parte, redactó para varias editoriales, el prólogo de poetas quebequenses  publicados en México,  como Gatien Lapointe, Gaston Miron, Paul-Marie Lapointe, Claude Beausoleil, etc. Por otra parte, tradujo textos de diferentes poetas mexicanos en revistas como “Lèvres urbaines”, “Estuaire” y “Exit,” así como en la Antología de Poesía Mexicana de Claude Beausoleil. Escribió también artículos sobre autores mexicanos en revistas y periódicos de Quebec.\n" +
                        "Bajo su dirección la casa editorial “Les Écrits des Forges” ha publicado más de 200 libros bilingües de poetas mexicanos y quebequenses.\n" +
                        "Premio de la revista francesa Levée d’encre en 1988 con “Ces traces que l’on croit éphémères” \n" +
                        "Reconocimiento y la medalla del estado de Aguascalientes en 2012 durante el XIV Encuentro de Poetas del Mundo Latino, por su labor en la  traducción y difusión de la poesía mexicana en Quebec \n" +
                        "2013 recibió el primer Premio de Calaveritas del Consulado de México en Montreal.\n" +
                        "Libros publicados de poesía, ensayos y antologías en español se encuentran: \n" +
                        "Las pirámides del corazón, Mantis / CONARTE/ Écrits des Forges, 2008 (bilingüe)\n" +
                        "Carnets de México /Postales de México, Les heures bleues / Secretaría de Cultura de la Ciudad de México, (Fotografías de Javier Valdés), 2009 (bilingüe) \n" +
                        "15 poetas de Quebec, Mantis / CONARTE / Écrits des Forges, 2008";
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
                this.descripcion = "Maestro y Doctor en Educación por la Universidad de Harvard. Profesor de la Universidad de Guadalajara, Investigador Nacional Nivel III, Miembro de la Academia Mexicana de Ciencias y Jefe del Departamento de Estudios de la Comunicación Social de la Universidad de Guadalajara.  Especialista en temas de recepción de audiencias y educomunicación. Coordinador General de la Cátedra UNESCO-UdeG sobre Alfabetización Mediática e Informacional; Co-Coordinador Internacional del Observatorio Iberoamericano de Ficción Televisiva (OBITEL) y Coordinador en México del Grupo de Estudios de Recepción de la Asociación Mexicana de Investigadores de la Comunicación (AMIC), de la cual es socio fundador. Última publicación: (Re)invención de géneros y formatos de la ficción televisiva (Globo Universidade, 2016).";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(19));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 164:
                this.nombre = "Fabiola";
                this.apellidos = "Alcalá";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "Doctora en Comunicación Audiovisual por la Universidad Pompeu Fabra de Barcelona. Tiene un Master en Teoría y Práctica del Cine Documental por la Universidad Autónoma de Barcelona.  Actualmente trabaja como profesora investigadora en el Departamento de Estudios de la Comunicación Social, del CUCSH, en la Universidad de Guadalajara. Sus líneas de investigación son: el análisis fílmico, la ética informativa en medios audiovisuales, las teorías de las imágenes y la televisión contemporánea.";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("19A"));
                break;
            case 165:
                this.nombre = "Maricela";
                this.apellidos = "Portillo";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "Doctora en Comunicación Audiovisual por la Universidad Autónoma de Barcelona, miembro del Sistema Nacional de Investigadores y Ex-presidenta de la Asociación Mexicana de Investigadores de la Comunicación. Líneas de investigación: Estudios de Juventud y Comunicación, y Comunicación Política: espectacularización de la información política e infoentretenimiento. Actualmente coordina el Doctorado en Comunicación en la Universidad Iberoamericana. ";
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
                this.descripcion = "Jefe del Departamento de Sociología, CUCSH, UdeG. \n" +
                        "Profesor investigador en el Departamento de Estudios sobre Movimientos Sociales (DESMOS).\n" +
                        "Doctor en Ciencias Sociales por el Colegio de Jalisco. \n" +
                        "Está involucrado en la investigación de la cultura política y la construcción social de la democracia en Jalisco, sobre todo con respecto al papel que en ello desempeñan los jóvenes. Es autor del libro: Y sin embargo se mueve. Juventud y cultura(s) política(s) en Guadalajara; y coordinador del libro Los movimientos sociales en Jalisco: entre la tradición y la (post)modernidad. Ha publicado además diversos artículos y capítulos de libro, entre los que destacan los siguientes: “(Re)pensar el desacato. Nuevas formas de movilización social en México”; “Nombrar es crear: una aproximación a la construcción de lo juvenil en México”; “Las imágenes del poder y el poder de las imágenes. La construcción institucional de la juventud en Jalisco”; entre otros. \n" +
                        "Coordinador de Producción y Miembro del Consejo de Producción del Programa de radio \"Diálogos del Pensamiento\".";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20A"));
                break;
            case 169:
                this.nombre = "Ramón";
                this.apellidos = "Gómez Zamudio";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "Profesor-Investigador en el Depto. de Estudios Ibéricos y Latinoamericanos\n" +
                        "Maestría en Antropología Social por la Universidad de Arizona\n" +
                        "Coordinador de la Sección de Estudios Latinoamericanos de la Western Social Sciences Association\n" +
                        "Coordinador del Diplomado en Estudios Latinoamericanos del DEILA\n" +
                        "Coordinador de Extensión del Colegio Departamental del DEILA\n" +
                        "Profesor de Teoría Política, Antropología Social y Filosofía Latinoamericana en el CUCSH. Conductor del programa radiofónico del CUCSH \"Diálogos del Pensamiento\", transmitido por Radio Universidad de Guadalajara y Miembro del Consejo de Producción  del mismo.";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20A"));
                break;
            case 170:
                this.nombre = "Almendra Cristal";
                this.apellidos = "Orozco Barranco";
                this.universidad = "Universidad de guadalajara";
                this.profesion = "";
                this.descripcion = "Egresada de la Licenciatura en Historia de la Universidad de Guadalajara. \n" +
                        "Diplomada en Locución por el Departamento de Imagen y Sonido del CUAAD. \n" +
                        "Desde el 2008 es Productora del programa radiofónico del CUCSH “Diálogos del Pensamiento”, transmitido por Radio Universidad de Guadalajara, y desde 2012 conductora del mismo.\n" +
                        "Miembro del Consejo de Producción de “Diálogos del Pensamiento”.";
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
                this.universidad = "Universidad de Guadalajara";
                this.profesion = "";
                this.descripcion = "Es Licenciado en Psicología, por la Universidad de Guadalajara. Maestro en Educación con Especialidad en Desarrollo Cognitivo, por el Instituto Tecnológico y de Estudios Superiores de Monterrey. Doctor en Ciencias del Comportamiento, opción Neurociencias de la Universidad de Guadalajara.\n" +
                        "Desde 1995 es académico adscrito al Departamento de Neurociencias del Centro Universitario de Ciencias de la Salud de la Universidad de Guadalajara.\n" +
                        "Como profesor universitario, ha tenido a su cargo la elaboración curricular e impartición de diversos cursos, entre ellos: Psicobiología, Funciones Cerebrales Superiores, Ciencia Cognitiva, Psicolingüística evolutiva, Bases Biológicas de la Actividad Psíquica e Inteligencia Artificial, en diversas dependencias de la Universidad de Guadalajara. \n" +
                        "En investigación se ha desarrollado en el área de exposición prenatal a sustancias de abuso, el deterioro de las habilidades matemáticas, en la evaluación del perfil neuropsicológico de los sujetos con epilepsia y en la identificación de mitos sobre la psicología. \n" +
                        "Ha fungido como Presidente de la Academia de Neurociencias Cognitivas y Coordinador de Docencia del Departamento de Neurociencias del Centro Universitario de Ciencias de la Salud de la Universidad de Guadalajara.\n" +
                        "Ha colaborado como divulgador de la ciencia en el periódico “El Occidental” en la sección de “Ciencia y Salud” de 1992 al 2012; en la estación “Jalisco Radio”, 96.3 de FM, del Sistema Jalisciense de Radio y Televisión con el programa “La Manzana de Newton” del 2003 al 2013; es colaborador de la revista “Replicante; y ocasionalmente ha colaborado en “La Gaceta Universitaria”, el órgano de comunicación oficial de la Universidad de Guadalajara.";
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
                this.descripcion = "Noemí Gómez es académica – investigadora del Departamento de Psicología, Educación y Salud, del Instituto Tecnológico y de Estudios Superiores de Occidente (ITESO). Estudió la licenciatura en Psicología, posteriormente la maestría en Investigación Educativa y el doctorado en Estudios Científico Sociales. Es miembro del Sistema Nacional de Investigadores. Sus  preocupaciones académicas han girado en torno a la pregunta sobre los actores sociales, en particular sobre sus diferenciales de actoría. En esta línea, ha tenido acercamiento con diversos sujetos: docentes, directores, estudiantes, niños en situación de calle, indígenas mixtecos, indígenas huicholes, habitantes de colonias populares y personas con intento de suicidio. Sus trabajos de investigación han girado alrededor de la conformación de la identidad, las formas simbólicas, la capacidad de agencia y las emociones sociales. Ha publicado también algunos trabajos sobre la investigación de corte interpretativa. Algunas de sus principales obras: Habitar el lugar imaginado. El libro: “Formas de construir la ciudad desde un proyecto educativo político”; ha publicado diversos capítulos y artículos como: “La intervención socio educativa. Cuando se juega en la cancha del otro“, “La propuesta pedagógica de Paulo Freire”, “Identidad docente. Vida personal – vida profesional”, “La investigación educativa: del sectarismo a la diversidad teórica y metodológica”, “Esperanza y capacidad de agencia”, “El sufrimiento y el compromiso social”, “identidad y memoria colectiva”, “Los mixtecos sobre la vía del tren”, entre otras.";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20D"));
                break;
            case 177:
                this.nombre = "Monique";
                this.apellidos = "Landesmann";
                this.universidad = "Universidad de París";
                this.profesion = "";
                this.descripcion = "Licenciada en Ciencias (Universidad de París).\n" +
                        "Maestra en Medicina Social (Universidad Autónoma Metropolitana-Xochimilco)\n" +
                        "Doctora en Letras y Ciencias Sociales con especialidad en Ciencias de la Educación por la Universidad de París X. \n" +
                        "Profesora de tiempo completo del Proyecto de Investigación Curricular de la Facultad de Estudios Superiores-Iztacala de la Universidad Nacional Autónoma de México (UNAM); del posgrado de Pedagogía, y del doctorado de Psicología de la UNAM. Su principal línea de investigacion es \"Identidades académicas dentro del campo de investigación de los académicos mexicanos\". Tiene publicaciones en revistas y libros. Ha realizado estancias de investigación en la Universidad Humboldt de Berlín, la Universidad de París X y la Universidad de Buenos Aires. Es miembro del Consejo Mexicano de Investigación Educativa y del Sistema Nacional de Investigadores, nivel I.";
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
                this.descripcion = "Es  químico farmacéutico biólogo e hizo estudios de la Maestría en Enseñanza e Historia de la Biología de la Facultad de Ciencias, ambas en la UNAM. \n" +
                        "Desde 1990 trabaja en la Dirección General de Divulgación de la Ciencia de la UNAM, de cuya planta académica forma parte, y donde se ha dedicado a la divulgación científica por escrito. Colaboró en los proyectos del museo de ciencias Universum y el Museo de la Luz, de la UNAM. Es autor de varios libros de divulgación científica y hasta 2008 fue editor de libros y del boletín El muégano divulgador.\n" +
                        "Ha sido  profesor de la Facultad de Ciencias de la UNAM y la Escuela de Periodismo Carlos Septién García. Ha colaborado regularmente en varias revistas (Milenio, Cambio, Los universitarios) y periódicos (La Jornada, Crónica, Reforma). Actualmente escribe la columna semanal “La ciencia por gusto”, que aparece los miércoles en Milenio Diario (puede consultarse en el blog lacienciaporgusto.blogspot.com), además de escribir mensualmente la columna “Ojo de mosca” para la revista ¿Cómo ves?, de la UNAM. Ha colaborado también en el canal ForoTV y en los programas de radio Imagen en la Ciencia e Imagen Informativa, de Grupo Imagen, Hoy por hoy, de W Radio, y actualmente “Ecléctico”, en la estación de radio por internet Código Radio, del Gobierno del DF, con cápsulas de ciencia. En 2004 se publicó su libro La ciencia por gusto, una invitación a la cultura científica  (Paidós). Desde 2013 es miembro del comité editorial de la revista de divulgación científica Hypatia, del Consejo de Ciencia y Tecnología del Estado de México (CCyTEM).\n" +
                        "En 2005 recibió la Distinción Universidad Nacional para Jóvenes Académicos en el área de Creación Artística y Extensión de la Cultura.\n" +
                        "Ha impartido cursos de divulgación escrita y periodismo científico en casi todos los Estados de la República.\n";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20H"));
                break;
            case 185:
                this.nombre = "Juan";
                this.apellidos = "Nepote";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "Nació en 1977 en la ciudad de Guadalajara (México). Estudió Física y desde 1999 se ha dedicado a la divulgación científica en museos, revistas, diarios y programas radiofónicos, labor por la cual en 2008 obtuvo el Premio de Ciencia, Tecnología e Innovación de Jalisco. Es miembro del comité editorial del Journal of Science Communication y socio titular de la Sociedad Mexicana para la Divulgación de la Ciencia y la Técnica. Ha trabajado como docente de secundaria, preparatoria y licenciatura de una serie de materias que, no por variopinta, debería pasar por exótica: Temas selectos de Física, Cálculo diferencial e integral, Introducción a la Física y la Química, Matemáticas, Cultura mexicana, Museología científica, Lengua y cultura italianas, Lectura y comprensión, Fotografía, entre otras. Ha sido becario de la American Association of Museums y del Fondo Nacional para la Cultura y las Artes de México, además de involucrarse en la creación y dirección de museos interactivos y exposiciones de ciencia y tecnología en varias regiones de la República mexicana. Promotor y fundador del Coloquio Internacional de Cultura Científica en la Feria Internacional del Libro de Guadalajara, escribe una página dominical sobre temas de ciencia y sociedad en los diarios La Jornada Jalisco y La Jornada Michoacán, además de una columna mensual en la revista Ciencia y Desarrollo, editada por el Consejo Nacional de Ciencia y Tecnología de México. Es autor de Más allá del océano. Ciencia y ciudadanos en Jalisco y Trieste, y de Almanaque. Historias de ciencia y poesía, traducido al portugués y publicado en Brasil por la Editorial de la Universidad de Campinas";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20H"));
                break;
            case 186:
                this.nombre = "Pablo";
                this.apellidos = "Gentili";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "Doctor en Educación en la Universidad de Buenos Aires. Reside en Brasil desde hace más de 20 años, donde es profesor de la Universidad del Estado de Río de Janeiro (UERJ). Actualmente, ejerce como secretario ejecutivo del Consejo Latinoamericano de Ciencias Sociales (CLACSO).\n" +
                        "Ha sido director de la Facultad Latinoamericana de Ciencias Sociales (FLACSO), Sede Brasil (2010-2014). Coordina el Observatorio Latinoamericano de Políticas Educativas (OLPED). Entre el 2001 y el 2010, ha sido Secretario Ejecutivo del Consejo Internacional del Foro Mundial de Educación.\n" +
                        "Desde 1999, miembro de la Carrera de Investigador del Consejo Nacional de Investigaciones Científicas de Brasil (CNPq). Investigador categoría 1.\n" +
                        "Ha dictado de conferencias y cursos de posgrado en instituciones académicas de  España, Estados Unidos, Canadá, Alemania, Francia, Suecia, Inglaterra, Noruega, Finlandia, Suecia, Portugal, Italia, Senegal, Líbano, Brasil, Uruguay, Chile, Argentina, Colombia, Venezuela, México, Perú, Ecuador, Honduras, Guatemala, Nicaragua, Cuba, Costa Rica, El Salvador, República Dominicana, Panamá, Bolivia, Puerto Rico, y Haití.\n" +
                        "Líneas de investigación: Reformas Educativas en América Latina; Políticas Educativas Comparadas; Educación y Ciudadanía; Filosofía Política de la Educación; Desigualdad, Pobreza y Políticas Educativas.\n\n" +
                        "\tAutor y compilador de más de 25 libros en el campo de las políticas educativas y los estudios sobre exclusión social en América Latina y el Caribe. Sus libros han sido publicados en Argentina, Brasil, México, España, Venezuela e Italia. \n" +
                        "Es miembro de numerosos consejos editoriales y ha publicado más de 80 artículos en revistas académicas de diversos países del mundo. Como Secretario Ejecutivo y Coordinador Académico de CLACSO ha dirigido la publicación de más de 300 libros en diversos campos de las ciencias sociales en más de 20 países y en acuerdo con más de 30 editoriales académicas y comerciales. Dirige la Colección Antologías del Pensamiento Social Latinoamericano y Caribeño, compuesta por 50 obras de referencia.\n\n" +
                        "\tDirige la Revista Crítica y Emancipación y es colaborador del periódico español, El País, donde firma el blog Contrapuntos.\n" +
                        "Ha coordinado proyectos de desarrollo científico, social, cultural y educativo financiados por el Banco Mundial, la UNESCO, la Agencia Sueca de Desarrollo Internacional, la Agencia Noruega de Desarrollo, el Banco Interamericano de Desarrollo, la Fundación Ford, la Fundación Konrad Adenauer, la Fundación Carolina (España), la Organización de Estados Iberoamericanos y la Unión Europea, además de diversos Ministerios de Educación, Cultura y Desarrollo Social de América Latina.";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20H"));
                break;
            case 187:
                this.nombre = "Alfonso Enrique";
                this.apellidos = "Islas Rodríguez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "Es Doctor en Ciencias Biomédicas por la UNAM. Profesor Investigador Titular C de la Universidad de Guadalajara. Profesor del Posgrado en Ciencias Biomédicas CUCS-CUCBA, con registro en el Padrón de Excelencia del CONACyT.  Profesor de la Maestría en Comunicación de la Ciencia y la Cultura con registro en el Padrón de Excelencia del CONACyT, del ITESO. Miembro del Sistema Nacional de Investigadores de 1985 a 1997. Ha publicado más de 50 artículos científicos en Revistas nacionales e internacionales. Fue Jefe del Departamento de Biología Celular y Molecular en 1994-1995,  Director de la División de Ciencias Biológicas 1995-1998, Jefe de Investigación y Posgrado de la de la UdeG de 1998 a 2000. Columnista de: Siglo 21 (1993). Armario de El Occidental1995-2000), MURAL del grupo REFORMA (2000-2009). Ha publicado en diferentes revistas culturales como Complot, Tragaluz, Replicante, Luvina y en otras académicas como Renglones (ITESO). Intereses: Ciencia, Cine, Literatura. Películas favoritas Movie-Art: Métropolis-Fritz Lang.";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("20I"));
                break;
            case 188:
                this.nombre = "Juan";
                this.apellidos = "Delval Merino";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "Catedrático de Psicología Evolutiva y de la Educación; ha sido profesor en la Universidad Complutense de Madrid, en la Universidad Autónoma de Madrid, en la Universidad Nacional de Educación a Distancia y ha impartido clases y conferencias en numerosos países. En la Universidad de Ginebra fue alumno de Jean Piaget y Bärbel Inhelder. Desde hace muchos años estudia el desarrollo del pensamiento en niños y adolescentes y sus aplicaciones a la educación.";
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
                this.nombre = "Álvaro Ballardo";
                this.apellidos = "Márquez Fernández";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "Graduado en Filosofía en 1975. Cuenta con dos Maestrías, en Historia de la filosofía por la Universidad de Sorbona Paris I en 1986 y  en la Universidad Del Zulia en el Programa de Filosofía en 1987 respectivamente. Es Doctor por la Universidad de Sorbona Paris I en Historia de la Filosofía (1993). \n" +
                        "Es profesor invitado de las universidades de Pamplona, el País Vasco, Navarra, Santiago de Compostela, Galicia, Miguel de Cervantes de Valladolid (Universidades Españolas), así como de la Universidad de Colima, México; Saint Louis, Bruselas; Federico II de Nápoles de Italia; Universidad Nacional de Costa Rica y la Experimental de Guayana. Es coinvestigador de la red Insumisos Latinoamericanos (México), Portal brasileño de Filosofía y Filosofía de la Educación y el Repertorio de Filósofos Iberoamericanos de Estados Unidos. Es miembro del consejo editor de más de 25 revistas nacionales e internacionales. Solo en los últimos 5 años, ha publicado 50 artículos científicos y capítulos de libros.\n" +
                        "Entre sus líneas de investigación se encuentran:\n" +
                        "Filosofía, Estética, Sociedad, Historia, América Latina\n" +
                        "Filosofía Política Latinoamericana\n" +
                        "Interculturalidad y razón Epistémica en América Latina\n" +
                        "Literatura y Violencia en América Latina";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("22B"));
                break;
            case 193:
                this.nombre = "Jorge Alonso";
                this.apellidos = "Sánchez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "Tiene doctorado en Antropología y es Profesor Investigador Emérito en el CIESAS Occidente. Ha sido profesor en postgrados en Ciencias Sociales en las Universidades Iberoamericana, Escuela Nacional de Antropología e Historia, Universidad Autónoma Metropolitana, Universidad Nacional Autónoma de México.";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("22B"));
                break;
            case 194:
                this.nombre = "Guillermo de la Peña";
                this.apellidos = "Topete";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "Es doctor en Antropología Social por la Universidad de Manchester (Reino Unido).\n\n" +
                        "Es miembro de la Academia Mexicana de Ciencias y del Sistema Nacional de Investigadores. Fue director fundador del Centro de Estudios Antropológicos de El Colegio de Michoacán (1979-1984) y de la Unidad Occidente del Centro de Investigaciones y Estudios Superiores en Antropología Social, CIESAS, (1987-1997).\n\n" +
                        "Ha sido profesor e investigador en varias universidades mexicanas y extranjeras, y consultor de instituciones académicas y fundaciones internacionales. Recibió el Premio Nacional de Investigación Urbana y Regional (1990), el Premio Jalisco en el área de ciencia (1993), la Beca Guggenheim (1994-1995) y, asimismo, ha obtenido apoyos para realizar investigación por parte de varias instituciones públicas, fundaciones y agencias académicas nacionales e internacionales.\n\n" +
                        "Sus intereses de investigación versan sobre las transformaciones del campesinado en México y América Latina, la cultura política de los sectores populares urbanos, las relaciones interétnicas, y las políticas sociales y culturales hacia los indígenas en el ámbito latinoamericano. Es autor de más de 150 publicaciones científicas. Su libro más reciente es Culturas indígenas de Jalisco (2006).";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("22C"));
                break;
            case 195:
                this.nombre = "Brahiman";
                this.apellidos = "Saganogo";
                this.universidad = "Universidad de Guadalajara";
                this.profesion = "";
                this.descripcion = "(Costa de Marfil), es Doctor en Letras por la Universidad de Guadalajara, y Maestro ès Lettres, especialidad en Literatura Hispanoamericana por la Universidad Cocody-Abidjan. Ha pronunciado conferencias,  presentado ponencias en varios congresos nacionales e internacionales sobre literatura y semiótica, e impartió clases en otras Universidades del extranjero como Profesor invitado.\n" +
                        " Es autor de varios artículos en revistas científicas de ámbito nacional e internacional, de capítulos de libros en tanto en México como en el extranjero, y del libros: “Elementos textuales en Crónica de una muerte anunciada de Gabriel García Márquez, Variaciones analíticas, La autobiografía: la notación gráfica del yo, Jardín de la retórica. Prolegómenos a un estudio de las figuras de estilo,  y de muchos otros inéditos.\n" +
                        "Es crítico literario y artístico, y semiótico; Profesor-Investigador Titular del Departamento de Filosofía de la Universidad de Guadalajara (México), y miembro del Sistema Nacional de Investigadores (SNI), de la Asociación Internacional de Semiótica (AIS) y miembro fundador de la Red Iberoamericana de Estudios sobre Oralidad (RIEO) y es Perfil Promep.";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(23));
                this.eventos = new ArrayList<String>(Arrays.asList(""));
                break;
            case 196:
                this.nombre = "Gonzalo";
                this.apellidos = "Santonja Gómez-Agero";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "Director General del Instituto Castellano y  Leonés de la Lengua, catedrático de  literatura española de la Universidad Complutense de Madrid y diplomado en  documentación, es autor de diversos libros de investigación de carácter socioliterario, entre los que destacan Del lápiz rojo al lápiz libre (1986), La república de los libros (1989), Un poeta español en Cuba (1994), Al otro lado del mar (1996), La insurrección literaria (2000), obras por las que ha obtenido, entre otros, los premios Ortega y Gasset (1990) y Nacional de Ensayo (1995), Poeta (Por la noche, 1997 y 2000); Paradizos, 2001), narrador (Incierta memoria de las tempestades y el  terremoto de 1680. Verídica historia de sus destructores efectos, así como del extraño caso que sucedió en Lisboa, 1988 y 1998; siete lugares, 2002), colaborador frecuente de prensa y Premio Pemán de artículos, por el conjunto de su obra  ha recibido el Premio castilla y León de las Letras (1995) y el Teresa de Ávila (1997). Asesor de diversas entidades y fundaciones, coordina el Premio  de Poesía “Jaime Gil de Biedma” de la Diputación de Segovia y ha impulsado varias iniciativas editoriales. Sus últimas obras han sido Los signos de la noche, donde traza la historia del libro republicano durante la guerra (Castalia, Madrid); la reedición, ampliada y corregida, de Museo de niebla, sobre la historia y los avatares del patrimonio histórico-artístico y bibliográfico de Castilla y León; los papeles y los días, antología de sus artículos de prensa (Salamanca, Fundación Salamanca, 2005) y, entre otras, Nueve pueblos singulares (2010). De última aparición, por Editorial Everest: Luces sobre la época oscura (el toreo a pie en el siglo XVII). ";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(23));
                this.eventos = new ArrayList<String>(Arrays.asList("23E"));
                break;
            case 197:
                this.nombre = "Anne Folger";
                this.apellidos = "Staples Dean";
                this.universidad = "El Colegio de México";
                this.profesion = "";
                this.descripcion = "Es Doctora en Historia por El Colegio de México. Desarrolla las líneas de investigación: Historia de la educación/Educación mexicana de \n" +
                        "1810 a 1860; sus estudios versan sobre la historia de la educación, minería, Iglesia y de las mujeres en el siglo XIX.  Ha impartido diversos seminarios para el doctorado en Historia, así como el curso de Historia de la Educación en México en la Licenciatura en Pedagogía de la Universidad Nacional Autónoma de México. Entre sus publicaciones se encuentran: \n" +
                        "- El siglo XIX mexicano.\n" +
                        "- Historia de la vida cotidiana, 2004.\n" +
                        "- La educación de las mujeres en la historia de México. México, Universidad Pedagógica Nacional.\n" +
                        "- La iglesia en la primera república federal mexicana: 1824-1835, México, Secretaría de Educación Pública, 1976. (Sepsetentas, 237).\n" +
                        "- Educar: Panacea de una nueva nación. Antología. México, Secretaría de Educación Pública, 1985, 2ª. Ed. 1998. \n" +
                        "- “Panorama educativo al comienzo de la vida independiente”, en Ensayos sobre la historia de la educación en México, México, El Colegio de \n" +
                        "México, 2ª. Edición 1985.";
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
                this.descripcion = "Nació el 8 de diciembre de 1970 en Baracaldo (Vizcaya, España), estudió Derecho, aunque se dedicó profesionalmente a la literatura. \n" +
                        "Es colaborador de prensa, escritor de fictions y crítico de arte, actividades que le han valido numerosos galardones tales como el Premio Planeta, el 14 de octubre de 2004 obtuvo el Premio Nacional de Narrativa, tras ganar el año anterior el Premio Primavera de Novela Desde septiembre de 2010 dirige y presenta en Intereconomía Televisión el programa \"Lágrimas en la lluvia.\n" +
                        "En 1998, la prestigiosa revista The New Yorker lo seleccionó como uno de los seis escritores menores de treinta y cinco años más importantes de Europa, junto a los alemanes Marcel Beyer e Ingo Schulze, a la francesa Marie Darrieussecq, al británico Lawrence Norfolk y al ruso Viktor Pelevin.11\n" +
                        "Es autor de relatos como: Un mundo especular y otros relatos (1991); Una temporada en Melchinar, (1994); Coños (1994); El silencio del patinador ( 1995).\n" +
                        "Ha publicado las novelas: Las máscaras del héroe (1996); La tempestad (1997); Las esquinas del aire: en busca de Ana María Martínez Sagi (2000); La vida invisible (2003); El séptimo velo, (2007); Me hallará la muerte (2012), obras que evidencian su gran originalidad como resultado de su audacia imaginativa y su deslumbrante uso del lenguaje.";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("23B"));
                break;
            case 201:
                this.nombre = "Bernardo";
                this.apellidos = "Barranco Villafán";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "Es sociólogo y especialista en creencias religiones y cultura.\n" +
                        "Desde su formación comprendió que el reto religioso es acoger y llevar a cabo un discernimiento sobre la voluntad de Dios en la realidad social. Como estudiante de economía, en los años posteriores a la gran renovación eclesial que fue el Concilio Vaticano II, participó en iniciativas progresistas de reflexión universitaria. Esto lo llevó a su primer trabajo profesional en una organización de desarrollo rural. Pero desde entonces, Bernardo sostuvo una tenaz colaboración en diversos movimientos de reflexión cristiana. Crecer con otros ha sido la marca distintiva de su trayectoria En los años ochentas realizó una labor más específica como Secretario General de movimientos internacionales de estudiantes católicos en Perú, Francia y Suiza. Fueron 10 años de interacción con las jerarquías eclesiales en todo el mundo que le permitieron conocer muchos aspectos de su funcionamiento. En esta época también se especializó en sociología de la religión.\n" +
                        "A su regreso a México, con una visión acorde a los nuevos tiempos y a sus exigencias, estuvo nueve años como subdirector de la Fundación de Desarrollo Rural y otros nueve en las fundaciones Invertir, Procura y Vamos. Para el cambio de siglo, su compromiso abarcó un nuevo giro: la participación de la ciudadanía en la acción gubernamental. Los próximos 10 años, asumió el cargo de Consejero electoral propietario en el Instituto Electoral del Estado de México y  posteriormente del IFE en el mismo estado. Entre uno y otro  cargo, coordinó el Dictamen Ciudadano, un proyecto social de observación electoral. Su experiencia y visión en este campo es invaluable. ";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("23C"));
                break;
            case 202:
                this.nombre = "Marina";
                this.apellidos = "Ruano Gutiérrez";
                this.universidad = "Universidad de Guadalajara";
                this.profesion = "";
                this.descripcion = "Es profesora e Investigadora del departamento de Letras de la Universidad de Guadalajara, México, Perfil Promep, imparte clases de  Literaturas peninsular hispanoamericana, de la Edad media, de los Siglos de Oro; Historias de América y de España, y de Literaturas románicas y desarrolla líneas afines.\n" +
                        "Ha participado en congresos y coloquio tanto a nivel nacional como internacional y publicado artículos en revista de circulación nacional e internacional.";
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
                this.apellidos = "Chávez Ramírez";
                this.universidad = "Universidad de Guadalajara";
                this.profesion = "";
                this.descripcion = "Médico Cirujano y Partero por U de G. 1980. Maestría en Salud Pública por U de G. 1986. Maestría en Gestión de la Calidad de los Servicios de Salud. Univ de Murcia, España. 2004. Doctorante de Economía de la Salud. UNED, España 2013. Profesor Investigador Titular C. CUCS-Ude G. Coordinador del Cuerpo Académico 463-UDG \"Calidad y Seguridad de los Servicios de Salud\". Jubilado de la Secretaría de Salud como Médico Especialista. 2012.\n\n" +
                        "Dr. José Elías García Ortiz\n" +
                        "Jefe de laboratorio de diagnóstico bioquímico de enfermedades lisosomales en la División de Genética del Centro de Investigación Biomédica de Occidente (CIBO), CMNO-IMSS y miembro del Grupo de Expertos en Enfermedades Lisosomales (GEEL) del IMSS .\n" +
                        "Médico Cirujano (Facultad de Medicina, Universidad Autónoma de Coahuila – Unidad Torreón); Master y Doctor en Genética Humana, Centro Universitario de Ciencias de la Salud. Universidad de Guadalajara. Estancia postdoctoral en el Laboratory of Genetics, National Institute on Aging, National Institutes of Health, Baltimore, Maryland, USA. Certificado vigente como médico especialista en Genética Humana por el Consejo Mexicano de Genética A.C (2010-2015). Pertenece al Consejo Mexicano de Genética A.C. (vocal), la Asociación Mexicana de Genética Humana (socio), the American Society of Human Genetics (socio) y a la Sociedad Mexicana de Medicina Genómica (socio).\n" +
                        "Investigador Nivel II en el Sistema Nacional de Investigadores, CONACYT e Investigador Titular A en el IMSS. Ha participado en múltiples congresos y foros nacionales e internacionales. Ha publicado más de 30 artículos indexados en el área de la genética clínica y molecular. Sus principales áreas de interés son el estudio y el diagnóstico de enfermedades raras, particularmente enfermedades lisosomales.";
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
                this.descripcion = "Profesora investigadora del Departamento de Desarrollo Social de la Universidad de Guadalajara. Profesora del Diplomado Derechos de los niños en ITESO";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("24D"));
                break;
            case 218:
                this.nombre = "Fernanda Gil";
                this.apellidos = "Lozano";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "Fue diputada nacional por la Coalición Cívica y actualmente integra el Frente Renovador. Es profesora de Historia (UBA) y magíster en Sociología y Análisis Cultural (Unsam). Trabaja activamente en temas relacionados con el combate a la trata de personas";
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
                this.universidad = "Universität Bielefeld";
                this.profesion = "";
                this.descripcion = "El Dr. Olaf Kaltmeier es miembro del Departamento de historia ibérico y latinoamericana de la Universidad de Bielefeld. Obtuvo su doctorado en sociología por la Universidad de Muenster. Ha impartido clases en la Universidad Andina Simón Bolívar-Quito, y en la Universidad Católica de Temuco. Es miembro de la junta editorial de la revista PERIPHERIE. Entre sus recientes publicaciones se encuentra: Marichiweu - Diez veces vamos a prevalecer. Una reconstrucción del actual movimiento mapuche en Chile a partir de la dialéctica de la dominación y la resistencia desde la Conquista (2004), Neoliberalismo, autonomía y resistencia (con Jens Kastner y Elisabeth Tuider) (2004), Etnicidad y poder en los países andinos (con Christian Büschges y Guillermo Bustos) (2007), Jatarishun. Testimonios de la lucha indígena de Saquisilí (2008). Sus intereses de investigación versan sobre: etnicidad, movimientos sociales, antropología social, estudios culturales y procesos de transnacionalización en Ecuador, Chile y Bolivia. En especial se centra en la formación, imaginación y performatividad de el Estado en el mundo andiano; movimientos indígenas en América Latina y la transformación de las culturas políticas; espacio y la identidad de la política en las Américas; estudios del desarrollo; culturas urbanas y la mercantilización de la ciudad; geografías visuales; intersecciones de clases y etnicidad en el siglo 20 en las Américas.";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17B"));
                break;

            case 320:
                this.nombre = "Stefan";
                this.apellidos = "Peters";
                this.universidad = "Universitäte Kassel";
                this.profesion = "";
                this.descripcion = "El Dr. Stefan Peters ha sido académico visitante en varias universidades: en el Instituto de Estudios Sociales y Políticos de la Patagonia de la Universidad Nacional de la Patagonia San Juan de Bosco en Comodoro Rivadavia Argentina; en la Universidad Andina Simón Bolívar en Quito; y  Instituto de Altos Estudios Sociales de la Universidad Nacional de San Martín (UNSAM) en Buenos Aires. En 2014 obtuvo el Premio Georg-Foster por sus logros académicos sobresalientes. Desde el 2008 es investigador en la Universidad de Kassel. Entre sus intereses de investigación se encuentran: las compañías de pensiones; (Neo) extractivismo; las políticas sociales y la educación y la desigualdad social; los movimientos sociales; teorías del desarrollo; temas que ha estudiado en América Latina, principalmente Venezuela, Uruguay, Ecuador, Argentina y en España. ";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17B"));
                break;
            case 321:
                this.nombre = "Federico";
                this.apellidos = "Finchelstein";
                this.universidad = "The New School for Social Research";
                this.profesion = "";
                this.descripcion = "Federico Finchelstein es Profesor Asociado de Historia en The New School School for Social Research en Eugene Lang College de la misma universidad. Ha enseñado en el Departamento de Historia de Brown University y recibió su Ph.D. de Cornell University.\n\n" +
                        "El profesor Finchelstein es autor de cuatro libros sobre fascismo, el Holocausto y la historia judía en Latinoamérica y Europa. Su último libro, Transatlantic Fascism (Fascismo Trasatlántico: 2010), estudia las conexiones globales entre el fascismo italiano y el argentino. Ha publicado más de cincuenta artículos académicos y reseñas sobre fascismo, populismo latinoamericano, genocidio y antisemitismo en publicaciones en inglés, español, francés, portugués e italiano, tanto en obras colectivas como en revistas especializadas en Estados Unidos, Reino Unido, Bélgica, Italia, España, Israel, Brasil y Argentina. También ha sido colaborador de los diarios de mayor circulación de Estados Unidos, Europa y Latinoamérica, incluyendo The New York Times, The Guardian, International Herald Tribune, Medipart (Francia), Clarín y Folha de S. Paulo.";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("17C"));
                break;
            case 322:
                this.nombre = "Ludger";
                this.apellidos = "Pries";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "El Dr. Luger Pries actualmente es el titular de la Cátedra Humboldt en el Colegio de México. Su trabajo académico versa sobre transnacionalización, migración y comparación internacional. Se concentra en los “entramados sociales” (Elias) entre actores (personas, organizaciones e instituciones societales), buscando entender y explicar tanto las configuraciones de diversidades y desigualdades, como los mecanismos sociales de su (re)producción y cambio, basándose, sobretodo, en los trabajos de Max Weber, Georg Simmel, Alfred Schütz, Peter L. Berger/Thomas Luckmann, Norbert Elias, Ulrich Beck y retoma, entre otros, los aportes de William Thomas, Anthony Giddens, Pierre Bourdieu, Richard Scott, John W. Meyer y Peter Hedström/Richard Swedberg. Sus trabajos  pueden catalogarse como sociología crítica orientada hacia la praxis social y por la utopía concreta transcendente (Bloch/Joas).";
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
                this.universidad = "Universidad de Guadalajara";
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
           case 391:
                this.nombre = "Carlos";
                this.apellidos = "Barba Solano";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("22C"));
                break;
           case 392:
                this.nombre = "Zulay";
                this.apellidos = "Díaz";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("22D"));
                break;
            case 393:
                this.nombre = "Miriam";
                this.apellidos = "Cárdenas";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("22D"));
                break;
            case 394:
                this.nombre = "David";
                this.apellidos = "Velasco";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("22D"));
                break;
            case 395:
                this.nombre = "Hermilo";
                this.apellidos = "López-Bassols";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("36A"));
                break;
            case 396:
                this.nombre = "Teresa";
                this.apellidos = "Pérez Rodríguez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("36A"));
                break;
            case 397:
                this.nombre = "Beatriz Nadia";
                this.apellidos = "Pérez Rodríguez";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("36A"));
                break;
            case 398:
                this.nombre = "Roberto";
                this.apellidos = "Peña Guerrero";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("36A"));
                break;
            case 399:
                this.nombre = "Miguel Alejandro";
                this.apellidos = "Hijar Chiapa";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("36A"));
                break;
            case 400:
                this.nombre = "Trinidad";
                this.apellidos = "Padilla López";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("36A"));
                break;
            case 401:
                this.nombre = "Santiaga";
                this.apellidos = "Anima Puentes";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("36A"));
                break;
            case 402:
                this.nombre = "Jorge Alberto";
                this.apellidos = "Quevedo Flores";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("36A"));
                break;
            case 403:
                this.nombre = "Enriqueta";
                this.apellidos = "Serrano Caballero";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("36A"));
                break;
            case 404:
                this.nombre = "Laura";
                this.apellidos = "Ibarra";
                this.universidad = "";
                this.profesion = "";
                this.descripcion = "";
                this.eventos_organizador = new ArrayList<Integer>(Arrays.asList(0));
                this.eventos = new ArrayList<String>(Arrays.asList("36A"));
                break;

        }
    }
}
