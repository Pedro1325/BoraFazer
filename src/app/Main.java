package app;
import app.Model.Tarefa;
import app.Model.Usuario;
import java.time.LocalDate;



public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(1, "Pedro","pedro@email.com", "123456");

        Tarefa tarefa = new Tarefa(
                1,
                "Estudar java",
                "Fazer sistema BoraFazer",
                "pendente",
                LocalDate.now(),
                LocalDate.of(2025, 6, 30),
                usuario.getId()
        );

        System.out.println(usuario);
        System.out.println(tarefa);
        }
    }
