package br.univesp.pi.ProjetoIdeias

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
class IdeiaController {

    @Autowired
    private lateinit var ideiaRepository: IdeiaRepository

    @PostMapping(path = ["/add"]) // Map ONLY POST Requests
    @ResponseBody
    fun addNewIdeia(
        @RequestParam nomeCompleto: String?,
        @RequestParam email: String?,
        @RequestParam telefone: String?,
        @RequestParam tituloProjeto: String?,
        @RequestParam descricaoIdeia: String?,
        @RequestParam comoConheceu: String?,
        @RequestParam participarClube: Boolean?,


        ): String {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        val i: Ideia = Ideia()
        i.nomeCompleto = nomeCompleto
        i.email = email
        i.telefone = telefone
        i.tituloProjeto = tituloProjeto
        i.descricaoIdeia = descricaoIdeia
        i.comoConheceu = comoConheceu
        i.participarClube = participarClube

        ideiaRepository.save(i)
        return "Saved"
    }

    @GetMapping(path = ["/all"])
    @ResponseBody
    fun getAllIdeias(): Iterable<Ideia> {
        return ideiaRepository.findAll()
    }
}
