package br.univesp.pi.ProjetoIdeias

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "formulario_ideias")
class Ideia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: Long? = null

    @Column(name = "nome_completo")
    var nomeCompleto: String? = null

    @Column(name = "email")
    var email: String? = null

    @Column(name = "telefone")
    var telefone: String? = null

    @Column(name = "titulo_projeto")
    var tituloProjeto: String? = null

    @Column(name = "descricao_ideia")
    var descricaoIdeia: String? = null

    @Column(name = "como_conheceu")
    var comoConheceu: String? = null

    @Column(name = "participar_clube")
    var participarClube: Boolean? = null

    @Column(name = "data_envio")
    var dataEnvio: Date? = null

    @Column(name = "foi_apagado")
    var foiApagado: Boolean? = null

    @Column(name = "data_apagado")
    var dataApagado: Date? = null
}
