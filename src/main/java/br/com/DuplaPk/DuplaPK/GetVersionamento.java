package br.com.DuplaPk.DuplaPK;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.DuplaPk.DuplaPK.entities.TipoGarantias;
import br.com.DuplaPk.DuplaPK.repository.TipoGarantiasRepository;
import br.com.DuplaPk.DuplaPK.repository.VersionamentoRepository;

@RestController
public class GetVersionamento {

	@Autowired
	private TipoGarantiasRepository gara;
	
	/*@GetMapping
	public List<VersionamentoAPI> Get(){
		return repo.findAll();
	}*/
	
	@GetMapping
	public List<TipoGarantias> GetGarantias(){
		return gara.findAll();
	}
}
