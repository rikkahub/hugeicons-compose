package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LoginSquare01: ImageVector
    get() {
        if (_loginSquare01 != null) {
            return _loginSquare01!!
        }
        _loginSquare01 = ImageVector.Builder(
            name = "LoginSquare01",
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
        moveTo(9f, 6f)
        curveTo(9.04665f, 4.90658f, 9.18531f, 4.20985f, 9.59747f, 3.67376f)
        curveTo(9.7574f, 3.46574f, 9.94396f, 3.27954f, 10.1524f, 3.11992f)
        curveTo(10.9619f, 2.5f, 12.137f, 2.5f, 14.4872f, 2.5f)
        horizontalLineTo(14.9882f)
        curveTo(17.8222f, 2.5f, 19.2391f, 2.5f, 20.1196f, 3.37867f)
        curveTo(21f, 4.25734f, 21f, 5.67157f, 21f, 8.49997f)
        lineTo(21f, 15.5f)
        curveTo(21f, 18.3284f, 21f, 19.7426f, 20.1196f, 20.6213f)
        curveTo(19.2392f, 21.5f, 17.8222f, 21.5f, 14.9882f, 21.5f)
        horizontalLineTo(14.4872f)
        curveTo(12.137f, 21.5f, 10.9619f, 21.5f, 10.1524f, 20.8801f)
        curveTo(9.94398f, 20.7205f, 9.75744f, 20.5343f, 9.59752f, 20.3263f)
        curveTo(9.1853f, 19.7901f, 9.04664f, 19.0933f, 9f, 17.9996f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 12f)
        horizontalLineTo(3f)
        moveTo(12.5f, 15.5001f)
        curveTo(12.5f, 15.5001f, 16f, 12.9224f, 16f, 12.0001f)
        curveTo(16f, 11.0778f, 12.5f, 8.50011f, 12.5f, 8.50011f)
        }
        }.build()

        return _loginSquare01!!
    }

private var _loginSquare01: ImageVector? = null
