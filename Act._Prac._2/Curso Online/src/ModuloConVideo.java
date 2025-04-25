public class ModuloConVideo extends Modulo {
    private String urlVideo;

    public ModuloConVideo(String titulo, int duracion, Recurso recurso, String urlVideo) {
        super(titulo, duracion, recurso);
        this.urlVideo = urlVideo;
    }

    public String getUrlVideo() {
        return urlVideo;
    }
}
