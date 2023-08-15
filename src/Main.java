import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("Java1");
        curso1.setDescricao("Descrição curso");
        curso1.setCargaHoraria(8);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("Mentoria braba");
        mentoria1.setDescricao("Descrição braba");
        mentoria1.setData(LocalDate.now());

        Bootcamp bt1 = new Bootcamp();
        bt1.setNome("Bootfoda");

        bt1.getConteudosInclusos().add(curso1);


        Dev rod = new Dev("Rodrigo");
        rod.inscreverBootcamp(bt1);

        System.out.println(curso1);
        System.out.println(mentoria1);
        System.out.println(bt1);
        System.out.println(rod.getXp());


    }
}