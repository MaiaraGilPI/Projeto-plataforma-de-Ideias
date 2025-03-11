package br.univesp.pi.ProjetoIdeias.model

data class AddIdeiaDto(
    val nomeCompleto: String?,
    val email: String?,
    val telefone: String?,
    val tituloProjeto: String?,
    val descricaoIdeia: String?,
    val comoConheceu: String?,
    val participarClube: Boolean?,
)
