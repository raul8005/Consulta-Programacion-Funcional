// CONSULTA PROGRAMACION
// NOMBRE: RAUL MEDINA CASTILLO

/// CREAR LA FUNCION DE INTEGRACION
def integracion(f: Double => Double, a:Double, b:Double): Double =
  (b-a) * (( f(a) + (4 * f((a+b)/2)) + f(b) )/6)

// CREAR FUNCION PARA CALCULAR EL ERROR
// REALIZA LA OPERACION DEL VALOREPERADO - VALOROBTENIDO
// SE LA UBICA AQUI PARA QUE EL RESTO DEL CODIGO FUNCIONE

def calError(valorEsperado: Double, valorObtenido:Double): Double =
  math.abs(valorEsperado- valorObtenido)

// AHORA SI VAMOS A EVALUAR CADA UNA DE LAS 7 INTEGRALES

// Integral Nro. 1
val integral1: Double => Double = (x: Double) => -math.pow(x,2) + 8*x - 12
val resultado1: Double = integracion(integral1, 3, 5)
val valorEsperado1: Double = 7.33
val error1: Double = calError(valorEsperado1, resultado1)
//Respuesta de la Integral: 7.333333333333333
// El valor de error: 0.0033333333333329662

// Integral Nro. 2
val integral2: Double => Double  = (x: Double) => (3 * math.pow(x,2))
val resultado2: Double = integracion(integral2, 0, 2)
val valorEsperado2: Double = 8
val error2: Double = calError(valorEsperado2, resultado2)
//Respuesta de la Integral: 8.0
// El valor de error: 0.0

//Integral Nro. 3
val integral3: Double => Double  = (x:Double) => (x + (2 * math.pow(x,2)) - math.pow(x,3)  + ( 5 * math.pow(x, 4)))
val resuntado3: Double =integracion(integral3, -1, 1)
val valorEsperado3: Double = 3.333
val error3: Double = calError(valorEsperado3, resuntado3)
//Respuesta de la Integral: 4.666666666666667
// El valor de error: 1.3336666666666668

//Integral Nro. 4
val integral4: Double => Double  =(x:Double) => ((2*x) + 1) / ((math.pow(x, 2)) + x)
val resultado4: Double =integracion(integral4,1,2)
val valorEsperado4: Double = 1.09861
val error4:  Double = calError(valorEsperado4, resultado4)
//Respuesta de la Integral: 1.0999999999999999
//El valor de error: 0.0013899999999997803

//Integral Nro. 5
val integral5: Double => Double  =(x:Double) => math.pow(Math.E, x)
val resultado5: Double =integracion(integral5,0,1)
val valorEsperado5: Double = 1.71828
val error5 : Double = calError(valorEsperado5, resultado5)
//Respuesta de la Integral: 1.7188611518765928
//El valor de error: 5.811518765928003E-4

//Integral Nro. 6
val integral6: Double => Double  =(x:Double) => 1 / math.sqrt(x -1)
val resultado6: Double =integracion(integral6, 2,3)
val valorEsperado6: Double = 0.82842
val error6: Double = calError(valorEsperado6, resultado6)
//Respuesta de la Integral: 0.8288488508162422
//El valor de error: 4.288508162421101E-4

//Integral Nro. 7
val integral7: Double => Double  = (x:Double) =>  1 / (1 + math.pow(x,2))
val resultado7: Double = integracion(integral7, 0,1)
val valorEsperado7: Double = 0.785398
val error7 : Double = calError(valorEsperado7, resultado7)
//Respuesta de la Integral:  0.7833333333333333
//El valor de error: 0.0020646666666667146








