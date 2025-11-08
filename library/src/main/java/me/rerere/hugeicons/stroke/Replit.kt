package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Replit: ImageVector
    get() {
        if (_replit != null) {
            return _replit!!
        }
        _replit = ImageVector.Builder(
            name = "Replit",
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
        moveTo(12f, 3.5f)
        verticalLineTo(8.5f)
        horizontalLineTo(5f)
        curveTo(4.44772f, 8.5f, 4f, 8.05228f, 4f, 7.5f)
        verticalLineTo(3.5f)
        curveTo(4f, 2.94772f, 4.44772f, 2.5f, 5f, 2.5f)
        horizontalLineTo(11f)
        curveTo(11.5523f, 2.5f, 12f, 2.94772f, 12f, 3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 15.5f)
        verticalLineTo(20.5f)
        curveTo(12f, 21.0523f, 11.5523f, 21.5f, 11f, 21.5f)
        horizontalLineTo(5f)
        curveTo(4.44772f, 21.5f, 4f, 21.0523f, 4f, 20.5f)
        verticalLineTo(16.5f)
        curveTo(4f, 15.9477f, 4.44772f, 15.5f, 5f, 15.5f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 9.5f)
        verticalLineTo(14.5f)
        curveTo(20f, 15.0523f, 19.5523f, 15.5f, 19f, 15.5f)
        horizontalLineTo(12f)
        verticalLineTo(8.5f)
        horizontalLineTo(19f)
        curveTo(19.5523f, 8.5f, 20f, 8.94772f, 20f, 9.5f)
        }
        }.build()

        return _replit!!
    }

private var _replit: ImageVector? = null
