package br.com.Daniel.JPA.orm;


    import jakarta.persistence.*;

    @Entity
    @Table(name ="cargos")
    public class Cargo {

        public Integer getId() {
            return id;
        }

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private  Integer id;

        public void setId(Integer id) {
            this.id = id;
        }

        public void setDescriçao(String descriçao) {
            this.descriçao = descriçao;
        }

        public String getDescriçao() {
            return descriçao;
        }

        private String descriçao;


    }
