package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Lamp04: ImageVector
    get() {
        if (_lamp04 != null) {
            return _lamp04!!
        }
        _lamp04 = ImageVector.Builder(
            name = "Lamp04",
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
        moveTo(12f, 19f)
        curveTo(12.8284f, 19f, 13.5f, 18.3284f, 13.5f, 17.5f)
        curveTo(13.5f, 16.6716f, 12.8284f, 16f, 12f, 16f)
        curveTo(11.1716f, 16f, 10.5f, 16.6716f, 10.5f, 17.5f)
        curveTo(10.5f, 18.3284f, 11.1716f, 19f, 12f, 19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 16f)
        lineTo(12f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 22f)
        verticalLineTo(19f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 22f)
        lineTo(16f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.0259f, 12f)
        horizontalLineTo(8.9741f)
        curveTo(6.76217f, 12f, 5.65621f, 12f, 5.18728f, 11.3145f)
        curveTo(4.71834f, 10.6289f, 5.17219f, 9.67558f, 6.07989f, 7.7689f)
        lineTo(7.70343f, 4.35854f)
        curveTo(8.24854f, 3.21351f, 8.52109f, 2.64099f, 9.04548f, 2.3205f)
        curveTo(9.56986f, 2f, 10.234f, 2f, 11.5624f, 2f)
        horizontalLineTo(12.4376f)
        curveTo(13.766f, 2f, 14.4301f, 2f, 14.9545f, 2.3205f)
        curveTo(15.4789f, 2.64099f, 15.7515f, 3.21351f, 16.2966f, 4.35854f)
        lineTo(17.9201f, 7.76891f)
        curveTo(18.8278f, 9.67558f, 19.2817f, 10.6289f, 18.8127f, 11.3145f)
        curveTo(18.3438f, 12f, 17.2378f, 12f, 15.0259f, 12f)
        }
        }.build()

        return _lamp04!!
    }

private var _lamp04: ImageVector? = null
