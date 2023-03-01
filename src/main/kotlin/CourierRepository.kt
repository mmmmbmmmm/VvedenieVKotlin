class CourierRepository {
   //класс содержит основные функции по работе с классом курьер
    val LCourier = mutableListOf<Courier>()

    fun findById(id: Int) : Int?{ // функция по нахождению курьера по id
        var findIndex: Int? = null
        //цикл с условием: пробегает лист с курьерами и если такой существует то выводит соответствующую строку и наобарот строку если нет такого курьера
        for( i in 0..LCourier.size){

            if(LCourier[i].id == id){
                findIndex = i
                println("Курьер ${LCourier[i].name} найден")
            } else {
                findIndex = null
                println("Курьер не найден")
            }
            break
        }
        return findIndex
    }

    fun insert(courier: Courier) { // функция для добавления ноавых курьеров
        courier.id = LCourier.size
        print("id: " + courier.id + " ")
        LCourier.add(courier)
        println("${courier.name} добвален")
    }

    fun update(id: Int, courier: Courier) { //функция  обновляет курьера
        var searchJobsPhone: Int? = findById(id)
        if (searchJobsPhone != null) {
            courier.id = id
            LCourier[searchJobsPhone] = courier
        }
    }
    fun delete(id: Int) { //функция удаляет курьеров
        var jobs: Int? = findById(id)
        if (jobs != null) {
            LCourier.removeAt(jobs)
        }
    }
}
