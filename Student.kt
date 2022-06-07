package coursework

//ФИО + группа, преподаватель
sealed class Student(val surname:String, val name:String){
    //ФИО + группа
    class PersonStudent(surname:String, name:String, numberGroup:Int):Student(surname, name){
        override fun toString() = "$surname $name"
    }

    //преподаватель ФИО + аудитория (на всякий случай)
    class Teacher(surname:String, name:String, val classroom: Int):Student(surname, name){
        override fun toString() = "$surname $name"
    }

    //????????
    //equals
    override fun equals(other: Any?): Boolean {
        if (javaClass != other?.javaClass)
            return false

        if (this === other)
            return true

        other as Student

        if (surname != other.surname)
            return false

        if (name != other.name)
            return false

        return true
    }

    //?????????????
    //hash code
    override fun hashCode(): Int {
        var answer = surname.hashCode()
        answer = answer*31 + name.hashCode()
        return answer
    }
}
