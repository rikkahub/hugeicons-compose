package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PlayCircle: ImageVector
    get() {
        if (_playCircle != null) {
            return _playCircle!!
        }
        _playCircle = ImageVector.Builder(
            name = "PlayCircle",
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
        moveTo(15.9453f, 12.3948f)
        curveTo(15.7686f, 13.0215f, 14.9333f, 13.4644f, 13.2629f, 14.3502f)
        curveTo(11.648f, 15.2064f, 10.8406f, 15.6346f, 10.1899f, 15.4625f)
        curveTo(9.9209f, 15.3913f, 9.6758f, 15.2562f, 9.47812f, 15.0701f)
        curveTo(9f, 14.6198f, 9f, 13.7465f, 9f, 12f)
        curveTo(9f, 10.2535f, 9f, 9.38018f, 9.47812f, 8.92995f)
        curveTo(9.6758f, 8.74381f, 9.9209f, 8.60868f, 10.1899f, 8.53753f)
        curveTo(10.8406f, 8.36544f, 11.648f, 8.79357f, 13.2629f, 9.64983f)
        curveTo(14.9333f, 10.5356f, 15.7686f, 10.9785f, 15.9453f, 11.6052f)
        curveTo(16.0182f, 11.8639f, 16.0182f, 12.1361f, 15.9453f, 12.3948f)
        }
        }.build()

        return _playCircle!!
    }

private var _playCircle: ImageVector? = null
