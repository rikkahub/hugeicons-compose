package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Dart: ImageVector
    get() {
        if (_dart != null) {
            return _dart!!
        }
        _dart = ImageVector.Builder(
            name = "Dart",
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
        moveTo(19.5f, 4.5f)
        lineTo(22f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.06697f, 19.4071f)
        curveTo(1.99688f, 18.9866f, 1.96184f, 18.7763f, 2.06329f, 18.6134f)
        curveTo(2.16473f, 18.4506f, 2.3689f, 18.3893f, 2.77723f, 18.2668f)
        lineTo(7f, 17f)
        lineTo(5.73317f, 21.2228f)
        curveTo(5.61067f, 21.6311f, 5.54942f, 21.8353f, 5.38656f, 21.9367f)
        curveTo(5.2237f, 22.0382f, 5.01345f, 22.0031f, 4.59294f, 21.933f)
        lineTo(3.14369f, 21.6915f)
        curveTo(2.79801f, 21.6339f, 2.62517f, 21.6051f, 2.51005f, 21.49f)
        curveTo(2.39493f, 21.3748f, 2.36612f, 21.202f, 2.30851f, 20.8563f)
        lineTo(2.06697f, 19.4071f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 6f)
        lineTo(18f, 9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.82023f, 15.9304f)
        lineTo(18.6643f, 9.44706f)
        curveTo(20.2341f, 8.41317f, 20.4597f, 6.19872f, 19.1306f, 4.86948f)
        curveTo(17.8015f, 3.54024f, 15.5873f, 3.76583f, 14.5535f, 5.33581f)
        lineTo(8.07079f, 15.1809f)
        curveTo(7.79101f, 15.6058f, 8.40284f, 16.2053f, 8.82023f, 15.9304f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 17f)
        lineTo(8f, 16f)
        }
        }.build()

        return _dart!!
    }

private var _dart: ImageVector? = null
