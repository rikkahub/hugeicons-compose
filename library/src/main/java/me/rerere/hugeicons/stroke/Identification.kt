package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Identification: ImageVector
    get() {
        if (_identification != null) {
            return _identification!!
        }
        _identification = ImageVector.Builder(
            name = "Identification",
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
        moveTo(9.13518f, 2.49991f)
        curveTo(6.4689f, 2.56066f, 4.91156f, 2.81447f, 3.8475f, 3.87483f)
        curveTo(2.91622f, 4.80288f, 2.60492f, 6.10747f, 2.50085f, 8.19991f)
        moveTo(14.8665f, 2.49991f)
        curveTo(17.5328f, 2.56066f, 19.0902f, 2.81447f, 20.1542f, 3.87483f)
        curveTo(21.0855f, 4.80288f, 21.3968f, 6.10747f, 21.5009f, 8.19991f)
        moveTo(14.8665f, 21.4999f)
        curveTo(17.5328f, 21.4392f, 19.0902f, 21.1853f, 20.1542f, 20.125f)
        curveTo(21.0855f, 19.1969f, 21.3968f, 17.8923f, 21.5009f, 15.7999f)
        moveTo(9.13518f, 21.4999f)
        curveTo(6.4689f, 21.4392f, 4.91156f, 21.1853f, 3.8475f, 20.125f)
        curveTo(2.91622f, 19.1969f, 2.60492f, 17.8923f, 2.50085f, 15.7999f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 17f)
        curveTo(9.83846f, 14.4046f, 14.1188f, 14.263f, 16f, 17f)
        moveTo(14.5f, 9.5f)
        curveTo(14.5f, 10.8807f, 13.3807f, 12f, 12f, 12f)
        curveTo(10.6193f, 12f, 9.5f, 10.8807f, 9.5f, 9.5f)
        curveTo(9.5f, 8.11929f, 10.6193f, 7f, 12f, 7f)
        curveTo(13.3807f, 7f, 14.5f, 8.11929f, 14.5f, 9.5f)
        }
        }.build()

        return _identification!!
    }

private var _identification: ImageVector? = null
