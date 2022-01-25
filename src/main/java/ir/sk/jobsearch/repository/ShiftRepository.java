package ir.sk.jobsearch.repository;

import ir.sk.jobsearch.entity.Shift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ShiftRepository extends JpaRepository<Shift, UUID> {

    List<Shift> findAllByJob_Id(UUID uuid);
}
