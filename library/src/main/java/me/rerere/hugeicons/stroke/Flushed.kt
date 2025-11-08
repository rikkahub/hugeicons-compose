package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Flushed: ImageVector
    get() {
        if (_flushed != null) {
            return _flushed!!
        }
        _flushed = ImageVector.Builder(
            name = "Flushed",
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
        moveTo(10f, 9.5f)
        curveTo(10f, 10.3284f, 9.32843f, 11f, 8.5f, 11f)
        curveTo(7.67157f, 11f, 7f, 10.3284f, 7f, 9.5f)
        curveTo(7f, 8.67157f, 7.67157f, 8f, 8.5f, 8f)
        curveTo(9.32843f, 8f, 10f, 8.67157f, 10f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 9.5f)
        curveTo(17f, 10.3284f, 16.3284f, 11f, 15.5f, 11f)
        curveTo(14.6716f, 11f, 14f, 10.3284f, 14f, 9.5f)
        curveTo(14f, 8.67157f, 14.6716f, 8f, 15.5f, 8f)
        curveTo(16.3284f, 8f, 17f, 8.67157f, 17f, 9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 16f)
        horizontalLineTo(15f)
        }
        }.build()

        return _flushed!!
    }

private var _flushed: ImageVector? = null
