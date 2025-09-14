# TP4_POO_II

# Trabajo Práctico 4 - Programación Orientada a Objetos II

**Materia:** Programación II  
**Carrera:** Tecnicatura Universitaria en Programación a Distancia - UTN

---

## 🎯 Objetivo

Aplicar conceptos fundamentales de POO en Java:
- Uso de `this`
- Constructores sobrecargados
- Métodos sobrecargados
- Encapsulamiento
- Miembros estáticos

---

## 📚 Marco Teórico

- `this`: referencia a la instancia actual.
- Constructores sobrecargados: permiten múltiples formas de instanciación.
- Métodos sobrecargados: permiten distintas versiones según parámetros.
- `toString()`: devuelve una representación legible del objeto.
- Atributos estáticos: compartidos por todas las instancias.
- Métodos estáticos: invocables sin instanciar.
- Encapsulamiento: restringe el acceso directo a los atributos.

---

## 🧪 Caso Práctico: Sistema de Gestión de Empleados

### Clase: `Empleado`

#### Atributos
- `int id`
- `String nombre`
- `String puesto`
- `double salario`
- `static int totalEmpleados`

---

## 🛠️ Requerimientos

1. Uso de `this` en constructores.
2. Constructores sobrecargados:
   - Todos los atributos.
   - Solo nombre y puesto (id automático, salario por defecto).
   - Ambos deben incrementar `totalEmpleados`.
3. Métodos sobrecargados `actualizarSalario`:
   - Recibe porcentaje de aumento.
   - Recibe monto fijo.
4. Método `toString()`: muestra id, nombre, puesto y salario.
5. Método estático `mostrarTotalEmpleados()`: retorna total de empleados.
6. Encapsulamiento:
   - Atributos privados.
   - Getters y Setters.

---

## 🧪 Tareas

1. Implementar clase `Empleado` con todos los puntos anteriores.
2. Crear clase de prueba con `main`:
   - Instanciar objetos con ambos constructores.
   - Aplicar `actualizarSalario()`.
   - Imprimir con `toString()`.
   - Mostrar total con `mostrarTotalEmpleados()`.

---

## 💡 Consejos

- Usar `this` para evitar ambigüedades.
- Probar distintos escenarios.
- Verificar claridad de `toString()`.
- Confirmar actualización de `totalEmpleados`.

---

## ✅ Conclusiones Esperadas

- Comprensión del uso de `this`.
- Aplicación de constructores sobrecargados.
- Encapsulamiento efectivo.
- Métodos con mismo nombre y distintos parámetros.
- Uso de `toString()` para depuración.
- Diferenciación entre atributos y métodos estáticos.
- Diseño modular y reutilizable.
