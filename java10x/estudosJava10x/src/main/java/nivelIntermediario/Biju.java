package nivelIntermediario;

public enum Biju {

    SHUKAKU("Shukaku", "Gaara", 1),
    MATATABI("Matatabi", "Yugito Nii", 2),
    ISOBU("Isobu", "Yagara", 3),
    SON_GOKU("Son Goku", "Roshi", 4),
    KUKUO("Kokuo", "Han", 5),
    SAIKEN("Saiken", "Utakata", 6),
    CHOMEI("Chomei", "Fuu", 7),
    GYUKI("Gyuki", "Killer Bee", 8),
    KURAMA("Kurama", "Naruto Uzumaki", 9);

    private String nomeBiju;
    private String jinchuriki;
    private int numerosDeCaldas;

    Biju() {
    }

    Biju(String nomeBiju, String jinchuriki, int numerosDeCaldas) {
        this.nomeBiju = nomeBiju;
        this.jinchuriki = jinchuriki;
        this.numerosDeCaldas = numerosDeCaldas;
    }

    public String getNomeBiju() {
        return nomeBiju;
    }

    public void setNomeBiju(String nomeBiju) {
        this.nomeBiju = nomeBiju;
    }

    public String getJinchuriki() {
        return jinchuriki;
    }

    public void setJinchuriki(String jinchuriki) {
        this.jinchuriki = jinchuriki;
    }

    public int getNumerosDeCaldas() {
        return numerosDeCaldas;
    }

    public void setNumerosDeCaldas(int numerosDeCaldas) {
        this.numerosDeCaldas = numerosDeCaldas;
    }
}
