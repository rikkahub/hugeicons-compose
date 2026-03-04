package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RupeeSquare: ImageVector
    get() {
        if (_rupeeSquare != null) {
            return _rupeeSquare!!
        }
        _rupeeSquare = ImageVector.Builder(
            name = "RupeeSquare",
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
        moveTo(12f, 21.5f)
        horizontalLineTo(12f)
        horizontalLineTo(12f)
        curveTo(16.4783f, 21.5f, 18.7175f, 21.5f, 20.1088f, 20.1088f)
        curveTo(21.5f, 18.7175f, 21.5f, 16.4783f, 21.5f, 12f)
        verticalLineTo(12f)
        verticalLineTo(12f)
        curveTo(21.5f, 7.52165f, 21.5f, 5.28248f, 20.1088f, 3.89124f)
        curveTo(18.7175f, 2.5f, 16.4783f, 2.5f, 12f, 2.5f)
        curveTo(7.52166f, 2.5f, 5.28249f, 2.5f, 3.89124f, 3.89124f)
        curveTo(2.5f, 5.28249f, 2.5f, 7.52166f, 2.5f, 12f)
        curveTo(2.5f, 16.4783f, 2.5f, 18.7175f, 3.89124f, 20.1088f)
        curveTo(5.28248f, 21.5f, 7.52165f, 21.5f, 12f, 21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 10f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 7f)
        horizontalLineTo(16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 7f)
        horizontalLineTo(11f)
        curveTo(12.6569f, 7f, 14f, 8.34315f, 14f, 10f)
        curveTo(14f, 11.6569f, 12.6569f, 13f, 11f, 13f)
        horizontalLineTo(8f)
        lineTo(14f, 18f)
        }
        }.build()

        return _rupeeSquare!!
    }

private var _rupeeSquare: ImageVector? = null
