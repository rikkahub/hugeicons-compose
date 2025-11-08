package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ZoomInArea: ImageVector
    get() {
        if (_zoomInArea != null) {
            return _zoomInArea!!
        }
        _zoomInArea = ImageVector.Builder(
            name = "ZoomInArea",
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
        moveTo(18.5016f, 19.1217f)
        lineTo(21f, 21.6217f)
        moveTo(20f, 15.1217f)
        curveTo(20f, 12.0842f, 17.5376f, 9.62173f, 14.5f, 9.62173f)
        curveTo(11.4624f, 9.62173f, 9f, 12.0842f, 9f, 15.1217f)
        curveTo(9f, 18.1593f, 11.4624f, 20.6217f, 14.5f, 20.6217f)
        curveTo(17.5376f, 20.6217f, 20f, 18.1593f, 20f, 15.1217f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 13.1217f)
        verticalLineTo(17.1217f)
        moveTo(16.5f, 15.1217f)
        horizontalLineTo(12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 3.62173f)
        horizontalLineTo(14f)
        moveTo(3f, 10.6217f)
        verticalLineTo(14.6217f)
        moveTo(6.5f, 21.6217f)
        curveTo(4.567f, 21.6217f, 3f, 20.0547f, 3f, 18.1217f)
        moveTo(17.5f, 3.62173f)
        curveTo(19.433f, 3.62173f, 21f, 5.18873f, 21f, 7.12173f)
        moveTo(3f, 7.12173f)
        curveTo(3f, 5.18873f, 4.567f, 3.62173f, 6.5f, 3.62173f)
        }
        }.build()

        return _zoomInArea!!
    }

private var _zoomInArea: ImageVector? = null
