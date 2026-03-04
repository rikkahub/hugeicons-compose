package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RamMemory: ImageVector
    get() {
        if (_ramMemory != null) {
            return _ramMemory!!
        }
        _ramMemory = ImageVector.Builder(
            name = "RamMemory",
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
        moveTo(2f, 12.5f)
        curveTo(3.10457f, 12.5f, 4f, 11.6046f, 4f, 10.5f)
        curveTo(4f, 9.39543f, 3.10457f, 8.5f, 2f, 8.5f)
        curveTo(2f, 7.09554f, 2f, 6.39331f, 2.33706f, 5.88886f)
        curveTo(2.48298f, 5.67048f, 2.67048f, 5.48298f, 2.88886f, 5.33706f)
        curveTo(3.39331f, 5f, 4.09554f, 5f, 5.5f, 5f)
        horizontalLineTo(18.5f)
        curveTo(19.9045f, 5f, 20.6067f, 5f, 21.1111f, 5.33706f)
        curveTo(21.3295f, 5.48298f, 21.517f, 5.67048f, 21.6629f, 5.88886f)
        curveTo(22f, 6.39331f, 22f, 7.09554f, 22f, 8.5f)
        curveTo(20.8954f, 8.5f, 20f, 9.39543f, 20f, 10.5f)
        curveTo(20f, 11.6046f, 20.8954f, 12.5f, 22f, 12.5f)
        curveTo(22f, 13.9045f, 22f, 14.6067f, 21.6629f, 15.1111f)
        curveTo(21.517f, 15.3295f, 21.3295f, 15.517f, 21.1111f, 15.6629f)
        curveTo(20.6067f, 16f, 19.9045f, 16f, 18.5f, 16f)
        horizontalLineTo(5.5f)
        curveTo(4.09554f, 16f, 3.39331f, 16f, 2.88886f, 15.6629f)
        curveTo(2.67048f, 15.517f, 2.48298f, 15.3295f, 2.33706f, 15.1111f)
        curveTo(2f, 14.6067f, 2f, 13.9045f, 2f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 16f)
        verticalLineTo(18f)
        curveTo(4f, 18.5523f, 4.44772f, 19f, 5f, 19f)
        horizontalLineTo(8f)
        curveTo(8.55228f, 19f, 9f, 18.5523f, 9f, 18f)
        verticalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 16f)
        verticalLineTo(18f)
        curveTo(13f, 18.5523f, 13.4477f, 19f, 14f, 19f)
        horizontalLineTo(19f)
        curveTo(19.5523f, 19f, 20f, 18.5523f, 20f, 18f)
        verticalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9f)
        verticalLineTo(12f)
        moveTo(16f, 9f)
        verticalLineTo(12f)
        moveTo(8f, 9f)
        verticalLineTo(12f)
        }
        }.build()

        return _ramMemory!!
    }

private var _ramMemory: ImageVector? = null
