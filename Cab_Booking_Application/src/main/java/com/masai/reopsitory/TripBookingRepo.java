package com.masai.reopsitory;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.TripBooking;
@Repository
public interface TripBookingRepo  extends JpaRepository<TripBooking, Integer>{

	

}
