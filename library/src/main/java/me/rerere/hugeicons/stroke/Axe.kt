package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Axe: ImageVector
    get() {
        if (_axe != null) {
            return _axe!!
        }
        _axe = ImageVector.Builder(
            name = "Axe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10.202f, 9.30552f)
            lineTo(13.3086f, 12.4119f)
            curveTo(13.5485f, 12.6518f, 13.6684f, 12.7717f, 13.7417f, 12.9212f)
            curveTo(13.8149f, 13.0708f, 13.8362f, 13.2391f, 13.8786f, 13.5757f)
            lineTo(14.1093f, 15.4031f)
            curveTo(14.2062f, 16.1709f, 14.2547f, 16.5548f, 14.6168f, 16.8157f)
            curveTo(14.979f, 17.0767f, 15.2756f, 17.0177f, 15.8687f, 16.8997f)
            curveTo(17.1633f, 16.6421f, 18.5479f, 15.8974f, 19.7226f, 14.7227f)
            curveTo(20.8974f, 13.548f, 21.6422f, 12.1634f, 21.8998f, 10.8687f)
            curveTo(22.0177f, 10.2758f, 22.0767f, 9.9793f, 21.8158f, 9.61719f)
            curveTo(21.5549f, 9.25508f, 21.1711f, 9.20655f, 20.4034f, 9.1095f)
            lineTo(18.5759f, 8.87844f)
            curveTo(18.2395f, 8.8359f, 18.0712f, 8.81463f, 17.9218f, 8.74141f)
            curveTo(17.7724f, 8.6682f, 17.6524f, 8.5483f, 17.4126f, 8.3085f)
            lineTo(14.3059f, 5.20192f)
            curveTo(13.7464f, 4.64254f, 13.4667f, 4.36286f, 13.165f, 4.21335f)
            curveTo(12.5909f, 3.92888f, 11.9169f, 3.92888f, 11.3428f, 4.21335f)
            curveTo(11.0411f, 4.36286f, 10.7614f, 4.64254f, 10.202f, 5.20192f)
            curveTo(9.64259f, 5.76129f, 9.36288f, 6.04097f, 9.21336f, 6.34269f)
            curveTo(8.92888f, 6.91673f, 8.92888f, 7.5907f, 9.21336f, 8.16475f)
            curveTo(9.36288f, 8.46646f, 9.64259f, 8.74615f, 10.202f, 9.30552f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(12.5f, 12f)
            lineTo(5.01777f, 19.4822f)
            curveTo(4.68625f, 19.8138f, 4.23661f, 20f, 3.76777f, 20f)
            curveTo(2.79146f, 20f, 2f, 19.2085f, 2f, 18.2322f)
            curveTo(2f, 17.7634f, 2.18625f, 17.3138f, 2.51777f, 16.9822f)
            lineTo(10f, 9.5f)
        }
        }.build()

        return _axe!!
    }

private var _axe: ImageVector? = null
