package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HandSanitizer: ImageVector
    get() {
        if (_handSanitizer != null) {
            return _handSanitizer!!
        }
        _handSanitizer = ImageVector.Builder(
            name = "HandSanitizer",
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
        moveTo(15.6565f, 16.1618f)
        lineTo(15.3119f, 13.9419f)
        curveTo(15.2092f, 13.2801f, 15.1578f, 12.9492f, 15.0787f, 12.666f)
        curveTo(14.5317f, 10.7079f, 12.8437f, 9.27248f, 10.8078f, 9.03444f)
        curveTo(10.5133f, 9f, 10.1755f, 9f, 9.5f, 9f)
        curveTo(8.82446f, 9f, 8.48668f, 9f, 8.19218f, 9.03444f)
        curveTo(6.15634f, 9.27248f, 4.46826f, 10.7079f, 3.92131f, 12.666f)
        curveTo(3.84219f, 12.9492f, 3.79083f, 13.2801f, 3.68811f, 13.9419f)
        lineTo(3.34352f, 16.1618f)
        curveTo(3.00313f, 18.3547f, 2.83293f, 19.4512f, 3.22851f, 20.2812f)
        curveTo(3.4607f, 20.7685f, 3.82102f, 21.1847f, 4.27159f, 21.4863f)
        curveTo(5.03922f, 22f, 6.15851f, 22f, 8.39711f, 22f)
        horizontalLineTo(10.6029f)
        curveTo(12.8415f, 22f, 13.9608f, 22f, 14.7284f, 21.4863f)
        curveTo(15.179f, 21.1847f, 15.5393f, 20.7685f, 15.7715f, 20.2812f)
        curveTo(16.1671f, 19.4512f, 15.9969f, 18.3547f, 15.6565f, 16.1618f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 13.5f)
        verticalLineTo(17.5f)
        moveTo(11.5f, 15.5f)
        lineTo(7.5f, 15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12.5f, 9.5f)
        verticalLineTo(9f)
        curveTo(12.5f, 7.58579f, 12.5f, 6.87868f, 12.0607f, 6.43934f)
        curveTo(11.6213f, 6f, 10.9142f, 6f, 9.5f, 6f)
        verticalLineTo(6f)
        curveTo(8.08579f, 6f, 7.37868f, 6f, 6.93934f, 6.43934f)
        curveTo(6.5f, 6.87868f, 6.5f, 7.58579f, 6.5f, 9f)
        verticalLineTo(9.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 6f)
        verticalLineTo(3.5f)
        curveTo(11f, 2.67157f, 10.3284f, 2f, 9.5f, 2f)
        verticalLineTo(2f)
        curveTo(8.67157f, 2f, 8f, 2.67157f, 8f, 3.5f)
        lineTo(8f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 4.21885f)
        lineTo(13.7173f, 3.49523f)
        curveTo(15.2293f, 3.09261f, 15.9852f, 2.8913f, 16.6861f, 3.05968f)
        curveTo(17.3869f, 3.22807f, 17.8331f, 3.71821f, 18.7255f, 4.69848f)
        lineTo(19f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 10.5f)
        curveTo(21f, 11.6046f, 20.25f, 12f, 19.5f, 12f)
        curveTo(18.75f, 12f, 18f, 11.6046f, 18f, 10.5f)
        curveTo(18f, 9.39543f, 19.5f, 8f, 19.5f, 8f)
        curveTo(19.5f, 8f, 21f, 9.39543f, 21f, 10.5f)
        }
        }.build()

        return _handSanitizer!!
    }

private var _handSanitizer: ImageVector? = null
