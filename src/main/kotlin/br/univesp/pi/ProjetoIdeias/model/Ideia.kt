package br.univesp.pi.ProjetoIdeias.model

import jakarta.persistence.*
import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime

@Entity
@Table(name = "formulario_ideias")
class Ideia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long? = null

    @Column(name = "nome_completo", length = 100)
    var nomeCompleto: String? = null

    @Column(name = "email", length = 100)
    var email: String? = null

    @Column(name = "telefone", nullable = true, length = 20)
    var telefone: String? = null

    @Column(name = "titulo_projeto", length = 200)
    var tituloProjeto: String? = null

    @Column(name = "descricao_ideia")
    var descricaoIdeia: String? = null

    @Column(name = "como_conheceu", nullable = true, length = 200)
    var comoConheceu: String? = null

    @Column(name = "participar_clube", nullable = true)
    var participarClube: Boolean? = null

    @CreatedDate
    @Column(name = "data_envio", nullable = true)
    var dataEnvio: LocalDateTime? = null

    @Column(name = "foi_apagado", nullable = true)
    var foiApagado: Boolean? = null

    @Column(name = "data_apagado", nullable = true)
    var dataApagado: LocalDateTime? = null
}
