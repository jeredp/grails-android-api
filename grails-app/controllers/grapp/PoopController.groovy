package grapp

class PoopController {

    def index() {
        render(contentType:"text/json") {
            [xCoord:30.0,yCoord:40.0]
        }
    }

    def myCoordinates() {
        def allCoordinates = [
                jered:[[xCoord: 30.0, yCoord: 10.0], [xCoord: 10.0, yCoord: 20.0]],
                ryan:[[xCoord: 20.0, yCoord: 20.0], [xCoord: 50.0, yCoord: 50.0]]
        ]
        render(contentType:"text/json") {
            allCoordinates[params.id]
        }
    }
}
