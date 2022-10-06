
//class = palabra reservada que indica que es una clase
//los nombres de clases los vamos a escribir en PascalCase
class Automovil {
    //agregamos modificadores de visibilidad
    private var marca : String = ""
    private var modelo : String = ""
    private var color : String = ""

    //creamos métodos de la clase
    fun cargarMarca(marca:String){
        this.marca = marca
    }


    fun cargarModelo(modelo:String){
        this.modelo = modelo
    }

    fun cargarColor(color:String){
        this.color = color
    }

    fun obtenerMarca() = this.marca
    fun obtenerModelo() = this.modelo
    fun obtenerColor() = this.color
}