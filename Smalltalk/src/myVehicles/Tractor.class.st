Class {
	#name : #Tractor,
	#superclass : #Vehiculo,
	#category : #myVehicles
}

{ #category : #accessing }
Tractor >> arar: anReal [
	^'estoy arando el campo de tamaño: ', anReal printString .
]
