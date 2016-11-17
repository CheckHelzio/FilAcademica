package ccv.checkhelzio.filacademica2015;

/**
 * Created by check on 17/11/2016.
 */

public class Noticia {
    String link;
    String titulo;
    String imagen;

    public Noticia(String link, String titulo, String imagen) {
        this.link = link;
        this.titulo = titulo;
        this.imagen = imagen;
    }

    public String getLink() {
        return link;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getImagen() {
        return imagen;
    }
}
