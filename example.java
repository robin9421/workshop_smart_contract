class Car {
    drive() {
        console.log('speeeed');
    }

    getColor() {
        return this.color;
    }

    setColor() {
        this.color = color;
    }
}


const ferrari = new Car(); 
ferrari.setColor('red');
ferrari.getColor();
