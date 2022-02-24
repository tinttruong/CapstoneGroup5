let sportsOne: string[] = ["Golf", "Cricket", "Tennis", "Swimming"];

for (let i = 0; i < sportsOne.length; i++) {
    console.log(sportsOne[i]);
}

console.log("\nSimplified Version with conditional statement:\n");

// Using simplified for loop
for (let sport of sportsOne) {
    
    if (sport == "Golf") {
        console.log(sport + " <-- My favorite");
    }
    else {
        console.log(sport);
    }
}