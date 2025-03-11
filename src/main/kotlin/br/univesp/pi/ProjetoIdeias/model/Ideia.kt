package br.univesp.pi.ProjetoIdeias.model

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "formulario_ideias")
open class Ideia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    open var id: Long? = null

    @Column(name = "nome_completo")
    open var nomeCompleto: String? = null

    @Column(name = "email")
    open var email: String? = null

    @Column(name = "telefone")
    open var telefone: String? = null

    @Column(name = "titulo_projeto")
    open var tituloProjeto: String? = null

    @Column(name = "descricao_ideia")
    open var descricaoIdeia: String? = null

    @Column(name = "como_conheceu")
    open var comoConheceu: String? = null

    @Column(name = "participar_clube")
    open var participarClube: Boolean? = null

    @Column(name = "data_envio")
    open var dataEnvio: Date? = null

    @Column(name = "foi_apagado")
    open var foiApagado: Boolean? = null

    @Column(name = "data_apagado")
    open var dataApagado: Date? = null
}
