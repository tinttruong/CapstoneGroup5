import { Coach } from "./Coach";
import { CricketCoach } from "./CricketCoach";
import { GolfCoach } from "./GolfCoach";

// initialize concrete class Coach objects
let myCricketCoach = new CricketCoach();
let myGolfCoach = new GolfCoach();

// declare an array for type Coaches, initially empty
let theCoaches: Coach[] = [];

// add the coach objects to the array
theCoaches.push(myCricketCoach);
theCoaches.push(myGolfCoach);

// loop through array and print the daily workout
for (let coach of theCoaches){
    console.log(coach.getDailyWorkout() + "\n");
}