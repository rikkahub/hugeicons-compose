package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GolfHole: ImageVector
    get() {
        if (_golfHole != null) {
            return _golfHole!!
        }
        _golfHole = ImageVector.Builder(
            name = "GolfHole",
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
        moveTo(8.49101f, 16.9944f)
        curveTo(5.84739f, 17.3919f, 3.99991f, 18.3674f, 3.99991f, 19.4237f)
        curveTo(3.99991f, 20.8463f, 7.35113f, 21.9996f, 11.4851f, 21.9996f)
        curveTo(15.619f, 21.9996f, 18.9703f, 20.8463f, 18.9703f, 19.4237f)
        curveTo(18.9703f, 18.3021f, 16.8874f, 17.348f, 13.9801f, 16.9944f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.9803f, 19.0279f)
        curveTo(11.063f, 11.8537f, 10.7826f, 5.1379f, 11.1511f, 2.88854f)
        curveTo(11.4308f, 2.09171f, 11.9223f, 1.29472f, 15.1486f, 3.06315f)
        lineTo(17.3293f, 4.13174f)
        curveTo(18.6711f, 4.78928f, 20.5387f, 5.83761f, 19.7703f, 7.1192f)
        curveTo(19.4206f, 7.70244f, 18.6245f, 8.35403f, 17.0701f, 9.01647f)
        lineTo(10.9782f, 11.9837f)
        }
        }.build()

        return _golfHole!!
    }

private var _golfHole: ImageVector? = null
