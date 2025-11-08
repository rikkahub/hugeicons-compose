package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChartRing: ImageVector
    get() {
        if (_chartRing != null) {
            return _chartRing!!
        }
        _chartRing = ImageVector.Builder(
            name = "ChartRing",
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
        moveTo(9f, 9f)
        lineTo(5f, 5f)
        moveTo(16f, 12f)
        horizontalLineTo(22f)
        moveTo(12f, 16f)
        verticalLineTo(22f)
        }
        }.build()

        return _chartRing!!
    }

private var _chartRing: ImageVector? = null
