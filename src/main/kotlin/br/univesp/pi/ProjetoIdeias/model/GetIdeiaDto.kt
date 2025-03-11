package br.univesp.pi.ProjetoIdeias.model

import java.util.*

data class GetIdeiaDto(
    val id: Long?,
    val nomeCompleto: String?,
    val email: String?,
    val telefone: String?,
    val tituloProjeto: String?,
    val descricaoIdeia: String?,
    val comoConheceu: String?,
    val participarClube: Boolean?,
    val dataEnvio: Date?,
    val foiApagado: Boolean?,
    val dataApagado: Date?
)
