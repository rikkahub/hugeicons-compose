package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Folder03: ImageVector
    get() {
        if (_folder03 != null) {
            return _folder03!!
        }
        _folder03 = ImageVector.Builder(
            name = "Folder03",
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
        moveTo(2.36064f, 15.1788f)
        curveTo(1.98502f, 13.2956f, 1.79721f, 12.354f, 2.33084f, 11.7159f)
        curveTo(2.36642f, 11.6734f, 2.40405f, 11.6323f, 2.44361f, 11.5927f)
        curveTo(3.03686f, 11f, 4.08674f, 11f, 6.1865f, 11f)
        horizontalLineTo(17.8135f)
        curveTo(19.9133f, 11f, 20.9631f, 11f, 21.5564f, 11.5927f)
        curveTo(21.5959f, 11.6323f, 21.6336f, 11.6734f, 21.6692f, 11.7159f)
        curveTo(22.2028f, 12.354f, 22.015f, 13.2956f, 21.6394f, 15.1788f)
        curveTo(21.0993f, 17.8865f, 20.8292f, 19.2404f, 19.8109f, 20.0721f)
        curveTo(19.7414f, 20.1288f, 19.6698f, 20.1833f, 19.5961f, 20.2354f)
        curveTo(18.5163f, 21f, 17.0068f, 21f, 13.9876f, 21f)
        horizontalLineTo(10.0124f)
        curveTo(6.99323f, 21f, 5.48367f, 21f, 4.40387f, 20.2354f)
        curveTo(4.33022f, 20.1833f, 4.2586f, 20.1288f, 4.18914f, 20.0721f)
        curveTo(3.17075f, 19.2404f, 2.90072f, 17.8865f, 2.36064f, 15.1788f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 11f)
        verticalLineTo(5.5f)
        curveTo(4f, 4.11929f, 5.11929f, 3f, 6.5f, 3f)
        horizontalLineTo(8.92963f)
        curveTo(9.59834f, 3f, 10.2228f, 3.3342f, 10.5937f, 3.8906f)
        lineTo(12f, 6f)
        moveTo(12f, 6f)
        horizontalLineTo(8.5f)
        moveTo(12f, 6f)
        horizontalLineTo(17.5f)
        curveTo(18.8807f, 6f, 20f, 7.11929f, 20f, 8.5f)
        verticalLineTo(11f)
        }
        }.build()

        return _folder03!!
    }

private var _folder03: ImageVector? = null
