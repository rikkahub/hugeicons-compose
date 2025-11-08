package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Php: ImageVector
    get() {
        if (_php != null) {
            return _php!!
        }
        _php = ImageVector.Builder(
            name = "Php",
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
        moveTo(5f, 12f)
        verticalLineTo(10f)
        curveTo(5f, 9.72386f, 5.22386f, 9.5f, 5.5f, 9.5f)
        horizontalLineTo(6.75f)
        curveTo(7.44036f, 9.5f, 8f, 10.0596f, 8f, 10.75f)
        curveTo(8f, 11.4404f, 7.44036f, 12f, 6.75f, 12f)
        horizontalLineTo(5f)
        moveTo(5f, 12f)
        verticalLineTo(14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 12f)
        verticalLineTo(10f)
        curveTo(16f, 9.72386f, 16.2239f, 9.5f, 16.5f, 9.5f)
        horizontalLineTo(17.75f)
        curveTo(18.4404f, 9.5f, 19f, 10.0596f, 19f, 10.75f)
        curveTo(19f, 11.4404f, 18.4404f, 12f, 17.75f, 12f)
        horizontalLineTo(16f)
        moveTo(16f, 12f)
        verticalLineTo(14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10.5f, 9.5f)
        verticalLineTo(12f)
        moveTo(10.5f, 14.5f)
        verticalLineTo(12f)
        moveTo(13.5f, 9.5f)
        verticalLineTo(12f)
        moveTo(13.5f, 14.5f)
        verticalLineTo(12f)
        moveTo(10.5f, 12f)
        horizontalLineTo(13.5f)
        }
        }.build()

        return _php!!
    }

private var _php: ImageVector? = null
