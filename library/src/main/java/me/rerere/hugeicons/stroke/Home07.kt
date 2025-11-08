package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Home07: ImageVector
    get() {
        if (_home07 != null) {
            return _home07!!
        }
        _home07 = ImageVector.Builder(
            name = "Home07",
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
        moveTo(12.8924f, 2.80982f)
        lineTo(21.4876f, 9.59547f)
        curveTo(21.8112f, 9.85095f, 22f, 10.2405f, 22f, 10.6528f)
        curveTo(22f, 11.3969f, 21.3969f, 12f, 20.6528f, 12f)
        horizontalLineTo(20f)
        verticalLineTo(15.5f)
        curveTo(20f, 18.3284f, 20f, 19.7426f, 19.1213f, 20.6213f)
        curveTo(18.2426f, 21.5f, 16.8284f, 21.5f, 14f, 21.5f)
        horizontalLineTo(10f)
        curveTo(7.17157f, 21.5f, 5.75736f, 21.5f, 4.87868f, 20.6213f)
        curveTo(4f, 19.7426f, 4f, 18.3284f, 4f, 15.5f)
        verticalLineTo(12f)
        horizontalLineTo(3.34716f)
        curveTo(2.60315f, 12f, 2f, 11.3969f, 2f, 10.6528f)
        curveTo(2f, 10.2405f, 2.1888f, 9.85095f, 2.5124f, 9.59547f)
        lineTo(11.1076f, 2.80982f)
        curveTo(11.3617f, 2.60915f, 11.6761f, 2.5f, 12f, 2.5f)
        curveTo(12.3239f, 2.5f, 12.6383f, 2.60915f, 12.8924f, 2.80982f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.5f, 21.5f)
        verticalLineTo(17f)
        curveTo(14.5f, 16.0654f, 14.5f, 15.5981f, 14.299f, 15.25f)
        curveTo(14.1674f, 15.022f, 13.978f, 14.8326f, 13.75f, 14.701f)
        curveTo(13.4019f, 14.5f, 12.9346f, 14.5f, 12f, 14.5f)
        curveTo(11.0654f, 14.5f, 10.5981f, 14.5f, 10.25f, 14.701f)
        curveTo(10.022f, 14.8326f, 9.83261f, 15.022f, 9.70096f, 15.25f)
        curveTo(9.5f, 15.5981f, 9.5f, 16.0654f, 9.5f, 17f)
        verticalLineTo(21.5f)
        }
        }.build()

        return _home07!!
    }

private var _home07: ImageVector? = null
