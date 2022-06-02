public class Predio {
    int andares;
    int direcao;
    int maxpessoas;

    double mudar() {
        if (direcao == 1) {
            andares = andares + 1;
        }
        if (direcao == 2) {
            andares = andares - 1;
        }
        return andar;
    }

    public Predio(int direcao, int maxpessoas) {
        this.direcao = direcao;
        this.maxpessoas = maxpessoas;
    }
}
