#include <iostream>
#include "Persona.cc"
#include "Alumno.cc"

using namespace std;

int main() {

    Persona *p1 = new Persona;
    p1->foo();

    Persona a;
    a.foo();

    Persona *p2 = new Alumno;
    p2->foo();

    return 0;
}
