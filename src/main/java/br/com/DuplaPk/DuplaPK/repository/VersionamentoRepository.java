package br.com.DuplaPk.DuplaPK.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.DuplaPk.DuplaPK.entities.VersionPK;
import br.com.DuplaPk.DuplaPK.entities.VersionamentoAPI;

public interface VersionamentoRepository extends JpaRepository<VersionamentoAPI, VersionPK> {

}
