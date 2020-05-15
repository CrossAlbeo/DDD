package fr.esgi.use_case.entretien.repository;

import fr.esgi.commun.dto.ReservationSalleDto;
import fr.esgi.model.Creneau;
import fr.esgi.model.ReservationSalle;

import java.util.List;

public interface ReservationSalleRepository {
    List<ReservationSalleDto> findByCreneau(Creneau creneau);
}
