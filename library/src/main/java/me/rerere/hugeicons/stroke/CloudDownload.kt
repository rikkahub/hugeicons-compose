package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CloudDownload: ImageVector
    get() {
        if (_cloudDownload != null) {
            return _cloudDownload!!
        }
        _cloudDownload = ImageVector.Builder(
            name = "CloudDownload",
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
        moveTo(17.4776f, 9.01106f)
        curveTo(17.485f, 9.01102f, 17.4925f, 9.01101f, 17.5f, 9.01101f)
        curveTo(19.9853f, 9.01101f, 22f, 11.0294f, 22f, 13.5193f)
        curveTo(22f, 15.8398f, 20.25f, 17.7508f, 18f, 18f)
        moveTo(17.4776f, 9.01106f)
        curveTo(17.4924f, 8.84606f, 17.5f, 8.67896f, 17.5f, 8.51009f)
        curveTo(17.5f, 5.46695f, 15.0376f, 3f, 12f, 3f)
        curveTo(9.12324f, 3f, 6.76233f, 5.21267f, 6.52042f, 8.03192f)
        moveTo(17.4776f, 9.01106f)
        curveTo(17.3753f, 10.1476f, 16.9286f, 11.1846f, 16.2428f, 12.0165f)
        moveTo(6.52042f, 8.03192f)
        curveTo(3.98398f, 8.27373f, 2f, 10.4139f, 2f, 13.0183f)
        curveTo(2f, 15.4417f, 3.71776f, 17.4632f, 6f, 17.9273f)
        moveTo(6.52042f, 8.03192f)
        curveTo(6.67826f, 8.01687f, 6.83823f, 8.00917f, 7f, 8.00917f)
        curveTo(8.12582f, 8.00917f, 9.16474f, 8.38194f, 10.0005f, 9.01101f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 21f)
        lineTo(12f, 13f)
        moveTo(12f, 21f)
        curveTo(11.2998f, 21f, 9.99153f, 19.0057f, 9.5f, 18.5f)
        moveTo(12f, 21f)
        curveTo(12.7002f, 21f, 14.0085f, 19.0057f, 14.5f, 18.5f)
        }
        }.build()

        return _cloudDownload!!
    }

private var _cloudDownload: ImageVector? = null
