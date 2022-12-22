public enum Sexo {
    HOMBRE("Hombre","♂"),
    MUJER("Mujer","♀"),
    NO("No binario","∅");

    private String sexo;
    private String letra;


    Sexo(String sexo, String letra) {
        this.sexo = sexo;
        this.letra = letra;
    }

    @Override
    public String toString() {
        return sexo +" "+ letra;
    }
}
