package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SixSquare: ImageVector
    get() {
        if (_sixSquare != null) {
            return _sixSquare!!
        }
        _sixSquare = ImageVector.Builder(
            name = "SixSquare",
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
        moveTo(11f, 12f)
        horizontalLineTo(13f)
        curveTo(14.1046f, 12f, 15f, 12.8954f, 15f, 14f)
        verticalLineTo(15f)
        curveTo(15f, 16.1046f, 14.1046f, 17f, 13f, 17f)
        horizontalLineTo(11f)
        curveTo(9.89543f, 17f, 9f, 16.1046f, 9f, 15f)
        verticalLineTo(14f)
        curveTo(9f, 12.8954f, 9.89543f, 12f, 11f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 14.5f)
        verticalLineTo(9f)
        curveTo(9f, 7.89543f, 9.89543f, 7f, 11f, 7f)
        horizontalLineTo(13f)
        curveTo(14.1046f, 7f, 15f, 7.89543f, 15f, 9f)
        }
        }.build()

        return _sixSquare!!
    }

private var _sixSquare: ImageVector? = null
