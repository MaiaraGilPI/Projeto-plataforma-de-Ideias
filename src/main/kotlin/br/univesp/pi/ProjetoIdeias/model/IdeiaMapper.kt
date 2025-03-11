package br.univesp.pi.ProjetoIdeias.model

import org.mapstruct.Mapper
import org.mapstruct.MappingTarget
import org.mapstruct.ReportingPolicy


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
abstract class IdeiaMapper {
    abstract fun ideiaToGetIdeiaDto(ideia: Ideia): GetIdeiaDto

    abstract fun addIdeiaDtoToIdeia(addIdeiaDto: AddIdeiaDto): Ideia

    abstract fun updateIdeia(@MappingTarget ideia: Ideia, updateIdeiaDto: UpdateIdeiaDto): Ideia

    abstract fun deleteIdeia(@MappingTarget ideia: Ideia, deleteIdeiaDto: DeleteIdeiaDto): Ideia
}

