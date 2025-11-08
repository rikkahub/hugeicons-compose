package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChartBreakoutSquare: ImageVector
    get() {
        if (_chartBreakoutSquare != null) {
            return _chartBreakoutSquare!!
        }
        _chartBreakoutSquare = ImageVector.Builder(
            name = "ChartBreakoutSquare",
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
        moveTo(16f, 3.38462f)
        verticalLineTo(2f)
        moveTo(19.6306f, 4.36369f)
        lineTo(20.6081f, 3.38462f)
        moveTo(20.6176f, 8f)
        horizontalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 12f)
        curveTo(22f, 16.714f, 22f, 19.0711f, 20.5355f, 20.5355f)
        curveTo(19.0711f, 22f, 16.714f, 22f, 12f, 22f)
        curveTo(7.28595f, 22f, 4.92893f, 22f, 3.46447f, 20.5355f)
        curveTo(2f, 19.0711f, 2f, 16.714f, 2f, 12f)
        curveTo(2f, 7.28595f, 2f, 4.92893f, 3.46447f, 3.46447f)
        curveTo(4.92893f, 2f, 7.28595f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.8517f, 8.00684f)
        horizontalLineTo(15.0738f)
        curveTo(15.4527f, 8.00684f, 15.7598f, 8.32175f, 15.7598f, 8.71022f)
        verticalLineTo(12.0354f)
        moveTo(2.75977f, 13.9583f)
        curveTo(5.03301f, 14.2241f, 10.7373f, 13.5137f, 14.8914f, 8.88963f)
        }
        }.build()

        return _chartBreakoutSquare!!
    }

private var _chartBreakoutSquare: ImageVector? = null
