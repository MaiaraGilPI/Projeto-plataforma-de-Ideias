package br.univesp.pi.ProjetoIdeias.repository

import br.univesp.pi.ProjetoIdeias.model.Ideia
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface IdeiaRepository : CrudRepository<Ideia, Long>