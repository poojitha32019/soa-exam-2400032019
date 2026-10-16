
package com.klef.soa.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.soa.exam.entity.Laundry;

public interface ServiceRepository extends JpaRepository<Laundry, Long> {

}