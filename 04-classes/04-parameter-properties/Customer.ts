class Customer {

    // Constructor with parameter properties shortcut
    constructor(private _firstName: string, private _lastName: string) {
    }

    // getter and setter methods, public is default
    get firstName(): string {
        return this._firstName;
    }

    get lastName(): string {
        return this._lastName;
    }

    set firstName(theFirst: string) {
        this._firstName = theFirst;
    }

    set lastName(theLast: string) {
        this._lastName = theLast;
    }

}

// create an instance of Customer class
let myCustomer = new Customer("Martin", "Dixon");


// This naming is based on the getter/setter methods, the instance variables can have any name
console.log(myCustomer.firstName);
console.log(myCustomer.lastName);