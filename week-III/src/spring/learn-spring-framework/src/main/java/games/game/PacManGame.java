package games.game;

import games.GamingConsole;
import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Cima");
    }

    @Override
    public void right() {
        System.out.println("Direita");
    }

    @Override
    public void down() {
        System.out.println("Baixo");
    }

    @Override
    public void left() {
        System.out.println("Esquerda");
    }

    @Override
    public String toString() {
        return "PacManGame{}";
    }
}
