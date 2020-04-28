const employee = (function() {
    let name;
    let age;
    let salary;

    const setAge = newAge => { age = newAge };
    const setSalary = newSalary => { salary = newSalary };
    const setName = newName => {name = newName }

    const getAge = () => age;
    const getSalary = () => salary;
    const getName = () => name;

    const increaseSalary = percentage => { setSalary(getSalary() * (1 + percentage / 100)) };
    const incrementAge = () => { setAge(getAge() + 1) };
    const getInfo = () => `Name: ${getName()}   Age: ${getAge()}    Salary: ${getSalary()}$`;

    return {
        setAge,
        setSalary,
        setName,
        increaseSalary,
        incrementAge,
        getInfo
    }
})();

employee.address = '';
employee.setAddress = address => this.address = address;
employee.getAddress = () => this.address;

employee.setName('Gantushig');
employee.setAge(25);
employee.setSalary(120000);

console.log("1st year");
console.log("\t", employee.getInfo());

employee.increaseSalary(20);
employee.incrementAge(1);

console.log("2nd year");
console.log("\t", employee.getInfo());

employee.increaseSalary(25);
employee.incrementAge(1);
employee.setAddress("Marina District, San Francisco, California");

console.log("3rd year");
console.log("\t", employee.getInfo() + `\tAddress: ${employee.getAddress()}`);

