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

val HugeIcons.MousePointerBan: ImageVector
    get() {
        if (_mousePointerBan != null) {
            return _mousePointerBan!!
        }
        _mousePointerBan = ImageVector.Builder(
            name = "MousePointerBan",
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
            moveTo(14.6638f, 9.57818f)
            curveTo(16.2259f, 11.1403f, 18.7585f, 11.1403f, 20.3206f, 9.57818f)
            curveTo(21.8827f, 8.01609f, 21.8827f, 5.48343f, 20.3206f, 3.92133f)
            moveTo(14.6638f, 9.57818f)
            curveTo(13.1017f, 8.01609f, 13.1017f, 5.48343f, 14.6638f, 3.92133f)
            curveTo(16.2259f, 2.35923f, 18.7585f, 2.35923f, 20.3206f, 3.92133f)
            moveTo(14.6638f, 9.57818f)
            lineTo(20.3206f, 3.92133f)
        }

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
            moveTo(15.9922f, 13.1774f)
            curveTo(15.3278f, 13.3814f, 14.5299f, 13.599f, 13.5973f, 13.8534f)
            curveTo(12.6361f, 14.1155f, 12.1555f, 14.2466f, 11.8223f, 14.5798f)
            curveTo(11.489f, 14.9131f, 11.358f, 15.3937f, 11.0958f, 16.3549f)
            curveTo(10.2154f, 19.5831f, 9.77518f, 21.1972f, 8.81515f, 21.2485f)
            curveTo(7.85511f, 21.2998f, 7.2499f, 19.7531f, 6.03947f, 16.6598f)
            lineTo(3.94084f, 11.2967f)
            curveTo(2.67356f, 8.05806f, 2.03993f, 6.43877f, 2.86056f, 5.61813f)
            curveTo(3.6812f, 4.79749f, 5.30049f, 5.43113f, 8.53909f, 6.69841f)
            lineTo(10.4922f, 7.46266f)
        }
        }.build()

        return _mousePointerBan!!
    }

private var _mousePointerBan: ImageVector? = null
