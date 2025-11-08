package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AppleStocks: ImageVector
    get() {
        if (_appleStocks != null) {
            return _appleStocks!!
        }
        _appleStocks = ImageVector.Builder(
            name = "AppleStocks",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 14.5f)
        horizontalLineTo(3.03875f)
        curveTo(3.51106f, 14.5f, 3.74721f, 14.5f, 3.95256f, 14.4013f)
        curveTo(4.15791f, 14.3026f, 4.30544f, 14.1182f, 4.60049f, 13.7494f)
        lineTo(6f, 12f)
        lineTo(7.5f, 14.5f)
        lineTo(9f, 11f)
        lineTo(11.5f, 16f)
        lineTo(15f, 9f)
        lineTo(17f, 12.5f)
        lineTo(18.5f, 11f)
        lineTo(19.9453f, 13.168f)
        curveTo(20.1973f, 13.546f, 20.3233f, 13.735f, 20.5074f, 13.8494f)
        curveTo(20.544f, 13.8721f, 20.582f, 13.8925f, 20.6212f, 13.9103f)
        curveTo(20.8185f, 14f, 21.0457f, 14f, 21.5f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 2.5f)
        verticalLineTo(5.5f)
        moveTo(15f, 21.5f)
        verticalLineTo(14.5f)
        }
        }.build()

        return _appleStocks!!
    }

private var _appleStocks: ImageVector? = null
