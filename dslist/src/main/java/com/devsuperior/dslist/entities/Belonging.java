package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer positiion;

    public Belonging() {}

    public Belonging(Game game, GameList list, Integer positiion) {
        id.setGame(game);
        id.setList(list);
        this.positiion = positiion;
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPositiion() {
        return positiion;
    }

    public void setPositiion(Integer positiion) {
        this.positiion = positiion;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Belonging belonging = (Belonging) o;
        return Objects.equals(id, belonging.id) && Objects.equals(positiion, belonging.positiion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, positiion);
    }
}
