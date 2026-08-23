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

val HugeIcons.ShowerHead: ImageVector
    get() {
        if (_showerHead != null) {
            return _showerHead!!
        }
        _showerHead = ImageVector.Builder(
            name = "ShowerHead",
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
            moveTo(6.13225f, 16.6536f)
            curveTo(6.93769f, 16.9301f, 7.81546f, 16.5033f, 8.09279f, 15.7002f)
            lineTo(9.2645f, 12.3072f)
            curveTo(9.44939f, 11.7718f, 10.0346f, 11.4873f, 10.5715f, 11.6716f)
            lineTo(11.5438f, 12.0054f)
            curveTo(12.0807f, 12.1898f, 12.6659f, 11.9052f, 12.8508f, 11.3698f)
            lineTo(15.1942f, 4.5839f)
            curveTo(15.3791f, 4.04851f, 15.0937f, 3.46504f, 14.5567f, 3.28069f)
            curveTo(11.8719f, 2.35893f, 8.94606f, 3.78182f, 8.02161f, 6.45878f)
            lineTo(5.17603f, 14.6988f)
            curveTo(4.89869f, 15.5019f, 5.32681f, 16.3771f, 6.13225f, 16.6536f)
            close()
            moveTo(6.13225f, 16.6536f)
            lineTo(5.39668f, 18.7836f)
            curveTo(5.01963f, 19.8755f, 4.12026f, 20.7072f, 3f, 21f)
            moveTo(18.0832f, 5.91908f)
            lineTo(21f, 6.92047f)
            moveTo(17.0789f, 8.82733f)
            lineTo(19.9957f, 9.82872f)
            moveTo(16.0746f, 11.7356f)
            lineTo(18.9914f, 12.737f)
        }
        }.build()

        return _showerHead!!
    }

private var _showerHead: ImageVector? = null
