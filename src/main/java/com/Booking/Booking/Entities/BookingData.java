package com.Booking.Booking.Entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table
public @Data class BookingData {

	public enum Unit{
		PER_TON,
		PER_TRUCK
	}
	@Id	
	private String bookingId;
	
	private String transporterId;
	private String loadId;
	private Long rate;
	private Unit unitValue;
	@Column(name="truckIds")
	@ElementCollection(targetClass=String.class)
	private List<String> truckId;
	private Boolean cancel;
	private Boolean completed;
	
}
