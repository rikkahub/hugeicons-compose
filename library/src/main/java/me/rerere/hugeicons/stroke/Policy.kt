package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Policy: ImageVector
    get() {
        if (_policy != null) {
            return _policy!!
        }
        _policy = ImageVector.Builder(
            name = "Policy",
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
        moveTo(16.6106f, 17.6596f)
        lineTo(15.5f, 22f)
        lineTo(18f, 21f)
        lineTo(20.5f, 22f)
        lineTo(19.5f, 17.5987f)
        moveTo(21f, 15f)
        curveTo(21f, 16.6569f, 19.6569f, 18f, 18f, 18f)
        curveTo(16.3431f, 18f, 15f, 16.6569f, 15f, 15f)
        curveTo(15f, 13.3431f, 16.3431f, 12f, 18f, 12f)
        curveTo(19.6569f, 12f, 21f, 13.3431f, 21f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 10f)
        curveTo(20f, 6.22876f, 20f, 4.34315f, 18.8284f, 3.17157f)
        curveTo(17.6569f, 2f, 15.7712f, 2f, 12f, 2f)
        horizontalLineTo(11.0001f)
        curveTo(7.2289f, 2f, 5.34329f, 2f, 4.17172f, 3.17156f)
        curveTo(3.00015f, 4.34312f, 3.00014f, 6.22872f, 3.0001f, 9.99993f)
        lineTo(3.00007f, 13.9999f)
        curveTo(3.00004f, 17.7712f, 3.00002f, 19.6568f, 4.17159f, 20.8284f)
        curveTo(5.34317f, 22f, 7.2288f, 22f, 11.0001f, 22f)
        horizontalLineTo(13f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 7f)
        horizontalLineTo(15.5f)
        moveTo(7.5f, 12f)
        horizontalLineTo(12f)
        }
        }.build()

        return _policy!!
    }

private var _policy: ImageVector? = null
