package com.example.demo;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Movie")
public class Movie{
	@Id
	private Integer id;
	private String name;
	private Integer rating;
	
	
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Integer getRating() {
		return rating;
	}
	public void setId(Integer id) {
	        this.id = id;
	}
	public void setName(String name) {
        this.name = name;
    }
	public void setRating(Integer rating) {
        this.rating = rating;
    }
	 
}