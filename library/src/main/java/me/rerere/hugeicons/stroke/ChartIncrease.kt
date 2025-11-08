package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChartIncrease: ImageVector
    get() {
        if (_chartIncrease != null) {
            return _chartIncrease!!
        }
        _chartIncrease = ImageVector.Builder(
            name = "ChartIncrease",
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
        moveTo(7.99707f, 16.999f)
        curveTo(11.5286f, 16.999f, 18.9122f, 15.5348f, 18.6979f, 6.43269f)
        moveTo(16.4886f, 8.04302f)
        lineTo(18.3721f, 6.14612f)
        curveTo(18.5656f, 5.95127f, 18.8798f, 5.94981f, 19.0751f, 6.14286f)
        lineTo(20.9971f, 8.04302f)
        }
        }.build()

        return _chartIncrease!!
    }

private var _chartIncrease: ImageVector? = null
