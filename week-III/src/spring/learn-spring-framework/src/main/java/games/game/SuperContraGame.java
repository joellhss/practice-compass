package games.game;

import games.GamingConsole;
import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Pulo");
    }

    @Override
    public void right() {
        System.out.println("Correr");
    }

    @Override
    public void down() {
        System.out.println("Atirar");
    }

    @Override
    public void left() {
        System.out.println("Defender");
    }

    @Override
    public String toString() {
        return "SuperContraGame{}";
    }
}
