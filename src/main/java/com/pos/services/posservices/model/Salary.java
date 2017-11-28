package com.pos.services.posservices.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Salary {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String net;

	public String getNet() {
		return net;
	}

	public void setNet(String net) {
		this.net = net;
	}

	private String gross;

	public String getGross() {
		return gross;
	}

	public void setGross(String gross) {
		this.gross = gross;
	}

}
