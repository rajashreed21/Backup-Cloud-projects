data class Employee(val id: Int, var name: String,var salary: Int , var role: String)

class empmanagement {
    private val employees = mutableListOf<Employee>()

    fun addEmployee(id: Int, name: String,salary: Int, role: String) {
        val employee = Employee(id, name, salary,role)
        employees.add(employee)
    }

    fun removeEmployee(id: Int) {
        employees.removeIf { it.id == id }
    }

    fun getEmployeeById(id: Int): Employee? {
        return employees.find { it.id == id }
    }

    fun getAllEmployees(): List<Employee> {
        return employees.toList()
    }

    fun updateEmployee(id: Int, newName: String, newrole: String) {
        employees.find { it.id == id }?.apply {
            name = newName
            role = newrole
        }
    }
}

fun main() {
    val employeeManagement = empmanagement()
    employeeManagement.addEmployee(1, "Raji", 65000,"Developer")
    employeeManagement.addEmployee(2, "Guna", 90000,"Manager")
    employeeManagement.addEmployee(3, "Sabari", 55000,"Trainer")


    println("All Employees:")
    employeeManagement.getAllEmployees().forEach { println(it) }

    println("\nUpdating Employee  ID 1:")
    employeeManagement.updateEmployee(1, "Rajkumar", "Team Lead")
    println(employeeManagement.getEmployeeById(1))

    println("\nRemoving Employee  ID 2:")
    employeeManagement.removeEmployee(2)

    println("\nAfter deleting:")
    employeeManagement.getAllEmployees().forEach { println(it) }
}
