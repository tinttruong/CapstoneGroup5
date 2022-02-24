"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Customer_1 = require("./Customer");
// create an instance of Customer class
var myCustomer = new Customer_1.Customer("Martin", "Dixon");
// This naming is based on the getter/setter methods, the instance variables can have any name
console.log(myCustomer.firstName);
console.log(myCustomer.lastName);
