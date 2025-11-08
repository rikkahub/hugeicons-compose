package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.StickyNote03: ImageVector
    get() {
        if (_stickyNote03 != null) {
            return _stickyNote03!!
        }
        _stickyNote03 = ImageVector.Builder(
            name = "StickyNote03",
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
        moveTo(14f, 20.5f)
        verticalLineTo(20f)
        curveTo(14f, 17.1716f, 14f, 15.7574f, 14.8787f, 14.8787f)
        curveTo(15.7574f, 14f, 17.1716f, 14f, 20f, 14f)
        horizontalLineTo(20.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 3f)
        horizontalLineTo(11f)
        curveTo(7.22876f, 3f, 5.34315f, 3f, 4.17157f, 4.17157f)
        curveTo(3f, 5.34315f, 3f, 7.22876f, 3f, 11f)
        verticalLineTo(13f)
        curveTo(3f, 16.7712f, 3f, 18.6569f, 4.17157f, 19.8284f)
        curveTo(5.34315f, 21f, 7.22876f, 21f, 11f, 21f)
        horizontalLineTo(12.3431f)
        curveTo(13.1606f, 21f, 13.5694f, 21f, 13.9369f, 20.8478f)
        curveTo(14.3045f, 20.6955f, 14.5935f, 20.4065f, 15.1716f, 19.8284f)
        lineTo(19.8284f, 15.1716f)
        curveTo(20.4065f, 14.5935f, 20.6955f, 14.3045f, 20.8478f, 13.9369f)
        curveTo(21f, 13.5694f, 21f, 13.1606f, 21f, 12.3431f)
        verticalLineTo(11f)
        curveTo(21f, 7.22876f, 21f, 5.34315f, 19.8284f, 4.17157f)
        curveTo(18.6569f, 3f, 16.7712f, 3f, 13f, 3f)
        }
        }.build()

        return _stickyNote03!!
    }

private var _stickyNote03: ImageVector? = null
