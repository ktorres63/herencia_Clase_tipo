Class {
	#name : #NaveEspacial,
	#superclass : #Object,
	#instVars : [
		'nombre'
	],
	#category : #myVehicles
}

{ #category : #accessing }
NaveEspacial >> destino: anObject [
	Transcript show: 'me dirijo a: '; show: anObject  .
]

{ #category : #accessing }
NaveEspacial >> nombre [

	^ nombre
]

{ #category : #accessing }
NaveEspacial >> nombre: anObject [

	nombre := anObject
]
