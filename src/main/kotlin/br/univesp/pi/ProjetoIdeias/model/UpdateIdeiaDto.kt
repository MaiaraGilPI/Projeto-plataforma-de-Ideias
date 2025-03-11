package br.univesp.pi.ProjetoIdeias.model

data class UpdateIdeiaDto(
    val tituloProjeto: String,
    val descricaoIdeia: String,
    val comoConheceu: String?,
    val participarClube: Boolean?,
)
