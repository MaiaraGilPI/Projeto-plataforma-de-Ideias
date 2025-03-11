package br.univesp.pi.ProjetoIdeias.model

import java.time.LocalDateTime

data class DeleteIdeiaDto(
    val foiApagado: Boolean = true, val dataApagado: LocalDateTime = LocalDateTime.now(),
)
