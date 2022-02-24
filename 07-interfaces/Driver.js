"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var CricketCoach_1 = require("./CricketCoach");
var GolfCoach_1 = require("./GolfCoach");
// initialize concrete class Coach objects
var myCricketCoach = new CricketCoach_1.CricketCoach();
var myGolfCoach = new GolfCoach_1.GolfCoach();
// declare an array for type Coaches, initially empty
var theCoaches = [];
// add the coach objects to the array
theCoaches.push(myCricketCoach);
theCoaches.push(myGolfCoach);
// loop through array and print the daily workout
for (var _i = 0, theCoaches_1 = theCoaches; _i < theCoaches_1.length; _i++) {
    var coach = theCoaches_1[_i];
    console.log(coach.getDailyWorkout() + "\n");
}
