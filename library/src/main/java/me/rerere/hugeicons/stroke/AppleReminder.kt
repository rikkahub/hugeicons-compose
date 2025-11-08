package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.AppleReminder: ImageVector
    get() {
        if (_appleReminder != null) {
            return _appleReminder!!
        }
        _appleReminder = ImageVector.Builder(
            name = "AppleReminder",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 7.5f)
        horizontalLineTo(17f)
        moveTo(8f, 7.5f)
        curveTo(8f, 7.77614f, 7.77614f, 8f, 7.5f, 8f)
        curveTo(7.22386f, 8f, 7f, 7.77614f, 7f, 7.5f)
        curveTo(7f, 7.22386f, 7.22386f, 7f, 7.5f, 7f)
        curveTo(7.77614f, 7f, 8f, 7.22386f, 8f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 12f)
        horizontalLineTo(17f)
        moveTo(8f, 12f)
        curveTo(8f, 12.2761f, 7.77614f, 12.5f, 7.5f, 12.5f)
        curveTo(7.22386f, 12.5f, 7f, 12.2761f, 7f, 12f)
        curveTo(7f, 11.7239f, 7.22386f, 11.5f, 7.5f, 11.5f)
        curveTo(7.77614f, 11.5f, 8f, 11.7239f, 8f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 16.5f)
        horizontalLineTo(17f)
        moveTo(8f, 16.5f)
        curveTo(8f, 16.7761f, 7.77614f, 17f, 7.5f, 17f)
        curveTo(7.22386f, 17f, 7f, 16.7761f, 7f, 16.5f)
        curveTo(7f, 16.2239f, 7.22386f, 16f, 7.5f, 16f)
        curveTo(7.77614f, 16f, 8f, 16.2239f, 8f, 16.5f)
        }
        }.build()

        return _appleReminder!!
    }

private var _appleReminder: ImageVector? = null
