package azizjon.ibragimov.crud

import azizjon.ibragimov.crud.util.Constants
import org.python.antlr.PythonParser
import org.python.util.PythonInterpreter
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CrudApplication

fun main(args: Array<String>) {
    runApplication<CrudApplication>(*args)


    val py = PythonInterpreter()
    py.execfile(Constants.PACKAGE_URL + "main.py")

}
