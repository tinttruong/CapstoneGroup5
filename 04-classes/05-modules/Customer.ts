export class Customer {

    // Constructor with parameter properties shortcut
    constructor(private _firstName: string, private _lastName: string) {
    }

    // getter and setter methods, public is default
    get firstName(): string {
        return this._firstName;
    }

    get lastName(): string {
        return this._lastName;
    }

    set firstName(theFirst: string) {
        this._firstName = theFirst;
    }

    set lastName(theLast: string) {
        this._lastName = theLast;
    }

}