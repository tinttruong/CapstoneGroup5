"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Circle_1 = require("./Circle");
var Rectangle_1 = require("./Rectangle");
// Object initialization
var myCircle = new Circle_1.Circle(5, 10, 20);
var myRec = new Rectangle_1.Rectangle(0, 0, 3, 7);
// Placing shape objects in arrays:
// initialize empty array of type Shape
var theShapes = [];
// add shapes to the array (only shapes can be stored in this array)
theShapes.push(myCircle);
theShapes.push(myRec);
for (var _i = 0, theShapes_1 = theShapes; _i < theShapes_1.length; _i++) {
    var shape = theShapes_1[_i];
    console.log(shape.getInfo());
    console.log("Area=  " + shape.calculateArea() + "\n");
}
