package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Surfboard: ImageVector
    get() {
        if (_surfboard != null) {
            return _surfboard!!
        }
        _surfboard = ImageVector.Builder(
            name = "Surfboard",
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
        moveTo(10.0529f, 6.50695f)
        curveTo(13.3334f, 3.22644f, 18.3612f, 1.84155f, 20.939f, 2.01431f)
        curveTo(21.302f, 2.03865f, 21.4835f, 2.05081f, 21.7164f, 2.28365f)
        curveTo(21.9492f, 2.51648f, 21.9614f, 2.698f, 21.9857f, 3.06103f)
        curveTo(22.1585f, 5.63883f, 20.7736f, 10.6666f, 17.4931f, 13.9471f)
        curveTo(14.4457f, 16.9945f, 9.81522f, 19.8991f, 6.81046f, 21.6485f)
        curveTo(6.45729f, 21.8541f, 6.2807f, 21.9569f, 6.13279f, 21.985f)
        curveTo(5.71158f, 22.0647f, 5.28599f, 21.8201f, 5.143f, 21.4159f)
        curveTo(5.09278f, 21.274f, 5.09278f, 21.0656f, 5.09278f, 20.6488f)
        curveTo(5.09278f, 20.2524f, 5.09278f, 20.0541f, 5.05038f, 19.8912f)
        curveTo(4.93033f, 19.4299f, 4.57009f, 19.0697f, 4.10879f, 18.9496f)
        curveTo(3.94588f, 18.9072f, 3.74764f, 18.9072f, 3.35117f, 18.9072f)
        curveTo(2.9344f, 18.9072f, 2.72601f, 18.9072f, 2.58409f, 18.857f)
        curveTo(2.17994f, 18.714f, 1.93525f, 18.2884f, 2.01503f, 17.8672f)
        curveTo(2.04305f, 17.7193f, 2.14586f, 17.5427f, 2.35148f, 17.1895f)
        curveTo(4.10093f, 14.1848f, 7.00549f, 9.55434f, 10.0529f, 6.50695f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 8f)
        curveTo(17.4091f, 14.1336f, 10.3975f, 8.45321f, 5.5f, 12.5f)
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

        return _surfboard!!
    }

private var _surfboard: ImageVector? = null
