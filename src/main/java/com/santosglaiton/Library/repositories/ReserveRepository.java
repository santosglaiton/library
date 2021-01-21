package com.santosglaiton.Library.repositories;

import com.santosglaiton.Library.domain.Reserve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReserveRepository extends JpaRepository<Reserve, Integer> {
}
