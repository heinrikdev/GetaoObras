package dev.gestao.obras.dtos;

import dev.gestao.obras.model.Proprietario;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ProprietarioDTO {
	
	private int codigo; 
	
	@NotBlank
	private String nome; 
	
	@NotBlank
	private String cpf;
	
	@NotBlank
	private String email;
	
	public ProprietarioDTO(Proprietario obj) {
		
		this.codigo = obj.getCodigo();
		this.nome = obj.getName();
		this.cpf = obj.getCpf();
		this.email = obj.getEmail();
		
	}
}
