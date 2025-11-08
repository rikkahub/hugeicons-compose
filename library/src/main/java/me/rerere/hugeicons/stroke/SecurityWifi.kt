package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.SecurityWifi: ImageVector
    get() {
        if (_securityWifi != null) {
            return _securityWifi!!
        }
        _securityWifi = ImageVector.Builder(
            name = "SecurityWifi",
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
        moveTo(8f, 9.47776f)
        curveTo(9.14883f, 8.54314f, 10.5209f, 8f, 11.9946f, 8f)
        curveTo(13.4729f, 8f, 14.849f, 8.54657f, 16f, 9.48661f)
        moveTo(14.1743f, 12f)
        curveTo(13.5182f, 11.5909f, 12.7779f, 11.3607f, 11.9946f, 11.3607f)
        curveTo(11.2152f, 11.3607f, 10.4784f, 11.5886f, 9.82477f, 11.9938f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 15f)
        horizontalLineTo(12.0064f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 11.1833f)
        verticalLineTo(8.28029f)
        curveTo(21f, 6.64029f, 21f, 5.82028f, 20.5959f, 5.28529f)
        curveTo(20.1918f, 4.75029f, 19.2781f, 4.49056f, 17.4507f, 3.9711f)
        curveTo(16.2022f, 3.6162f, 15.1016f, 3.18863f, 14.2223f, 2.79829f)
        curveTo(13.0234f, 2.2661f, 12.424f, 2f, 12f, 2f)
        curveTo(11.576f, 2f, 10.9766f, 2.2661f, 9.77771f, 2.79829f)
        curveTo(8.89839f, 3.18863f, 7.79784f, 3.61619f, 6.54933f, 3.9711f)
        curveTo(4.72193f, 4.49056f, 3.80822f, 4.75029f, 3.40411f, 5.28529f)
        curveTo(3f, 5.82028f, 3f, 6.64029f, 3f, 8.28029f)
        verticalLineTo(11.1833f)
        curveTo(3f, 16.8085f, 8.06277f, 20.1835f, 10.594f, 21.5194f)
        curveTo(11.2011f, 21.8398f, 11.5046f, 22f, 12f, 22f)
        curveTo(12.4954f, 22f, 12.7989f, 21.8398f, 13.406f, 21.5194f)
        curveTo(15.9372f, 20.1835f, 21f, 16.8085f, 21f, 11.1833f)
        }
        }.build()

        return _securityWifi!!
    }

private var _securityWifi: ImageVector? = null
