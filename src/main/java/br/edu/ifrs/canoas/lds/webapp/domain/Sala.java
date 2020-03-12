package br.edu.ifrs.canoas.lds.webapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Sala {
	@Id
	@GeneratedValue
	private Long id;
	private String predio;
	private String nome;
	private Enum<TipoSala> tipoSala;
}
