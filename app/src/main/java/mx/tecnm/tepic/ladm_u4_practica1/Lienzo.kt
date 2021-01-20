package mx.tecnm.tepic.ladm_u4_practica1

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.view.View

class Lienzo(p:MainActivity) : View(p){
    var img = BitmapFactory.decodeResource(resources,R.drawable.steven)
    var fondo1 = BitmapFactory.decodeResource(resources,R.drawable.fondodia)
    var fondo2 = BitmapFactory.decodeResource(resources,R.drawable.fondonoche)

    var normal = AtributosGraficos(-250,-700, fondo1)
    var atrapado = AtributosGraficos(-250,-700, fondo2)
    var steven = AtributosGraficos(250,550, img)

    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        var p = Paint()

        normal.draw(c, p)
        atrapado.draw(c, p)
        steven.draw(c, p)
    }
}