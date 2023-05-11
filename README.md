# PatronesEstructuralesEjercicio2

Mi repositorio es : https://github.com/RRG1312/PatronesEstructuralesEjercicio2.git

## Diagrama de clases para resolver el ejercicio 2
@startuml  

interface InterfazBase  
abstract class ArchivoBase  
class Directorio  
class Fichero   
class Link  

interface InterfazFactoria  
abstract class FactoriaBase  
class FactoriaDirectorio  
class FactoriaFichero  
class FactoriaLink  

InterfazBase <-- ArchivoBase  
ArchivoBase <-- Directorio  
ArchivoBase <-- Fichero  
ArchivoBase <-- Link   

InterfazFactoria <-- FactoriaBase  
FactoriaBase <-- FactoriaDirectorio  
FactoriaBase <-- FactoriaFichero  
FactoriaBase <-- FactoriaLink  

@enduml   


![UML](http://www.plantuml.com/plantuml/png/TP5H2i8m38RVTufUO3VmOOeC12yHOsJ1kK8QVV3qQcimBUuj-Rzi7pyTaeBe_JPt7IzASW6aS2ZJSmU9EZWb5K0DE4DAOIiuyIDcL98z2w56uVWDHiQ9nBOZBzT_FnyXVmIjm79diAWsEU2CBYrcNoPi-hvgOBCnPsYHEThyOma_ZSapgxhufQ9EkdfZzfK3AplGSdu_vWi0)
