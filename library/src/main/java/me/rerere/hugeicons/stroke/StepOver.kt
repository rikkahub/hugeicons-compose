package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.StepOver: ImageVector
    get() {
        if (_stepOver != null) {
            return _stepOver!!
        }
        _stepOver = ImageVector.Builder(
            name = "StepOver",
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
        moveTo(14f, 14f)
        lineTo(15.5858f, 15.8398f)
        curveTo(16.2525f, 16.6133f, 16.5858f, 17f, 17f, 17f)
        curveTo(17.4142f, 17f, 17.7475f, 16.6133f, 18.4142f, 15.8398f)
        lineTo(20f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 17f)
        verticalLineTo(11f)
        curveTo(17f, 8.19108f, 17f, 6.78661f, 16.3259f, 5.77772f)
        curveTo(16.034f, 5.34096f, 15.659f, 4.96596f, 15.2223f, 4.67412f)
        curveTo(14.2134f, 4f, 12.8089f, 4f, 10f, 4f)
        curveTo(7.19108f, 4f, 5.78661f, 4f, 4.77772f, 4.67412f)
        curveTo(4.34096f, 4.96596f, 3.96596f, 5.34096f, 3.67412f, 5.77772f)
        curveTo(3f, 6.78661f, 3f, 8.19108f, 3f, 11f)
        lineTo(3f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 20f)
        horizontalLineTo(13f)
        }
        }.build()

        return _stepOver!!
    }

private var _stepOver: ImageVector? = null
