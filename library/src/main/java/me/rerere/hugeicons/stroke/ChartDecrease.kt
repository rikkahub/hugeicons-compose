package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ChartDecrease: ImageVector
    get() {
        if (_chartDecrease != null) {
            return _chartDecrease!!
        }
        _chartDecrease = ImageVector.Builder(
            name = "ChartDecrease",
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
        moveTo(6.99707f, 5.99902f)
        curveTo(10.5286f, 5.999f, 17.9122f, 7.46328f, 17.6979f, 16.5654f)
        moveTo(15.4886f, 14.955f)
        lineTo(17.3721f, 16.8519f)
        curveTo(17.5656f, 17.0468f, 17.8798f, 17.0482f, 18.0751f, 16.8552f)
        lineTo(19.9971f, 14.955f)
        }
        }.build()

        return _chartDecrease!!
    }

private var _chartDecrease: ImageVector? = null
