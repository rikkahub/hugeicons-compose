package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CurvyLeftRightDirection: ImageVector
    get() {
        if (_curvyLeftRightDirection != null) {
            return _curvyLeftRightDirection!!
        }
        _curvyLeftRightDirection = ImageVector.Builder(
            name = "CurvyLeftRightDirection",
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
        moveTo(3.99803f, 12.9996f)
        curveTo(3.99803f, 12.9996f, 1.99805f, 11.5266f, 1.99805f, 10.9996f)
        curveTo(1.99805f, 10.4725f, 3.99805f, 8.99965f, 3.99805f, 8.99965f)
        moveTo(20.0039f, 15.0001f)
        curveTo(20.0039f, 15.0001f, 22.0029f, 13.5271f, 22.0029f, 13.0001f)
        curveTo(22.0029f, 12.473f, 20.0039f, 11.0001f, 20.0039f, 11.0001f)
        moveTo(21.7781f, 12.8675f)
        curveTo(20.3664f, 13.1574f, 17.7204f, 13.27f, 16.4099f, 10.8163f)
        curveTo(15.8666f, 9.95268f, 15.9684f, 8.50668f, 15.9684f, 6.86106f)
        curveTo(15.9346f, 6.19025f, 15.3632f, 4.96995f, 13.931f, 5.00057f)
        curveTo(12.4989f, 5.03118f, 12.0286f, 6.20733f, 11.9725f, 6.79158f)
        verticalLineTo(16.9022f)
        curveTo(11.9871f, 17.7539f, 11.4934f, 18.9993f, 9.97701f, 18.9993f)
        curveTo(8.49653f, 18.9993f, 7.91702f, 17.6872f, 8.04471f, 16.7036f)
        curveTo(8.39056f, 14.0396f, 7.5823f, 11.2472f, 4.08206f, 11.003f)
        horizontalLineTo(1.99805f)
        }
        }.build()

        return _curvyLeftRightDirection!!
    }

private var _curvyLeftRightDirection: ImageVector? = null
