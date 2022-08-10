In der Angabe ist eine Klammerfolge dann korrekt, wenn am Ende der Stack leer ist.
Das ist allerdings bei nur zwei Klammern die sich unterscheiden nicht der Fall. Hier müsste das Ergebnis sein
"Der Quelltext ist nicht korrekt geklammert". Jedoch wird hier keine fehlerhafte Klammerfolge festgestellt, sondern
eine korrekte. Es gibt hierzu unterschiedliche Möglichkeiten dies abzufangen. In dieser Lösung wird die simpelste in
Form eines zusätzlichen "Correct"-Flags genutzt.