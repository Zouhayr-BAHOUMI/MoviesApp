package springmvc.model;

//import jakarta.persistence.*;

import javax.persistence.*;


@Entity
@Table(name = "Transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_transaction;
    private float montant;
    private String  description;
    private String categorie;
    private String date;

    public int getId_transaction() {
        return id_transaction;
    }

    public void setId_transaction(int id_transaction) {
        this.id_transaction = id_transaction;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id_transaction=" + id_transaction +
                ", montant=" + montant +
                ", description='" + description + '\'' +
                ", categorie='" + categorie + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
