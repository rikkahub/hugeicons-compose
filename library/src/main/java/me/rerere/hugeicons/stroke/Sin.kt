package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Sin: ImageVector
    get() {
        if (_sin != null) {
            return _sin!!
        }
        _sin = ImageVector.Builder(
            name = "Sin",
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
        moveTo(10f, 7f)
        horizontalLineTo(12f)
        moveTo(14f, 7f)
        horizontalLineTo(12f)
        moveTo(14f, 17f)
        horizontalLineTo(12f)
        moveTo(10f, 17f)
        horizontalLineTo(12f)
        moveTo(12f, 7f)
        verticalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(22f, 7f)
        verticalLineTo(17f)
        lineTo(17f, 7f)
        verticalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6.68959f, 8.61565f)
        curveTo(6.26371f, 7.65235f, 5.4428f, 7f, 4.5f, 7f)
        horizontalLineTo(4f)
        curveTo(2.89543f, 7f, 2f, 8.11929f, 2f, 9.5f)
        curveTo(2f, 10.8807f, 2.89543f, 12f, 4f, 12f)
        horizontalLineTo(5f)
        curveTo(6.10457f, 12f, 7f, 13.1193f, 7f, 14.5f)
        curveTo(7f, 15.8807f, 6.10457f, 17f, 5f, 17f)
        horizontalLineTo(4.5f)
        curveTo(3.47484f, 17f, 2.5938f, 16.2287f, 2.20802f, 15.125f)
        }
        }.build()

        return _sin!!
    }

private var _sin: ImageVector? = null
