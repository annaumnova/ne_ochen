package coursework

interface Register {

    //    номер группы
    fun inputNumberGroup()

    //название дисциплины
    fun inputNameSubject()

    //ФИО преподавателя
    fun inputNameTeacher()

    //выставить оценки всем студентам
    fun markAllStudents()

//    //сохранить результат в файл, который можно будет открыть в дальнейшем
//    fun saveFile()
//
//    //сгенерировать и сохранить ведомость в формате excel (csv)
//    fun generateSaveExcel()
}