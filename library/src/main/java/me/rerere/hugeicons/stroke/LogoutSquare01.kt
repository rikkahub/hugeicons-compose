package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LogoutSquare01: ImageVector
    get() {
        if (_logoutSquare01 != null) {
            return _logoutSquare01!!
        }
        _logoutSquare01 = ImageVector.Builder(
            name = "LogoutSquare01",
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
        moveTo(14.5f, 6f)
        curveTo(14.4534f, 4.90658f, 14.3147f, 4.20985f, 13.9025f, 3.67376f)
        curveTo(13.7426f, 3.46574f, 13.5561f, 3.27954f, 13.3476f, 3.11992f)
        curveTo(12.5381f, 2.5f, 11.363f, 2.5f, 9.01286f, 2.5f)
        horizontalLineTo(8.51184f)
        curveTo(5.67786f, 2.5f, 4.26087f, 2.5f, 3.38046f, 3.37867f)
        curveTo(2.50006f, 4.25734f, 2.50004f, 5.67157f, 2.50003f, 8.49997f)
        lineTo(2.50002f, 15.5f)
        curveTo(2.50001f, 18.3284f, 2.5f, 19.7426f, 3.38042f, 20.6213f)
        curveTo(4.26083f, 21.5f, 5.67783f, 21.5f, 8.51184f, 21.5f)
        horizontalLineTo(9.01281f)
        curveTo(11.363f, 21.5f, 12.5381f, 21.5f, 13.3476f, 20.8801f)
        curveTo(13.556f, 20.7205f, 13.7426f, 20.5343f, 13.9025f, 20.3263f)
        curveTo(14.3147f, 19.7901f, 14.4534f, 19.0933f, 14.5f, 17.9996f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20.5f, 11.9999f)
        horizontalLineTo(8.50002f)
        moveTo(18f, 15.5f)
        curveTo(18f, 15.5f, 21.5f, 12.9223f, 21.5f, 12f)
        curveTo(21.5f, 11.0777f, 18f, 8.5f, 18f, 8.5f)
        }
        }.build()

        return _logoutSquare01!!
    }

private var _logoutSquare01: ImageVector? = null
