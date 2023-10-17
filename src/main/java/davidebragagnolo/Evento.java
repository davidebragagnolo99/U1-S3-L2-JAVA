package davidebragagnolo;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Evento {
    @Id
    @GeneratedValue
    private int Id;

    private String Titolo;
    private LocalDate DataEvento;
    private String Descrizione;
    @Enumerated(EnumType.STRING)
    private TipoEvento tipo;
    private int numeroMassimoPartecipanti;

    public Evento () {}

    public Evento(String titolo, LocalDate dataEvento, String descrizione, TipoEvento tipo, int numeroMassimoPartecipanti) {
        Titolo = titolo;
        DataEvento = dataEvento;
        Descrizione = descrizione;
        this.tipo = tipo;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public String getTitolo() {
        return Titolo;
    }

    public void setTitolo(String titolo) {
        Titolo = titolo;
    }

    public LocalDate getDataEvento() {
        return DataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        DataEvento = dataEvento;
    }

    public String getDescrizione() {
        return Descrizione;
    }

    public void setDescrizione(String descrizione) {
        Descrizione = descrizione;
    }

    public TipoEvento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }

    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public int getId() {
        return Id;
    }
}
