package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.BorderBottom01: ImageVector
    get() {
        if (_borderBottom01 != null) {
            return _borderBottom01!!
        }
        _borderBottom01 = ImageVector.Builder(
            name = "BorderBottom01",
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
        moveTo(2.5f, 17.5f)
        curveTo(2.69854f, 18.594f, 3.04969f, 19.3991f, 3.6708f, 20.0356f)
        curveTo(5.09987f, 21.5f, 7.39991f, 21.5f, 12f, 21.5f)
        curveTo(16.6001f, 21.5f, 18.9001f, 21.5f, 20.3292f, 20.0356f)
        curveTo(20.9503f, 19.3991f, 21.3015f, 18.594f, 21.5f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.75143f, 6.31038f)
        curveTo(2.94471f, 5.26831f, 3.28657f, 4.50138f, 3.89124f, 3.89506f)
        curveTo(4.49591f, 3.28875f, 5.26076f, 2.94595f, 6.3f, 2.75214f)
        moveTo(2.50496f, 14f)
        curveTo(2.5f, 13.414f, 2.5f, 12.7117f, 2.5f, 12.0259f)
        curveTo(2.5f, 11.3401f, 2.5f, 10.5751f, 2.50496f, 9.98913f)
        moveTo(10.1f, 2.505f)
        curveTo(10.6844f, 2.50003f, 11.3161f, 2.50003f, 12f, 2.50003f)
        curveTo(12.6839f, 2.50003f, 13.3156f, 2.50003f, 13.9001f, 2.505f)
        moveTo(17.7f, 2.75214f)
        curveTo(18.7392f, 2.94595f, 19.5041f, 3.28874f, 20.1088f, 3.89506f)
        curveTo(20.7134f, 4.50138f, 21.0553f, 5.26831f, 21.2486f, 6.31038f)
        moveTo(21.495f, 14f)
        curveTo(21.5f, 13.414f, 21.5f, 12.7117f, 21.5f, 12.0259f)
        curveTo(21.5f, 11.3402f, 21.5f, 10.5751f, 21.495f, 9.98913f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2.5f, 12f)
        lineTo(4f, 12f)
        moveTo(20f, 12f)
        lineTo(21.5f, 12f)
        moveTo(12f, 15f)
        lineTo(12f, 9.00003f)
        moveTo(12f, 4.46878f)
        lineTo(12f, 3.00003f)
        moveTo(9f, 12f)
        lineTo(15f, 12f)
        }
        }.build()

        return _borderBottom01!!
    }

private var _borderBottom01: ImageVector? = null
