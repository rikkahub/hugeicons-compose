package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.GoogleMaps: ImageVector
    get() {
        if (_googleMaps != null) {
            return _googleMaps!!
        }
        _googleMaps = ImageVector.Builder(
            name = "GoogleMaps",
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
        moveTo(9f, 17f)
        lineTo(18f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 12f)
        lineTo(14f, 2.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 5f)
        lineTo(10f, 7.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.0097f, 22f)
        curveTo(11.656f, 22f, 11.4911f, 21.8487f, 11.3085f, 21.341f)
        curveTo(10.8283f, 19.6517f, 9.93051f, 18.1911f, 8.84193f, 16.8195f)
        curveTo(7.85602f, 15.5031f, 6.40188f, 14.0036f, 5.64625f, 12.2964f)
        curveTo(3.54607f, 7.65487f, 6.8014f, 1.99238f, 11.9927f, 2.00003f)
        curveTo(17.3276f, 1.98532f, 20.5359f, 7.85105f, 18.2565f, 12.5446f)
        curveTo(17.5862f, 13.7271f, 16.8028f, 14.8433f, 15.917f, 15.878f)
        curveTo(14.5359f, 17.5095f, 13.2946f, 19.2753f, 12.7057f, 21.3436f)
        curveTo(12.5703f, 21.7426f, 12.3955f, 22f, 12.0097f, 22f)
        }
        }.build()

        return _googleMaps!!
    }

private var _googleMaps: ImageVector? = null
