package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Calendar03: ImageVector
    get() {
        if (_calendar03 != null) {
            return _calendar03!!
        }
        _calendar03 = ImageVector.Builder(
            name = "Calendar03",
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
        moveTo(16f, 2f)
        verticalLineTo(6f)
        moveTo(8f, 2f)
        verticalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 4f)
        horizontalLineTo(11f)
        curveTo(7.22876f, 4f, 5.34315f, 4f, 4.17157f, 5.17157f)
        curveTo(3f, 6.34315f, 3f, 8.22876f, 3f, 12f)
        verticalLineTo(14f)
        curveTo(3f, 17.7712f, 3f, 19.6569f, 4.17157f, 20.8284f)
        curveTo(5.34315f, 22f, 7.22876f, 22f, 11f, 22f)
        horizontalLineTo(13f)
        curveTo(16.7712f, 22f, 18.6569f, 22f, 19.8284f, 20.8284f)
        curveTo(21f, 19.6569f, 21f, 17.7712f, 21f, 14f)
        verticalLineTo(12f)
        curveTo(21f, 8.22876f, 21f, 6.34315f, 19.8284f, 5.17157f)
        curveTo(18.6569f, 4f, 16.7712f, 4f, 13f, 4f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 10f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.9955f, 14f)
        horizontalLineTo(12.0045f)
        moveTo(11.9955f, 18f)
        horizontalLineTo(12.0045f)
        moveTo(15.991f, 14f)
        horizontalLineTo(16f)
        moveTo(8f, 14f)
        horizontalLineTo(8.00897f)
        moveTo(8f, 18f)
        horizontalLineTo(8.00897f)
        }
        }.build()

        return _calendar03!!
    }

private var _calendar03: ImageVector? = null
