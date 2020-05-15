package fr.esgi.use_case.entretien.repository;

import fr.esgi.commun.dto.ReservationSalleDto;
import fr.esgi.model.Creneau;

import java.util.ArrayList;
import java.util.List;

public class ReservationsSalle implements ReservationSalleRepository {
    private final List<ReservationSalleDto> reservationsSalleDto;

    public ReservationsSalle() {
        this.reservationsSalleDto = new ArrayList<>();
    }

    public List<ReservationSalleDto> findByCreneau(Creneau creneau) {
        return this.reservationsSalleDto;
    }
    public List<ReservationSalleDto> find() {
        return this.reservationsSalleDto;
    }

    public void sauvegarder(ReservationSalleDto reservationSalleDto) {
        this.reservationsSalleDto.add(reservationSalleDto);
    }
}
