package com.example.cars.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import io.swagger.annotations.ApiModelProperty;

/**
 * This class will represent out car and its attributes:
 * - ID
 * - Name
 * - Number of doors
 * 
 * @author Eduardo
 */
@Entity
@Table(name = "cars") // the table in the database that will contain our cars data
@EntityListeners(AuditingEntityListener.class)
public class Car {

	/**
	 * The attributes of the car
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; // Each car will be given an auto-generated unique identifier when stored

	@Column(name = "car_name", nullable = false)
	private String carName; // We will also save the name of the car

	@Column(name = "doors", nullable = false)
	private Integer doors; // We will also save the number of dors that a car has

	/**
	 * Our getters and setters for the attributes above
	 */
	@ApiModelProperty(name = "id",
					  value = "The id of the car",
					  example = "1")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ApiModelProperty(name="carName",
            value="The name of the car to be saved",
            example="Bugatti",
            required=true)
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	@ApiModelProperty(name="doors",
            value="The number of doors that the car has",
            example="2",
            required=true)
	public Integer getDoors() {
		return doors;
	}

	public void setDoors(Integer doors) {
		this.doors = doors;
	}

}
