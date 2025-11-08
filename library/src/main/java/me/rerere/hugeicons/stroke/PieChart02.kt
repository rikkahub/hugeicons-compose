package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PieChart02: ImageVector
    get() {
        if (_pieChart02 != null) {
            return _pieChart02!!
        }
        _pieChart02 = ImageVector.Builder(
            name = "PieChart02",
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
        moveTo(11.024f, 22f)
        curveTo(15.3242f, 22f, 18.9218f, 18.9922f, 19.8279f, 14.9657f)
        curveTo(20.0135f, 14.141f, 20.1063f, 13.7286f, 19.8052f, 13.3523f)
        curveTo(19.5042f, 12.976f, 19.017f, 12.976f, 18.0427f, 12.976f)
        horizontalLineTo(11.024f)
        moveTo(11.024f, 22f)
        curveTo(6.04018f, 22f, 2f, 17.9598f, 2f, 12.976f)
        curveTo(2f, 8.67584f, 5.00779f, 5.07818f, 9.03431f, 4.17208f)
        curveTo(9.85901f, 3.9865f, 10.2714f, 3.89371f, 10.6477f, 4.19475f)
        curveTo(11.024f, 4.4958f, 11.024f, 4.98298f, 11.024f, 5.95734f)
        verticalLineTo(12.976f)
        moveTo(11.024f, 22f)
        verticalLineTo(12.976f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5541f, 7.02647f)
        curveTo(20.7305f, 4.93588f, 19.0641f, 3.26953f, 16.9735f, 2.44595f)
        curveTo(15.8783f, 2.01448f, 15.3307f, 1.79874f, 14.6653f, 2.25173f)
        curveTo(14f, 2.70472f, 14f, 3.44563f, 14f, 4.92747f)
        verticalLineTo(6.95648f)
        curveTo(14f, 8.39121f, 14f, 9.10857f, 14.4457f, 9.55429f)
        curveTo(14.8914f, 10f, 15.6088f, 10f, 17.0435f, 10f)
        horizontalLineTo(19.0725f)
        curveTo(20.5544f, 10f, 21.2953f, 10f, 21.7483f, 9.33467f)
        curveTo(22.2013f, 8.66935f, 21.9855f, 8.12172f, 21.5541f, 7.02647f)
        }
        }.build()

        return _pieChart02!!
    }

private var _pieChart02: ImageVector? = null
