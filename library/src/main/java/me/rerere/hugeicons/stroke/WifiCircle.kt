package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.WifiCircle: ImageVector
    get() {
        if (_wifiCircle != null) {
            return _wifiCircle!!
        }
        _wifiCircle = ImageVector.Builder(
            name = "WifiCircle",
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
        moveTo(22f, 12f)
        curveTo(22f, 17.5228f, 17.5228f, 22f, 12f, 22f)
        curveTo(6.47715f, 22f, 2f, 17.5228f, 2f, 12f)
        curveTo(2f, 6.47715f, 6.47715f, 2f, 12f, 2f)
        curveTo(17.5228f, 2f, 22f, 6.47715f, 22f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 10.3136f)
        curveTo(9.14883f, 9.48279f, 10.5209f, 9f, 11.9946f, 9f)
        curveTo(13.4729f, 9f, 14.849f, 9.48584f, 16f, 10.3214f)
        moveTo(14.1743f, 13f)
        curveTo(13.5182f, 12.6363f, 12.7779f, 12.4317f, 11.9946f, 12.4317f)
        curveTo(11.2152f, 12.4317f, 10.4784f, 12.6343f, 9.82477f, 12.9945f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 16f)
        horizontalLineTo(12.0064f)
        }
        }.build()

        return _wifiCircle!!
    }

private var _wifiCircle: ImageVector? = null
