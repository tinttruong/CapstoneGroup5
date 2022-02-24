class Customer {
    
    // instance variables
    firstName: string;
    lastName: string;

    // Constructor
    constructor(theFirst: string, theLast: string) {
        
        this.firstName = theFirst;
        this.lastName = theLast;
    }

}

// create an instance of Customer class
let myCustomer = new Customer("Martin", "Dixon");

/*
myCustomer.firstName = "Martin";
myCustomer.lastName = "Dixon";
*/

console.log(myCustomer.firstName);
console.log(myCustomer.lastName);