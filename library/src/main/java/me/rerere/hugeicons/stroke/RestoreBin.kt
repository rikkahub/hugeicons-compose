package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RestoreBin: ImageVector
    get() {
        if (_restoreBin != null) {
            return _restoreBin!!
        }
        _restoreBin = ImageVector.Builder(
            name = "RestoreBin",
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
        moveTo(19.75f, 5.5f)
        lineTo(19.25f, 11.5f)
        moveTo(4.75f, 5.5f)
        lineTo(5.35461f, 15.5368f)
        curveTo(5.50945f, 18.1073f, 5.58688f, 19.3925f, 6.22868f, 20.3167f)
        curveTo(6.546f, 20.7737f, 6.9548f, 21.1594f, 7.42905f, 21.4493f)
        curveTo(8.01127f, 21.8051f, 8.71343f, 21.945f, 9.75f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11.25f, 15.5f)
        lineTo(12.3863f, 16.9657f)
        curveTo(12.958f, 14.8319f, 15.1514f, 13.5655f, 17.2852f, 14.1373f)
        curveTo(18.3775f, 14.43f, 19.2425f, 15.1475f, 19.75f, 16.0646f)
        moveTo(21.25f, 20.5f)
        lineTo(20.1137f, 19.0363f)
        curveTo(19.5419f, 21.1701f, 17.3486f, 22.4365f, 15.2147f, 21.8647f)
        curveTo(14.1478f, 21.5788f, 13.2977f, 20.8875f, 12.7859f, 20.001f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3.25f, 5.5f)
        horizontalLineTo(21.25f)
        moveTo(16.3057f, 5.5f)
        lineTo(15.6231f, 4.09173f)
        curveTo(15.1696f, 3.15626f, 14.9428f, 2.68852f, 14.5517f, 2.39681f)
        curveTo(14.465f, 2.3321f, 14.3731f, 2.27454f, 14.277f, 2.2247f)
        curveTo(13.8439f, 2f, 13.3241f, 2f, 12.2845f, 2f)
        curveTo(11.2188f, 2f, 10.686f, 2f, 10.2457f, 2.23412f)
        curveTo(10.1481f, 2.28601f, 10.055f, 2.3459f, 9.96729f, 2.41317f)
        curveTo(9.57164f, 2.7167f, 9.35063f, 3.20155f, 8.90861f, 4.17126f)
        lineTo(8.30292f, 5.5f)
        }
        }.build()

        return _restoreBin!!
    }

private var _restoreBin: ImageVector? = null
