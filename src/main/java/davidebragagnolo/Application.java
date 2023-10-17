package davidebragagnolo;

import utils.JPAUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Application {

    private static EntityManagerFactory emf = JPAUtils.getEntityManagerFactory();

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventoDAO Ev = new EventoDAO(em);

        Evento primoEvento = new Evento("Presentazione iPhone 16 by Tim Cook", LocalDate.now(), "Expo 2024", TipoEvento.PUBBLICO, 6000);
        Ev.save(primoEvento);

        Evento eventoTrovato = Ev.findById(1);
        if (eventoTrovato != null)
            System.out.println("Elemento trovato tramite id: " + eventoTrovato);

        Ev.deleteById(1);

        Evento eventoTrovato2 = Ev.findById(2);
        if (eventoTrovato2 != null)
    }
}
