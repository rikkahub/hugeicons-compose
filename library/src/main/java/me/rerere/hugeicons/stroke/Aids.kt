package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Aids: ImageVector
    get() {
        if (_aids != null) {
            return _aids!!
        }
        _aids = ImageVector.Builder(
            name = "Aids",
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
        moveTo(12f, 2f)
        curveTo(9.92705f, 2f, 6.88247f, 2.5672f, 6.29f, 4.89186f)
        curveTo(5.7657f, 6.94903f, 5.88763f, 8.4198f, 7.1936f, 10.1667f)
        lineTo(14.8875f, 20.4583f)
        curveTo(15.6615f, 21.4936f, 16.0486f, 22.0113f, 16.5727f, 21.9998f)
        curveTo(17.0969f, 21.9883f, 17.4599f, 21.4542f, 18.186f, 20.3859f)
        lineTo(18.7147f, 19.608f)
        curveTo(19.6223f, 18.2725f, 20.0762f, 17.6047f, 19.9895f, 16.883f)
        curveTo(19.9029f, 16.1613f, 19.3034f, 15.6152f, 18.1043f, 14.523f)
        lineTo(6.79911f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        curveTo(14.0729f, 2f, 17.1175f, 2.5672f, 17.71f, 4.89186f)
        curveTo(18.2343f, 6.94903f, 18.1124f, 8.4198f, 16.8064f, 10.1667f)
        lineTo(15.4358f, 12f)
        moveTo(17.2009f, 4f)
        lineTo(12f, 8.84105f)
        moveTo(12f, 16.5959f)
        lineTo(9.11248f, 20.4583f)
        curveTo(8.33845f, 21.4936f, 7.95143f, 22.0113f, 7.42726f, 21.9998f)
        curveTo(6.90309f, 21.9883f, 6.54007f, 21.4542f, 5.81402f, 20.3859f)
        lineTo(5.28533f, 19.608f)
        curveTo(4.37768f, 18.2725f, 3.92383f, 17.6047f, 4.01046f, 16.883f)
        curveTo(4.09709f, 16.1613f, 4.69663f, 15.6152f, 5.89571f, 14.523f)
        lineTo(8.60624f, 12f)
        }
        }.build()

        return _aids!!
    }

private var _aids: ImageVector? = null
