Class {
	#name : #Vehiculo,
	#superclass : #Object,
	#instVars : [
		'marca',
		'velocidad'
	],
	#category : #myVehicles
}

{ #category : #accessing }
Vehiculo >> marca [

	^ marca
]

{ #category : #accessing }
Vehiculo >> marca: anObject [
	marca := anObject
]

{ #category : #accessing }
Vehiculo >> velocidad [
	^ velocidad
]

{ #category : #accessing }
Vehiculo >> velocidad: anReal [
	velocidad :=anReal

]
