package ccv.checkhelzio.filacademica;

import java.util.ArrayList;

/**
 * Created by check on 19/10/2016.
 */

public class Eventos {
    private int id_evento;
    private int id_cartel;
    private String titulo;
    private String subtitulo;
    private ArrayList<Ponentes> listaCoordinadores;
    private ArrayList<Fecha> listaFecha;
    private String descripcion;

    public Eventos(int id_evento, ArrayList<Fecha> fechas) {
        this.id_evento = id_evento;
        setDatos(id_evento);
    }

    public int getId_cartel() {
        return id_cartel;
    }

    public void setId_cartel(int id_cartel) {
        this.id_cartel = id_cartel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {return subtitulo;}

    public void setSubtitulo(String subtitulo) {this.subtitulo = subtitulo;}

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getId_evento() {return id_evento;}

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public ArrayList<Ponentes> getListaCoordinadores() {return listaCoordinadores;}

    public void setListaCoordinadores(ArrayList<Ponentes> listaCoordinadores) {this.listaCoordinadores = listaCoordinadores;}

    public void setDatos(int datos) {
        switch (datos){
            case 1:
                this.id_cartel =  R.drawable.cartel1;
                this.titulo = "Coloquio Gobernanza y Democracia en América Latina";
                this.subtitulo = "Carta Democrática";
                this.descripcion = "";
                break;
            case 2:
                this.id_cartel =  R.drawable.cartel2;
                this.titulo = "Encuentro de Literaturas Originarias de América";
                this.subtitulo = "";
                this.descripcion = "";
                break;
            case 3:
                this.id_cartel =  R.drawable.cartel3;
                this.titulo = "II Seminario Internacional ASPEN-FIL";
                this.subtitulo = "Relaciones Bilaterales México y Estados Unidos en perspectiva";
                this.descripcion = "El panorama político en ambos lados de la frontera entre México y Estados Unidos plantea una compleja serie de desafíos legales, sociales, económicos y diplomáticos; la manera en que éstos sean enfrentados en el corto plazo por uno y otro Estado definirá el curso de las relaciones bilaterales en los próximos años. The Aspen Institute México y la FIL reunirán a reconocidos académicos,  diplomáticos y especialistas en el II Seminario Internacional ASPEN-FIL, que será un atractivo núcleo de reflexión, análisis y perspectiva en torno a estos temas de relevancia internacional.";
                break;
            case 4:
                this.id_cartel =  R.drawable.cartel4;
                this.titulo = "Coaliciones políticas";
                this.subtitulo = "¿Solución del régimen político mexicano?";
                this.descripcion = "";
                break;
            case 5:
                this.id_cartel =  R.drawable.cartel5;
                this.titulo = "Aportaciones y limitaciones del Sistema Nacional Anticorrupción";
                this.subtitulo = "";
                this.descripcion = "";
                break;
            case 6:
                this.id_cartel =  R.drawable.cartel6;
                this.titulo = "Diálogo La Unión Europea";
                this.subtitulo = "¿El fin de un sueño? Terrorismo, migración, derechas y el Brexit";
                this.descripcion = "";
                break;
            case 7:
                this.id_cartel =  R.drawable.cartel7;
                this.titulo = "Conferencia Magistral ";
                this.subtitulo = "";
                this.descripcion = "";
                break;
            case 8:
                this.id_cartel =  R.drawable.cartel8;
                this.titulo = "Diálogo Buenos gobiernos locales";
                this.subtitulo = "";
                this.descripcion = "";
                break;
            case 9:
                this.id_cartel =  R.drawable.cartel9;
                this.titulo = "Tv Morfosis: “La nueva medición de las audiencias: audímetro vs tuitómetro";
                this.subtitulo = "";
                this.descripcion = "McLuhan decía que la tecnología prolonga las facultades humanas psíquicas o físicas, es una extensión del ser humano. La realidad virtual, encierra a la perfección esta tesis. Estamos acostumbrados a transformar la realidad, ahora empezaremos a crearla y vivirla. Smartphone, gafas VR, publicidad, periodismo, videojuegos, videos de 360°, aplicaciones y un sinfín de cosas están revolucionando con la realidad virtual. Cada 15 años llega un elemento al mercado y lo cambia todo: la computadora personal, el Internet, el Smartphone, ¿Será la realidad virtual el próximo elemento?";
                break;
            case 10:
                this.id_cartel =  R.drawable.cartel10;
                this.titulo = "Homenaje a Enrique Florescano Mayet";
                this.subtitulo = "";
                this.descripcion = "";
                break;
            case 11:
                this.id_cartel =  R.drawable.cartel11;
                this.titulo = "Homenaje póstumo a Teodoro González de León";
                this.subtitulo = "";
                this.descripcion = "";
                break;
            case 12:
                this.id_cartel =  R.drawable.cartel12;
                this.titulo = "Diálogo Magistral entre Pierre Salama y Theotonio Dos  Santos Alexis Saludjian";
                this.subtitulo = "Relaciones de América Latina";
                this.descripcion = "";
                break;
            case 13:
                this.id_cartel =  R.drawable.cartel13;
                this.titulo = "Comentario al libro No siembro para mí: biografía de Adolfo Ruiz Cortines, de " +
                        "Miguel Alemán Velasco";
                this.subtitulo = "";
                this.descripcion = "";
                break;
            case 14:
                this.id_cartel =  R.drawable.cartel14;
                this.titulo = "Presentación de la Colección Ensayística Liberal";
                this.subtitulo = "Obra de Enrique Krauze sobre Democracia";
                this.descripcion = "";
                break;
            case 15:
                this.id_cartel =  R.drawable.cartel15;
                this.titulo = "VI Foro Internacional sobre Migración y Desarrollo";
                this.subtitulo = "Migrantes en tránsito";
                this.descripcion = "";
                break;
            case 16:
                this.id_cartel =  R.drawable.cartel16;
                this.titulo = "VI Seminario de Relaciones Internacionales";
                this.subtitulo = "América Latina: Momentos de Cambio";
                this.descripcion = "América Latina ha sido escenario de transformaciones importantes en los últimos años. Desde el restablecimiento de relaciones diplomáticas entre Cuba y Estados Unidos hasta la firma de la paz entre el gobierno colombiano y las Fuerzas Armadas Revolucionarias de Colombia, pasando por la intensificación del problema de seguridad en Centroamérica y el juicio político a la presidenta Dilma Rousseff en Brasil. Así pues, y en sintonía con la 30 edición de la Feria Internacional del Libro de Guadalajara, la cual tiene como invitada de honor a la región, el VI Seminario de Relaciones Internacionales está dedicado a América Latina.\n\n" +
                        "Especialistas mexicanos y extranjeros de primer nivel discutirán la problemática latinoamericana actual en dos mesas, precedidos por una presentación magistral sobre los cambios recientes en la región. En la primera mesa, dedicada a América Central y Cuba, se abordarán temas como el crimen organizado, la economía y la migración en el istmo centroamericano, así como la situación política actual de Cuba. La segunda mesa está dedicada a América del Sur, y en ella se tratarán las coyunturas económico-políticas de cuatro países importantes de la región: Argentina, Brasil, Colombia y Venezuela.";
                break;
            case 17:
                this.id_cartel =  R.drawable.cartel17;
                this.titulo = "XXX Encuentro Internacional de Ciencias Sociales";
                this.subtitulo = "Dimensiones de la crisis en América Latina";
                this.descripcion = "La crisis es uno de los signos preeminentes de la modernidad. El desarrollo científico, tecnológico e industrial se acelera de una manera sin precedentes en la historia. Al mismo tiempo, el progreso no cumple con todas sus promesas. A pesar de los muchos avances, los conflictos, en vez de desaparecer, se incrementan. Por consiguiente, los desastres aparecen como una eventualidad inminente. Esta situación límite, en que se suspende el orden establecido, es la crisis, en la cual el curso a seguir se convierte en un problema.\n\n" +
                        "\tEl evento internacional se propone discutir la crisis como una característica de la actualidad, tanto en Europa como en América Latina y en otras partes del mundo. Reuniendo investigadores de México y de Alemania, el coloquio pretende discutir la variedad del fenómeno en el caso latinoamericano. Si la crisis en esa región deriva de la experiencia moderna, ella también presenta rasgos particulares, propios de la modernidad latinoamericana. El tema son las causas y tendencias que el fenómeno manifiesta en esta región. En parte, sus críticas provienen de problemas estructurales, como la desigualdad y representan legados históricos que se retoman a la época de la Colonia. Otras crisis son efectos de transformaciones ambientales, no pocas veces provocadas por dinámicas sociales y económicas. Las identidades colectivas establecen relaciones de tensión con alteridades y diferencias sociales. Al mismo tiempo, el coloquio analiza las estrategias y propuestas latinoamericanas de superación de las crisis, por lo tanto, se discutirán conceptos como igualdad política, formas de solución de conflictos, mecanismos de adaptación a transformaciones ambientales en curso y acciones para prevenir catástrofes, así como propuestas inclusivas de identidad y aceptación de otredades.";
                break;
            case 18:
                this.id_cartel =  R.drawable.cartel18;
                this.titulo = "Encuentro de Literaturas Originarias de América";
                this.subtitulo = "";
                this.descripcion = "";
                break;
            case 19:
                this.id_cartel =  R.drawable.cartel19;
                this.titulo = "XX Seminario Internacional Comunicación y Sociedad";
                this.subtitulo = "Entre el conocer y el reconocerse. Las cine-tele-videncias de las culturas contemporáneas en un mundo de migraciones";
                this.descripcion = "En un escenario creciente de migraciones y diásporas múltiples entre países y civilizaciones, el registro audiovisual sigue siendo central como lenguaje expresivo y de reconocimiento en las culturas del mundo. Más allá de un mero video o una simple película, lo audiovisual constituye un documento vital para la reconstitución de las culturas en movimiento, aún más en la era digital, que facilita el flujo de programas por el mundo entero en segundos.  El lugar como origen o destino y el género como identificación primaria se vuelven claves para entender el ir y venir contemporáneos. Fenómeno manifiesto que se intensifica,  lo mismo  para públicos de países de América Latina, como México, que para audiencias locales y de la diáspora Asiática o Africana en países Europeos, con los cuales el Profesor Philippe Meers ha desarrollado sus investigaciones.\n\n" +
                        "Desde  la investigación colectiva –comparada de públicos contemporáneos e históricos de diferentes países como  México,  Nigeria,  Turquía,  Bélgica o Marruecos,  y su relación con productos audiovisuales locales, nacionales y globales,  el  Dr. Meers presenta de manera comparativa, resultados y preguntas que  contribuyen a  la comprensión del vínculo del movimiento de las culturas contemporáneas con  sus registros  audiovisuales.";
                break;
            case 20:
                this.id_cartel =  R.drawable.cartel20;
                this.titulo = "XX Encuentro Internacional de Investigación Educativa y I Encuentro Internacional de Comunicación Pública de la Investigación Educativa " +
                        "Educar en América Latina";
                this.subtitulo = "";
                this.descripcion = "México y América Latina en general, tienen ya una larga y productiva tradición en materia de investigación educativa en todos los ámbitos y niveles. Sin embargo, siguen siendo insuficientes los esfuerzos para hacer comunicación social, es decir, divulgación de los resultados y hallazgos de los estudios que año con año se realizan. Por lo general, la labor del investigador científico termina cuando se hace difusión, para un público especializado, del nuevo conocimiento que se ha generado, y son pocos los académicos que dedican además parte de su tiempo para buscar llevarlo al ciudadano no especializado.\n\n" +
                        "Esta insuficiente comunicación social de la investigación en América Latina no aqueja solamente a la investigación educativa, sino que es un problema que se puede observar en las Ciencias Sociales en general. Mientras que la mayoría de los divulgadores de ciencia son científicos cuya formación proviene de las ciencias naturales o las ciencias físicas, son verdaderamente escasos aquellos que realizan esta labor y tienen su origen en las ciencias sociales y las humanidades.\n\n" +
                        "Este Vigésimo Encuentro Internacional de Investigación Educativa, que ahora se realiza articulado con el Primer Encuentro Internacional de la Comunicación Pública de la Investigación Educativa pretende abordar a la divulgación de la investigación educativa en América Latina, sus problemas, presencias y ausencias, así como analizar los perfiles de quienes realizan esta labor en nuestro especial contexto histórico, cultural y social que nos caracteriza.\n\n" +
                        "En concordancia con el espíritu de ambos encuentros que aquí concurren, el análisis es serio y profundo, pero el tratamiento es accesible a todo el público y el formato empleado para ello se aleja de las mesas de exposición tradicional de los típicos eventos académicos, para dar lugar a espacios de diálogos entre el público y los expertos quienes a la vez son experimentados divulgadores, de manera que no solamente se puedan exponer puntos de vista, sino que se propicie la interacción entre participantes, así como entre participantes y asistentes, a propósito de los temas analizados.";
                break;
            case 21:
                this.id_cartel =  R.drawable.cartel21;
                this.titulo = "XXIV Encuentro Internacional de Educación a Distancia y III Encuentro internacional de Educación y Cultura en Ambientes Virtuales Desafíos de la cultura digital en América Latina";
                this.subtitulo = "";
                this.descripcion = "La transformación cultural que inició con la emergencia de las tecnologías de información y comunicación sigue su curso y abarca todo tipo de prácticas humanas, y no obstante su desarrollo exponencial, su expansión no ha seguido el mismo ritmo en cuanto a cobertura social y geográfica. Las diferencias en el  acceso, usos  y formas de apropiación, han generado nuevas problemáticas en campos de conocimiento tradicionales y emergentes. La institución escolar en todos sus niveles se ha visto sacudida, y enfrenta los desafíos culturales de diferentes maneras, de ahí la importancia de hacerlos visibles y compartir las experiencias. \n\n" +
                        "América Latina, por su diversidad cultural y sus marcadas diferencias sociales, representa un campo rico en contrastes y en desarrollo creativo de la cultura digital. \n\n" +
                        "El III Encuentro Internacional de Educación y Cultura en Ambientes Virtuales invita a una reflexión profunda sobre las implicaciones de la Cultura digital en América Latina, disponiendo un marco de análisis que integra los logros de la Educación a Distancia para la transformación educativa en la región y los nuevos desafíos que la modalidad enfrenta, lo cual será motivo de análisis en el  XXIV Encuentro sobre esta modalidad.\n\n" +
                        "La cultura digital es un campo de reflexión que contiene al mismo tiempo: los problemas y las respuestas, los obstáculos y las oportunidades, las limitaciones y las estrategias.";
                break;
            case 22:
                this.id_cartel =  R.drawable.cartel22;
                this.titulo = "XVI Encuentro Internacional sobre Cultura Democrática";
                this.subtitulo = "Las Encrucijadas Democráticas de América Latina";
                this.descripcion = "Las coyunturas por las que atraviesan los países y sociedades latinoamericanas, con sus flujos y reflujos políticos, constituyen un punto de partida para reflexionar sobre el presente y el futuro de la democracia en esta región del mundo. Los dilemas no son pocos, recorren la economía, la política y la cultura de conglomerados caracterizados por historias específicas, por la diversidad, la polarización social y la búsqueda de alternativas políticas de naturaleza democrática. \n\n" +
                        "Con la participación de connotados académicos, este Encuentro tiene por objeto ahondar en el análisis de las tendencias prevalecientes y de los derroteros posibles para la vida democrática en nuestro continente.";
                break;
            case 23:
                this.id_cartel =  R.drawable.cartel23;
                this.titulo = "IX Foro Internacional Interdisciplinario de Investigaciones Filológicas";
                this.subtitulo = "Monjas, alumbradas y visionarias en América Latina";
                this.descripcion = "En la paz de los conventos, las llamas de la inquietud. En la paz de los conventos, la llama de la inquietud y los temblores del desasosiego interior. Y  la experiencia religiosa, explica José C. Nieto (Juan de Valdés y los orígenes de la Reforma en España e Italia. México, Fondo de Cultura Económica, 1979), como fuente de conocimiento, con las Sagradas Escrituras leídas de un modo abierto: “Os certifico”, afirma Valdés, “que pienso que sentiría más fastidio y me ofenderían más los Evangelios cuando los hallase conformes en todo y por todo sin que discrepasen en modo en cosa ninguna, que hallándolos como los hallo, que al parecer son disconformes en algunas cosas”, sometidos a las fragilidades e inconsistencias, a los errores en suma de cualquier obra humana. \n\n" +
                        "Este planteamiento, que enseguida prendió intramuros de los centros religiosos, determinó una respuesta vigilante, con los miembros del Santo Oficio en estado de alerta contra toda suerte de herejías, más, muchas más, de cuántas en principio pudieran suponerse. \n\n" +
                        "Y es que además de las alumbradas (Isabel de la Cruz, Magdalena de la Cruz, María de Cazalla, Catalina de la Cruz),sólo en cuanto atañe a los siglos XVI y XVII florecieron diversos movimientos heréticos, desde el abecedarianismo (para salvarse sería necesario no saber leer ni escribir) hasta el quietismo, doctrina formulada por el sacerdote y teólogo Miguel de Molinos, predicador y confesor de monjas, condenado a por la Inquisición a cadena perpetua, que postulaba la pasividad y la vida contemplativa, con su propagación por América ocupando un capítulo de nota, especialmente por el apartado de brujas, magas,  hechiceras y por mujeres que sencillamente sintieron la necesidad de rebasar las bardas conventuales para entregarse de lleno al azar y las aventuras.\n\n" +
                        "Ese fue el caso, por ejemplo, de Catalina de Erauso, la Monja Alférez, que después de salir mal parada en una contienda  con una hermana mayor, doña Catharina Alizi, viuda “muy robusta”, aprovechó un descuido, mientras la comunidad rezaba maitines, para ir “abriendo las puertas, que eran doze”, del convento de las dominicas de San Sebastián y echarse de momento al monte para protagonizar después una vida de prodigios que la llevó hasta Sevilla y desde Sevilla a las Indias, caracterizada de varón, para abrirse paso en infinidad de trances difíciles y en no pocas batallas de amor, así en Trujillo, como en Lima, Concepción, Tucumán, Potosí, La Plata, Pischobamba, Cuzco o Callao, para regresar a España, ya convertida en famosa, y peregrinar hasta la Santa Sede y besar los pies del Sumo Pontífice y volver definitivamente a la Nueva España (1630), autorizada por el Rey y por el Papa para vestir y profesar de varón bajo el nombre de Antonio de Erauso, dedicado a la arriería, “con algunos pocos pelillos por bigote”  y con pujos de guapo entre los guapos, al frente de “una gran aria de mulas y negros”. \n\n" +
                        "Ahora bien, ni heterodoxias ni singularidades pueden tapar la evidencia de multitud de monjas, beatas y místicas ortodoxas, muchas de y de gran importancia literaria, empezando por santa Teresa de Jesús y sor Juana Inés de la Cruz, siguiendo por Luisa de Carvajal, Sor María de Jesús de Ágreda, Ana Francisca Abarca de Bolea o Marcela de San Félix,  hija de Lope de Vega y de su amante Micaela Luján, poeta y dramaturga de verso vivo e ingenio mordaz, autora de una autobiografía lamentablemente quemada por disposición de su confesor.\n\n" +
                        "A su vez,  también hay que tener muy presente la trascendencia del universo de  escritoras del Nuevo Mundo puesto de manifiesto, por ejemplo, en La palabra oculta. Monjas escritoras en la Hispanoamérica colonial de Iridi Rossi de Fiori et al (Universidad Católica de Salta, 2008),  y  tampoco cabe dejar en el olvido a personajes tan singulares como la profetisa Lucrecia de León, la ermitaña Catalina de Cardona o la muy rigurosa María de Jesús de Yepes, cofundadora con santa Teresa de la clausura descalza de Alcalá de Henares.\n\n" +
                        "Así pues, este Foro trata de escritoras apasionantes, con especialistas de primer nivel poniendo voz a sus desvelos y logros, los cuales forman parte, enriqueciéndolo, del inmenso patrimonio de la literatura en español. ";
                break;
            case 24:
                this.id_cartel =  R.drawable.cartel24;
                this.titulo = "VIII Encuentro de Género";
                this.subtitulo = "La nueva esclavitud del género";
                this.descripcion = "“La nueva esclavitud del género” se manifiesta de manera real, concreta y tangible al mantener y reforzarlos estereotipos de género para mujeres y hombres, en tanto que da dividendos y privilegios a la economía, a las clases sociales y al sistema neoliberal. Nuestra discusión se centra en analizar cómo el género, en términos de dividendos políticos y económicos, sigue estableciendo desigualdades entre mujeres y hombres, de donde,  el comercio sexual, por ejemplo y en específico la trata de niñas, jóvenes y mujeres, resulta una nueva forma de esclavitud debido, justamente, a que se vuelven a reforzar las conductas dominantes masculinas y la apropiación del cuerpo de las mujeres.\n\n" +
                        "Es así como frente a los afanes liberadores de los cuerpos, se da una convivencia en paralelo con fuertes resistencias que ven, en dicho proceso de liberación, una amenaza a sus privilegios, pues con ello se desestabilizaría el propio sistema capitalista y neoliberal.";
                break;
            case 25:
                this.id_cartel =  R.drawable.cartel25;
                this.titulo = "XVIII Coloquio de Historia México-América Latina";
                this.subtitulo = "Caudillismos en América Latina, siglos XIX y XX";
                this.descripcion = "En el marco de la Feria Internacional del Libro del año 2016, y para continuar con la tradición de establecer un diálogo con el invitado de honor, en este caso América Latina, el Coloquio de Historia, se propone como un espacio en que se exponen diversos enfoques y narrativas de investigación que abordan los caudillismos en América Latina durante los siglos XIX y XX.";
                break;
            case 26:
                this.id_cartel =  R.drawable.cartel26;
                this.titulo = "XII Banquete de FIL - o - Sofía ";
                this.subtitulo = "Filosofía latinoamericana: ¿nuevos rumbos del filosofar?";
                this.descripcion = "América Latina pasa por un momento difícil, si bien ninguna etapa de su historia parece haber sido fácil. Adicionalmente, este momento está enmarcado por una recomposición y efervescencia social global que hace aún más incierto nuestro futuro próximo. En este contexto, adquiere particular relevancia la discusión sobre las herramientas teóricas de las que se pueda echar mano para responder a las exigencias y particularidades de nuestra situación, y en el ámbito filosófico se revive la discusión en torno a los rumbos de la filosofía latinoamericana.\n\n" +
                        "Esta cuestión suscita la pregunta de si la reflexión filosófica es algo que va  o debe ir más allá del contexto social, cultural o ideológico del que surge o está plenamente condicionado por éste, incluso si el propio pensador es consciente de ello o no. Si podemos hablar de una “filosofía” en general, surgida y modelada por el continente europeo que se puede adaptar a distintas situaciones o si, por el contrario, requerimos y de hecho, existe una filosofía propiamente latinoamericana que dé cuenta de nuestros propios procesos sociales, históricos, políticos, científicos, etc.  En esta disyuntiva aparece un amplio espectro de posiciones que van desde los extremos del universalismo que desdeña por completo esta última opción, hasta la de un contextualismo que reivindica un “pensamiento propio” que exige definitivamente una reflexión en una clave “propiamente latinoamericana”. Así, mientras que algunos consideran inminente y necesario desarrollar una perspectiva característicamente latinoamericana que ayude a configurar cuestiones acerca de la identidad local, la justicia, el saber y todas las prácticas sociales, otros señalan que con ello existe el riesgo de caer en un etnocentrismo cerrado ante las posibilidades de ampliar los horizontes hacia otras formas de vida, sensibilidad y mutua comprensión. Al mismo tiempo, ello pone sobre la mesa de discusión otras cuestiones como la del eurocentrismo de la comunidad latinoamericana de filósofos, el papel que tienen las propuestas latinoamericanas en el mundo no latinoamericano y el impacto de la reflexión filosófica en la esfera pública de nuestras propias sociedades.\n\n" +
                        "Desde hace doce años, en el marco de la XX Feria Internacional del Libro de Guadalajara se realiza el Banquete de FIL-O-SOFÍA, que tiene como propósito fundamental reunir a la comunidad filosófica nacional e internacional para reflexionar de forma crítica y profunda sobre temas de actualidad de diversa índole y que son acuciantes en la comprensión del ser humano mismo en su realidad. Para alcanzar tal cometido, se extiende la invitación a participar como “comensales” del pensamiento a especialistas en varias áreas de la filosofía. \n\n" +
                        "En esta ocasión, y en la que la región latinoamericana será la homenajeada central, se convoca a dialogar sobre el tema: Filosofía latinoamericana: ¿nuevos rumbos del filosofar? Con el objetivo primordial de revisar las formas tradicionales con las que se ha distinguido el filosofar latinoamericano, frente a nuevos retos o nuevas alternativas que convendría abordar. De manera específica sabemos que en los últimos años el debate sobre lo que se entiende por filosofía latinoamericana se ha enfocado casi de manera exclusiva al tema de la dominación y la dependencia, se impone sin duda realizar un análisis desde la filosofía que permita cuestionarnos: desde las diversas áreas de la investigación filosófica, ¿En estos temas se agota lo que se conoce como filosofía latinoamericana? ¿Hay nuevas temáticas que es urgente incorporar a la reflexión filosófica latinoamericana? Ante los procesos de globalización ¿sigue teniendo sentido el tema de la desigualdad y la injusticia? Si bien la filosofía no posee un carácter directivo, sí puede arrojar luz para encontrar nuevos caminos en la búsqueda la comprensión de nuestra situación y una prospección de soluciones a tales dificultades. \n\n" +
                        "Con esta propuesta, los estudiosos e interesados en la filosofía en nuestro continente buscarán ampliar sus horizontes respecto de las direcciones, retos, oportunidades y aportes del trabajo filosófico de Latinoamérica para el mundo. Así, tenemos el honor de invitar a personalidades como Rodolfo Arango (Universidad de los Andes),  Ambrosio Velasco Gómez (Universidad Nacional Autónoma de México), Kim Díaz (Universidad de Texas), Santiago Rey (Universidad de los Andes) y Aureliano Ortega Esquivel (Universidad de Guanajuato); todos ellos con enfoques genuinos y con una gran experiencia en diversas áreas de la filosofía en Latinoamérica.";
                break;
            case 27:
                this.id_cartel =  R.drawable.cartel27;
                this.titulo = "XX  Encuentro Internacional de Juristas";
                this.subtitulo = "Nuevas tendencias teóricas del derecho";
                this.descripcion = "";
                break;
            case 28:
                this.id_cartel =  R.drawable.cartel28;
                this.titulo = "V Seminario Internacional de Crítica de Arte";
                this.subtitulo = "Crítica de arte cinco miradas Latinoamericanas.\n" +
                        "Análisis, crítica y la realidad de ser crítico";
                this.descripcion = "El V Seminario Internacional de Crítica de Arte, se inaugura con una conferencia magistral. Durante tres días reúne la opinión y mirada de cinco críticos y expertos en el arte latinoamericano, realidades y retos de lo contemporáneo, más allá de un discurso, reflexionarán sobre la crítica y la práctica de la crítica. Como complemento a las conferencias de expertos, el seminario realiza una master class en torno al ejercer y escribir la crítica.";
                break;
            case 29:
                this.id_cartel =  R.drawable.cartel29;
                this.titulo = "VIII Coloquio Internacional de Cultura Mexicana";
                this.subtitulo = "";
                this.descripcion = "";
                break;
            case 30:
                this.id_cartel =  R.drawable.cartel30;
                this.titulo = "Encuentro de Literaturas Originarias de América";
                this.subtitulo = "";
                this.descripcion = "";
                break;
        }
    }
}
