package searchengine.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "lemma")
@Data
@NoArgsConstructor

public class Lemma {
    public Lemma(Site site, String lemma, int frequency) {
        this.site = site;
        this.lemma = lemma;
        this.frequency = frequency;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(cascade = CascadeType.REFRESH)
    private Site site;
    @Column(columnDefinition = "VARCHAR(255)")
    private String lemma;
    private int frequency;
}
