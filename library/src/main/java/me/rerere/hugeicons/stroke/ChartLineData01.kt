package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChartLineData01: ImageVector
    get() {
        if (_chartLineData01 != null) {
            return _chartLineData01!!
        }
        _chartLineData01 = ImageVector.Builder(
            name = "ChartLineData01",
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
        moveTo(21f, 21f)
        horizontalLineTo(10f)
        curveTo(6.70017f, 21f, 5.05025f, 21f, 4.02513f, 19.9749f)
        curveTo(3f, 18.9497f, 3f, 17.2998f, 3f, 14f)
        verticalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 20f)
        curveTo(5.43938f, 16.8438f, 7.67642f, 8.7643f, 10.4282f, 8.7643f)
        curveTo(12.3301f, 8.7643f, 12.8226f, 12.6353f, 14.6864f, 12.6353f)
        curveTo(17.8931f, 12.6353f, 17.4282f, 4f, 21f, 4f)
        }
        }.build()

        return _chartLineData01!!
    }

private var _chartLineData01: ImageVector? = null
