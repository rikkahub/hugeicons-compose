package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Radius: ImageVector
    get() {
        if (_radius != null) {
            return _radius!!
        }
        _radius = ImageVector.Builder(
            name = "Radius",
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
        moveTo(12f, 13.5f)
        curveTo(11.1716f, 13.5f, 10.5f, 12.8284f, 10.5f, 12f)
        curveTo(10.5f, 11.1716f, 11.1716f, 10.5f, 12f, 10.5f)
        curveTo(12.8284f, 10.5f, 13.5f, 11.1716f, 13.5f, 12f)
        curveTo(13.5f, 12.8284f, 12.8284f, 13.5f, 12f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.0007f, 12f)
        horizontalLineTo(14f)
        moveTo(19.0007f, 12f)
        curveTo(19.0007f, 11.4398f, 16.9999f, 10f, 16.9999f, 10f)
        moveTo(19.0007f, 12f)
        curveTo(19.0007f, 12.5602f, 16.9999f, 14f, 16.9999f, 14f)
        }
        }.build()

        return _radius!!
    }

private var _radius: ImageVector? = null
