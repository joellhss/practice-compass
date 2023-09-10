package games.game;

import games.GamingConsole;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {
    @Override
    public void up() {
        System.out.println("Pulo");
    }

    @Override
    public void right() {
        System.out.println("Andar");
    }

    @Override
    public void down() {
        System.out.println("Abaixar");
    }

    @Override
    public void left() {
        System.out.println("Voltar");
    }

    @Override
    public String toString() {
        return "MarioGame{}";
    }
}
