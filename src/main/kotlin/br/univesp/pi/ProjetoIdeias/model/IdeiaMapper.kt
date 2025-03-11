package br.univesp.pi.ProjetoIdeias.model

import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
abstract class IdeiaMapper {
    abstract fun addIdeiaDtoToIdeia(addIdeiaDto: AddIdeiaDto): Ideia
    abstract fun ideiaToGetIdeiaDto(ideia: Ideia): GetIdeiaDto
}

