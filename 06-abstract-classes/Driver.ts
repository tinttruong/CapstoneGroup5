import { Shape } from './Shape';
import { Circle} from './Circle';
import { Rectangle } from './Rectangle';

// Object initialization
let myCircle = new Circle(5, 10, 20);
let myRec = new Rectangle(0, 0, 3, 7);

// Placing shape objects in arrays:
// initialize empty array of type Shape
let theShapes: Shape[] = [];

// add shapes to the array (only shapes can be stored in this array)
theShapes.push(myCircle);
theShapes.push(myRec);

for (let shape of theShapes) {
    console.log(shape.getInfo());
    console.log(`Area=  ${shape.calculateArea()}\n`);
}