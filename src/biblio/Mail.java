package biblio;

import java.time.LocalDateTime;
import java.util.Objects;

public class Mail {
    private String objet;
    private String message;
    private LocalDateTime dateEnvoi;

    //<-------------------Constructeur,getter,setter et equals-------------->

    public Mail(String objet, String message, LocalDateTime dateEnvoi) {
        this.objet = objet;
        this.message = message;
        this.dateEnvoi = dateEnvoi;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(LocalDateTime dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mail mail = (Mail) o;
        return Objects.equals(objet, mail.objet) && Objects.equals(message, mail.message) && Objects.equals(dateEnvoi, mail.dateEnvoi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objet, message, dateEnvoi);
    }
}
