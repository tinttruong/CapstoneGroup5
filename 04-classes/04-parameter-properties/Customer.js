var Customer = /** @class */ (function () {
    // Constructor with parameter properties shortcut
    function Customer(_firstName, _lastName) {
        this._firstName = _firstName;
        this._lastName = _lastName;
    }
    Object.defineProperty(Customer.prototype, "firstName", {
        // getter and setter methods, public is default
        get: function () {
            return this._firstName;
        },
        set: function (theFirst) {
            this._firstName = theFirst;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Customer.prototype, "lastName", {
        get: function () {
            return this._lastName;
        },
        set: function (theLast) {
            this._lastName = theLast;
        },
        enumerable: false,
        configurable: true
    });
    return Customer;
}());
// create an instance of Customer class
var myCustomer = new Customer("Martin", "Dixon");
/*
 -- ts will behind the scenes call the get and set methods --
myCustomer.firstName = "Martin";
myCustomer.lastName = "Dixon";
*/
// This naming is based on the getter/setter methods, the instance variables can have any name
console.log(myCustomer.firstName);
console.log(myCustomer.lastName);
