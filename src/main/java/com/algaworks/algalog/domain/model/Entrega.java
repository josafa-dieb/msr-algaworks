package com.algaworks.algalog.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Entrega {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Cliente cliente;

	@Embedded
	private Destinatario destinatario;
	
	private BigDecimal taxa;

	@JsonProperty(access = Access.READ_ONLY)
	@Enumerated(EnumType.STRING)
	@Column(name = "stauts")
	private StatusEntrega status;
	
	private LocalDateTime dataPedido;
	
	@JsonProperty(access = Access.READ_ONLY)
	@Column(name = "data_finalizacao")
	private LocalDateTime dataFinalizado;

}
