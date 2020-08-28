package br.com.DuplaPk.DuplaPK;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.DuplaPk.DuplaPK.entities.TipoGarantias;
import br.com.DuplaPk.DuplaPK.entities.VersionPK;
import br.com.DuplaPk.DuplaPK.entities.VersionamentoAPI;
import br.com.DuplaPk.DuplaPK.repository.TipoGarantiasRepository;
import br.com.DuplaPk.DuplaPK.repository.VersionamentoRepository;

@Configuration
@Profile("test")
public class TestaInsercao implements CommandLineRunner {
	
	@Autowired
	private VersionamentoRepository repository;
	
	@Autowired
	private TipoGarantiasRepository rTipo;

	@Override
	public void run(String... args) throws Exception {
		
		VersionamentoAPI v = new VersionamentoAPI();
		TipoGarantias t = new TipoGarantias();
		VersionPK pk = new VersionPK();
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		d = s.parse("01/08/2020");
		pk.setCodVersionamento("01");
		pk.setDataVersao(d);
		v.setMesReferencia("08");
		v.setPks(pk);
		
		t.setNomeGarantia("Capital de Giro");
		t.setTipoGarantia(1L);
		t.setVersionamento(v);
		
		//Ordem correta
		repository.save(v);
		rTipo.save(t);
		
	}

}
