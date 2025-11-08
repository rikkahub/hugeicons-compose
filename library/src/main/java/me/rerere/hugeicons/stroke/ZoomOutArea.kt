package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ZoomOutArea: ImageVector
    get() {
        if (_zoomOutArea != null) {
            return _zoomOutArea!!
        }
        _zoomOutArea = ImageVector.Builder(
            name = "ZoomOutArea",
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
        moveTo(18.5016f, 18.5f)
        lineTo(21f, 21f)
        moveTo(20f, 14.5f)
        curveTo(20f, 11.4624f, 17.5376f, 9f, 14.5f, 9f)
        curveTo(11.4624f, 9f, 9f, 11.4624f, 9f, 14.5f)
        curveTo(9f, 17.5376f, 11.4624f, 20f, 14.5f, 20f)
        curveTo(17.5376f, 20f, 20f, 17.5376f, 20f, 14.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 14.5f)
        horizontalLineTo(12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 3f)
        horizontalLineTo(14f)
        moveTo(3f, 10f)
        verticalLineTo(14f)
        moveTo(6.5f, 21f)
        curveTo(4.567f, 21f, 3f, 19.433f, 3f, 17.5f)
        moveTo(17.5f, 3f)
        curveTo(19.433f, 3f, 21f, 4.567f, 21f, 6.5f)
        moveTo(3f, 6.5f)
        curveTo(3f, 4.567f, 4.567f, 3f, 6.5f, 3f)
        }
        }.build()

        return _zoomOutArea!!
    }

private var _zoomOutArea: ImageVector? = null
