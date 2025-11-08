package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CurvyLeftDirection: ImageVector
    get() {
        if (_curvyLeftDirection != null) {
            return _curvyLeftDirection!!
        }
        _curvyLeftDirection = ImageVector.Builder(
            name = "CurvyLeftDirection",
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
        moveTo(3.99709f, 15.0001f)
        curveTo(3.99709f, 15.0001f, 1.99805f, 13.5271f, 1.99805f, 13.0001f)
        curveTo(1.99805f, 12.473f, 3.99711f, 11.0001f, 3.99711f, 11.0001f)
        moveTo(2.2229f, 12.8675f)
        curveTo(3.63456f, 13.1574f, 6.28054f, 13.27f, 7.59106f, 10.8163f)
        curveTo(8.13439f, 9.95268f, 8.03253f, 8.50668f, 8.03253f, 6.86106f)
        curveTo(8.06633f, 6.19025f, 8.63778f, 4.96995f, 10.0699f, 5.00057f)
        curveTo(11.5021f, 5.03118f, 11.9723f, 6.20733f, 12.0284f, 6.79158f)
        verticalLineTo(16.9022f)
        curveTo(12.0138f, 17.7539f, 12.5076f, 18.9993f, 14.0239f, 18.9993f)
        curveTo(15.5044f, 18.9993f, 16.0839f, 17.6872f, 15.9562f, 16.7036f)
        curveTo(15.6104f, 14.0396f, 16.4187f, 11.2472f, 19.9189f, 11.003f)
        horizontalLineTo(22.0029f)
        }
        }.build()

        return _curvyLeftDirection!!
    }

private var _curvyLeftDirection: ImageVector? = null
