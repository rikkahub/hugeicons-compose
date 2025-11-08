package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Building06: ImageVector
    get() {
        if (_building06 != null) {
            return _building06!!
        }
        _building06 = ImageVector.Builder(
            name = "Building06",
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
        moveTo(12f, 2f)
        horizontalLineTo(6f)
        curveTo(3.518f, 2f, 3f, 2.518f, 3f, 5f)
        verticalLineTo(22f)
        horizontalLineTo(15f)
        verticalLineTo(5f)
        curveTo(15f, 2.518f, 14.482f, 2f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 8f)
        horizontalLineTo(15f)
        verticalLineTo(22f)
        horizontalLineTo(21f)
        verticalLineTo(11f)
        curveTo(21f, 8.518f, 20.482f, 8f, 18f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 6f)
        lineTo(10f, 6f)
        moveTo(8f, 9f)
        lineTo(10f, 9f)
        moveTo(8f, 12f)
        lineTo(10f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.5f, 22f)
        verticalLineTo(18f)
        curveTo(11.5f, 17.0572f, 11.5f, 16.5858f, 11.2071f, 16.2929f)
        curveTo(10.9142f, 16f, 10.4428f, 16f, 9.5f, 16f)
        horizontalLineTo(8.5f)
        curveTo(7.55719f, 16f, 7.08579f, 16f, 6.79289f, 16.2929f)
        curveTo(6.5f, 16.5858f, 6.5f, 17.0572f, 6.5f, 18f)
        verticalLineTo(22f)
        }
        }.build()

        return _building06!!
    }

private var _building06: ImageVector? = null
