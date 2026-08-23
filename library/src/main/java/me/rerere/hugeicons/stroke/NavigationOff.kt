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

val HugeIcons.NavigationOff: ImageVector
    get() {
        if (_navigationOff != null) {
            return _navigationOff!!
        }
        _navigationOff = ImageVector.Builder(
            name = "NavigationOff",
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
            moveTo(3f, 3f)
            lineTo(21f, 21f)
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
            moveTo(11.1761f, 6.17609f)
            lineTo(15.8353f, 4.29256f)
            curveTo(18.6104f, 3.17071f, 19.9979f, 2.60978f, 20.6941f, 3.30595f)
            curveTo(21.3902f, 4.00211f, 20.8293f, 5.38967f, 19.7074f, 8.16477f)
            lineTo(17.8239f, 12.8239f)
            moveTo(7.61575f, 7.61575f)
            curveTo(4.54977f, 8.85978f, 3.01572f, 9.54441f, 3.00021f, 10.459f)
            curveTo(2.99809f, 10.5846f, 3.01186f, 10.7098f, 3.04121f, 10.8319f)
            curveTo(3.2714f, 11.7893f, 5.1611f, 12.1042f, 8.94051f, 12.7341f)
            curveTo(9.85191f, 12.886f, 10.3076f, 12.962f, 10.6276f, 13.2454f)
            curveTo(10.6725f, 13.2852f, 10.715f, 13.3277f, 10.7548f, 13.3726f)
            curveTo(11.0382f, 13.6925f, 11.1141f, 14.1482f, 11.266f, 15.0597f)
            curveTo(11.8959f, 18.8389f, 12.2109f, 20.7286f, 13.1682f, 20.9588f)
            curveTo(13.2902f, 20.9881f, 13.4156f, 21.0019f, 13.5411f, 20.9998f)
            curveTo(14.4557f, 20.9843f, 15.1403f, 19.4502f, 16.3843f, 16.3843f)
        }
        }.build()

        return _navigationOff!!
    }

private var _navigationOff: ImageVector? = null
