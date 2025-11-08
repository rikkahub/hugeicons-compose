package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Coordinate02: ImageVector
    get() {
        if (_coordinate02 != null) {
            return _coordinate02!!
        }
        _coordinate02 = ImageVector.Builder(
            name = "Coordinate02",
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
        moveTo(13.5f, 2f)
        lineTo(12f, 3.5f)
        moveTo(12f, 3.5f)
        verticalLineTo(5f)
        moveTo(12f, 3.5f)
        lineTo(10.5f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(2f, 14f)
        horizontalLineTo(5f)
        lineTo(2f, 17f)
        horizontalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 14f)
        lineTo(22f, 17f)
        moveTo(22f, 14f)
        lineTo(19f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 8f)
        verticalLineTo(16f)
        moveTo(12f, 16f)
        lineTo(3f, 22f)
        moveTo(12f, 16f)
        lineTo(21f, 22f)
        }
        }.build()

        return _coordinate02!!
    }

private var _coordinate02: ImageVector? = null
