package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Flag02: ImageVector
    get() {
        if (_flag02 != null) {
            return _flag02!!
        }
        _flag02 = ImageVector.Builder(
            name = "Flag02",
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
        moveTo(4f, 7f)
        lineTo(4f, 21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.7576f, 3.90865f)
        curveTo(8.45236f, 2.22497f, 5.85125f, 3.21144f, 4.55426f, 4.2192f)
        curveTo(4.32048f, 4.40085f, 4.20358f, 4.49167f, 4.10179f, 4.69967f)
        curveTo(4f, 4.90767f, 4f, 5.10138f, 4f, 5.4888f)
        verticalLineTo(14.7319f)
        curveTo(4.9697f, 13.6342f, 7.87879f, 11.9328f, 11.7576f, 13.9086f)
        curveTo(15.224f, 15.6744f, 18.1741f, 14.9424f, 19.5697f, 14.1795f)
        curveTo(19.7633f, 14.0737f, 19.8601f, 14.0207f, 19.9301f, 13.9028f)
        curveTo(20f, 13.7849f, 20f, 13.6569f, 20f, 13.4009f)
        verticalLineTo(5.87389f)
        curveTo(20f, 5.04538f, 20f, 4.63113f, 19.8027f, 4.48106f)
        curveTo(19.6053f, 4.33099f, 19.1436f, 4.459f, 18.2202f, 4.71504f)
        curveTo(16.64f, 5.15319f, 14.3423f, 5.22532f, 11.7576f, 3.90865f)
        }
        }.build()

        return _flag02!!
    }

private var _flag02: ImageVector? = null
