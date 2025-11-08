package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChartLineData02: ImageVector
    get() {
        if (_chartLineData02 != null) {
            return _chartLineData02!!
        }
        _chartLineData02 = ImageVector.Builder(
            name = "ChartLineData02",
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
        moveTo(15.4341f, 14.2963f)
        lineTo(18f, 9f)
        moveTo(9.58251f, 11.5684f)
        lineTo(13.2038f, 14.2963f)
        moveTo(3f, 19f)
        lineTo(7.58957f, 11.8792f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 21f)
        horizontalLineTo(9f)
        curveTo(5.70017f, 21f, 4.05025f, 21f, 3.02513f, 19.9749f)
        curveTo(2f, 18.9497f, 2f, 17.2998f, 2f, 14f)
        verticalLineTo(3f)
        }
        }.build()

        return _chartLineData02!!
    }

private var _chartLineData02: ImageVector? = null
