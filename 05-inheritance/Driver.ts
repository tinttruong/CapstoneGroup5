import { Shape } from './Shape';
import { Circle} from './Circle';
import { Rectangle } from './Rectangle';

// Object initialization
let myShape = new Shape(10, 15);
let myCircle = new Circle(5, 10, 20);
let myRec = new Rectangle(0, 0, 3, 7);

console.log(myShape.getInfo());
console.log(myCircle.getInfo());
console.log(myRec.getInfo());

// Placing shape objects in arrays:
// initialize empty array of type Shape
let theShapes: Shape[] = [];

// add shapes to the array (only shapes can be stored in this array)
theShapes.push(myShape);
theShapes.push(myCircle);
theShapes.push(myRec);

for (let shape of theShapes) {
    console.log(shape.getInfo());
}