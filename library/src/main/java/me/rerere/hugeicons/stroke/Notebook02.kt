package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Notebook02: ImageVector
    get() {
        if (_notebook02 != null) {
            return _notebook02!!
        }
        _notebook02 = ImageVector.Builder(
            name = "Notebook02",
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
        moveTo(22f, 14f)
        verticalLineTo(10f)
        curveTo(22f, 6.22876f, 22f, 4.34315f, 20.8284f, 3.17157f)
        curveTo(19.6569f, 2f, 17.7712f, 2f, 14f, 2f)
        horizontalLineTo(12f)
        curveTo(8.22876f, 2f, 6.34315f, 2f, 5.17157f, 3.17157f)
        curveTo(4f, 4.34315f, 4f, 6.22876f, 4f, 10f)
        verticalLineTo(14f)
        curveTo(4f, 17.7712f, 4f, 19.6569f, 5.17157f, 20.8284f)
        curveTo(6.34315f, 22f, 8.22876f, 22f, 12f, 22f)
        horizontalLineTo(14f)
        curveTo(17.7712f, 22f, 19.6569f, 22f, 20.8284f, 20.8284f)
        curveTo(22f, 19.6569f, 22f, 17.7712f, 22f, 14f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 6f)
        lineTo(2f, 6f)
        moveTo(5f, 12f)
        horizontalLineTo(2f)
        moveTo(5f, 18f)
        horizontalLineTo(2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17.5f, 7f)
        lineTo(13.5f, 7f)
        moveTo(15.5f, 11f)
        horizontalLineTo(13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 22f)
        lineTo(9f, 2f)
        }
        }.build()

        return _notebook02!!
    }

private var _notebook02: ImageVector? = null
