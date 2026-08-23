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

val HugeIcons.Navigation: ImageVector
    get() {
        if (_navigation != null) {
            return _navigation!!
        }
        _navigation = ImageVector.Builder(
            name = "Navigation",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15.8353f, 4.29256f)
            lineTo(8.34527f, 7.32048f)
            curveTo(4.79302f, 8.75652f, 3.0169f, 9.47453f, 3.00021f, 10.459f)
            curveTo(2.99809f, 10.5846f, 3.01186f, 10.7098f, 3.04121f, 10.8319f)
            curveTo(3.2714f, 11.7893f, 5.16111f, 12.1042f, 8.94051f, 12.7341f)
            curveTo(9.85191f, 12.886f, 10.3076f, 12.962f, 10.6276f, 13.2454f)
            curveTo(10.6725f, 13.2852f, 10.715f, 13.3277f, 10.7548f, 13.3726f)
            curveTo(11.0382f, 13.6925f, 11.1141f, 14.1482f, 11.266f, 15.0597f)
            curveTo(11.8959f, 18.8389f, 12.2109f, 20.7286f, 13.1682f, 20.9588f)
            curveTo(13.2902f, 20.9881f, 13.4156f, 21.0019f, 13.5411f, 20.9998f)
            curveTo(14.5256f, 20.9831f, 15.2435f, 19.207f, 16.6795f, 15.6549f)
            lineTo(19.7074f, 8.16477f)
            curveTo(20.8293f, 5.38967f, 21.3902f, 4.00211f, 20.6941f, 3.30595f)
            curveTo(19.9979f, 2.60978f, 18.6104f, 3.17071f, 15.8353f, 4.29256f)
            close()
        }
        }.build()

        return _navigation!!
    }

private var _navigation: ImageVector? = null
