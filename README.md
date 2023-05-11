# PatronesEstructuralesEjercicio2


## Diagrama de clases para resolver el ejercicio 2
@startuml

interface InterfazBase
abstract class ArchivoBase
class Directorio
class Fichero
class Link

abstract class FactoriaBase
class FactoriaDirectorio
class FactoriaFichero
class FactoriaLink

InterfazBase <-- ArchivoBase
ArchivoBase <-- Directorio
ArchivoBase <-- Fichero
ArchivoBase <-- Link 

FactoriaBase <-- FactoriaDirectorio
FactoriaBase <-- FactoriaFichero
FactoriaBase <-- FactoriaLink

@enduml
