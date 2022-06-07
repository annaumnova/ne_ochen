package coursework

class StudyList:Register {

    private val theregister = mutableListOf<Student>()

    //add students
    fun addStudents(person: Student) = theregister.add(person)

    //student's group
    override fun inputNumberGroup() {
        TODO("Not yet implemented")
    }

    //current subject
    override fun inputNameSubject() {
        TODO("Not yet implemented")
    }

    //teacher's full name
    override fun inputNameTeacher() {
        TODO("Not yet implemented")
    }

    //mark
    override fun markAllStudents() {
        TODO("Not yet implemented")
    }


//    //for saving file
//    override fun saveFile() {
//
//    }
//
//    //for excel format
//    override fun generateSaveExcel() {
//
//    }

}