package agenda;


public class nif {

private int NIF;
private char letra;

private nif(){}

    public nif(int NIF, char letra) {
        this.NIF = NIF;
        this.letra = letra;
    }

    public int getNIF() {
        return NIF;
    }

    public void setNIF(int NIF) {
        this.NIF = NIF;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "nif{" + "NIF=" + NIF + ", letra=" + letra + '}';
    }


    
}
