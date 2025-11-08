package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.StickyNote01: ImageVector
    get() {
        if (_stickyNote01 != null) {
            return _stickyNote01!!
        }
        _stickyNote01 = ImageVector.Builder(
            name = "StickyNote01",
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
        moveTo(12.5f, 5f)
        horizontalLineTo(11.5f)
        curveTo(7.72876f, 5f, 5.84315f, 5f, 4.67157f, 6.17157f)
        curveTo(3.5f, 7.34315f, 3.5f, 9.22876f, 3.5f, 13f)
        verticalLineTo(14f)
        curveTo(3.5f, 17.7712f, 3.5f, 19.6569f, 4.67157f, 20.8284f)
        curveTo(5.84315f, 22f, 7.72876f, 22f, 11.5f, 22f)
        lineTo(12.5f, 22f)
        curveTo(16.2712f, 22f, 18.1569f, 22f, 19.3284f, 20.8284f)
        curveTo(20.5f, 19.6569f, 20.5f, 17.7712f, 20.5f, 14f)
        verticalLineTo(13f)
        curveTo(20.5f, 9.22876f, 20.5f, 7.34315f, 19.3284f, 6.17157f)
        curveTo(18.1569f, 5f, 16.2712f, 5f, 12.5f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 7.5f)
        curveTo(11f, 8.32843f, 11.6716f, 9f, 12.5f, 9f)
        curveTo(13.3284f, 9f, 14f, 8.32843f, 14f, 7.5f)
        verticalLineTo(4f)
        curveTo(14f, 2.89543f, 13.1046f, 2f, 12f, 2f)
        curveTo(10.8954f, 2f, 10f, 2.89543f, 10f, 4f)
        verticalLineTo(5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 17.5f)
        horizontalLineTo(12.5f)
        moveTo(7.5f, 13.5f)
        horizontalLineTo(16.5f)
        }
        }.build()

        return _stickyNote01!!
    }

private var _stickyNote01: ImageVector? = null
