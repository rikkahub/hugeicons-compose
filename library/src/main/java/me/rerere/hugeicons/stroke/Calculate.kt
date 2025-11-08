package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Calculate: ImageVector
    get() {
        if (_calculate != null) {
            return _calculate!!
        }
        _calculate = ImageVector.Builder(
            name = "Calculate",
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
        moveTo(21.5f, 12.95f)
        verticalLineTo(11.05f)
        curveTo(21.5f, 7.01949f, 21.5f, 5.00424f, 20.1088f, 3.75212f)
        curveTo(18.7175f, 2.5f, 16.4783f, 2.5f, 12f, 2.5f)
        curveTo(7.52166f, 2.5f, 5.28249f, 2.5f, 3.89124f, 3.75212f)
        curveTo(2.5f, 5.00424f, 2.5f, 7.01949f, 2.5f, 11.05f)
        verticalLineTo(12.95f)
        curveTo(2.5f, 16.9805f, 2.5f, 18.9958f, 3.89124f, 20.2479f)
        curveTo(5.28249f, 21.5f, 7.52166f, 21.5f, 12f, 21.5f)
        curveTo(16.4783f, 21.5f, 18.7175f, 21.5f, 20.1088f, 20.2479f)
        curveTo(21.5f, 18.9958f, 21.5f, 16.9805f, 21.5f, 12.95f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 8f)
        horizontalLineTo(14f)
        moveTo(16f, 6f)
        lineTo(16f, 10f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 17.5f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 14.5f)
        horizontalLineTo(14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 17.5f)
        lineTo(8.25f, 15.75f)
        moveTo(8.25f, 15.75f)
        lineTo(6.5f, 14f)
        moveTo(8.25f, 15.75f)
        lineTo(10f, 14f)
        moveTo(8.25f, 15.75f)
        lineTo(6.5f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 8f)
        horizontalLineTo(6f)
        }
        }.build()

        return _calculate!!
    }

private var _calculate: ImageVector? = null
