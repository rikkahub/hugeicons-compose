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

val HugeIcons.KeyRound: ImageVector
    get() {
        if (_keyRound != null) {
            return _keyRound!!
        }
        _keyRound = ImageVector.Builder(
            name = "KeyRound",
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
            moveTo(15f, 15.5f)
            curveTo(18.5899f, 15.5f, 21.5f, 12.5899f, 21.5f, 9f)
            curveTo(21.5f, 5.41015f, 18.5899f, 2.5f, 15f, 2.5f)
            curveTo(11.4101f, 2.5f, 8.5f, 5.41015f, 8.5f, 9f)
            curveTo(8.5f, 9.41773f, 8.5394f, 9.82625f, 8.6147f, 10.2221f)
            curveTo(8.75737f, 10.972f, 8.82871f, 11.347f, 8.75558f, 11.5844f)
            curveTo(8.68245f, 11.8217f, 8.47202f, 12.032f, 8.05118f, 12.4526f)
            lineTo(3.67253f, 16.8283f)
            curveTo(3.094f, 17.4064f, 2.80474f, 17.6955f, 2.65237f, 18.0631f)
            curveTo(2.5f, 18.4308f, 2.5f, 18.8398f, 2.5f, 19.6576f)
            verticalLineTo(21.5f)
            horizontalLineTo(6f)
            verticalLineTo(19.5f)
            horizontalLineTo(8f)
            verticalLineTo(17.5f)
            horizontalLineTo(10f)
            lineTo(11.5526f, 15.9485f)
            curveTo(11.9729f, 15.5286f, 12.183f, 15.3186f, 12.4201f, 15.2456f)
            curveTo(12.6572f, 15.1726f, 13.0316f, 15.2436f, 13.7806f, 15.3858f)
            curveTo(14.1756f, 15.4608f, 14.5832f, 15.5f, 15f, 15.5f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(18f, 7.5f)
            curveTo(18f, 8.32843f, 17.3284f, 9f, 16.5f, 9f)
            curveTo(15.6716f, 9f, 15f, 8.32843f, 15f, 7.5f)
            curveTo(15f, 6.67157f, 15.6716f, 6f, 16.5f, 6f)
            curveTo(17.3284f, 6f, 18f, 6.67157f, 18f, 7.5f)
            close()
        }
        }.build()

        return _keyRound!!
    }

private var _keyRound: ImageVector? = null
