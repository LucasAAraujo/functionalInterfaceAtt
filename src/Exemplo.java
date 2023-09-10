@FunctionalInterface
interface Figura2D {
    Retangulo desenha(Double largura, Double altura);
}

class Retangulo {
    public Retangulo(Double largura, Double altura) {
        System.out.println("Desenha retângulo de altura: " + altura + " e largura: " + largura);
    }
}
public class Exemplo {
    public static void main(String[] args) {
        Figura2D fig1 = Retangulo::new;

        fig1.desenha(2.5, 10.0);
    }
}
