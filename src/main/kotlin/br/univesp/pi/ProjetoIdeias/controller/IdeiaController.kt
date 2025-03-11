package br.univesp.pi.ProjetoIdeias.controller

import br.univesp.pi.ProjetoIdeias.model.*
import br.univesp.pi.ProjetoIdeias.repository.IdeiaRepository
import jakarta.persistence.EntityNotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/ideias")
class IdeiaController {
    @Autowired
    private lateinit var ideiaRepository: IdeiaRepository

    @Autowired
    private lateinit var ideiaMapper: IdeiaMapper

    @GetMapping()
    @ResponseBody
    fun getAllIdeias(): ResponseEntity<Iterable<GetIdeiaDto>> {
        return ResponseEntity<Iterable<GetIdeiaDto>>(
            ideiaRepository.findAll().map {
                ideiaMapper.ideiaToGetIdeiaDto(it)
            }, HttpStatus.OK
        )
    }

    @GetMapping("/{id}")
    @ResponseBody
    fun getIdeiaById(
        @PathVariable(value = "id") id: Long
    ): ResponseEntity<GetIdeiaDto?> {
        return ResponseEntity<GetIdeiaDto?>(
            ideiaMapper.ideiaToGetIdeiaDto(
                ideiaRepository.findById(id).get()
            ), HttpStatus.OK
        )
    }

    @PostMapping()
    fun addNewIdeia(
        @RequestBody addIdeiaDto: AddIdeiaDto
    ): ResponseEntity<Any> {
        ideiaRepository.save(ideiaMapper.addIdeiaDtoToIdeia(addIdeiaDto))
        return ResponseEntity<Any>(HttpStatus.CREATED)
    }

    @PatchMapping("/{id}")
    fun updateIdeia(
        @PathVariable(value = "id") id: Long, @RequestBody updateIdeiaDto: UpdateIdeiaDto,
    ): ResponseEntity<Any> {
        val ideia = ideiaRepository.findById(id).orElseThrow { EntityNotFoundException() }
        return ResponseEntity<Any>(
            ideiaRepository.save(ideiaMapper.updateIdeia(ideia, updateIdeiaDto)), HttpStatus.OK
        )
    }

    @DeleteMapping("/{id}")
    fun deleteIdeia(
        @PathVariable(value = "id") id: Long
    ): ResponseEntity<Any> {
        val ideia = ideiaRepository.findById(id).orElseThrow { EntityNotFoundException() }
        return ResponseEntity<Any>(
            ideiaRepository.save(ideiaMapper.deleteIdeia(ideia, DeleteIdeiaDto())), HttpStatus.OK
        )
    }
}
