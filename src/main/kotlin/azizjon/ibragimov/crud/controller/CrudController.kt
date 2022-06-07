package azizjon.ibragimov.crud.controller


class CrudController(private val name: String) {



    fun getData(text: String): String {
       return "$text $name Это kotlin function"
    }
}