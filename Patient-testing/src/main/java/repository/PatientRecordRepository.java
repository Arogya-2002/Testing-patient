package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.PatientRecord;

public interface PatientRecordRepository extends JpaRepository<PatientRecord, Long> {

}
