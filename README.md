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


![UML](http://www.plantuml.com/plantuml/png/RP512W8n34NtEKKlC3TmCOeC25uYniW4nocaqOMdLwS6QiPT-dxw_o_jYw7Q_JO1o6oi5oHEXpezTrWOy5HCaIpHXAMahT8eZxn8bUn5cIohv2yOX4PMFnrbla9q6N2vWOsDevMT2zKsqchVDawRhlkfwRDhJKAKF2FoJqe2y53d_qh7dT1_lH2UqlDyVl_72m00)
