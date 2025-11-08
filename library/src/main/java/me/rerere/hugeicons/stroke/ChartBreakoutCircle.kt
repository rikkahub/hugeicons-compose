package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChartBreakoutCircle: ImageVector
    get() {
        if (_chartBreakoutCircle != null) {
            return _chartBreakoutCircle!!
        }
        _chartBreakoutCircle = ImageVector.Builder(
            name = "ChartBreakoutCircle",
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
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.8527f, 8.00684f)
        horizontalLineTo(15.0748f)
        curveTo(15.4536f, 8.00684f, 15.7607f, 8.32175f, 15.7607f, 8.71022f)
        verticalLineTo(12.0354f)
        moveTo(2.76074f, 13.9583f)
        curveTo(5.03399f, 14.2241f, 10.7383f, 13.5137f, 14.8923f, 8.88963f)
        }
        }.build()

        return _chartBreakoutCircle!!
    }

private var _chartBreakoutCircle: ImageVector? = null
