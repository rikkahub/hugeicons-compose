package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChartBarLine: ImageVector
    get() {
        if (_chartBarLine != null) {
            return _chartBarLine!!
        }
        _chartBarLine = ImageVector.Builder(
            name = "ChartBarLine",
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
        moveTo(4f, 15f)
        lineTo(4f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9f)
        lineTo(12f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 22f)
        lineTo(2f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 13f)
        lineTo(20f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.60009f, 8.79993f)
        curveTo(5.23521f, 8.31419f, 4.6543f, 8f, 4f, 8f)
        curveTo(2.89543f, 8f, 2f, 8.89543f, 2f, 10f)
        curveTo(2f, 11.1046f, 2.89543f, 12f, 4f, 12f)
        curveTo(5.10457f, 12f, 6f, 11.1046f, 6f, 10f)
        curveTo(6f, 9.54973f, 5.8512f, 9.13421f, 5.60009f, 8.79993f)
        moveTo(5.60009f, 8.79993f)
        lineTo(10.3999f, 5.20007f)
        moveTo(10.3999f, 5.20007f)
        curveTo(10.7648f, 5.68581f, 11.3457f, 6f, 12f, 6f)
        curveTo(12.783f, 6f, 13.4609f, 5.55006f, 13.7892f, 4.89462f)
        moveTo(10.3999f, 5.20007f)
        curveTo(10.1488f, 4.86579f, 10f, 4.45027f, 10f, 4f)
        curveTo(10f, 2.89543f, 10.8954f, 2f, 12f, 2f)
        curveTo(13.1046f, 2f, 14f, 2.89543f, 14f, 4f)
        curveTo(14f, 4.32158f, 13.9241f, 4.62543f, 13.7892f, 4.89462f)
        moveTo(13.7892f, 4.89462f)
        lineTo(18.2108f, 7.10538f)
        moveTo(18.2108f, 7.10538f)
        curveTo(18.0759f, 7.37457f, 18f, 7.67842f, 18f, 8f)
        curveTo(18f, 9.10457f, 18.8954f, 10f, 20f, 10f)
        curveTo(21.1046f, 10f, 22f, 9.10457f, 22f, 8f)
        curveTo(22f, 6.89543f, 21.1046f, 6f, 20f, 6f)
        curveTo(19.217f, 6f, 18.5391f, 6.44994f, 18.2108f, 7.10538f)
        }
        }.build()

        return _chartBarLine!!
    }

private var _chartBarLine: ImageVector? = null
