package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Bread01: ImageVector
    get() {
        if (_bread01 != null) {
            return _bread01!!
        }
        _bread01 = ImageVector.Builder(
            name = "Bread01",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.19405f, 14.077f)
        curveTo(1.94563f, 15.3082f, 1.84437f, 17.6176f, 2.13655f, 19.7508f)
        curveTo(2.40166f, 21.6864f, 4.57937f, 22.5986f, 6.21199f, 21.5763f)
        curveTo(9.1986f, 19.7061f, 12.3179f, 17.2421f, 15.3067f, 14.2947f)
        curveTo(18.3772f, 11.2666f, 20.0596f, 8.96143f, 21.5435f, 6.36753f)
        curveTo(22.4433f, 4.79463f, 22.0218f, 2.69734f, 20.1997f, 2.23223f)
        curveTo(18.2048f, 1.72304f, 15.6191f, 1.93195f, 13.3375f, 4.0775f)
        moveTo(3.19405f, 14.077f)
        curveTo(2.36031f, 10.337f, 5.29027f, 5.93188f, 12.1656f, 9.7943f)
        moveTo(3.19405f, 14.077f)
        curveTo(3.81736f, 14.0897f, 5.21758f, 14.3717f, 6.5544f, 15.3245f)
        moveTo(6.84592f, 8.19547f)
        curveTo(6.90898f, 6.25487f, 8.82259f, 3.00486f, 13.3375f, 4.0775f)
        moveTo(13.3375f, 4.0775f)
        curveTo(14.304f, 4.30712f, 15.3897f, 4.73482f, 16.602f, 5.41585f)
        }
        }.build()

        return _bread01!!
    }

private var _bread01: ImageVector? = null
