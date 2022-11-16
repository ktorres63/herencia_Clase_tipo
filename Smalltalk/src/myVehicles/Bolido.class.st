Class {
	#name : #Bolido,
	#superclass : #Vehiculo,
	#instVars : [
		'placa'
	],
	#category : #myVehicles
}

{ #category : #accessing }
Bolido >> destino: anObject [
	|v|
	v:= NaveEspacial new destino: anObject.
 ^ v.
]

{ #category : #accessing }
Bolido >> placa [

	^ placa
]

{ #category : #accessing }
Bolido >> placa: anObject [

	placa := anObject
]
