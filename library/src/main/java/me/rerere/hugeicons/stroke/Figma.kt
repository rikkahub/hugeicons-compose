package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Figma: ImageVector
    get() {
        if (_figma != null) {
            return _figma!!
        }
        _figma = ImageVector.Builder(
            name = "Figma",
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
        moveTo(9f, 21f)
        curveTo(10.6569f, 21f, 12f, 19.6569f, 12f, 18f)
        verticalLineTo(15f)
        horizontalLineTo(9f)
        curveTo(7.34315f, 15f, 6f, 16.3431f, 6f, 18f)
        curveTo(6f, 19.6569f, 7.34315f, 21f, 9f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 9f)
        verticalLineTo(15f)
        horizontalLineTo(9f)
        curveTo(7.34315f, 15f, 6f, 13.6569f, 6f, 12f)
        curveTo(6f, 10.3431f, 7.34315f, 9f, 9f, 9f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 3f)
        verticalLineTo(9f)
        horizontalLineTo(9f)
        curveTo(7.34315f, 9f, 6f, 7.65685f, 6f, 6f)
        curveTo(6f, 4.34315f, 7.34315f, 3f, 9f, 3f)
        horizontalLineTo(12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 3f)
        verticalLineTo(9f)
        horizontalLineTo(15f)
        curveTo(16.6569f, 9f, 18f, 7.65685f, 18f, 6f)
        curveTo(18f, 4.34315f, 16.6569f, 3f, 15f, 3f)
        horizontalLineTo(12f)
        }
        }.build()

        return _figma!!
    }

private var _figma: ImageVector? = null
