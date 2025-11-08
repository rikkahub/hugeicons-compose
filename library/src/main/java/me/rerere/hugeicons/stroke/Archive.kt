package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive = ImageVector.Builder(
            name = "Archive",
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
        moveTo(13f, 2f)
        horizontalLineTo(11f)
        curveTo(7.22876f, 2f, 5.34315f, 2f, 4.17157f, 3.17157f)
        curveTo(3f, 4.34315f, 3f, 6.22876f, 3f, 10f)
        verticalLineTo(14f)
        curveTo(3f, 17.7712f, 3f, 19.6569f, 4.17157f, 20.8284f)
        curveTo(5.34315f, 22f, 7.22876f, 22f, 11f, 22f)
        horizontalLineTo(13f)
        curveTo(16.7712f, 22f, 18.6569f, 22f, 19.8284f, 20.8284f)
        curveTo(21f, 19.6569f, 21f, 17.7712f, 21f, 14f)
        verticalLineTo(10f)
        curveTo(21f, 6.22876f, 21f, 4.34315f, 19.8284f, 3.17157f)
        curveTo(18.6569f, 2f, 16.7712f, 2f, 13f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 12f)
        horizontalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 7f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 17f)
        horizontalLineTo(9f)
        }
        }.build()

        return _archive!!
    }

private var _archive: ImageVector? = null
