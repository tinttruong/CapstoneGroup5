var Customer = /** @class */ (function () {
    // Constructor
    function Customer(theFirst, theLast) {
        this.firstName = theFirst;
        this.lastName = theLast;
    }
    return Customer;
}());
// create an instance of Customer class
var myCustomer = new Customer("Martin", "Dixon");
/*
myCustomer.firstName = "Martin";
myCustomer.lastName = "Dixon";
*/
console.log(myCustomer.firstName);
console.log(myCustomer.lastName);
