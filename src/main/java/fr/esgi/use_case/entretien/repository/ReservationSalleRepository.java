package fr.esgi.use_case.entretien.repository;

import fr.esgi.commun.dto.ReservationSalleDto;
import fr.esgi.model.Creneau;

import java.util.List;

public interface ReservationSalleRepository {
    List<ReservationSalleDto> findByCreneau(Creneau creneau);
    List<ReservationSalleDto> find();
    void sauvegarder(ReservationSalleDto reservationSalleDto);
}
