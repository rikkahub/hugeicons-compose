package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WasteRestore: ImageVector
    get() {
        if (_wasteRestore != null) {
            return _wasteRestore!!
        }
        _wasteRestore = ImageVector.Builder(
            name = "WasteRestore",
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.25f, 5f)
        horizontalLineTo(8.67963f)
        curveTo(9.34834f, 5f, 9.9728f, 4.6658f, 10.3437f, 4.1094f)
        lineTo(11.1563f, 2.8906f)
        curveTo(11.5272f, 2.3342f, 12.1517f, 2f, 12.8204f, 2f)
        horizontalLineTo(17.3085f)
        curveTo(18.1693f, 2f, 18.9336f, 2.55086f, 19.2058f, 3.36754f)
        lineTo(19.75f, 5f)
        moveTo(21.25f, 5f)
        horizontalLineTo(8.25f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.75f, 5f)
        lineTo(19.25f, 11.5f)
        moveTo(4.75f, 5f)
        lineTo(5.35461f, 15.5362f)
        curveTo(5.50945f, 18.1069f, 5.58688f, 19.3923f, 6.22868f, 20.3166f)
        curveTo(6.546f, 20.7736f, 6.9548f, 21.1593f, 7.42905f, 21.4492f)
        curveTo(8.01127f, 21.8051f, 8.71343f, 21.945f, 9.75f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.25f, 15.498f)
        lineTo(12.3863f, 16.9638f)
        curveTo(12.958f, 14.8299f, 15.1514f, 13.5636f, 17.2852f, 14.1353f)
        curveTo(18.3775f, 14.428f, 19.2425f, 15.1456f, 19.75f, 16.0626f)
        moveTo(21.25f, 20.498f)
        lineTo(20.1137f, 19.0343f)
        curveTo(19.5419f, 21.1682f, 17.3486f, 22.4345f, 15.2147f, 21.8627f)
        curveTo(14.1478f, 21.5769f, 13.2977f, 20.8856f, 12.7859f, 19.999f)
        }
        }.build()

        return _wasteRestore!!
    }

private var _wasteRestore: ImageVector? = null
