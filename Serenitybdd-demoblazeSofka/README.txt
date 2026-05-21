***************************************************************
 README - AUTOMATIZACION E2E: DemoBlaze Purchase Flow
 Prueba funcional E2E - Flujo de compra
***************************************************************

1. TECNOLOGIAS Y VERSIONES REQUERIDAS

  - Java (JDK)                    : 17 LTS
  - Gradle                        : 8.x o superior
  - Serenity BDD                  : 4.2.1
  - Cucumber JUnit Platform Engine: 7.16.1

2. EJECUCION DESDE ENTERNO DE DESAROLLO

  2.1 Abrir el proyecto:
      File > Open > seleccionar la carpeta del proyecto

  2.2 Esperar a que se sincronicen las dependencias
      de Gradle automaticamente.
      Si no lo hace: clic derecho sobre build.gradle
      > Gradle > Reload Gradle Project

  2.3 Opciones de ejecucion:

      OPCION A — Ejecutar desde el CucumberTestSuite:
        Clic derecho sobre CucumberTestSuite.java
        > Run 'CucumberTestSuite'
        Ejecuta todos los features del proyecto.

      OPCION B — Ejecutar directamente el feature:
        Abrir e2eDemoblaze.feature
        Clic en el icono verde junto al Scenario

  2.4 Ver resultados:
      El reporte HTML de Serenity se genera en:
      build/site/serenity/index.html
      Abrirlo en cualquier navegador para ver el reporte
      completo con capturas de pantalla de cada paso.

3. EJECUCION DESDE LINEA DE COMANDOS

  3.1 Abrir terminal y navegar a la carpeta del proyecto:

        cd /ruta/karate-demoblaze

  3.2 Ejecutar todos los tests y generar reporte:

      Windows:
        gradlew.bat clean test aggregate
	o
	./gradlew.bat clean test aggregate

      macOS / Linux:
        ./gradlew clean test aggregate

  3.3 Ver el reporte HTML generado:

        build/site/serenity/index.html
***************************************************************


