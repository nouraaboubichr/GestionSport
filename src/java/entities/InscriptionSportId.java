/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author hp
 */
public class InscriptionSportId implements Serializable {
    private Long user;
    private Long activite;

    public InscriptionSportId() {}

    public InscriptionSportId(Long user, Long activite) {
        this.user = user;
        this.activite = activite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InscriptionSportId)) return false;
        InscriptionSportId that = (InscriptionSportId) o;
        return Objects.equals(user, that.user) && Objects.equals(activite, that.activite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, activite);
    }
}