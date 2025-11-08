package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.StepInto: ImageVector
    get() {
        if (_stepInto != null) {
            return _stepInto!!
        }
        _stepInto = ImageVector.Builder(
            name = "StepInto",
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
        moveTo(9f, 14f)
        lineTo(10.5858f, 15.8398f)
        curveTo(11.2525f, 16.6133f, 11.5858f, 17f, 12f, 17f)
        curveTo(12.4142f, 17f, 12.7475f, 16.6133f, 13.4142f, 15.8398f)
        lineTo(15f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 16.5f)
        verticalLineTo(12f)
        curveTo(12f, 8.22876f, 12f, 6.34315f, 10.8284f, 5.17157f)
        curveTo(9.65685f, 4f, 7.77124f, 4f, 4f, 4f)
        horizontalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 20f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 20f)
        horizontalLineTo(21f)
        }
        }.build()

        return _stepInto!!
    }

private var _stepInto: ImageVector? = null
