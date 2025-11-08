package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.VideoReplay: ImageVector
    get() {
        if (_videoReplay != null) {
            return _videoReplay!!
        }
        _videoReplay = ImageVector.Builder(
            name = "VideoReplay",
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
        moveTo(17.7001f, 21.3351f)
        curveTo(16.5281f, 21.4998f, 14.9996f, 21.4998f, 12.9501f, 21.4998f)
        horizontalLineTo(11.0501f)
        curveTo(7.01955f, 21.4998f, 5.0043f, 21.4998f, 3.75218f, 20.2476f)
        curveTo(2.50006f, 18.9955f, 2.50006f, 16.9803f, 2.50006f, 12.9498f)
        verticalLineTo(11.0498f)
        curveTo(2.50006f, 7.01925f, 2.50006f, 5.00399f, 3.75218f, 3.75187f)
        curveTo(5.0043f, 2.49976f, 7.01955f, 2.49976f, 11.0501f, 2.49976f)
        horizontalLineTo(12.9501f)
        curveTo(16.9806f, 2.49976f, 18.9958f, 2.49976f, 20.2479f, 3.75187f)
        curveTo(21.5001f, 5.00399f, 21.5001f, 7.01925f, 21.5001f, 11.0498f)
        verticalLineTo(12.9498f)
        curveTo(21.5001f, 14.158f, 21.5001f, 15.1851f, 21.4663f, 16.0648f)
        curveTo(21.4393f, 16.7699f, 21.4258f, 17.1224f, 21.1588f, 17.2541f)
        curveTo(20.8918f, 17.3859f, 20.5932f, 17.1746f, 19.9958f, 16.752f)
        lineTo(18.6501f, 15.7998f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.9453f, 12.3948f)
        curveTo(14.7686f, 13.0215f, 13.9333f, 13.4644f, 12.2629f, 14.3502f)
        curveTo(10.648f, 15.2064f, 9.8406f, 15.6346f, 9.18992f, 15.4625f)
        curveTo(8.9209f, 15.3913f, 8.6758f, 15.2562f, 8.47812f, 15.07f)
        curveTo(8f, 14.6198f, 8f, 13.7465f, 8f, 12f)
        curveTo(8f, 10.2535f, 8f, 9.38018f, 8.47812f, 8.92995f)
        curveTo(8.6758f, 8.74381f, 8.9209f, 8.60868f, 9.18992f, 8.53753f)
        curveTo(9.8406f, 8.36544f, 10.648f, 8.79357f, 12.2629f, 9.64983f)
        curveTo(13.9333f, 10.5356f, 14.7686f, 10.9785f, 14.9453f, 11.6052f)
        curveTo(15.0182f, 11.8639f, 15.0182f, 12.1361f, 14.9453f, 12.3948f)
        }
        }.build()

        return _videoReplay!!
    }

private var _videoReplay: ImageVector? = null
