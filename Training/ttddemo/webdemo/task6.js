// Define a user object using a constructor function
function User(name, email, age) {
    this.name = name;
    this.email = email;
    this.age = age;
}

// Define methods to manipulate the user object
User.prototype.changeName = function(newName) {
    this.name = newName;
};

User.prototype.updateEmail = function(newEmail) {
    this.email = newEmail;
};

User.prototype.calculateBirthYear = function() {
    var currentYear = new Date().getFullYear();
    return currentYear - this.age;
};

// Example usage:
var user = new User("John Doe", "john@example.com", 30);
console.log("Original user:", user);

user.changeName("Jane Doe");
console.log("Updated name:", user.name);

user.updateEmail("jane@example.com");
console.log("Updated email:", user.email);

console.log("Birth year:", user.calculateBirthYear());