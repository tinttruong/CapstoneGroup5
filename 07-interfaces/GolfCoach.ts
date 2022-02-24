import { Coach } from "./Coach";

export class GolfCoach implements Coach {

    getDailyWorkout(): string {

        return "Hit 100 golf balls at the driving range.";
    }
}