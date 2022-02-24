class Customer {
    
    // instance variables (preceding '_' is convention)
    private _firstName: string;
    private _lastName: string;

    // Constructor
    constructor(theFirst: string, theLast: string) {
        
        this._firstName = theFirst;
        this._lastName = theLast;
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

/*
 -- ts will behind the scenes call the get and set methods --
myCustomer.firstName = "Martin";
myCustomer.lastName = "Dixon";
*/

// This naming is based on the getter/setter methods, the instance variables can have any name
console.log(myCustomer.firstName);
console.log(myCustomer.lastName);