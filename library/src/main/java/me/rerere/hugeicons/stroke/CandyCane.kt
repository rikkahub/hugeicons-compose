package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CandyCane: ImageVector
    get() {
        if (_candyCane != null) {
            return _candyCane!!
        }
        _candyCane = ImageVector.Builder(
            name = "CandyCane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(5.20209f, 14.4862f)
            lineTo(6.63118f, 19.7143f)
            moveTo(8.13036f, 9.51447f)
            lineTo(9.55945f, 14.7425f)
            moveTo(11.2373f, 5.19627f)
            lineTo(12.4877f, 9.77084f)
            moveTo(14.8801f, 2.8386f)
            lineTo(15.7733f, 6.10615f)
            moveTo(13.9519f, 7.28499f)
            lineTo(6.14314f, 20.5429f)
            curveTo(5.60406f, 21.4581f, 4.41013f, 21.7717f, 3.47641f, 21.2433f)
            curveTo(2.5427f, 20.7149f, 2.22279f, 19.5445f, 2.76187f, 18.6293f)
            lineTo(10.5706f, 5.37138f)
            curveTo(12.1878f, 2.62558f, 15.7696f, 1.6848f, 18.5708f, 3.27008f)
            curveTo(21.3719f, 4.85537f, 22.3316f, 8.36641f, 20.7144f, 11.1122f)
            curveTo(20.1753f, 12.0275f, 18.9814f, 12.3411f, 18.0477f, 11.8126f)
            curveTo(17.114f, 11.2842f, 16.794f, 10.1139f, 17.3331f, 9.1986f)
            curveTo(17.8722f, 8.28333f, 17.5523f, 7.11299f, 16.6186f, 6.58456f)
            curveTo(15.6849f, 6.05613f, 14.4909f, 6.36972f, 13.9519f, 7.28499f)
            close()
        }
        }.build()

        return _candyCane!!
    }

private var _candyCane: ImageVector? = null
