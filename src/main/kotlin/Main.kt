fun main(args: Array<String>) { // в основном классе Main в её функции вызываем и работаем с созданными методами
    val courier = CourierRepository() //экземпляр класса  CourierRepository
        //добавляем 2-х курьеров
    courier.insert(Courier("Кирилл", "Доставка еды"))
    courier.insert(Courier("Антон", "Доставка заказов с онлайн магазина "))


    println()
        //ищем по 0 id курьера
    courier.findById(0)
    println()
        //удаляем курьера по 0 id
    courier.delete(0)
    courier.findById(0)
    courier.findById(1)
    //обновляем
    courier.update(1, Courier("Антон", "Доставка заказов "))
    courier.findById(1)
}
