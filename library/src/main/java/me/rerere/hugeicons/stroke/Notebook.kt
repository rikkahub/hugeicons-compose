package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Notebook: ImageVector
    get() {
        if (_notebook != null) {
            return _notebook!!
        }
        _notebook = ImageVector.Builder(
            name = "Notebook",
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
        moveTo(10f, 11f)
        horizontalLineTo(13.5f)
        moveTo(10f, 7f)
        horizontalLineTo(17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 2f)
        horizontalLineTo(12.5f)
        curveTo(8.72877f, 2f, 6.84314f, 2f, 5.67157f, 3.17158f)
        curveTo(4.5f, 4.34315f, 4.5f, 6.22877f, 4.5f, 10f)
        verticalLineTo(14f)
        curveTo(4.5f, 17.7712f, 4.5f, 19.6569f, 5.67157f, 20.8284f)
        curveTo(6.84315f, 22f, 8.72876f, 22f, 12.5f, 22f)
        horizontalLineTo(13f)
        curveTo(16.7712f, 22f, 18.6569f, 22f, 19.8284f, 20.8284f)
        curveTo(21f, 19.6569f, 21f, 17.7712f, 21f, 14f)
        verticalLineTo(10f)
        curveTo(21f, 6.22877f, 21f, 4.34315f, 19.8284f, 3.17157f)
        curveTo(18.6569f, 2f, 16.7712f, 2f, 13f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 6f)
        horizontalLineTo(3f)
        moveTo(6f, 12f)
        horizontalLineTo(3f)
        moveTo(6f, 18f)
        horizontalLineTo(3f)
        }
        }.build()

        return _notebook!!
    }

private var _notebook: ImageVector? = null
