# Instrucciones para Inicializar Plantilla de Prueba Técnica

## ✅ Estado Actual
La plantilla de prueba técnica está LISTA para ser usada. Incluye:

### 🏗️ Estructura del Proyecto
- ✅ Spring Boot 4.0.0 con Java 21
- ✅ Spring Data JPA con H2 Database
- ✅ Entidades: Product, Order, OrderItem, OrderStatus
- ✅ Repositorios JPA
- ✅ DTOs para requests
- ✅ Controladores REST
- ✅ Servicio con problemas intencionalmente (para refactorizar)
- ✅ Tests incompletos (para implementar)
- ✅ Datos de ejemplo precargados
- ✅ Configuración H2 console
- ✅ Excepciones personalizadas

### 🔧 Funcionalidades Implementadas
- ✅ API REST para productos y pedidos
- ✅ Base de código problemática que necesita refactorización
- ✅ Lógica de descuento "Variedad" sin implementar (intencionalmente)
- ✅ Tests unitarios con `fail()` para que los candidatos implementen
- ✅ Documentación completa en README.md
- ✅ Ejemplos de API calls en api-examples.http
- ✅ Plantilla de respuestas en RESPUESTAS.md

## Información del Candidato
- **Nombre:** 
- **Email:** 
- **LinkedIn:** 
- **Fork:** 
- **Pull Request:** 

## Checklist de Entrega
- [ ] Refactorización del método `createOrder()`
- [ ] Implementación del descuento por variedad
- [ ] Tests unitarios para la lógica de descuento
- [ ] Archivo RESPUESTAS.md completado
- [ ] README.md actualizado con decisiones de diseño

## Observaciones Adicionales
(Comentarios opcionales del candidato)
```

## 🧪 Verificación Final

### Comandos para Verificar
```bash
# Compilar
./gradlew clean build

# Ejecutar (los tests fallarán intencionalmente)
./gradlew test

# Arrancar aplicación
./gradlew bootRun
```

### URLs para Probar
- **Aplicación:** http://localhost:8080
- **H2 Console:** http://localhost:8080/h2-console
  - URL: `jdbc:h2:mem:testdb`
  - Usuario: `sa`
  - Contraseña: (vacía)

### Endpoints de la API
- `GET /api/products` - Listar productos
- `POST /api/orders` - Crear pedido
- `GET /api/orders` - Listar pedidos
- `GET /api/orders/{id}` - Obtener pedido específico

## 🎯 Mensaje para Compartir con Candidatos

```
🚀 Prueba Técnica Backend Developer - Java & Spring Boot

Repositorio Template: https://github.com/danny-palma/prueba-tecnica-backend-template

📋 Instrucciones:
1. Haz fork del repositorio
2. Lee las instrucciones en README.md
3. Implementa las mejoras solicitadas
4. Abre un Pull Request hacia el repositorio original
5. Tiempo límite: 5 días calendario

¡Mucho éxito! 🍀
```

## ⚠️ Notas Importantes

1. **Los errores son intencionalmente:** Los tests con `fail()` y los problemas del código son parte del ejercicio
2. **Documentación clara:** El README.md explica exactamente qué hacer
3. **Flexibilidad:** Los candidatos pueden usar su criterio para mejoras adicionales
4. **Evaluación objetiva:** Los criterios están claramente definidos

---
