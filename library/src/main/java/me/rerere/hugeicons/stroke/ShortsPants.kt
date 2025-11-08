package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ShortsPants: ImageVector
    get() {
        if (_shortsPants != null) {
            return _shortsPants!!
        }
        _shortsPants = ImageVector.Builder(
            name = "ShortsPants",
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
        moveTo(10.9876f, 15.1231f)
        lineTo(10.2566f, 20.2254f)
        curveTo(10.0233f, 21.8538f, 9.63333f, 22.1467f, 8.0011f, 21.9433f)
        lineTo(3.79203f, 21.4186f)
        curveTo(2.20615f, 21.221f, 1.90147f, 20.854f, 2.0244f, 19.2605f)
        lineTo(2.76037f, 9.72027f)
        curveTo(2.81727f, 8.98263f, 2.84572f, 8.61382f, 2.91847f, 8.25272f)
        curveTo(3.10263f, 7.33855f, 3.61242f, 6.53567f, 3.82223f, 5.63542f)
        curveTo(3.94435f, 5.11145f, 3.90106f, 4.55591f, 3.90106f, 4.01893f)
        curveTo(3.90106f, 2.34611f, 4.25316f, 2f, 5.92579f, 2f)
        horizontalLineTo(18.0742f)
        curveTo(19.7468f, 2f, 20.0989f, 2.34611f, 20.0989f, 4.01893f)
        curveTo(20.0989f, 4.55591f, 20.0557f, 5.11145f, 20.1778f, 5.63542f)
        curveTo(20.3876f, 6.53567f, 20.8974f, 7.33855f, 21.0815f, 8.25272f)
        curveTo(21.7973f, 11.8057f, 21.6973f, 15.6526f, 21.9756f, 19.2605f)
        curveTo(22.0985f, 20.854f, 21.7938f, 21.221f, 20.208f, 21.4186f)
        lineTo(15.9989f, 21.9433f)
        curveTo(14.3667f, 22.1467f, 13.9767f, 21.8538f, 13.7434f, 20.2254f)
        lineTo(13.0124f, 15.1231f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 13.5f)
        curveTo(9.76053f, 14.2605f, 10.1976f, 15f, 11.3284f, 15f)
        horizontalLineTo(12.6716f)
        curveTo(13.8024f, 15f, 14.2395f, 14.2605f, 15f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 5f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 11f)
        curveTo(7f, 11.0068f, 7f, 7.00225f, 7f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 5f)
        curveTo(17f, 7.00225f, 17f, 11.0068f, 21f, 11f)
        }
        }.build()

        return _shortsPants!!
    }

private var _shortsPants: ImageVector? = null
