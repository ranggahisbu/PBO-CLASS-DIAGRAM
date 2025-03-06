class Pengguna {
    private int idPengguna;
    private String namaLengkap;
    private String email;
    private String kataSandi;
    
    void setIdPengguna(int idPengguna) {
        this.idPengguna = idPengguna;
    }
    
    void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }
    
    void setEmail(String email) {
        this.email = email;
    }
    
    void setKataSandi(String kataSandi) {
        this.kataSandi = kataSandi;
    }
    
    int getIdPengguna() {
        return this.idPengguna;
    }
    
    String getNamaLengkap() {
        return this.namaLengkap;
    }
    
    String getEmail() {
        return this.email;
    }
    
    String getKataSandi() {
        return this.kataSandi;
    }
}

class Anime {
    private int idAnime;
    private String judul;
    private String genre;
    private int tahunRilis;
    private String studio;
    
    void setIdAnime(int idAnime) {
        this.idAnime = idAnime;
    }
    
    void setJudul(String judul) {
        this.judul = judul;
    }
    
    void setGenre(String genre) {
        this.genre = genre;
    }
    
    void setTahunRilis(int tahunRilis) {
        this.tahunRilis = tahunRilis;
    }
    
    void setStudio(String studio) {
        this.studio = studio;
    }
    
    int getIdAnime() {
        return this.idAnime;
    }
    
    String getJudul() {
        return this.judul;
    }
    
    String getGenre() {
        return this.genre;
    }
    
    int getTahunRilis() {
        return this.tahunRilis;
    }
    
    String getStudio() {
        return this.studio;
    }
}

public class StreamingApp {
    public static void main(String[] args) {

        Pengguna penonton = new Pengguna();
        penonton.setIdPengguna(1);
        penonton.setNamaLengkap(" Yanto Anime");
        penonton.setEmail("budi@anime.com");
        
        Anime naruto = new Anime();
        naruto.setIdAnime(001);
        naruto.setJudul("Naruto");
        naruto.setGenre("Action");
        naruto.setTahunRilis(2002);
        naruto.setStudio("Studio Pierrot");
        
        System.out.println("Nama Penonton: " + penonton.getNamaLengkap());
        System.out.println("Email: " + penonton.getEmail());

        System.out.println("Judul: " + naruto.getJudul());
        System.out.println("Genre: " + naruto.getGenre());
        System.out.println("Tahun Rilis: " + naruto.getTahunRilis());
        System.out.println("Studio: " + naruto.getStudio());

    }
}